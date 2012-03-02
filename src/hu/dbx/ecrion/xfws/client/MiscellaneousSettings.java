
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiscellaneousSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceResolverType" type="{http://www.ecrion.com/xfws/2.0}ReferenceResolverType" minOccurs="0"/>
 *         &lt;element name="AutoLayoutRowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImageErrorsHandlingMode" type="{http://www.ecrion.com/xfws/2.0}ImageErrorsHandlingMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousSettings", propOrder = {
    "referenceResolverType",
    "autoLayoutRowCount",
    "imageErrorsHandlingMode"
})
public class MiscellaneousSettings {

    @XmlElement(name = "ReferenceResolverType", defaultValue = "Parallel")
    protected ReferenceResolverType referenceResolverType;
    @XmlElement(name = "AutoLayoutRowCount", defaultValue = "100")
    protected Integer autoLayoutRowCount;
    @XmlElement(name = "ImageErrorsHandlingMode", defaultValue = "IgnoreAndDisplayImageNotFound")
    protected ImageErrorsHandlingMode imageErrorsHandlingMode;

    /**
     * Gets the value of the referenceResolverType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceResolverType }
     *     
     */
    public ReferenceResolverType getReferenceResolverType() {
        return referenceResolverType;
    }

    /**
     * Sets the value of the referenceResolverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceResolverType }
     *     
     */
    public void setReferenceResolverType(ReferenceResolverType value) {
        this.referenceResolverType = value;
    }

    /**
     * Gets the value of the autoLayoutRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoLayoutRowCount() {
        return autoLayoutRowCount;
    }

    /**
     * Sets the value of the autoLayoutRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoLayoutRowCount(Integer value) {
        this.autoLayoutRowCount = value;
    }

    /**
     * Gets the value of the imageErrorsHandlingMode property.
     * 
     * @return
     *     possible object is
     *     {@link ImageErrorsHandlingMode }
     *     
     */
    public ImageErrorsHandlingMode getImageErrorsHandlingMode() {
        return imageErrorsHandlingMode;
    }

    /**
     * Sets the value of the imageErrorsHandlingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageErrorsHandlingMode }
     *     
     */
    public void setImageErrorsHandlingMode(ImageErrorsHandlingMode value) {
        this.imageErrorsHandlingMode = value;
    }

}
