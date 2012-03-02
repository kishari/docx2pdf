package hu.dbx.docx2pdf.util;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.PortInfo;
import java.util.List;
import javax.xml.ws.handler.HandlerResolver;

/**
 * Created by IntelliJ IDEA.
 * User: kishari
 * Date: 2012.03.02.
 * Time: 11:16
 */
public class PdfHandlerResolver implements HandlerResolver {

	private List<Handler> handlerList;

	public List<Handler> getHandlerChain(PortInfo arg0) {
		return getHandlerList();
	}

	public void setHandlerList(List<Handler> handlerList) {
		this.handlerList = handlerList;
	}

	public List<Handler> getHandlerList() {
		return handlerList;
	}

}
