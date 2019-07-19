
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>shareHolderInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡassetid���Ե�ֵ��
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
     * ����assetid���Ե�ֵ��
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
     * ��ȡfaccounttype���Ե�ֵ��
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
     * ����faccounttype���Ե�ֵ��
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
     * ��ȡffzsfzmwjhm���Ե�ֵ��
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
     * ����ffzsfzmwjhm���Ե�ֵ��
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
     * ��ȡfgddm���Ե�ֵ��
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
     * ����fgddm���Ե�ֵ��
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
     * ��ȡfgdxm���Ե�ֵ��
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
     * ����fgdxm���Ե�ֵ��
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
     * ��ȡfid���Ե�ֵ��
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
     * ����fid���Ե�ֵ��
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
     * ��ȡfjysc���Ե�ֵ��
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
     * ����fjysc���Ե�ֵ��
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
     * ��ȡfkhmc���Ե�ֵ��
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
     * ����fkhmc���Ե�ֵ��
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
     * ��ȡfqsdm���Ե�ֵ��
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
     * ����fqsdm���Ե�ֵ��
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
     * ��ȡfsetCode���Ե�ֵ��
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
     * ����fsetCode���Ե�ֵ��
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
     * ��ȡfstartDate���Ե�ֵ��
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
     * ����fstartDate���Ե�ֵ��
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
     * ��ȡftzbz���Ե�ֵ��
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
     * ����ftzbz���Ե�ֵ��
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
     * ��ȡfzysfzmwjhm���Ե�ֵ��
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
     * ����fzysfzmwjhm���Ե�ֵ��
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
