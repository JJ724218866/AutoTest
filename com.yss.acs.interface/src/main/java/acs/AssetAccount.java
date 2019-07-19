
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>assetAccount complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfaccount���Ե�ֵ��
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
     * ����faccount���Ե�ֵ��
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
     * ��ȡfaccountfx���Ե�ֵ��
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
     * ����faccountfx���Ե�ֵ��
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
     * ��ȡfaccountlx���Ե�ֵ��
     * 
     */
    public int getFaccountlx() {
        return faccountlx;
    }

    /**
     * ����faccountlx���Ե�ֵ��
     * 
     */
    public void setFaccountlx(int value) {
        this.faccountlx = value;
    }

    /**
     * ��ȡfaccountname���Ե�ֵ��
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
     * ����faccountname���Ե�ֵ��
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
     * ��ȡfaccountrange���Ե�ֵ��
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
     * ����faccountrange���Ե�ֵ��
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
     * ��ȡfarea���Ե�ֵ��
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
     * ����farea���Ե�ֵ��
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
     * ��ȡfbank���Ե�ֵ��
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
     * ����fbank���Ե�ֵ��
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
     * ��ȡfcurycode���Ե�ֵ��
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
     * ����fcurycode���Ե�ֵ��
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
     * ��ȡfmasterid���Ե�ֵ��
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
     * ����fmasterid���Ե�ֵ��
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
     * ��ȡfname���Ե�ֵ��
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
     * ����fname���Ե�ֵ��
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
     * ��ȡfoperationtype���Ե�ֵ��
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
     * ����foperationtype���Ե�ֵ��
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
     * ��ȡfremark���Ե�ֵ��
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
     * ����fremark���Ե�ֵ��
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
     * ��ȡfsetcode���Ե�ֵ��
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
     * ����fsetcode���Ե�ֵ��
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
     * ��ȡfstartdate���Ե�ֵ��
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
     * ����fstartdate���Ե�ֵ��
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
     * ��ȡftype���Ե�ֵ��
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
     * ����ftype���Ե�ֵ��
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
     * ��ȡftyzt���Ե�ֵ��
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
     * ����ftyzt���Ե�ֵ��
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
     * ��ȡfwdh���Ե�ֵ��
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
     * ����fwdh���Ե�ֵ��
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
     * ��ȡfyhkm���Ե�ֵ��
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
     * ����fyhkm���Ե�ֵ��
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
     * ��ȡfyt���Ե�ֵ��
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
     * ����fyt���Ե�ֵ��
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
