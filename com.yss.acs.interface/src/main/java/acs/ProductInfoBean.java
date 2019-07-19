
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>productInfoBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="productInfoBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fassetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fclgm" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ffullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fjjcldate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fjjdqdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fjjglren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fjjglrendm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fjjlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fjjtgren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fjjtgrendm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fjjzl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsetname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fstartdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fstren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fstrendm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftzfw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productInfoBean", propOrder = {
    "fassetid",
    "fclgm",
    "ffullname",
    "fjjcldate",
    "fjjdqdate",
    "fjjglren",
    "fjjglrendm",
    "fjjlx",
    "fjjtgren",
    "fjjtgrendm",
    "fjjzl",
    "fsetname",
    "fstartdate",
    "fstren",
    "fstrendm",
    "ftaid",
    "ftzfw"
})
public class ProductInfoBean {

    protected String fassetid;
    protected Double fclgm;
    protected String ffullname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fjjcldate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fjjdqdate;
    protected String fjjglren;
    protected String fjjglrendm;
    protected String fjjlx;
    protected String fjjtgren;
    protected String fjjtgrendm;
    protected String fjjzl;
    protected String fsetname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fstartdate;
    protected String fstren;
    protected String fstrendm;
    protected String ftaid;
    protected String ftzfw;

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
     * 获取fclgm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFclgm() {
        return fclgm;
    }

    /**
     * 设置fclgm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFclgm(Double value) {
        this.fclgm = value;
    }

    /**
     * 获取ffullname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfullname() {
        return ffullname;
    }

    /**
     * 设置ffullname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfullname(String value) {
        this.ffullname = value;
    }

    /**
     * 获取fjjcldate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFjjcldate() {
        return fjjcldate;
    }

    /**
     * 设置fjjcldate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFjjcldate(XMLGregorianCalendar value) {
        this.fjjcldate = value;
    }

    /**
     * 获取fjjdqdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFjjdqdate() {
        return fjjdqdate;
    }

    /**
     * 设置fjjdqdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFjjdqdate(XMLGregorianCalendar value) {
        this.fjjdqdate = value;
    }

    /**
     * 获取fjjglren属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjjglren() {
        return fjjglren;
    }

    /**
     * 设置fjjglren属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjjglren(String value) {
        this.fjjglren = value;
    }

    /**
     * 获取fjjglrendm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjjglrendm() {
        return fjjglrendm;
    }

    /**
     * 设置fjjglrendm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjjglrendm(String value) {
        this.fjjglrendm = value;
    }

    /**
     * 获取fjjlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjjlx() {
        return fjjlx;
    }

    /**
     * 设置fjjlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjjlx(String value) {
        this.fjjlx = value;
    }

    /**
     * 获取fjjtgren属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjjtgren() {
        return fjjtgren;
    }

    /**
     * 设置fjjtgren属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjjtgren(String value) {
        this.fjjtgren = value;
    }

    /**
     * 获取fjjtgrendm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjjtgrendm() {
        return fjjtgrendm;
    }

    /**
     * 设置fjjtgrendm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjjtgrendm(String value) {
        this.fjjtgrendm = value;
    }

    /**
     * 获取fjjzl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjjzl() {
        return fjjzl;
    }

    /**
     * 设置fjjzl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjjzl(String value) {
        this.fjjzl = value;
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

    /**
     * 获取fstartdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFstartdate() {
        return fstartdate;
    }

    /**
     * 设置fstartdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFstartdate(XMLGregorianCalendar value) {
        this.fstartdate = value;
    }

    /**
     * 获取fstren属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFstren() {
        return fstren;
    }

    /**
     * 设置fstren属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFstren(String value) {
        this.fstren = value;
    }

    /**
     * 获取fstrendm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFstrendm() {
        return fstrendm;
    }

    /**
     * 设置fstrendm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFstrendm(String value) {
        this.fstrendm = value;
    }

    /**
     * 获取ftaid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtaid() {
        return ftaid;
    }

    /**
     * 设置ftaid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtaid(String value) {
        this.ftaid = value;
    }

    /**
     * 获取ftzfw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtzfw() {
        return ftzfw;
    }

    /**
     * 设置ftzfw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtzfw(String value) {
        this.ftzfw = value;
    }

}
