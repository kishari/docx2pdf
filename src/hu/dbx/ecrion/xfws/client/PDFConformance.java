
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFConformance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFConformance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF14"/>
 *     &lt;enumeration value="PDFX"/>
 *     &lt;enumeration value="PDFA1A"/>
 *     &lt;enumeration value="PDFA1B"/>
 *     &lt;enumeration value="PDF508"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDFConformance")
@XmlEnum
public enum PDFConformance {

    @XmlEnumValue("PDF14")
    PDF_14("PDF14"),
    PDFX("PDFX"),
    @XmlEnumValue("PDFA1A")
    PDFA_1_A("PDFA1A"),
    @XmlEnumValue("PDFA1B")
    PDFA_1_B("PDFA1B"),
    @XmlEnumValue("PDF508")
    PDF_508("PDF508");
    private final String value;

    PDFConformance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDFConformance fromValue(String v) {
        for (PDFConformance c: PDFConformance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
