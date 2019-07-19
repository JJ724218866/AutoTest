
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>productInfoBean complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfassetid���Ե�ֵ��
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
     * ����fassetid���Ե�ֵ��
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
     * ��ȡfclgm���Ե�ֵ��
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
     * ����fclgm���Ե�ֵ��
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
     * ��ȡffullname���Ե�ֵ��
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
     * ����ffullname���Ե�ֵ��
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
     * ��ȡfjjcldate���Ե�ֵ��
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
     * ����fjjcldate���Ե�ֵ��
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
     * ��ȡfjjdqdate���Ե�ֵ��
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
     * ����fjjdqdate���Ե�ֵ��
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
     * ��ȡfjjglren���Ե�ֵ��
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
     * ����fjjglren���Ե�ֵ��
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
     * ��ȡfjjglrendm���Ե�ֵ��
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
     * ����fjjglrendm���Ե�ֵ��
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
     * ��ȡfjjlx���Ե�ֵ��
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
     * ����fjjlx���Ե�ֵ��
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
     * ��ȡfjjtgren���Ե�ֵ��
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
     * ����fjjtgren���Ե�ֵ��
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
     * ��ȡfjjtgrendm���Ե�ֵ��
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
     * ����fjjtgrendm���Ե�ֵ��
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
     * ��ȡfjjzl���Ե�ֵ��
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
     * ����fjjzl���Ե�ֵ��
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
     * ��ȡfsetname���Ե�ֵ��
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
     * ����fsetname���Ե�ֵ��
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
     * ��ȡfstren���Ե�ֵ��
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
     * ����fstren���Ե�ֵ��
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
     * ��ȡfstrendm���Ե�ֵ��
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
     * ����fstrendm���Ե�ֵ��
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
     * ��ȡftaid���Ե�ֵ��
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
     * ����ftaid���Ե�ֵ��
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
     * ��ȡftzfw���Ե�ֵ��
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
     * ����ftzfw���Ե�ֵ��
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
