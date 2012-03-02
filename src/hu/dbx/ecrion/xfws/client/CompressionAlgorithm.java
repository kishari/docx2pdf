
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompressionAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompressionAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CCITT3"/>
 *     &lt;enumeration value="CCITT4"/>
 *     &lt;enumeration value="LZW"/>
 *     &lt;enumeration value="RLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompressionAlgorithm")
@XmlEnum
public enum CompressionAlgorithm {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("CCITT3")
    CCITT_3("CCITT3"),
    @XmlEnumValue("CCITT4")
    CCITT_4("CCITT4"),
    LZW("LZW"),
    RLE("RLE");
    private final String value;

    CompressionAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompressionAlgorithm fromValue(String v) {
        for (CompressionAlgorithm c: CompressionAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
