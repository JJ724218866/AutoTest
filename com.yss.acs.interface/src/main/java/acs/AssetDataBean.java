
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>assetDataBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="assetDataBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fassetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ffullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fjjcldate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fjjdqdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fjjlx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fsetname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetDataBean", propOrder = {
    "fassetid",
    "ffullname",
    "fjjcldate",
    "fjjdqdate",
    "fjjlx",
    "fsetname",
    "ftaid"
})
public class AssetDataBean {

    protected String fassetid;
    protected String ffullname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fjjcldate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fjjdqdate;
    protected Integer fjjlx;
    protected String fsetname;
    protected String ftaid;

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
     * 获取fjjlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFjjlx() {
        return fjjlx;
    }

    /**
     * 设置fjjlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFjjlx(Integer value) {
        this.fjjlx = value;
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

}
