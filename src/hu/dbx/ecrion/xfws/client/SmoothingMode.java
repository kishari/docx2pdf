
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmoothingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmoothingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AntiAlias"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmoothingMode")
@XmlEnum
public enum SmoothingMode {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("AntiAlias")
    ANTI_ALIAS("AntiAlias");
    private final String value;

    SmoothingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmoothingMode fromValue(String v) {
        for (SmoothingMode c: SmoothingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
