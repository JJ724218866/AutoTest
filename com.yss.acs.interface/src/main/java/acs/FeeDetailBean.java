
package acs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>feeDetailBean complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaccountNum���Ե�ֵ��
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
     * ����accountNum���Ե�ֵ��
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
     * ��ȡassetCode���Ե�ֵ��
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
     * ����assetCode���Ե�ֵ��
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
     * ��ȡassetName���Ե�ֵ��
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
     * ����assetName���Ե�ֵ��
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
     * ��ȡcountMethod���Ե�ֵ��
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
     * ����countMethod���Ե�ֵ��
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
     * ��ȡdFeeFs���Ե�ֵ��
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
     * ����dFeeFs���Ե�ֵ��
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
     * ��ȡdZbFs���Ե�ֵ��
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
     * ����dZbFs���Ե�ֵ��
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
     * ��ȡerrMsg���Ե�ֵ��
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
     * ����errMsg���Ե�ֵ��
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
     * ��ȡfeeYe���Ե�ֵ��
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
     * ����feeYe���Ե�ֵ��
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
     * ��ȡgzDate���Ե�ֵ��
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
     * ����gzDate���Ե�ֵ��
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
     * ��ȡisCountFee���Ե�ֵ��
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
     * ����isCountFee���Ե�ֵ��
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
     * ��ȡjFeeFs���Ե�ֵ��
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
     * ����jFeeFs���Ե�ֵ��
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
     * ��ȡjZbFs���Ե�ֵ��
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
     * ����jZbFs���Ե�ֵ��
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
     * ��ȡnetAssetValue���Ե�ֵ��
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
     * ����netAssetValue���Ե�ֵ��
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
     * ��ȡretCode���Ե�ֵ��
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
     * ����retCode���Ե�ֵ��
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
     * ��ȡzbYe���Ե�ֵ��
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
     * ����zbYe���Ե�ֵ��
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
