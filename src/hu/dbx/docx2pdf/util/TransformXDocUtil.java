package hu.dbx.docx2pdf.util;


import fr.opensagres.xdocreport.converter.ConverterTypeTo;
import fr.opensagres.xdocreport.converter.ConverterTypeVia;
import fr.opensagres.xdocreport.converter.Options;
import fr.opensagres.xdocreport.converter.XDocConverterException;
import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import hu.dbx.docx2pdf.model.Developer;
import hu.dbx.docx2pdf.model.SampleXDocModel;
import hu.dbx.docx2pdf.model.TransformResponseType;
//import org.docx4j.convert.out.pdf.PdfConversion;
//import org.docx4j.fonts.IdentityPlusMapper;
//import org.docx4j.openpackaging.exceptions.Docx4JException;
//import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
//import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TransformXDocUtil {

    private String templateDir;
    private String testOutputDir;

    public TransformXDocUtil(){}

    public TransformResponseType transfrom(String templateName, SampleXDocModel model) {
        try {

            InputStream input = new FileInputStream(new File(getTemplateDir(), templateName));
            IXDocReport report = XDocReportRegistry.getRegistry().loadReport(input, TemplateEngineKind.Velocity);

            FieldsMetadata metadata = report.createFieldsMetadata();
            metadata.addFieldAsList( "developers.Name" );
            metadata.addFieldAsList( "developers.LastName" );
            metadata.addFieldAsList( "developers.Mail" );
            report.setFieldsMetadata(metadata);

            List<Developer> developers = new ArrayList<Developer>();
            developers.add( new Developer( "ZERR", "Angelo", "angelo.zerr@gmail.com" ) );
            developers.add( new Developer( "Leclercq", "Pascal", "pascal.leclercq@gmail.com" ) );

			IContext context = report.createContext();
			context.put("model", model);
            context.put( "developers", developers );

            String docxOutName = "res_" + templateName;
			OutputStream outDocx = new FileOutputStream(new File(getTestOutputDir(),  docxOutName));
			report.process(context, outDocx);
            outDocx.close();

            convertViaItext(report, context, templateName);
            //convertViaXslFo(docxOutName);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
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

    private void convertViaItext(IXDocReport report, IContext context, String templateName) throws IOException, XDocReportException {
        OutputStream out = new FileOutputStream(new File(getTestOutputDir(), templateName + "_viaItext.pdf"));
		Options options = Options.getTo(ConverterTypeTo.PDF).via(ConverterTypeVia.ITEXT);
		report.convert(context, options, out);
    }
/*
    private void convertViaXslFo(String docxOutName) throws Exception, Docx4JException {
        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new File(getTestOutputDir(),  docxOutName));

        wordMLPackage.setFontMapper(  new IdentityPlusMapper());

        MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();
        org.docx4j.wml.Document wmlDocumentEl = (org.docx4j.wml.Document)documentPart.getJaxbElement();
        String xml = org.docx4j.XmlUtils.marshaltoString(wmlDocumentEl, true);

        System.out.println(xml);

        PdfConversion c = new org.docx4j.convert.out.pdf.viaXSLFO.Conversion(wordMLPackage);

        OutputStream os = new FileOutputStream(new File(getTestOutputDir(), docxOutName +  "_viaXslfo.pdf"));
        c.output(os);

        os.close();
    }
    */
}
