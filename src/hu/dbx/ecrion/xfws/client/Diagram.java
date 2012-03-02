
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Diagram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diagram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Properties" type="{http://www.ecrion.com/xfws/2.0}ArrayOfJobProperty" minOccurs="0"/>
 *         &lt;element name="InputBytesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputBytesID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diagram", propOrder = {
    "properties",
    "inputBytesID",
    "outputBytesID"
})
@XmlSeeAlso({
    LocalDiagram.class,
    ServerDiagram.class
})
public abstract class Diagram {

    @XmlElement(name = "Properties")
    protected ArrayOfJobProperty properties;
    @XmlElement(name = "InputBytesID", defaultValue = "")
    protected String inputBytesID;
    @XmlElement(name = "OutputBytesID", defaultValue = "")
    protected String outputBytesID;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobProperty }
     *     
     */
    public ArrayOfJobProperty getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobProperty }
     *     
     */
    public void setProperties(ArrayOfJobProperty value) {
        this.properties = value;
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

}
