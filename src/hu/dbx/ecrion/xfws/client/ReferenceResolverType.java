
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceResolverType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceResolverType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Parallel"/>
 *     &lt;enumeration value="Serial"/>
 *     &lt;enumeration value="Disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferenceResolverType")
@XmlEnum
public enum ReferenceResolverType {

    @XmlEnumValue("Parallel")
    PARALLEL("Parallel"),
    @XmlEnumValue("Serial")
    SERIAL("Serial"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled");
    private final String value;

    ReferenceResolverType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferenceResolverType fromValue(String v) {
        for (ReferenceResolverType c: ReferenceResolverType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
