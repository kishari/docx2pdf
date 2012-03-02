
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RasterOutputSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RasterOutputSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompressionAlgorithm" type="{http://www.ecrion.com/xfws/2.0}CompressionAlgorithm" minOccurs="0"/>
 *         &lt;element name="ZoomFactor" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="XResolution" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="YResolution" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SmoothingMode" type="{http://www.ecrion.com/xfws/2.0}SmoothingMode" minOccurs="0"/>
 *         &lt;element name="PageIdx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImageTransparentBackground" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImageScaleWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImageScaleHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RasterOutputSettings", propOrder = {
    "compressionAlgorithm",
    "zoomFactor",
    "xResolution",
    "yResolution",
    "smoothingMode",
    "pageIdx",
    "imageTransparentBackground",
    "imageScaleWidth",
    "imageScaleHeight"
})
public class RasterOutputSettings {

    @XmlElement(name = "CompressionAlgorithm", defaultValue = "None")
    protected CompressionAlgorithm compressionAlgorithm;
    @XmlElement(name = "ZoomFactor", defaultValue = "100")
    protected Float zoomFactor;
    @XmlElement(name = "XResolution", defaultValue = "0")
    protected Integer xResolution;
    @XmlElement(name = "YResolution", defaultValue = "0")
    protected Integer yResolution;
    @XmlElement(name = "SmoothingMode", defaultValue = "Default")
    protected SmoothingMode smoothingMode;
    @XmlElement(name = "PageIdx", defaultValue = "-1")
    protected Integer pageIdx;
    @XmlElement(name = "ImageTransparentBackground", defaultValue = "false")
    protected Boolean imageTransparentBackground;
    @XmlElement(name = "ImageScaleWidth", defaultValue = "-1")
    protected Integer imageScaleWidth;
    @XmlElement(name = "ImageScaleHeight", defaultValue = "-1")
    protected Integer imageScaleHeight;

    /**
     * Gets the value of the compressionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionAlgorithm }
     *     
     */
    public CompressionAlgorithm getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    /**
     * Sets the value of the compressionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionAlgorithm }
     *     
     */
    public void setCompressionAlgorithm(CompressionAlgorithm value) {
        this.compressionAlgorithm = value;
    }

    /**
     * Gets the value of the zoomFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getZoomFactor() {
        return zoomFactor;
    }

    /**
     * Sets the value of the zoomFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setZoomFactor(Float value) {
        this.zoomFactor = value;
    }

    /**
     * Gets the value of the xResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXResolution() {
        return xResolution;
    }

    /**
     * Sets the value of the xResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXResolution(Integer value) {
        this.xResolution = value;
    }

    /**
     * Gets the value of the yResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYResolution() {
        return yResolution;
    }

    /**
     * Sets the value of the yResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYResolution(Integer value) {
        this.yResolution = value;
    }

    /**
     * Gets the value of the smoothingMode property.
     * 
     * @return
     *     possible object is
     *     {@link SmoothingMode }
     *     
     */
    public SmoothingMode getSmoothingMode() {
        return smoothingMode;
    }

    /**
     * Sets the value of the smoothingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmoothingMode }
     *     
     */
    public void setSmoothingMode(SmoothingMode value) {
        this.smoothingMode = value;
    }

    /**
     * Gets the value of the pageIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIdx() {
        return pageIdx;
    }

    /**
     * Sets the value of the pageIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIdx(Integer value) {
        this.pageIdx = value;
    }

    /**
     * Gets the value of the imageTransparentBackground property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImageTransparentBackground() {
        return imageTransparentBackground;
    }

    /**
     * Sets the value of the imageTransparentBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImageTransparentBackground(Boolean value) {
        this.imageTransparentBackground = value;
    }

    /**
     * Gets the value of the imageScaleWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageScaleWidth() {
        return imageScaleWidth;
    }

    /**
     * Sets the value of the imageScaleWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageScaleWidth(Integer value) {
        this.imageScaleWidth = value;
    }

    /**
     * Gets the value of the imageScaleHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageScaleHeight() {
        return imageScaleHeight;
    }

    /**
     * Sets the value of the imageScaleHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageScaleHeight(Integer value) {
        this.imageScaleHeight = value;
    }

}
