package hu.dbx.docx2pdf.service;

import hu.dbx.docx2pdf.model.SampleXDocModel;
import hu.dbx.docx2pdf.model.TransformResponseType;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import hu.dbx.docx2pdf.util.TransformXDocUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebService(serviceName="PDFService")
@HandlerChain(file = "handlers.xml")
public class PDFService implements ApplicationContextAware {
	Logger logger = Logger.getLogger(PDFService.class);
	
	@Resource
	private WebServiceContext context;
	private ApplicationContext applicationContext = null;
	
	private TransformXDocUtil transformUtil;

	@WebMethod
	public byte[] render(@WebParam(name="inputXML") String inputXML,
					   @WebParam(name="templateId") String templateId,
					   @WebParam(name="version") String version) {

		logger.info("render started.");
        String templateName = templateId + "-v" + version.toString() + ".docx";

        SampleXDocModel model = new SampleXDocModel("Józsi", "Ödön");

		try {
			final TransformResponseType result = getTransformUtil().transfrom(templateName, model);

        	File baseDir = new File(getTransformUtil().getTestOutputDir());
		    File outDir = new File(baseDir, "out");
				
			outDir.mkdirs();
				

			File pdfFile = new File(outDir, "result_" + templateName + ".pdf");
			OutputStream fos;
			fos = new BufferedOutputStream(new FileOutputStream(pdfFile));
//			fos.write(result.getPdf());
			fos.close();

		    logger.info("render finished.");

    		return result.getPdf();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@WebMethod(exclude = true)
	public TransformXDocUtil getTransformUtil() {
		if (transformUtil == null) {
			transformUtil = (TransformXDocUtil)getWebApplicationContext().getBean("transformUtil");
		}
		return transformUtil;
	}
	@WebMethod(exclude = true)
	public void setTransformUtil(TransformXDocUtil transformUtil) {
		this.transformUtil = transformUtil;
	}
	
	@WebMethod(exclude = true)
    private ApplicationContext getWebApplicationContext() throws IllegalStateException {
        if (applicationContext == null) {
            ServletContext servletContext = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
            applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        }
        return applicationContext;
    }

	//@Override
	@WebMethod(exclude = true)
	public void setApplicationContext(ApplicationContext appCtx)
			throws BeansException {
		this.applicationContext = appCtx;
	}
	
}
