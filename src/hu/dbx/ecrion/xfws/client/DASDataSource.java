
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DASDataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DASDataSource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ecrion.com/xfws/2.0}IDataSource">
 *       &lt;sequence>
 *         &lt;element name="Diagram" type="{http://www.ecrion.com/xfws/2.0}Diagram"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DASDataSource", propOrder = {
    "diagram"
})
public class DASDataSource
    extends IDataSource
{

    @XmlElement(name = "Diagram", required = true, nillable = true)
    protected Diagram diagram;

    /**
     * Gets the value of the diagram property.
     * 
     * @return
     *     possible object is
     *     {@link Diagram }
     *     
     */
    public Diagram getDiagram() {
        return diagram;
    }

    /**
     * Sets the value of the diagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagram }
     *     
     */
    public void setDiagram(Diagram value) {
        this.diagram = value;
    }

}
