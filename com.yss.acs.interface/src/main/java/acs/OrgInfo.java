
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orgInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="orgInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://qsfund.service.webservice.fa.yss.com/}absCheckPo">
 *       &lt;sequence>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fjgjb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkhh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flinkman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forgall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forgcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fother" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fssjg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ftypeCiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orgInfo", propOrder = {
    "fid",
    "fjgjb",
    "fkhh",
    "flinkman",
    "forg",
    "forgall",
    "forgcode",
    "fother",
    "fphone",
    "fssjg",
    "ftype",
    "ftypeCiss"
})
public class OrgInfo
    extends AbsCheckPo
{

    protected Long fid;
    protected String fjgjb;
    protected String fkhh;
    protected String flinkman;
    protected String forg;
    protected String forgall;
    protected String forgcode;
    protected String fother;
    protected String fphone;
    protected String fssjg;
    protected Integer ftype;
    protected String ftypeCiss;

    /**
     * 获取fid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFid() {
        return fid;
    }

    /**
     * 设置fid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFid(Long value) {
        this.fid = value;
    }

    /**
     * 获取fjgjb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFjgjb() {
        return fjgjb;
    }

    /**
     * 设置fjgjb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFjgjb(String value) {
        this.fjgjb = value;
    }

    /**
     * 获取fkhh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkhh() {
        return fkhh;
    }

    /**
     * 设置fkhh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkhh(String value) {
        this.fkhh = value;
    }

    /**
     * 获取flinkman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlinkman() {
        return flinkman;
    }

    /**
     * 设置flinkman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlinkman(String value) {
        this.flinkman = value;
    }

    /**
     * 获取forg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForg() {
        return forg;
    }

    /**
     * 设置forg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForg(String value) {
        this.forg = value;
    }

    /**
     * 获取forgall属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgall() {
        return forgall;
    }

    /**
     * 设置forgall属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgall(String value) {
        this.forgall = value;
    }

    /**
     * 获取forgcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForgcode() {
        return forgcode;
    }

    /**
     * 设置forgcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForgcode(String value) {
        this.forgcode = value;
    }

    /**
     * 获取fother属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFother() {
        return fother;
    }

    /**
     * 设置fother属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFother(String value) {
        this.fother = value;
    }

    /**
     * 获取fphone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFphone() {
        return fphone;
    }

    /**
     * 设置fphone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFphone(String value) {
        this.fphone = value;
    }

    /**
     * 获取fssjg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFssjg() {
        return fssjg;
    }

    /**
     * 设置fssjg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFssjg(String value) {
        this.fssjg = value;
    }

    /**
     * 获取ftype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFtype() {
        return ftype;
    }

    /**
     * 设置ftype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFtype(Integer value) {
        this.ftype = value;
    }

    /**
     * 获取ftypeCiss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtypeCiss() {
        return ftypeCiss;
    }

    /**
     * 设置ftypeCiss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtypeCiss(String value) {
        this.ftypeCiss = value;
    }

}
