
package acs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "YssException", targetNamespace = "http://qsfund.service.webservice.fa.yss.com/")
public class YssException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private YssException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public YssException_Exception(String message, YssException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public YssException_Exception(String message, YssException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: acs.YssException
     */
    public YssException getFaultInfo() {
        return faultInfo;
    }

}
