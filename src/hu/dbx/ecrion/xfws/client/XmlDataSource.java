
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlDataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlDataSource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ecrion.com/xfws/2.0}IDataSource">
 *       &lt;sequence>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Format" type="{http://www.ecrion.com/xfws/2.0}InputFormat"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlDataSource", propOrder = {
    "content",
    "format"
})
public class XmlDataSource
    extends IDataSource
{

    @XmlElement(name = "Content", required = true, nillable = true)
    protected Object content;
    @XmlElement(name = "Format", required = true)
    protected InputFormat format;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContent(Object value) {
        this.content = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link InputFormat }
     *     
     */
    public InputFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFormat }
     *     
     */
    public void setFormat(InputFormat value) {
        this.format = value;
    }

}
