
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InputFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="XSLFO"/>
 *     &lt;enumeration value="SVG"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="WordML"/>
 *     &lt;enumeration value="DocX"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="EPS"/>
 *     &lt;enumeration value="DAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InputFormat")
@XmlEnum
public enum InputFormat {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    XSLFO("XSLFO"),
    SVG("SVG"),
    XML("XML"),
    @XmlEnumValue("WordML")
    WORD_ML("WordML"),
    @XmlEnumValue("DocX")
    DOC_X("DocX"),
    PDF("PDF"),
    HTML("HTML"),
    EPS("EPS"),
    DAL("DAL");
    private final String value;

    InputFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputFormat fromValue(String v) {
        for (InputFormat c: InputFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
