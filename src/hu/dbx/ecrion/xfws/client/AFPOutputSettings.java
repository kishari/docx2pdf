
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFPOutputSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AFPOutputSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fonts" type="{http://www.ecrion.com/xfws/2.0}AFPFonts" minOccurs="0"/>
 *         &lt;element name="EmbedFonts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WriteSentinels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Grayscale" type="{http://www.ecrion.com/xfws/2.0}GrayscaleMethod" minOccurs="0"/>
 *         &lt;element name="AutoRotateLandscapePages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AFPOutputSettings", propOrder = {
    "fonts",
    "embedFonts",
    "writeSentinels",
    "grayscale",
    "autoRotateLandscapePages"
})
public class AFPOutputSettings {

    @XmlElement(name = "Fonts", defaultValue = "NativeRasterFonts")
    protected AFPFonts fonts;
    @XmlElement(name = "EmbedFonts", defaultValue = "false")
    protected Boolean embedFonts;
    @XmlElement(name = "WriteSentinels", defaultValue = "false")
    protected Boolean writeSentinels;
    @XmlElement(name = "Grayscale", defaultValue = "Disabled")
    protected GrayscaleMethod grayscale;
    @XmlElement(name = "AutoRotateLandscapePages", defaultValue = "false")
    protected Boolean autoRotateLandscapePages;

    /**
     * Gets the value of the fonts property.
     * 
     * @return
     *     possible object is
     *     {@link AFPFonts }
     *     
     */
    public AFPFonts getFonts() {
        return fonts;
    }

    /**
     * Sets the value of the fonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AFPFonts }
     *     
     */
    public void setFonts(AFPFonts value) {
        this.fonts = value;
    }

    /**
     * Gets the value of the embedFonts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmbedFonts() {
        return embedFonts;
    }

    /**
     * Sets the value of the embedFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedFonts(Boolean value) {
        this.embedFonts = value;
    }

    /**
     * Gets the value of the writeSentinels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWriteSentinels() {
        return writeSentinels;
    }

    /**
     * Sets the value of the writeSentinels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteSentinels(Boolean value) {
        this.writeSentinels = value;
    }

    /**
     * Gets the value of the grayscale property.
     * 
     * @return
     *     possible object is
     *     {@link GrayscaleMethod }
     *     
     */
    public GrayscaleMethod getGrayscale() {
        return grayscale;
    }

    /**
     * Sets the value of the grayscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrayscaleMethod }
     *     
     */
    public void setGrayscale(GrayscaleMethod value) {
        this.grayscale = value;
    }

    /**
     * Gets the value of the autoRotateLandscapePages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRotateLandscapePages() {
        return autoRotateLandscapePages;
    }

    /**
     * Sets the value of the autoRotateLandscapePages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRotateLandscapePages(Boolean value) {
        this.autoRotateLandscapePages = value;
    }

}
