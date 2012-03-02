
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageErrorsHandlingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageErrorsHandlingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ThrowError"/>
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="IgnoreAndDisplayImageNotFound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageErrorsHandlingMode")
@XmlEnum
public enum ImageErrorsHandlingMode {

    @XmlEnumValue("ThrowError")
    THROW_ERROR("ThrowError"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("IgnoreAndDisplayImageNotFound")
    IGNORE_AND_DISPLAY_IMAGE_NOT_FOUND("IgnoreAndDisplayImageNotFound");
    private final String value;

    ImageErrorsHandlingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageErrorsHandlingMode fromValue(String v) {
        for (ImageErrorsHandlingMode c: ImageErrorsHandlingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
