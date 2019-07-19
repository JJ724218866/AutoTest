
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>absCheckPo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfchk���Ե�ֵ��
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
     * ����fchk���Ե�ֵ��
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
     * ��ȡfsh���Ե�ֵ��
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
     * ����fsh���Ե�ֵ��
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
     * ��ȡfzzr���Ե�ֵ��
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
     * ����fzzr���Ե�ֵ��
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
