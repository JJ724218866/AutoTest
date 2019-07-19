
package acs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orgInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfid���Ե�ֵ��
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
     * ����fid���Ե�ֵ��
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
     * ��ȡfjgjb���Ե�ֵ��
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
     * ����fjgjb���Ե�ֵ��
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
     * ��ȡfkhh���Ե�ֵ��
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
     * ����fkhh���Ե�ֵ��
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
     * ��ȡflinkman���Ե�ֵ��
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
     * ����flinkman���Ե�ֵ��
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
     * ��ȡforg���Ե�ֵ��
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
     * ����forg���Ե�ֵ��
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
     * ��ȡforgall���Ե�ֵ��
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
     * ����forgall���Ե�ֵ��
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
     * ��ȡforgcode���Ե�ֵ��
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
     * ����forgcode���Ե�ֵ��
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
     * ��ȡfother���Ե�ֵ��
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
     * ����fother���Ե�ֵ��
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
     * ��ȡfphone���Ե�ֵ��
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
     * ����fphone���Ե�ֵ��
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
     * ��ȡfssjg���Ե�ֵ��
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
     * ����fssjg���Ե�ֵ��
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
     * ��ȡftype���Ե�ֵ��
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
     * ����ftype���Ե�ֵ��
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
     * ��ȡftypeCiss���Ե�ֵ��
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
     * ����ftypeCiss���Ե�ֵ��
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
