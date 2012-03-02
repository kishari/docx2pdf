
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HtmlOutputSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HtmlOutputSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenerateHtmlDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseFixedBodyWidth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideStaticContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RenderedImagesBaseUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RenderedImagesOutputFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HtmlOutputSettings", propOrder = {
    "generateHtmlDocument",
    "useFixedBodyWidth",
    "hideStaticContent",
    "renderedImagesBaseUrl",
    "renderedImagesOutputFolder"
})
public class HtmlOutputSettings {

    @XmlElement(name = "GenerateHtmlDocument", defaultValue = "true")
    protected Boolean generateHtmlDocument;
    @XmlElement(name = "UseFixedBodyWidth", defaultValue = "true")
    protected Boolean useFixedBodyWidth;
    @XmlElement(name = "HideStaticContent", defaultValue = "false")
    protected Boolean hideStaticContent;
    @XmlElement(name = "RenderedImagesBaseUrl", defaultValue = "")
    protected String renderedImagesBaseUrl;
    @XmlElement(name = "RenderedImagesOutputFolder", defaultValue = "")
    protected String renderedImagesOutputFolder;

    /**
     * Gets the value of the generateHtmlDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateHtmlDocument() {
        return generateHtmlDocument;
    }

    /**
     * Sets the value of the generateHtmlDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateHtmlDocument(Boolean value) {
        this.generateHtmlDocument = value;
    }

    /**
     * Gets the value of the useFixedBodyWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFixedBodyWidth() {
        return useFixedBodyWidth;
    }

    /**
     * Sets the value of the useFixedBodyWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFixedBodyWidth(Boolean value) {
        this.useFixedBodyWidth = value;
    }

    /**
     * Gets the value of the hideStaticContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideStaticContent() {
        return hideStaticContent;
    }

    /**
     * Sets the value of the hideStaticContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideStaticContent(Boolean value) {
        this.hideStaticContent = value;
    }

    /**
     * Gets the value of the renderedImagesBaseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderedImagesBaseUrl() {
        return renderedImagesBaseUrl;
    }

    /**
     * Sets the value of the renderedImagesBaseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderedImagesBaseUrl(String value) {
        this.renderedImagesBaseUrl = value;
    }

    /**
     * Gets the value of the renderedImagesOutputFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderedImagesOutputFolder() {
        return renderedImagesOutputFolder;
    }

    /**
     * Sets the value of the renderedImagesOutputFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderedImagesOutputFolder(String value) {
        this.renderedImagesOutputFolder = value;
    }

}
