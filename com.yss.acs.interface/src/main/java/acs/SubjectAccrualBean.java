
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>subjectAccrualBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="subjectAccrualBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="direct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subjectCodeOrAttr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subjectAccrualBean", propOrder = {
    "accMoney",
    "direct",
    "flag",
    "productCode",
    "subjectCodeOrAttr",
    "summary"
})
public class SubjectAccrualBean {

    protected double accMoney;
    protected String direct;
    protected String flag;
    protected String productCode;
    protected String subjectCodeOrAttr;
    protected String summary;

    /**
     * 获取accMoney属性的值。
     * 
     */
    public double getAccMoney() {
        return accMoney;
    }

    /**
     * 设置accMoney属性的值。
     * 
     */
    public void setAccMoney(double value) {
        this.accMoney = value;
    }

    /**
     * 获取direct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirect() {
        return direct;
    }

    /**
     * 设置direct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirect(String value) {
        this.direct = value;
    }

    /**
     * 获取flag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 设置flag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * 获取productCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置productCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * 获取subjectCodeOrAttr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCodeOrAttr() {
        return subjectCodeOrAttr;
    }

    /**
     * 设置subjectCodeOrAttr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCodeOrAttr(String value) {
        this.subjectCodeOrAttr = value;
    }

    /**
     * 获取summary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置summary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

}
