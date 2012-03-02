
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Input" type="{http://www.ecrion.com/xfws/2.0}IDataSource"/>
 *         &lt;element name="Parameters" type="{http://www.ecrion.com/xfws/2.0}RenderingParameters"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "input",
    "parameters"
})
@XmlRootElement(name = "Render")
public class Render {

    @XmlElement(name = "Input", required = true, nillable = true)
    protected IDataSource input;
    @XmlElement(name = "Parameters", required = true, nillable = true)
    protected RenderingParameters parameters;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link IDataSource }
     *     
     */
    public IDataSource getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDataSource }
     *     
     */
    public void setInput(IDataSource value) {
        this.input = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link RenderingParameters }
     *     
     */
    public RenderingParameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenderingParameters }
     *     
     */
    public void setParameters(RenderingParameters value) {
        this.parameters = value;
    }

}
