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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CumulativeFlowData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CumulativeFlowData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}WorkspaceDomainObject">
 *       &lt;sequence>
 *         &lt;element name="CardCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CardEstimateTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CardState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardToDoTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaskEstimateTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CumulativeFlowData", propOrder = {
    "cardCount",
    "cardEstimateTotal",
    "cardState",
    "cardToDoTotal",
    "taskEstimateTotal"
})
@XmlSeeAlso({
    ReleaseCumulativeFlowData.class,
    IterationCumulativeFlowData.class
})
public class CumulativeFlowData
    extends WorkspaceDomainObject
{

    @XmlElement(name = "CardCount")
    protected Long cardCount;
    @XmlElement(name = "CardEstimateTotal")
    protected Double cardEstimateTotal;
    @XmlElement(name = "CardState")
    protected String cardState;
    @XmlElement(name = "CardToDoTotal")
    protected Double cardToDoTotal;
    @XmlElement(name = "TaskEstimateTotal")
    protected Double taskEstimateTotal;

    /**
     * Gets the value of the cardCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardCount() {
        return cardCount;
    }

    /**
     * Sets the value of the cardCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardCount(Long value) {
        this.cardCount = value;
    }

    /**
     * Gets the value of the cardEstimateTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCardEstimateTotal() {
        return cardEstimateTotal;
    }

    /**
     * Sets the value of the cardEstimateTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCardEstimateTotal(Double value) {
        this.cardEstimateTotal = value;
    }

    /**
     * Gets the value of the cardState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardState() {
        return cardState;
    }

    /**
     * Sets the value of the cardState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardState(String value) {
        this.cardState = value;
    }

    /**
     * Gets the value of the cardToDoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCardToDoTotal() {
        return cardToDoTotal;
    }

    /**
     * Sets the value of the cardToDoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCardToDoTotal(Double value) {
        this.cardToDoTotal = value;
    }

    /**
     * Gets the value of the taskEstimateTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }

    /**
     * Sets the value of the taskEstimateTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaskEstimateTotal(Double value) {
        this.taskEstimateTotal = value;
    }

}
