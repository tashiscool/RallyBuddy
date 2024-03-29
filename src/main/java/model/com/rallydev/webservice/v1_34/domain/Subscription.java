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
 * <p>Java class for Subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}PersistableObject">
 *       &lt;sequence>
 *         &lt;element name="Modules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PasswordExpirationDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreviousPasswordCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevisionHistory" type="{http://rallydev.com/webservice/v1_34/domain}RevisionHistory" minOccurs="0"/>
 *         &lt;element name="SessionTimeoutSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SubscriptionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Workspaces" type="{http://rallydev.com/webservice/v1_34/domain}SubscriptionWorkspacesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "modules",
    "name",
    "passwordExpirationDays",
    "previousPasswordCount",
    "revisionHistory",
    "sessionTimeoutSeconds",
    "subscriptionID",
    "workspaces"
})
public class Subscription
    extends PersistableObject
{

    @XmlElement(name = "Modules")
    protected String modules;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PasswordExpirationDays")
    protected Long passwordExpirationDays;
    @XmlElement(name = "PreviousPasswordCount")
    protected Long previousPasswordCount;
    @XmlElement(name = "RevisionHistory")
    protected RevisionHistory revisionHistory;
    @XmlElement(name = "SessionTimeoutSeconds")
    protected Long sessionTimeoutSeconds;
    @XmlElement(name = "SubscriptionID")
    protected Long subscriptionID;
    @XmlElement(name = "Workspaces")
    protected SubscriptionWorkspacesType workspaces;

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModules(String value) {
        this.modules = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the passwordExpirationDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPasswordExpirationDays() {
        return passwordExpirationDays;
    }

    /**
     * Sets the value of the passwordExpirationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPasswordExpirationDays(Long value) {
        this.passwordExpirationDays = value;
    }

    /**
     * Gets the value of the previousPasswordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreviousPasswordCount() {
        return previousPasswordCount;
    }

    /**
     * Sets the value of the previousPasswordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreviousPasswordCount(Long value) {
        this.previousPasswordCount = value;
    }

    /**
     * Gets the value of the revisionHistory property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionHistory }
     *     
     */
    public RevisionHistory getRevisionHistory() {
        return revisionHistory;
    }

    /**
     * Sets the value of the revisionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionHistory }
     *     
     */
    public void setRevisionHistory(RevisionHistory value) {
        this.revisionHistory = value;
    }

    /**
     * Gets the value of the sessionTimeoutSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionTimeoutSeconds() {
        return sessionTimeoutSeconds;
    }

    /**
     * Sets the value of the sessionTimeoutSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionTimeoutSeconds(Long value) {
        this.sessionTimeoutSeconds = value;
    }

    /**
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriptionID(Long value) {
        this.subscriptionID = value;
    }

    /**
     * Gets the value of the workspaces property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionWorkspacesType }
     *     
     */
    public SubscriptionWorkspacesType getWorkspaces() {
        return workspaces;
    }

    /**
     * Sets the value of the workspaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionWorkspacesType }
     *     
     */
    public void setWorkspaces(SubscriptionWorkspacesType value) {
        this.workspaces = value;
    }

}
