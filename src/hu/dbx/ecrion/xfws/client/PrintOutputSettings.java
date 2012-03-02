
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintOutputSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintOutputSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrinterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputPrintFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputTray" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputTray" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopyCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Duplex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintOutputSettings", propOrder = {
    "printerName",
    "outputPrintFile",
    "inputTray",
    "outputTray",
    "copyCount",
    "duplex"
})
public class PrintOutputSettings {

    @XmlElement(name = "PrinterName", defaultValue = "")
    protected String printerName;
    @XmlElement(name = "OutputPrintFile", defaultValue = "")
    protected String outputPrintFile;
    @XmlElement(name = "InputTray", defaultValue = "")
    protected String inputTray;
    @XmlElement(name = "OutputTray", defaultValue = "")
    protected String outputTray;
    @XmlElement(name = "CopyCount", defaultValue = "-1")
    protected Integer copyCount;
    @XmlElement(name = "Duplex", defaultValue = "false")
    protected Boolean duplex;

    /**
     * Gets the value of the printerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName() {
        return printerName;
    }

    /**
     * Sets the value of the printerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName(String value) {
        this.printerName = value;
    }

    /**
     * Gets the value of the outputPrintFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputPrintFile() {
        return outputPrintFile;
    }

    /**
     * Sets the value of the outputPrintFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputPrintFile(String value) {
        this.outputPrintFile = value;
    }

    /**
     * Gets the value of the inputTray property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputTray() {
        return inputTray;
    }

    /**
     * Sets the value of the inputTray property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputTray(String value) {
        this.inputTray = value;
    }

    /**
     * Gets the value of the outputTray property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputTray() {
        return outputTray;
    }

    /**
     * Sets the value of the outputTray property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputTray(String value) {
        this.outputTray = value;
    }

    /**
     * Gets the value of the copyCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCopyCount() {
        return copyCount;
    }

    /**
     * Sets the value of the copyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCopyCount(Integer value) {
        this.copyCount = value;
    }

    /**
     * Gets the value of the duplex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplex() {
        return duplex;
    }

    /**
     * Sets the value of the duplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplex(Boolean value) {
        this.duplex = value;
    }

}
