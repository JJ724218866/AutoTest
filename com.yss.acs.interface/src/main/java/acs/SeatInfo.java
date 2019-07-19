
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>seatInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfjySc���Ե�ֵ��
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
     * ����fjySc���Ե�ֵ��
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
     * ��ȡflinkman���Ե�ֵ��
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
     * ����flinkman���Ե�ֵ��
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
     * ��ȡforg���Ե�ֵ��
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
     * ����forg���Ե�ֵ��
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
     * ��ȡfphone���Ե�ֵ��
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
     * ����fphone���Ե�ֵ��
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
     * ��ȡfqsDm���Ե�ֵ��
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
     * ����fqsDm���Ե�ֵ��
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
     * ��ȡfqsXw���Ե�ֵ��
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
     * ����fqsXw���Ե�ֵ��
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
     * ��ȡfxwLb���Ե�ֵ��
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
     * ����fxwLb���Ե�ֵ��
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
