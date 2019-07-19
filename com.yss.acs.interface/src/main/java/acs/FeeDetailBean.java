
package acs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>feeDetailBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="feeDetailBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DFeeFs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DZbFs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="errMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeYe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="gzDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCountFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JFeeFs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="JZbFs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="netAssetValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="retCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zbYe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feeDetailBean", propOrder = {
    "accountNum",
    "assetCode",
    "assetName",
    "countMethod",
    "dFeeFs",
    "dZbFs",
    "errMsg",
    "feeYe",
    "gzDate",
    "isCountFee",
    "jFeeFs",
    "jZbFs",
    "netAssetValue",
    "retCode",
    "zbYe"
})
public class FeeDetailBean {

    protected String accountNum;
    protected String assetCode;
    protected String assetName;
    protected String countMethod;
    @XmlElement(name = "DFeeFs")
    protected BigDecimal dFeeFs;
    @XmlElement(name = "DZbFs")
    protected BigDecimal dZbFs;
    protected String errMsg;
    protected BigDecimal feeYe;
    protected String gzDate;
    protected String isCountFee;
    @XmlElement(name = "JFeeFs")
    protected BigDecimal jFeeFs;
    @XmlElement(name = "JZbFs")
    protected BigDecimal jZbFs;
    protected BigDecimal netAssetValue;
    protected String retCode;
    protected BigDecimal zbYe;

    /**
     * 获取accountNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * 设置accountNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

    /**
     * 获取assetCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCode() {
        return assetCode;
    }

    /**
     * 设置assetCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCode(String value) {
        this.assetCode = value;
    }

    /**
     * 获取assetName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * 设置assetName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetName(String value) {
        this.assetName = value;
    }

    /**
     * 获取countMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountMethod() {
        return countMethod;
    }

    /**
     * 设置countMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountMethod(String value) {
        this.countMethod = value;
    }

    /**
     * 获取dFeeFs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDFeeFs() {
        return dFeeFs;
    }

    /**
     * 设置dFeeFs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDFeeFs(BigDecimal value) {
        this.dFeeFs = value;
    }

    /**
     * 获取dZbFs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDZbFs() {
        return dZbFs;
    }

    /**
     * 设置dZbFs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDZbFs(BigDecimal value) {
        this.dZbFs = value;
    }

    /**
     * 获取errMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * 设置errMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }

    /**
     * 获取feeYe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeYe() {
        return feeYe;
    }

    /**
     * 设置feeYe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeYe(BigDecimal value) {
        this.feeYe = value;
    }

    /**
     * 获取gzDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGzDate() {
        return gzDate;
    }

    /**
     * 设置gzDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGzDate(String value) {
        this.gzDate = value;
    }

    /**
     * 获取isCountFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCountFee() {
        return isCountFee;
    }

    /**
     * 设置isCountFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCountFee(String value) {
        this.isCountFee = value;
    }

    /**
     * 获取jFeeFs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJFeeFs() {
        return jFeeFs;
    }

    /**
     * 设置jFeeFs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJFeeFs(BigDecimal value) {
        this.jFeeFs = value;
    }

    /**
     * 获取jZbFs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJZbFs() {
        return jZbFs;
    }

    /**
     * 设置jZbFs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJZbFs(BigDecimal value) {
        this.jZbFs = value;
    }

    /**
     * 获取netAssetValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAssetValue() {
        return netAssetValue;
    }

    /**
     * 设置netAssetValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAssetValue(BigDecimal value) {
        this.netAssetValue = value;
    }

    /**
     * 获取retCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCode() {
        return retCode;
    }

    /**
     * 设置retCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCode(String value) {
        this.retCode = value;
    }

    /**
     * 获取zbYe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZbYe() {
        return zbYe;
    }

    /**
     * 设置zbYe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZbYe(BigDecimal value) {
        this.zbYe = value;
    }

}
