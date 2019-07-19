
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>shareHolderInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="shareHolderInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://qsfund.service.webservice.fa.yss.com/}absCheckPo">
 *       &lt;sequence>
 *         &lt;element name="assetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faccounttype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ffzsfzmwjhm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fgddm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fgdxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fjysc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkhmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fqsdm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsetCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fstartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ftzbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fzysfzmwjhm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shareHolderInfo", propOrder = {
    "assetid",
    "faccounttype",
    "ffzsfzmwjhm",
    "fgddm",
    "fgdxm",
    "fid",
    "fjysc",
    "fkhmc",
    "fqsdm",
    "fsetCode",
    "fstartDate",
    "ftzbz",
    "fzysfzmwjhm"
})
public class ShareHolderInfo
    extends AbsCheckPo
{

    protected String assetid;
    protected Integer faccounttype;
    protected String ffzsfzmwjhm;
    protected String fgddm;
    protected String fgdxm;
    protected Long fid;
    protected String fjysc;
    protected String fkhmc;
    protected String fqsdm;
    protected Integer fsetCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fstartDate;
    protected String ftzbz;
    protected String fzysfzmwjhm;

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
     * 获取faccounttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaccounttype() {
        return faccounttype;
    }

    /**
     * 设置faccounttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaccounttype(Integer value) {
        this.faccounttype = value;
    }

    /**
     * 获取ffzsfzmwjhm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfzsfzmwjhm() {
        return ffzsfzmwjhm;
    }

    /**
     * 设置ffzsfzmwjhm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfzsfzmwjhm(String value) {
        this.ffzsfzmwjhm = value;
    }

    /**
     * 获取fgddm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFgddm() {
        return fgddm;
    }

    /**
     * 设置fgddm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFgddm(String value) {
        this.fgddm = value;
    }

    /**
     * 获取fgdxm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFgdxm() {
        return fgdxm;
    }

    /**
     * 设置fgdxm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFgdxm(String value) {
        this.fgdxm = value;
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
     * 获取fjysc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjysc() {
        return fjysc;
    }

    /**
     * 设置fjysc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjysc(String value) {
        this.fjysc = value;
    }

    /**
     * 获取fkhmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkhmc() {
        return fkhmc;
    }

    /**
     * 设置fkhmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkhmc(String value) {
        this.fkhmc = value;
    }

    /**
     * 获取fqsdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFqsdm() {
        return fqsdm;
    }

    /**
     * 设置fqsdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFqsdm(String value) {
        this.fqsdm = value;
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
     * 获取ftzbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtzbz() {
        return ftzbz;
    }

    /**
     * 设置ftzbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtzbz(String value) {
        this.ftzbz = value;
    }

    /**
     * 获取fzysfzmwjhm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFzysfzmwjhm() {
        return fzysfzmwjhm;
    }

    /**
     * 设置fzysfzmwjhm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFzysfzmwjhm(String value) {
        this.fzysfzmwjhm = value;
    }

}
