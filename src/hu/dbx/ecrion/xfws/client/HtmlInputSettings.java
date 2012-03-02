
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HtmlInputSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HtmlInputSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PageWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageMarginTop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageMarginLeft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageMarginRight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageMarginBottom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageHeaderMargin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageFooterMargin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowPageNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HtmlInputSettings", propOrder = {
    "pageWidth",
    "pageHeight",
    "pageMarginTop",
    "pageMarginLeft",
    "pageMarginRight",
    "pageMarginBottom",
    "pageHeaderMargin",
    "pageFooterMargin",
    "showPageNumber",
    "showTitle"
})
public class HtmlInputSettings {

    @XmlElement(name = "PageWidth", defaultValue = "auto")
    protected String pageWidth;
    @XmlElement(name = "PageHeight", defaultValue = "auto")
    protected String pageHeight;
    @XmlElement(name = "PageMarginTop", defaultValue = "1in")
    protected String pageMarginTop;
    @XmlElement(name = "PageMarginLeft", defaultValue = "1in")
    protected String pageMarginLeft;
    @XmlElement(name = "PageMarginRight", defaultValue = "1in")
    protected String pageMarginRight;
    @XmlElement(name = "PageMarginBottom", defaultValue = "1in")
    protected String pageMarginBottom;
    @XmlElement(name = "PageHeaderMargin", defaultValue = "0.5in")
    protected String pageHeaderMargin;
    @XmlElement(name = "PageFooterMargin", defaultValue = "0.5in")
    protected String pageFooterMargin;
    @XmlElement(name = "ShowPageNumber", defaultValue = "true")
    protected Boolean showPageNumber;
    @XmlElement(name = "ShowTitle", defaultValue = "true")
    protected Boolean showTitle;

    /**
     * Gets the value of the pageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageWidth() {
        return pageWidth;
    }

    /**
     * Sets the value of the pageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageWidth(String value) {
        this.pageWidth = value;
    }

    /**
     * Gets the value of the pageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageHeight() {
        return pageHeight;
    }

    /**
     * Sets the value of the pageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageHeight(String value) {
        this.pageHeight = value;
    }

    /**
     * Gets the value of the pageMarginTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageMarginTop() {
        return pageMarginTop;
    }

    /**
     * Sets the value of the pageMarginTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageMarginTop(String value) {
        this.pageMarginTop = value;
    }

    /**
     * Gets the value of the pageMarginLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageMarginLeft() {
        return pageMarginLeft;
    }

    /**
     * Sets the value of the pageMarginLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageMarginLeft(String value) {
        this.pageMarginLeft = value;
    }

    /**
     * Gets the value of the pageMarginRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageMarginRight() {
        return pageMarginRight;
    }

    /**
     * Sets the value of the pageMarginRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageMarginRight(String value) {
        this.pageMarginRight = value;
    }

    /**
     * Gets the value of the pageMarginBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageMarginBottom() {
        return pageMarginBottom;
    }

    /**
     * Sets the value of the pageMarginBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageMarginBottom(String value) {
        this.pageMarginBottom = value;
    }

    /**
     * Gets the value of the pageHeaderMargin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageHeaderMargin() {
        return pageHeaderMargin;
    }

    /**
     * Sets the value of the pageHeaderMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageHeaderMargin(String value) {
        this.pageHeaderMargin = value;
    }

    /**
     * Gets the value of the pageFooterMargin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageFooterMargin() {
        return pageFooterMargin;
    }

    /**
     * Sets the value of the pageFooterMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageFooterMargin(String value) {
        this.pageFooterMargin = value;
    }

    /**
     * Gets the value of the showPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPageNumber() {
        return showPageNumber;
    }

    /**
     * Sets the value of the showPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPageNumber(Boolean value) {
        this.showPageNumber = value;
    }

    /**
     * Gets the value of the showTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTitle() {
        return showTitle;
    }

    /**
     * Sets the value of the showTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTitle(Boolean value) {
        this.showTitle = value;
    }

}
