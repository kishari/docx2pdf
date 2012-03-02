
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrayscaleMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrayscaleMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="RGB"/>
 *     &lt;enumeration value="Pattern"/>
 *     &lt;enumeration value="Highlight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrayscaleMethod")
@XmlEnum
public enum GrayscaleMethod {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    RGB("RGB"),
    @XmlEnumValue("Pattern")
    PATTERN("Pattern"),
    @XmlEnumValue("Highlight")
    HIGHLIGHT("Highlight");
    private final String value;

    GrayscaleMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GrayscaleMethod fromValue(String v) {
        for (GrayscaleMethod c: GrayscaleMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
