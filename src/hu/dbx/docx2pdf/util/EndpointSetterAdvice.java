package hu.dbx.docx2pdf.util;

import org.springframework.aop.MethodBeforeAdvice;

import javax.xml.ws.BindingProvider;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EndpointSetterAdvice implements MethodBeforeAdvice {

    private Set<Object> advicedBeans = new HashSet<Object>();

    private Map<Object, URL> endpointMap;

    public Map<Object, URL> getEndpointMap() {
        return endpointMap;
    }

    public void setEndpointMap(Map<Object, URL> endpointMap) {
        this.endpointMap = endpointMap;
    }

    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (getEndpointMap().containsKey(target) && !advicedBeans.contains(target)) {
            ((BindingProvider) target).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, getEndpointMap().get(target).toString());
            advicedBeans.add(target);
        }
    }
}
