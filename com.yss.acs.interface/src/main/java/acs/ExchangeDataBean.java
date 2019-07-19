
package acs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>exchangeDataBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="exchangeDataBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bondMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dealMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realDealAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="riskAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tradeMarket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exchangeDataBean", propOrder = {
    "bondMark",
    "dealAmount",
    "dealMark",
    "operationMark",
    "productCode",
    "realDealAmount",
    "riskAmount",
    "tradeMarket"
})
public class ExchangeDataBean {

    protected String bondMark;
    protected BigDecimal dealAmount;
    protected String dealMark;
    protected String operationMark;
    protected String productCode;
    protected BigDecimal realDealAmount;
    protected BigDecimal riskAmount;
    protected String tradeMarket;

    /**
     * 获取bondMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondMark() {
        return bondMark;
    }

    /**
     * 设置bondMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondMark(String value) {
        this.bondMark = value;
    }

    /**
     * 获取dealAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDealAmount() {
        return dealAmount;
    }

    /**
     * 设置dealAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDealAmount(BigDecimal value) {
        this.dealAmount = value;
    }

    /**
     * 获取dealMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealMark() {
        return dealMark;
    }

    /**
     * 设置dealMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealMark(String value) {
        this.dealMark = value;
    }

    /**
     * 获取operationMark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationMark() {
        return operationMark;
    }

    /**
     * 设置operationMark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationMark(String value) {
        this.operationMark = value;
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
     * 获取realDealAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRealDealAmount() {
        return realDealAmount;
    }

    /**
     * 设置realDealAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRealDealAmount(BigDecimal value) {
        this.realDealAmount = value;
    }

    /**
     * 获取riskAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskAmount() {
        return riskAmount;
    }

    /**
     * 设置riskAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskAmount(BigDecimal value) {
        this.riskAmount = value;
    }

    /**
     * 获取tradeMarket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeMarket() {
        return tradeMarket;
    }

    /**
     * 设置tradeMarket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeMarket(String value) {
        this.tradeMarket = value;
    }

}
