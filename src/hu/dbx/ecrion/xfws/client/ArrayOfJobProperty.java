
package hu.dbx.ecrion.xfws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJobProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJobProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobProperty" type="{http://www.ecrion.com/xfws/2.0}JobProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJobProperty", propOrder = {
    "jobProperty"
})
public class ArrayOfJobProperty {

    @XmlElement(name = "JobProperty", nillable = true)
    protected List<JobProperty> jobProperty;

    /**
     * Gets the value of the jobProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProperty }
     * 
     * 
     */
    public List<JobProperty> getJobProperty() {
        if (jobProperty == null) {
            jobProperty = new ArrayList<JobProperty>();
        }
        return this.jobProperty;
    }

}
