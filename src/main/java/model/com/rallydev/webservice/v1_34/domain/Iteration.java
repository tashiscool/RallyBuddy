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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Iteration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Iteration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}WorkspaceDomainObject">
 *       &lt;sequence>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Project" type="{http://rallydev.com/webservice/v1_34/domain}Project" minOccurs="0"/>
 *         &lt;element name="Resources" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RevisionHistory" type="{http://rallydev.com/webservice/v1_34/domain}RevisionHistory" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Theme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserIterationCapacities" type="{http://rallydev.com/webservice/v1_34/domain}IterationUserIterationCapacitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Iteration", propOrder = {
    "endDate",
    "name",
    "notes",
    "project",
    "resources",
    "revisionHistory",
    "startDate",
    "state",
    "theme",
    "userIterationCapacities"
})
public class Iteration
    extends WorkspaceDomainObject
{

    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Project")
    protected Project project;
    @XmlElement(name = "Resources")
    protected Double resources;
    @XmlElement(name = "RevisionHistory")
    protected RevisionHistory revisionHistory;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Theme")
    protected String theme;
    @XmlElement(name = "UserIterationCapacities")
    protected IterationUserIterationCapacitiesType userIterationCapacities;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResources(Double value) {
        this.resources = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Gets the value of the userIterationCapacities property.
     * 
     * @return
     *     possible object is
     *     {@link IterationUserIterationCapacitiesType }
     *     
     */
    public IterationUserIterationCapacitiesType getUserIterationCapacities() {
        return userIterationCapacities;
    }

    /**
     * Sets the value of the userIterationCapacities property.
     * 
     * @param value
     *     allowed object is
     *     {@link IterationUserIterationCapacitiesType }
     *     
     */
    public void setUserIterationCapacities(IterationUserIterationCapacitiesType value) {
        this.userIterationCapacities = value;
    }

}
