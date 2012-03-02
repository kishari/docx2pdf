
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxtOutputSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxtOutputSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Encoding" type="{http://www.ecrion.com/xfws/2.0}OutputEncoding" minOccurs="0"/>
 *         &lt;element name="FontFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="LineHeight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="UseFormFeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TrimPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxtOutputSettings", propOrder = {
    "encoding",
    "fontFamily",
    "fontSize",
    "lineHeight",
    "useFormFeed",
    "trimPages"
})
public class TxtOutputSettings {

    @XmlElement(name = "Encoding", defaultValue = "ASCII")
    protected OutputEncoding encoding;
    @XmlElement(name = "FontFamily", defaultValue = "Courier New")
    protected String fontFamily;
    @XmlElement(name = "FontSize", defaultValue = "9")
    protected Float fontSize;
    @XmlElement(name = "LineHeight", defaultValue = "1.4")
    protected Float lineHeight;
    @XmlElement(name = "UseFormFeed", defaultValue = "true")
    protected Boolean useFormFeed;
    @XmlElement(name = "TrimPages", defaultValue = "false")
    protected Boolean trimPages;

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link OutputEncoding }
     *     
     */
    public OutputEncoding getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputEncoding }
     *     
     */
    public void setEncoding(OutputEncoding value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFontSize(Float value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the lineHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLineHeight() {
        return lineHeight;
    }

    /**
     * Sets the value of the lineHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLineHeight(Float value) {
        this.lineHeight = value;
    }

    /**
     * Gets the value of the useFormFeed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFormFeed() {
        return useFormFeed;
    }

    /**
     * Sets the value of the useFormFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFormFeed(Boolean value) {
        this.useFormFeed = value;
    }

    /**
     * Gets the value of the trimPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrimPages() {
        return trimPages;
    }

    /**
     * Sets the value of the trimPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrimPages(Boolean value) {
        this.trimPages = value;
    }

}
