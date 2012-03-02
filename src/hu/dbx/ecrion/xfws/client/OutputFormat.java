
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="AFP"/>
 *     &lt;enumeration value="POSTSCRIPT"/>
 *     &lt;enumeration value="WordML"/>
 *     &lt;enumeration value="Silverlight"/>
 *     &lt;enumeration value="XPS"/>
 *     &lt;enumeration value="TIFF"/>
 *     &lt;enumeration value="PRN"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="JPEG"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="SVG"/>
 *     &lt;enumeration value="PPTX"/>
 *     &lt;enumeration value="EPUB"/>
 *     &lt;enumeration value="IOCA"/>
 *     &lt;enumeration value="TXT"/>
 *     &lt;enumeration value="DOCX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputFormat")
@XmlEnum
public enum OutputFormat {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    PDF("PDF"),
    AFP("AFP"),
    POSTSCRIPT("POSTSCRIPT"),
    @XmlEnumValue("WordML")
    WORD_ML("WordML"),
    @XmlEnumValue("Silverlight")
    SILVERLIGHT("Silverlight"),
    XPS("XPS"),
    TIFF("TIFF"),
    PRN("PRN"),
    HTML("HTML"),
    JPEG("JPEG"),
    GIF("GIF"),
    PNG("PNG"),
    SVG("SVG"),
    PPTX("PPTX"),
    EPUB("EPUB"),
    IOCA("IOCA"),
    TXT("TXT"),
    DOCX("DOCX");
    private final String value;

    OutputFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputFormat fromValue(String v) {
        for (OutputFormat c: OutputFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
