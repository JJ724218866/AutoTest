
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cwjySj complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="cwjySj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fassetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fcjrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fdqrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fhgts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fhkje" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fhklx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fhkrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cwjySj", propOrder = {
    "fassetid",
    "fbz",
    "fcjrq",
    "fdqrq",
    "fhgts",
    "fhkje",
    "fhklx",
    "fhkrq"
})
public class CwjySj {

    protected String fassetid;
    protected String fbz;
    protected String fcjrq;
    protected String fdqrq;
    protected Double fhgts;
    protected Double fhkje;
    protected String fhklx;
    protected String fhkrq;

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
     * 获取fbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbz() {
        return fbz;
    }

    /**
     * 设置fbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbz(String value) {
        this.fbz = value;
    }

    /**
     * 获取fcjrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcjrq() {
        return fcjrq;
    }

    /**
     * 设置fcjrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcjrq(String value) {
        this.fcjrq = value;
    }

    /**
     * 获取fdqrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdqrq() {
        return fdqrq;
    }

    /**
     * 设置fdqrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdqrq(String value) {
        this.fdqrq = value;
    }

    /**
     * 获取fhgts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFhgts() {
        return fhgts;
    }

    /**
     * 设置fhgts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFhgts(Double value) {
        this.fhgts = value;
    }

    /**
     * 获取fhkje属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFhkje() {
        return fhkje;
    }

    /**
     * 设置fhkje属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFhkje(Double value) {
        this.fhkje = value;
    }

    /**
     * 获取fhklx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFhklx() {
        return fhklx;
    }

    /**
     * 设置fhklx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFhklx(String value) {
        this.fhklx = value;
    }

    /**
     * 获取fhkrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFhkrq() {
        return fhkrq;
    }

    /**
     * 设置fhkrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFhkrq(String value) {
        this.fhkrq = value;
    }

}
