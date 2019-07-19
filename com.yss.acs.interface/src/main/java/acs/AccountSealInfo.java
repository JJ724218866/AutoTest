
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>accountSealInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取faccsealdate属性的值。
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
     * 设置faccsealdate属性的值。
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
     * 获取fendcleanval属性的值。
     * 
     */
    public double getFendcleanval() {
        return fendcleanval;
    }

    /**
     * 设置fendcleanval属性的值。
     * 
     */
    public void setFendcleanval(double value) {
        this.fendcleanval = value;
    }

    /**
     * 获取fenddate属性的值。
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
     * 设置fenddate属性的值。
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
     * 获取fendshare属性的值。
     * 
     */
    public double getFendshare() {
        return fendshare;
    }

    /**
     * 设置fendshare属性的值。
     * 
     */
    public void setFendshare(double value) {
        this.fendshare = value;
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
     * 获取fisseal属性的值。
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
     * 设置fisseal属性的值。
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
     * 获取flfddate属性的值。
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
     * 设置flfddate属性的值。
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
     * 获取fsealtype属性的值。
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
     * 设置fsealtype属性的值。
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

}
