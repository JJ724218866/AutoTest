
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cwjySj complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="cwjySj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fassetid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fcjrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fdqrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fhgts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fhkje" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fhklx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fhkrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cwjySj", propOrder = {
    "fassetid",
    "fbz",
    "fcjrq",
    "fdqrq",
    "fhgts",
    "fhkje",
    "fhklx",
    "fhkrq"
})
public class CwjySj {

    protected String fassetid;
    protected String fbz;
    protected String fcjrq;
    protected String fdqrq;
    protected Double fhgts;
    protected Double fhkje;
    protected String fhklx;
    protected String fhkrq;

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
     * ��ȡfbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFbz() {
        return fbz;
    }

    /**
     * ����fbz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFbz(String value) {
        this.fbz = value;
    }

    /**
     * ��ȡfcjrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcjrq() {
        return fcjrq;
    }

    /**
     * ����fcjrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcjrq(String value) {
        this.fcjrq = value;
    }

    /**
     * ��ȡfdqrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdqrq() {
        return fdqrq;
    }

    /**
     * ����fdqrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdqrq(String value) {
        this.fdqrq = value;
    }

    /**
     * ��ȡfhgts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFhgts() {
        return fhgts;
    }

    /**
     * ����fhgts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFhgts(Double value) {
        this.fhgts = value;
    }

    /**
     * ��ȡfhkje���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFhkje() {
        return fhkje;
    }

    /**
     * ����fhkje���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFhkje(Double value) {
        this.fhkje = value;
    }

    /**
     * ��ȡfhklx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFhklx() {
        return fhklx;
    }

    /**
     * ����fhklx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFhklx(String value) {
        this.fhklx = value;
    }

    /**
     * ��ȡfhkrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFhkrq() {
        return fhkrq;
    }

    /**
     * ����fhkrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFhkrq(String value) {
        this.fhkrq = value;
    }

}
