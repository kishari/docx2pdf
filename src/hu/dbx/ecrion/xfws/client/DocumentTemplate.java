
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XSLTParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XSLTEngine" type="{http://www.ecrion.com/xfws/2.0}XsltEngine" minOccurs="0"/>
 *         &lt;element name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentTemplate", propOrder = {
    "xsltParameters",
    "xsltEngine",
    "languageID"
})
@XmlSeeAlso({
    ServerDocumentTemplate.class,
    LocalDocumentTemplate.class
})
public abstract class DocumentTemplate {

    @XmlElement(name = "XSLTParameters", defaultValue = "")
    protected String xsltParameters;
    @XmlElement(name = "XSLTEngine", defaultValue = "MSXML")
    protected XsltEngine xsltEngine;
    @XmlElement(name = "LanguageID", defaultValue = "")
    protected String languageID;

    /**
     * Gets the value of the xsltParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSLTParameters() {
        return xsltParameters;
    }

    /**
     * Sets the value of the xsltParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSLTParameters(String value) {
        this.xsltParameters = value;
    }

    /**
     * Gets the value of the xsltEngine property.
     * 
     * @return
     *     possible object is
     *     {@link XsltEngine }
     *     
     */
    public XsltEngine getXSLTEngine() {
        return xsltEngine;
    }

    /**
     * Sets the value of the xsltEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsltEngine }
     *     
     */
    public void setXSLTEngine(XsltEngine value) {
        this.xsltEngine = value;
    }

    /**
     * Gets the value of the languageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

}
