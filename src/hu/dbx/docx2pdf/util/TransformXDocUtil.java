package hu.dbx.docx2pdf.util;


import hu.dbx.docx2pdf.model.SampleXDocModel;
import hu.dbx.docx2pdf.model.TransformResponseType;
import hu.dbx.ecrion.xfws.client.*;

public class TransformXDocUtil {

    private String templateDir;
    private String testOutputDir;
    private XfwsSoap xfService;

    public TransformXDocUtil(){}

    public TransformResponseType transfrom(String templateName, SampleXDocModel model) {
/*
        try {

            InputStream input = new FileInputStream(new File(getTemplateDir(), templateName));
            IXDocReport report = XDocReportRegistry.getRegistry().loadReport(input, TemplateEngineKind.Velocity);

            FieldsMetadata metadata = report.createFieldsMetadata();
            metadata.addFieldAsList( "developers.Name" );
            metadata.addFieldAsList( "developers.LastName" );
            metadata.addFieldAsList( "developers.Mail" );

            List<Developer> developers = new ArrayList<Developer>();
            developers.add( new Developer( "ZERR", "Angelo", "angelo.zerr@gmail.com" ) );
            developers.add( new Developer( "Leclercq", "Pascal", "pascal.leclercq@gmail.com" ) );

			IContext context = report.createContext();
			context.put("model", model);
            context.put( "developers", developers );
			//context.put("model.Name2", model.getName());
			//context.put("model.testContent", model.getName());

            Options options = Options.getFrom(DocumentKind.DOCX).to(ConverterTypeTo.PDF).via(ConverterTypeVia.ITEXT);
            //Options options = Options.getTo(ConverterTypeTo.PDF).via(ConverterTypeVia.ITEXT);
			OutputStream outPdf = new FileOutputStream(new File(getTestOutputDir(), "out_" + templateName + "_viaItext.pdf"));
			OutputStream outDocx = new FileOutputStream(new File(getTestOutputDir(), "out_" + templateName));
			report.process(context, outDocx);
			report.convert(context, options, outPdf);

            // Fonts identity mapping best on Microsoft Windows
            WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
            wordMLPackage.setFontMapper(  new  IdentityPlusMapper());

            // Set up converter

            PdfConversion c = new org.docx4j.convert.out.pdf.viaXSLFO.Conversion(wordMLPackage);

            // Write to output stream
            OutputStream os = new FileOutputStream(getTestOutputDir() + "/out_" + templateName +  "_viaXslfo.pdf"  );
            c.output(os, new PdfSettings());
*/

            /*
            XmlDataSource dataSource = new XmlDataSource();

            dataSource.setContent(content);
            dataSource.setFormat(InputFormat.DOC_X);

            RenderingParameters parameters = new RenderingParameters();
            parameters.setOutputFormat(OutputFormat.PDF);
            parameters.setInputBytesID("Id");

            getXfService().render(dataSource, parameters);
            */
/*        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XDocReportException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
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

    public XfwsSoap getXfService() {
        return xfService;
    }

    public void setXfService(XfwsSoap xfService) {
        this.xfService = xfService;
    }
}
