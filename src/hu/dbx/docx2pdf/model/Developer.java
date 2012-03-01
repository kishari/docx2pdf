package hu.dbx.docx2pdf.model;

/**
 * Created by IntelliJ IDEA.
 * User: kishari
 * Date: 2012.02.28.
 * Time: 14:10
 */
public class Developer {
    private String name;
    private String lastName;
    private String mail;

    public Developer(String name, String lastName, String mail) {
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
