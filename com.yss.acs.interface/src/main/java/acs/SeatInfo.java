
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>seatInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="seatInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://qsfund.service.webservice.fa.yss.com/}absCheckPo">
 *       &lt;sequence>
 *         &lt;element name="assetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fjySc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flinkman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fqsDm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fqsXw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsetCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fstartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fxwLb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seatInfo", propOrder = {
    "assetid",
    "fid",
    "fjySc",
    "flinkman",
    "forg",
    "fphone",
    "fqsDm",
    "fqsXw",
    "fsetCode",
    "fstartDate",
    "fxwLb"
})
public class SeatInfo
    extends AbsCheckPo
{

    protected String assetid;
    protected Long fid;
    protected String fjySc;
    protected String flinkman;
    protected String forg;
    protected String fphone;
    protected String fqsDm;
    protected String fqsXw;
    protected Integer fsetCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fstartDate;
    protected String fxwLb;

    /**
     * 获取assetid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetid() {
        return assetid;
    }

    /**
     * 设置assetid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetid(String value) {
        this.assetid = value;
    }

    /**
     * 获取fid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFid() {
        return fid;
    }

    /**
     * 设置fid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFid(Long value) {
        this.fid = value;
    }

    /**
     * 获取fjySc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjySc() {
        return fjySc;
    }

    /**
     * 设置fjySc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjySc(String value) {
        this.fjySc = value;
    }

    /**
     * 获取flinkman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlinkman() {
        return flinkman;
    }

    /**
     * 设置flinkman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlinkman(String value) {
        this.flinkman = value;
    }

    /**
     * 获取forg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForg() {
        return forg;
    }

    /**
     * 设置forg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForg(String value) {
        this.forg = value;
    }

    /**
     * 获取fphone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFphone() {
        return fphone;
    }

    /**
     * 设置fphone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFphone(String value) {
        this.fphone = value;
    }

    /**
     * 获取fqsDm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFqsDm() {
        return fqsDm;
    }

    /**
     * 设置fqsDm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFqsDm(String value) {
        this.fqsDm = value;
    }

    /**
     * 获取fqsXw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFqsXw() {
        return fqsXw;
    }

    /**
     * 设置fqsXw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFqsXw(String value) {
        this.fqsXw = value;
    }

    /**
     * 获取fsetCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFsetCode() {
        return fsetCode;
    }

    /**
     * 设置fsetCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFsetCode(Integer value) {
        this.fsetCode = value;
    }

    /**
     * 获取fstartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFstartDate() {
        return fstartDate;
    }

    /**
     * 设置fstartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFstartDate(XMLGregorianCalendar value) {
        this.fstartDate = value;
    }

    /**
     * 获取fxwLb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxwLb() {
        return fxwLb;
    }

    /**
     * 设置fxwLb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxwLb(String value) {
        this.fxwLb = value;
    }

}
