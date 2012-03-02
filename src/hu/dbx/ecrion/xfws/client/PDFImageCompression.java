
package hu.dbx.ecrion.xfws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFImageCompression.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFImageCompression">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLAT"/>
 *     &lt;enumeration value="JPEG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDFImageCompression")
@XmlEnum
public enum PDFImageCompression {

    FLAT,
    JPEG;

    public String value() {
        return name();
    }

    public static PDFImageCompression fromValue(String v) {
        return valueOf(v);
    }

}
