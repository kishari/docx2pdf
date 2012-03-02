
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASCII"/>
 *     &lt;enumeration value="UTF16"/>
 *     &lt;enumeration value="UTF8"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputEncoding")
@XmlEnum
public enum OutputEncoding {

    ASCII("ASCII"),
    @XmlEnumValue("UTF16")
    UTF_16("UTF16"),
    @XmlEnumValue("UTF8")
    UTF_8("UTF8");
    private final String value;

    OutputEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputEncoding fromValue(String v) {
        for (OutputEncoding c: OutputEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
