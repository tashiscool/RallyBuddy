//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.07 at 09:26:43 PM EDT 
//


package model.com.rallydev.webservice.v1_34.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IterationCumulativeFlowData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IterationCumulativeFlowData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}CumulativeFlowData">
 *       &lt;sequence>
 *         &lt;element name="IterationObjectID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IterationCumulativeFlowData", propOrder = {
    "iterationObjectID"
})
public class IterationCumulativeFlowData
    extends CumulativeFlowData
{

    @XmlElement(name = "IterationObjectID")
    protected Long iterationObjectID;

    /**
     * Gets the value of the iterationObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIterationObjectID() {
        return iterationObjectID;
    }

    /**
     * Sets the value of the iterationObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIterationObjectID(Long value) {
        this.iterationObjectID = value;
    }

}