
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFOutputSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFOutputSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PDFConformance" type="{http://www.ecrion.com/xfws/2.0}PDFConformance" minOccurs="0"/>
 *         &lt;element name="AllowPrinting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowModifyContents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowCopy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowModifyAnnotations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowFillIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowScreenReaders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowAssembly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowDegradedPrinting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EncryptionStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageCompression" type="{http://www.ecrion.com/xfws/2.0}PDFImageCompression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFOutputSettings", propOrder = {
    "pdfConformance",
    "allowPrinting",
    "allowModifyContents",
    "allowCopy",
    "allowModifyAnnotations",
    "allowFillIn",
    "allowScreenReaders",
    "allowAssembly",
    "allowDegradedPrinting",
    "encryptionStrength",
    "userPassword",
    "ownerPassword",
    "imageCompression"
})
public class PDFOutputSettings {

    @XmlElement(name = "PDFConformance", defaultValue = "PDF14")
    protected PDFConformance pdfConformance;
    @XmlElement(name = "AllowPrinting", defaultValue = "false")
    protected Boolean allowPrinting;
    @XmlElement(name = "AllowModifyContents", defaultValue = "false")
    protected Boolean allowModifyContents;
    @XmlElement(name = "AllowCopy", defaultValue = "false")
    protected Boolean allowCopy;
    @XmlElement(name = "AllowModifyAnnotations", defaultValue = "false")
    protected Boolean allowModifyAnnotations;
    @XmlElement(name = "AllowFillIn", defaultValue = "false")
    protected Boolean allowFillIn;
    @XmlElement(name = "AllowScreenReaders", defaultValue = "false")
    protected Boolean allowScreenReaders;
    @XmlElement(name = "AllowAssembly", defaultValue = "false")
    protected Boolean allowAssembly;
    @XmlElement(name = "AllowDegradedPrinting", defaultValue = "false")
    protected Boolean allowDegradedPrinting;
    @XmlElement(name = "EncryptionStrength", defaultValue = "40")
    protected Integer encryptionStrength;
    @XmlElement(name = "UserPassword", defaultValue = "")
    protected String userPassword;
    @XmlElement(name = "OwnerPassword", defaultValue = "")
    protected String ownerPassword;
    @XmlElement(name = "ImageCompression", defaultValue = "JPEG")
    protected PDFImageCompression imageCompression;

    /**
     * Gets the value of the pdfConformance property.
     * 
     * @return
     *     possible object is
     *     {@link PDFConformance }
     *     
     */
    public PDFConformance getPDFConformance() {
        return pdfConformance;
    }

    /**
     * Sets the value of the pdfConformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFConformance }
     *     
     */
    public void setPDFConformance(PDFConformance value) {
        this.pdfConformance = value;
    }

    /**
     * Gets the value of the allowPrinting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPrinting() {
        return allowPrinting;
    }

    /**
     * Sets the value of the allowPrinting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPrinting(Boolean value) {
        this.allowPrinting = value;
    }

    /**
     * Gets the value of the allowModifyContents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowModifyContents() {
        return allowModifyContents;
    }

    /**
     * Sets the value of the allowModifyContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowModifyContents(Boolean value) {
        this.allowModifyContents = value;
    }

    /**
     * Gets the value of the allowCopy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCopy() {
        return allowCopy;
    }

    /**
     * Sets the value of the allowCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCopy(Boolean value) {
        this.allowCopy = value;
    }

    /**
     * Gets the value of the allowModifyAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowModifyAnnotations() {
        return allowModifyAnnotations;
    }

    /**
     * Sets the value of the allowModifyAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowModifyAnnotations(Boolean value) {
        this.allowModifyAnnotations = value;
    }

    /**
     * Gets the value of the allowFillIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowFillIn() {
        return allowFillIn;
    }

    /**
     * Sets the value of the allowFillIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowFillIn(Boolean value) {
        this.allowFillIn = value;
    }

    /**
     * Gets the value of the allowScreenReaders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowScreenReaders() {
        return allowScreenReaders;
    }

    /**
     * Sets the value of the allowScreenReaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowScreenReaders(Boolean value) {
        this.allowScreenReaders = value;
    }

    /**
     * Gets the value of the allowAssembly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAssembly() {
        return allowAssembly;
    }

    /**
     * Sets the value of the allowAssembly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAssembly(Boolean value) {
        this.allowAssembly = value;
    }

    /**
     * Gets the value of the allowDegradedPrinting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDegradedPrinting() {
        return allowDegradedPrinting;
    }

    /**
     * Sets the value of the allowDegradedPrinting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDegradedPrinting(Boolean value) {
        this.allowDegradedPrinting = value;
    }

    /**
     * Gets the value of the encryptionStrength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEncryptionStrength() {
        return encryptionStrength;
    }

    /**
     * Sets the value of the encryptionStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEncryptionStrength(Integer value) {
        this.encryptionStrength = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the ownerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPassword() {
        return ownerPassword;
    }

    /**
     * Sets the value of the ownerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPassword(String value) {
        this.ownerPassword = value;
    }

    /**
     * Gets the value of the imageCompression property.
     * 
     * @return
     *     possible object is
     *     {@link PDFImageCompression }
     *     
     */
    public PDFImageCompression getImageCompression() {
        return imageCompression;
    }

    /**
     * Sets the value of the imageCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFImageCompression }
     *     
     */
    public void setImageCompression(PDFImageCompression value) {
        this.imageCompression = value;
    }

}
