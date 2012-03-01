package hu.dbx.docx2pdf.model;

/**
 * Created by IntelliJ IDEA.
 * User: kishari
 * Date: 2012.02.28.
 * Time: 12:26
 */
public class SampleXDocModel {

    private final String name;
    private final String testContent;

    public SampleXDocModel(String name, String testContent) {
        this.name = name;
        this.testContent = testContent;
    }

    public String getName() {
        return name;
    }

    public String getTestContent() {
        return testContent;
    }
}