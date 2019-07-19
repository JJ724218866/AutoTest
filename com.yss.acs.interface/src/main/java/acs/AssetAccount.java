
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>assetAccount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="assetAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://qsfund.service.webservice.fa.yss.com/}absCheckPo">
 *       &lt;sequence>
 *         &lt;element name="assetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faccountfx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faccountlx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="faccountname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faccountrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faccounttype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="farea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fbank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fcurycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fmasterid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foperationtype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsetcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fstartdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ftype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftyzt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fwdh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fyhkm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fyt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetAccount", propOrder = {
    "assetid",
    "faccount",
    "faccountfx",
    "faccountlx",
    "faccountname",
    "faccountrange",
    "faccounttype",
    "farea",
    "fbank",
    "fcurycode",
    "fid",
    "fmasterid",
    "fname",
    "foperationtype",
    "fremark",
    "fsetcode",
    "fstartdate",
    "ftype",
    "ftyzt",
    "fwdh",
    "fyhkm",
    "fyt"
})
public class AssetAccount
    extends AbsCheckPo
{

    protected String assetid;
    protected String faccount;
    protected Integer faccountfx;
    protected int faccountlx;
    protected String faccountname;
    protected String faccountrange;
    protected Integer faccounttype;
    protected String farea;
    protected String fbank;
    protected String fcurycode;
    protected Long fid;
    protected String fmasterid;
    protected String fname;
    protected Integer foperationtype;
    protected String fremark;
    protected Integer fsetcode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fstartdate;
    protected String ftype;
    protected Integer ftyzt;
    protected String fwdh;
    protected String fyhkm;
    protected String fyt;

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
     * 获取faccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaccount() {
        return faccount;
    }

    /**
     * 设置faccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaccount(String value) {
        this.faccount = value;
    }

    /**
     * 获取faccountfx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaccountfx() {
        return faccountfx;
    }

    /**
     * 设置faccountfx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaccountfx(Integer value) {
        this.faccountfx = value;
    }

    /**
     * 获取faccountlx属性的值。
     * 
     */
    public int getFaccountlx() {
        return faccountlx;
    }

    /**
     * 设置faccountlx属性的值。
     * 
     */
    public void setFaccountlx(int value) {
        this.faccountlx = value;
    }

    /**
     * 获取faccountname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaccountname() {
        return faccountname;
    }

    /**
     * 设置faccountname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaccountname(String value) {
        this.faccountname = value;
    }

    /**
     * 获取faccountrange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaccountrange() {
        return faccountrange;
    }

    /**
     * 设置faccountrange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaccountrange(String value) {
        this.faccountrange = value;
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
     * 获取farea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarea() {
        return farea;
    }

    /**
     * 设置farea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarea(String value) {
        this.farea = value;
    }

    /**
     * 获取fbank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbank() {
        return fbank;
    }

    /**
     * 设置fbank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbank(String value) {
        this.fbank = value;
    }

    /**
     * 获取fcurycode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcurycode() {
        return fcurycode;
    }

    /**
     * 设置fcurycode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcurycode(String value) {
        this.fcurycode = value;
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
     * 获取fmasterid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmasterid() {
        return fmasterid;
    }

    /**
     * 设置fmasterid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmasterid(String value) {
        this.fmasterid = value;
    }

    /**
     * 获取fname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFname() {
        return fname;
    }

    /**
     * 设置fname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFname(String value) {
        this.fname = value;
    }

    /**
     * 获取foperationtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFoperationtype() {
        return foperationtype;
    }

    /**
     * 设置foperationtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFoperationtype(Integer value) {
        this.foperationtype = value;
    }

    /**
     * 获取fremark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFremark() {
        return fremark;
    }

    /**
     * 设置fremark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFremark(String value) {
        this.fremark = value;
    }

    /**
     * 获取fsetcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFsetcode() {
        return fsetcode;
    }

    /**
     * 设置fsetcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFsetcode(Integer value) {
        this.fsetcode = value;
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
     * 获取ftype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtype() {
        return ftype;
    }

    /**
     * 设置ftype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtype(String value) {
        this.ftype = value;
    }

    /**
     * 获取ftyzt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFtyzt() {
        return ftyzt;
    }

    /**
     * 设置ftyzt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFtyzt(Integer value) {
        this.ftyzt = value;
    }

    /**
     * 获取fwdh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdh() {
        return fwdh;
    }

    /**
     * 设置fwdh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdh(String value) {
        this.fwdh = value;
    }

    /**
     * 获取fyhkm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFyhkm() {
        return fyhkm;
    }

    /**
     * 设置fyhkm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFyhkm(String value) {
        this.fyhkm = value;
    }

    /**
     * 获取fyt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFyt() {
        return fyt;
    }

    /**
     * 设置fyt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFyt(String value) {
        this.fyt = value;
    }

}
