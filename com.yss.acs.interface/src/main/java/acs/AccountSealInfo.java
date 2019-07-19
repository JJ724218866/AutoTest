
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>accountSealInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="accountSealInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://qsfund.service.webservice.fa.yss.com/}absCheckPo">
 *       &lt;sequence>
 *         &lt;element name="assetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faccsealdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fendcleanval" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fenddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fendshare" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fisseal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flfddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fsealtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsetcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountSealInfo", propOrder = {
    "assetid",
    "faccsealdate",
    "fendcleanval",
    "fenddate",
    "fendshare",
    "fid",
    "fisseal",
    "flfddate",
    "fsealtype",
    "fsetcode"
})
public class AccountSealInfo
    extends AbsCheckPo
{

    protected String assetid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar faccsealdate;
    protected double fendcleanval;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fenddate;
    protected double fendshare;
    protected Long fid;
    protected Boolean fisseal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flfddate;
    protected String fsealtype;
    protected Integer fsetcode;

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
     * ��ȡfaccsealdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFaccsealdate() {
        return faccsealdate;
    }

    /**
     * ����faccsealdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFaccsealdate(XMLGregorianCalendar value) {
        this.faccsealdate = value;
    }

    /**
     * ��ȡfendcleanval���Ե�ֵ��
     * 
     */
    public double getFendcleanval() {
        return fendcleanval;
    }

    /**
     * ����fendcleanval���Ե�ֵ��
     * 
     */
    public void setFendcleanval(double value) {
        this.fendcleanval = value;
    }

    /**
     * ��ȡfenddate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFenddate() {
        return fenddate;
    }

    /**
     * ����fenddate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFenddate(XMLGregorianCalendar value) {
        this.fenddate = value;
    }

    /**
     * ��ȡfendshare���Ե�ֵ��
     * 
     */
    public double getFendshare() {
        return fendshare;
    }

    /**
     * ����fendshare���Ե�ֵ��
     * 
     */
    public void setFendshare(double value) {
        this.fendshare = value;
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
     * ��ȡfisseal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFisseal() {
        return fisseal;
    }

    /**
     * ����fisseal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFisseal(Boolean value) {
        this.fisseal = value;
    }

    /**
     * ��ȡflfddate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlfddate() {
        return flfddate;
    }

    /**
     * ����flfddate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlfddate(XMLGregorianCalendar value) {
        this.flfddate = value;
    }

    /**
     * ��ȡfsealtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsealtype() {
        return fsealtype;
    }

    /**
     * ����fsealtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsealtype(String value) {
        this.fsealtype = value;
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

}
