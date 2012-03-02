
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenderingParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenderingParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputFormat" type="{http://www.ecrion.com/xfws/2.0}OutputFormat"/>
 *         &lt;element name="BaseUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputBytesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputBytesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreloadDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Template" type="{http://www.ecrion.com/xfws/2.0}DocumentTemplate" minOccurs="0"/>
 *         &lt;element name="MiscellaneousSettings" type="{http://www.ecrion.com/xfws/2.0}MiscellaneousSettings" minOccurs="0"/>
 *         &lt;element name="HtmlInputSettings" type="{http://www.ecrion.com/xfws/2.0}HtmlInputSettings" minOccurs="0"/>
 *         &lt;element name="RasterOutputSettings" type="{http://www.ecrion.com/xfws/2.0}RasterOutputSettings" minOccurs="0"/>
 *         &lt;element name="AFPOutputSettings" type="{http://www.ecrion.com/xfws/2.0}AFPOutputSettings" minOccurs="0"/>
 *         &lt;element name="PDFOutputSettings" type="{http://www.ecrion.com/xfws/2.0}PDFOutputSettings" minOccurs="0"/>
 *         &lt;element name="PrintOutputSettings" type="{http://www.ecrion.com/xfws/2.0}PrintOutputSettings" minOccurs="0"/>
 *         &lt;element name="HtmlOutputSettings" type="{http://www.ecrion.com/xfws/2.0}HtmlOutputSettings" minOccurs="0"/>
 *         &lt;element name="TxtOutputSettings" type="{http://www.ecrion.com/xfws/2.0}TxtOutputSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenderingParameters", propOrder = {
    "outputFormat",
    "baseUrl",
    "inputBytesID",
    "outputBytesID",
    "preloadDocument",
    "template",
    "miscellaneousSettings",
    "htmlInputSettings",
    "rasterOutputSettings",
    "afpOutputSettings",
    "pdfOutputSettings",
    "printOutputSettings",
    "htmlOutputSettings",
    "txtOutputSettings"
})
public class RenderingParameters {

    @XmlElement(name = "OutputFormat", required = true)
    protected OutputFormat outputFormat;
    @XmlElement(name = "BaseUrl", defaultValue = "")
    protected String baseUrl;
    @XmlElement(name = "InputBytesID", defaultValue = "")
    protected String inputBytesID;
    @XmlElement(name = "OutputBytesID", defaultValue = "")
    protected String outputBytesID;
    @XmlElement(name = "PreloadDocument", defaultValue = "false")
    protected Boolean preloadDocument;
    @XmlElement(name = "Template")
    protected DocumentTemplate template;
    @XmlElement(name = "MiscellaneousSettings")
    protected MiscellaneousSettings miscellaneousSettings;
    @XmlElement(name = "HtmlInputSettings")
    protected HtmlInputSettings htmlInputSettings;
    @XmlElement(name = "RasterOutputSettings")
    protected RasterOutputSettings rasterOutputSettings;
    @XmlElement(name = "AFPOutputSettings")
    protected AFPOutputSettings afpOutputSettings;
    @XmlElement(name = "PDFOutputSettings")
    protected PDFOutputSettings pdfOutputSettings;
    @XmlElement(name = "PrintOutputSettings")
    protected PrintOutputSettings printOutputSettings;
    @XmlElement(name = "HtmlOutputSettings")
    protected HtmlOutputSettings htmlOutputSettings;
    @XmlElement(name = "TxtOutputSettings")
    protected TxtOutputSettings txtOutputSettings;

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat }
     *     
     */
    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat }
     *     
     */
    public void setOutputFormat(OutputFormat value) {
        this.outputFormat = value;
    }

    /**
     * Gets the value of the baseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Sets the value of the baseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUrl(String value) {
        this.baseUrl = value;
    }

    /**
     * Gets the value of the inputBytesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBytesID() {
        return inputBytesID;
    }

    /**
     * Sets the value of the inputBytesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBytesID(String value) {
        this.inputBytesID = value;
    }

    /**
     * Gets the value of the outputBytesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputBytesID() {
        return outputBytesID;
    }

    /**
     * Sets the value of the outputBytesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputBytesID(String value) {
        this.outputBytesID = value;
    }

    /**
     * Gets the value of the preloadDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreloadDocument() {
        return preloadDocument;
    }

    /**
     * Sets the value of the preloadDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreloadDocument(Boolean value) {
        this.preloadDocument = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTemplate }
     *     
     */
    public DocumentTemplate getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTemplate }
     *     
     */
    public void setTemplate(DocumentTemplate value) {
        this.template = value;
    }

    /**
     * Gets the value of the miscellaneousSettings property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousSettings }
     *     
     */
    public MiscellaneousSettings getMiscellaneousSettings() {
        return miscellaneousSettings;
    }

    /**
     * Sets the value of the miscellaneousSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousSettings }
     *     
     */
    public void setMiscellaneousSettings(MiscellaneousSettings value) {
        this.miscellaneousSettings = value;
    }

    /**
     * Gets the value of the htmlInputSettings property.
     * 
     * @return
     *     possible object is
     *     {@link HtmlInputSettings }
     *     
     */
    public HtmlInputSettings getHtmlInputSettings() {
        return htmlInputSettings;
    }

    /**
     * Sets the value of the htmlInputSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link HtmlInputSettings }
     *     
     */
    public void setHtmlInputSettings(HtmlInputSettings value) {
        this.htmlInputSettings = value;
    }

    /**
     * Gets the value of the rasterOutputSettings property.
     * 
     * @return
     *     possible object is
     *     {@link RasterOutputSettings }
     *     
     */
    public RasterOutputSettings getRasterOutputSettings() {
        return rasterOutputSettings;
    }

    /**
     * Sets the value of the rasterOutputSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RasterOutputSettings }
     *     
     */
    public void setRasterOutputSettings(RasterOutputSettings value) {
        this.rasterOutputSettings = value;
    }

    /**
     * Gets the value of the afpOutputSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AFPOutputSettings }
     *     
     */
    public AFPOutputSettings getAFPOutputSettings() {
        return afpOutputSettings;
    }

    /**
     * Sets the value of the afpOutputSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFPOutputSettings }
     *     
     */
    public void setAFPOutputSettings(AFPOutputSettings value) {
        this.afpOutputSettings = value;
    }

    /**
     * Gets the value of the pdfOutputSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PDFOutputSettings }
     *     
     */
    public PDFOutputSettings getPDFOutputSettings() {
        return pdfOutputSettings;
    }

    /**
     * Sets the value of the pdfOutputSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFOutputSettings }
     *     
     */
    public void setPDFOutputSettings(PDFOutputSettings value) {
        this.pdfOutputSettings = value;
    }

    /**
     * Gets the value of the printOutputSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PrintOutputSettings }
     *     
     */
    public PrintOutputSettings getPrintOutputSettings() {
        return printOutputSettings;
    }

    /**
     * Sets the value of the printOutputSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintOutputSettings }
     *     
     */
    public void setPrintOutputSettings(PrintOutputSettings value) {
        this.printOutputSettings = value;
    }

    /**
     * Gets the value of the htmlOutputSettings property.
     * 
     * @return
     *     possible object is
     *     {@link HtmlOutputSettings }
     *     
     */
    public HtmlOutputSettings getHtmlOutputSettings() {
        return htmlOutputSettings;
    }

    /**
     * Sets the value of the htmlOutputSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link HtmlOutputSettings }
     *     
     */
    public void setHtmlOutputSettings(HtmlOutputSettings value) {
        this.htmlOutputSettings = value;
    }

    /**
     * Gets the value of the txtOutputSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TxtOutputSettings }
     *     
     */
    public TxtOutputSettings getTxtOutputSettings() {
        return txtOutputSettings;
    }

    /**
     * Sets the value of the txtOutputSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxtOutputSettings }
     *     
     */
    public void setTxtOutputSettings(TxtOutputSettings value) {
        this.txtOutputSettings = value;
    }

}
