
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>shareHolderCheck complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取assetId属性的值。
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
     * 设置assetId属性的值。
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
     * 获取fdate属性的值。
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
     * 设置fdate属性的值。
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
     * 获取ffxj属性的值。
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
     * 设置ffxj属性的值。
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
     * 获取fghf属性的值。
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
     * 设置fghf属性的值。
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
     * 获取fgzlx属性的值。
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
     * 设置fgzlx属性的值。
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
     * 获取fhgsy属性的值。
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
     * 设置fhgsy属性的值。
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
     * 获取fje属性的值。
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
     * 设置fje属性的值。
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
     * 获取fjsf属性的值。
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
     * 设置fjsf属性的值。
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
     * 获取fjslx属性的值。
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
     * 设置fjslx属性的值。
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
     * 获取fkdzzt属性的值。
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
     * 设置fkdzzt属性的值。
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
     * 获取fqtf属性的值。
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
     * 设置fqtf属性的值。
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
     * 获取fsc属性的值。
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
     * 设置fsc属性的值。
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
     * 获取fsjly属性的值。
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
     * 设置fsjly属性的值。
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
     * 获取fyhs属性的值。
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
     * 设置fyhs属性的值。
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
     * 获取fywbz属性的值。
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
     * 设置fywbz属性的值。
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
     * 获取fzgf属性的值。
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
     * 设置fzgf属性的值。
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
     * 获取fzqbz属性的值。
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
     * 设置fzqbz属性的值。
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
