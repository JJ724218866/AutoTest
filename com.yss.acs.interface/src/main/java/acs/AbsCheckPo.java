
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>absCheckPo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="absCheckPo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fchk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fsh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fzzr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "absCheckPo", propOrder = {
    "fchk",
    "fsh",
    "fzzr"
})
@XmlSeeAlso({
    AssetAccount.class,
    ShareHolderInfo.class,
    OrgInfo.class,
    AccountSealInfo.class,
    SeatInfo.class
})
public abstract class AbsCheckPo {

    protected String fchk;
    protected Boolean fsh;
    protected String fzzr;

    /**
     * 获取fchk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFchk() {
        return fchk;
    }

    /**
     * 设置fchk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFchk(String value) {
        this.fchk = value;
    }

    /**
     * 获取fsh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFsh() {
        return fsh;
    }

    /**
     * 设置fsh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFsh(Boolean value) {
        this.fsh = value;
    }

    /**
     * 获取fzzr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFzzr() {
        return fzzr;
    }

    /**
     * 设置fzzr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFzzr(String value) {
        this.fzzr = value;
    }

}
