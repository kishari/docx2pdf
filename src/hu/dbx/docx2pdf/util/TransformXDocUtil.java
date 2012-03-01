package hu.dbx.docx2pdf.util;

import fr.opensagres.xdocreport.converter.ConverterTypeTo;
import fr.opensagres.xdocreport.converter.ConverterTypeVia;
import fr.opensagres.xdocreport.converter.Options;
import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.core.document.DocumentKind;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import hu.dbx.docx2pdf.model.Developer;
import hu.dbx.docx2pdf.model.SampleXDocModel;
import hu.dbx.docx2pdf.model.TransformResponseType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: kishari
 * Date: 2012.02.28.
 * Time: 11:43
 */
public class TransformXDocUtil {

    private String templateDir;
    private String testOutputDir;

    public TransformXDocUtil(){}

    public TransformResponseType transfrom(String templateName, SampleXDocModel model) {
        try {
            // 1) Load Docx file by filling Velocity template engine and cache
			// it to the registry
            InputStream input = new FileInputStream(new File(getTemplateDir(), templateName));
            IXDocReport report = XDocReportRegistry.getRegistry().loadReport(input, TemplateEngineKind.Velocity);

            FieldsMetadata metadata = report.createFieldsMetadata();
            metadata.addFieldAsList( "developers.Name" );
            metadata.addFieldAsList( "developers.LastName" );
            metadata.addFieldAsList( "developers.Mail" );

            List<Developer> developers = new ArrayList<Developer>();
            developers.add( new Developer( "ZERR", "Angelo", "angelo.zerr@gmail.com" ) );
            developers.add( new Developer( "Leclercq", "Pascal", "pascal.leclercq@gmail.com" ) );

            // 2) Create context Java model
			IContext context = report.createContext();
			context.put("model", model);
            context.put( "developers", developers );
			//context.put("model.Name2", model.getName());
			//context.put("model.testContent", model.getName());

			// 3) Generate report by merging Java model with the Docx
            Options options = Options.getFrom(DocumentKind.DOCX).to(ConverterTypeTo.PDF).via(ConverterTypeVia.ITEXT);
            //Options options = Options.getTo(ConverterTypeTo.PDF).via(ConverterTypeVia.ITEXT);
			OutputStream outPdf = new FileOutputStream(new File(templateDir, "out_" + templateName + ".pdf"));
			OutputStream outDocx = new FileOutputStream(new File(templateDir, "out_" + templateName));
			report.process(context, outDocx);
			report.convert(context, options, outPdf);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XDocReportException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }

        return new TransformResponseType();
    }

    public String getTemplateDir() {
        return templateDir;
    }

    public void setTemplateDir(String templateDir) {
        this.templateDir = templateDir;
    }

    public String getTestOutputDir() {
        return testOutputDir;
    }

    public void setTestOutputDir(String testOutputDir) {
        this.testOutputDir = testOutputDir;
    }
}
