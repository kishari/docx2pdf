package hu.dbx.docx2pdf.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pilot {
	public static void main(String[] argv){
		// create and configure beans
		ApplicationContext context =
		    new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml", "standaloneContext.xml"});
			// new ClassPathXmlApplicationContext(new String[] {"standaloneContext.xml"});
	}
}
