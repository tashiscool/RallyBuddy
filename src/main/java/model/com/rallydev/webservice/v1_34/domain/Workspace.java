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
 * <p>Java class for Workspace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workspace">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}DomainObject">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://rallydev.com/webservice/v1_34/domain}User" minOccurs="0"/>
 *         &lt;element name="Projects" type="{http://rallydev.com/webservice/v1_34/domain}WorkspaceProjectsType" minOccurs="0"/>
 *         &lt;element name="RevisionHistory" type="{http://rallydev.com/webservice/v1_34/domain}RevisionHistory" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeDefinitions" type="{http://rallydev.com/webservice/v1_34/domain}WorkspaceTypeDefinitionsType" minOccurs="0"/>
 *         &lt;element name="WorkspaceConfiguration" type="{http://rallydev.com/webservice/v1_34/domain}WorkspaceConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workspace", propOrder = {
    "description",
    "name",
    "notes",
    "owner",
    "projects",
    "revisionHistory",
    "state",
    "style",
    "typeDefinitions",
    "workspaceConfiguration"
})
public class Workspace
    extends DomainObject
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Owner")
    protected User owner;
    @XmlElement(name = "Projects")
    protected WorkspaceProjectsType projects;
    @XmlElement(name = "RevisionHistory")
    protected RevisionHistory revisionHistory;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Style")
    protected String style;
    @XmlElement(name = "TypeDefinitions")
    protected WorkspaceTypeDefinitionsType typeDefinitions;
    @XmlElement(name = "WorkspaceConfiguration")
    protected WorkspaceConfiguration workspaceConfiguration;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setOwner(User value) {
        this.owner = value;
    }

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link WorkspaceProjectsType }
     *     
     */
    public WorkspaceProjectsType getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkspaceProjectsType }
     *     
     */
    public void setProjects(WorkspaceProjectsType value) {
        this.projects = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the typeDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link WorkspaceTypeDefinitionsType }
     *     
     */
    public WorkspaceTypeDefinitionsType getTypeDefinitions() {
        return typeDefinitions;
    }

    /**
     * Sets the value of the typeDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkspaceTypeDefinitionsType }
     *     
     */
    public void setTypeDefinitions(WorkspaceTypeDefinitionsType value) {
        this.typeDefinitions = value;
    }

    /**
     * Gets the value of the workspaceConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link WorkspaceConfiguration }
     *     
     */
    public WorkspaceConfiguration getWorkspaceConfiguration() {
        return workspaceConfiguration;
    }

    /**
     * Sets the value of the workspaceConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkspaceConfiguration }
     *     
     */
    public void setWorkspaceConfiguration(WorkspaceConfiguration value) {
        this.workspaceConfiguration = value;
    }

}