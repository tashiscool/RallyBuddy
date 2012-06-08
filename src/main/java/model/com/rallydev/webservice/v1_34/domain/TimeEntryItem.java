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
 * <p>Java class for TimeEntryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeEntryItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}WorkspaceDomainObject">
 *       &lt;sequence>
 *         &lt;element name="Project" type="{http://rallydev.com/webservice/v1_34/domain}Project" minOccurs="0"/>
 *         &lt;element name="ProjectDisplayString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevisionHistory" type="{http://rallydev.com/webservice/v1_34/domain}RevisionHistory" minOccurs="0"/>
 *         &lt;element name="Task" type="{http://rallydev.com/webservice/v1_34/domain}Task" minOccurs="0"/>
 *         &lt;element name="TaskDisplayString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://rallydev.com/webservice/v1_34/domain}User" minOccurs="0"/>
 *         &lt;element name="Values" type="{http://rallydev.com/webservice/v1_34/domain}TimeEntryItemValuesType" minOccurs="0"/>
 *         &lt;element name="WeekStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="WorkProduct" type="{http://rallydev.com/webservice/v1_34/domain}Artifact" minOccurs="0"/>
 *         &lt;element name="WorkProductDisplayString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeEntryItem", propOrder = {
    "project",
    "projectDisplayString",
    "revisionHistory",
    "task",
    "taskDisplayString",
    "user",
    "values",
    "weekStartDate",
    "workProduct",
    "workProductDisplayString"
})
public class TimeEntryItem
    extends WorkspaceDomainObject
{

    @XmlElement(name = "Project")
    protected Project project;
    @XmlElement(name = "ProjectDisplayString")
    protected String projectDisplayString;
    @XmlElement(name = "RevisionHistory")
    protected RevisionHistory revisionHistory;
    @XmlElement(name = "Task")
    protected Task task;
    @XmlElement(name = "TaskDisplayString")
    protected String taskDisplayString;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "Values")
    protected TimeEntryItemValuesType values;
    @XmlElement(name = "WeekStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar weekStartDate;
    @XmlElement(name = "WorkProduct")
    protected Artifact workProduct;
    @XmlElement(name = "WorkProductDisplayString")
    protected String workProductDisplayString;

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
     * Gets the value of the projectDisplayString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectDisplayString() {
        return projectDisplayString;
    }

    /**
     * Sets the value of the projectDisplayString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectDisplayString(String value) {
        this.projectDisplayString = value;
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
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link Task }
     *     
     */
    public Task getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link Task }
     *     
     */
    public void setTask(Task value) {
        this.task = value;
    }

    /**
     * Gets the value of the taskDisplayString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskDisplayString() {
        return taskDisplayString;
    }

    /**
     * Sets the value of the taskDisplayString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskDisplayString(String value) {
        this.taskDisplayString = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntryItemValuesType }
     *     
     */
    public TimeEntryItemValuesType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntryItemValuesType }
     *     
     */
    public void setValues(TimeEntryItemValuesType value) {
        this.values = value;
    }

    /**
     * Gets the value of the weekStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeekStartDate() {
        return weekStartDate;
    }

    /**
     * Sets the value of the weekStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeekStartDate(XMLGregorianCalendar value) {
        this.weekStartDate = value;
    }

    /**
     * Gets the value of the workProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Artifact }
     *     
     */
    public Artifact getWorkProduct() {
        return workProduct;
    }

    /**
     * Sets the value of the workProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Artifact }
     *     
     */
    public void setWorkProduct(Artifact value) {
        this.workProduct = value;
    }

    /**
     * Gets the value of the workProductDisplayString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkProductDisplayString() {
        return workProductDisplayString;
    }

    /**
     * Sets the value of the workProductDisplayString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkProductDisplayString(String value) {
        this.workProductDisplayString = value;
    }

}