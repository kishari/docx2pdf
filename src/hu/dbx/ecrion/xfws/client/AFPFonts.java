
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AFPFonts.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AFPFonts">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NativeRasterFonts"/>
 *     &lt;enumeration value="NativeOutlineFonts"/>
 *     &lt;enumeration value="TTF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AFPFonts")
@XmlEnum
public enum AFPFonts {

    @XmlEnumValue("NativeRasterFonts")
    NATIVE_RASTER_FONTS("NativeRasterFonts"),
    @XmlEnumValue("NativeOutlineFonts")
    NATIVE_OUTLINE_FONTS("NativeOutlineFonts"),
    TTF("TTF");
    private final String value;

    AFPFonts(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AFPFonts fromValue(String v) {
        for (AFPFonts c: AFPFonts.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
