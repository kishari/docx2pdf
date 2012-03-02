
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XsltEngine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XsltEngine">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MSXML"/>
 *     &lt;enumeration value="DotNet20"/>
 *     &lt;enumeration value="Saxon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XsltEngine")
@XmlEnum
public enum XsltEngine {

    MSXML("MSXML"),
    @XmlEnumValue("DotNet20")
    DOT_NET_20("DotNet20"),
    @XmlEnumValue("Saxon")
    SAXON("Saxon");
    private final String value;

    XsltEngine(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XsltEngine fromValue(String v) {
        for (XsltEngine c: XsltEngine.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
