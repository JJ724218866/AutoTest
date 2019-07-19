
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>totalAssets complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="totalAssets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fassetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fassets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="flastdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsetname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totalAssets", propOrder = {
    "fassetid",
    "fassets",
    "flastdate",
    "fsetname"
})
public class TotalAssets {

    protected String fassetid;
    protected Double fassets;
    protected String flastdate;
    protected String fsetname;

    /**
     * 获取fassetid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFassetid() {
        return fassetid;
    }

    /**
     * 设置fassetid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFassetid(String value) {
        this.fassetid = value;
    }

    /**
     * 获取fassets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFassets() {
        return fassets;
    }

    /**
     * 设置fassets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFassets(Double value) {
        this.fassets = value;
    }

    /**
     * 获取flastdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlastdate() {
        return flastdate;
    }

    /**
     * 设置flastdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlastdate(String value) {
        this.flastdate = value;
    }

    /**
     * 获取fsetname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsetname() {
        return fsetname;
    }

    /**
     * 设置fsetname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsetname(String value) {
        this.fsetname = value;
    }

}
