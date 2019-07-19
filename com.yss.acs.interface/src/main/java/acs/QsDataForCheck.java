
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>qsDataForCheck complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="qsDataForCheck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finterfacetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fje" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fproductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qsDataForCheck", propOrder = {
    "faccount",
    "faccountType",
    "fdate",
    "finterfacetype",
    "fje",
    "fproductCode"
})
public class QsDataForCheck {

    protected String faccount;
    protected String faccountType;
    protected String fdate;
    protected String finterfacetype;
    protected Double fje;
    protected String fproductCode;

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
     * 获取faccountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaccountType() {
        return faccountType;
    }

    /**
     * 设置faccountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaccountType(String value) {
        this.faccountType = value;
    }

    /**
     * 获取fdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdate() {
        return fdate;
    }

    /**
     * 设置fdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdate(String value) {
        this.fdate = value;
    }

    /**
     * 获取finterfacetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinterfacetype() {
        return finterfacetype;
    }

    /**
     * 设置finterfacetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinterfacetype(String value) {
        this.finterfacetype = value;
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
     * 获取fproductCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFproductCode() {
        return fproductCode;
    }

    /**
     * 设置fproductCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFproductCode(String value) {
        this.fproductCode = value;
    }

}
