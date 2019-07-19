
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>shareHolderCheck complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="shareHolderCheck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ffxj" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fghf" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fgzlx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fhgsy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fje" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fjsf" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fjslx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fjysc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkdzzt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fqtf" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsjly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fyhs" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fywbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fzgf" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fzqbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shareHolderCheck", propOrder = {
    "assetId",
    "fdate",
    "ffxj",
    "fghf",
    "fgzlx",
    "fhgsy",
    "fje",
    "fjsf",
    "fjslx",
    "fjysc",
    "fkdzzt",
    "fqtf",
    "fsc",
    "fsjly",
    "fyhs",
    "fywbz",
    "fzgf",
    "fzqbz"
})
public class ShareHolderCheck {

    protected String assetId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fdate;
    protected Double ffxj;
    protected Double fghf;
    protected Double fgzlx;
    protected Double fhgsy;
    protected Double fje;
    protected Double fjsf;
    protected String fjslx;
    protected String fjysc;
    protected Boolean fkdzzt;
    protected Double fqtf;
    protected String fsc;
    protected String fsjly;
    protected Double fyhs;
    protected String fywbz;
    protected Double fzgf;
    protected String fzqbz;

    /**
     * ��ȡassetId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * ����assetId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * ��ȡfdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFdate() {
        return fdate;
    }

    /**
     * ����fdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFdate(XMLGregorianCalendar value) {
        this.fdate = value;
    }

    /**
     * ��ȡffxj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFfxj() {
        return ffxj;
    }

    /**
     * ����ffxj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFfxj(Double value) {
        this.ffxj = value;
    }

    /**
     * ��ȡfghf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFghf() {
        return fghf;
    }

    /**
     * ����fghf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFghf(Double value) {
        this.fghf = value;
    }

    /**
     * ��ȡfgzlx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFgzlx() {
        return fgzlx;
    }

    /**
     * ����fgzlx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFgzlx(Double value) {
        this.fgzlx = value;
    }

    /**
     * ��ȡfhgsy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFhgsy() {
        return fhgsy;
    }

    /**
     * ����fhgsy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFhgsy(Double value) {
        this.fhgsy = value;
    }

    /**
     * ��ȡfje���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFje() {
        return fje;
    }

    /**
     * ����fje���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFje(Double value) {
        this.fje = value;
    }

    /**
     * ��ȡfjsf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFjsf() {
        return fjsf;
    }

    /**
     * ����fjsf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFjsf(Double value) {
        this.fjsf = value;
    }

    /**
     * ��ȡfjslx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjslx() {
        return fjslx;
    }

    /**
     * ����fjslx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjslx(String value) {
        this.fjslx = value;
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
     * ��ȡfkdzzt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFkdzzt() {
        return fkdzzt;
    }

    /**
     * ����fkdzzt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFkdzzt(Boolean value) {
        this.fkdzzt = value;
    }

    /**
     * ��ȡfqtf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFqtf() {
        return fqtf;
    }

    /**
     * ����fqtf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFqtf(Double value) {
        this.fqtf = value;
    }

    /**
     * ��ȡfsc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsc() {
        return fsc;
    }

    /**
     * ����fsc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsc(String value) {
        this.fsc = value;
    }

    /**
     * ��ȡfsjly���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsjly() {
        return fsjly;
    }

    /**
     * ����fsjly���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsjly(String value) {
        this.fsjly = value;
    }

    /**
     * ��ȡfyhs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFyhs() {
        return fyhs;
    }

    /**
     * ����fyhs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFyhs(Double value) {
        this.fyhs = value;
    }

    /**
     * ��ȡfywbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFywbz() {
        return fywbz;
    }

    /**
     * ����fywbz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFywbz(String value) {
        this.fywbz = value;
    }

    /**
     * ��ȡfzgf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFzgf() {
        return fzgf;
    }

    /**
     * ����fzgf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFzgf(Double value) {
        this.fzgf = value;
    }

    /**
     * ��ȡfzqbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFzqbz() {
        return fzqbz;
    }

    /**
     * ����fzqbz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFzqbz(String value) {
        this.fzqbz = value;
    }

}
