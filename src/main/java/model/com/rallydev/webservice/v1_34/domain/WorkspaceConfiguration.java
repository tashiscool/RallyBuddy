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
 * <p>Java class for WorkspaceConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkspaceConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}WorkspaceDomainObject">
 *       &lt;sequence>
 *         &lt;element name="BuildandChangesetEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DragDropRankingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IterationEstimateUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseEstimateUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeTrackerEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkspaceConfiguration", propOrder = {
    "buildandChangesetEnabled",
    "dateFormat",
    "dateTimeFormat",
    "dragDropRankingEnabled",
    "iterationEstimateUnitName",
    "releaseEstimateUnitName",
    "taskUnitName",
    "timeTrackerEnabled",
    "timeZone",
    "workDays"
})
public class WorkspaceConfiguration
    extends WorkspaceDomainObject
{

    @XmlElement(name = "BuildandChangesetEnabled")
    protected Boolean buildandChangesetEnabled;
    @XmlElement(name = "DateFormat")
    protected String dateFormat;
    @XmlElement(name = "DateTimeFormat")
    protected String dateTimeFormat;
    @XmlElement(name = "DragDropRankingEnabled")
    protected Boolean dragDropRankingEnabled;
    @XmlElement(name = "IterationEstimateUnitName")
    protected String iterationEstimateUnitName;
    @XmlElement(name = "ReleaseEstimateUnitName")
    protected String releaseEstimateUnitName;
    @XmlElement(name = "TaskUnitName")
    protected String taskUnitName;
    @XmlElement(name = "TimeTrackerEnabled")
    protected Boolean timeTrackerEnabled;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "WorkDays")
    protected String workDays;

    /**
     * Gets the value of the buildandChangesetEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildandChangesetEnabled() {
        return buildandChangesetEnabled;
    }

    /**
     * Sets the value of the buildandChangesetEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildandChangesetEnabled(Boolean value) {
        this.buildandChangesetEnabled = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the dateTimeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    /**
     * Sets the value of the dateTimeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeFormat(String value) {
        this.dateTimeFormat = value;
    }

    /**
     * Gets the value of the dragDropRankingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDragDropRankingEnabled() {
        return dragDropRankingEnabled;
    }

    /**
     * Sets the value of the dragDropRankingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDragDropRankingEnabled(Boolean value) {
        this.dragDropRankingEnabled = value;
    }

    /**
     * Gets the value of the iterationEstimateUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationEstimateUnitName() {
        return iterationEstimateUnitName;
    }

    /**
     * Sets the value of the iterationEstimateUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationEstimateUnitName(String value) {
        this.iterationEstimateUnitName = value;
    }

    /**
     * Gets the value of the releaseEstimateUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseEstimateUnitName() {
        return releaseEstimateUnitName;
    }

    /**
     * Sets the value of the releaseEstimateUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseEstimateUnitName(String value) {
        this.releaseEstimateUnitName = value;
    }

    /**
     * Gets the value of the taskUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskUnitName() {
        return taskUnitName;
    }

    /**
     * Sets the value of the taskUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskUnitName(String value) {
        this.taskUnitName = value;
    }

    /**
     * Gets the value of the timeTrackerEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeTrackerEnabled() {
        return timeTrackerEnabled;
    }

    /**
     * Sets the value of the timeTrackerEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeTrackerEnabled(Boolean value) {
        this.timeTrackerEnabled = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the workDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDays() {
        return workDays;
    }

    /**
     * Sets the value of the workDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDays(String value) {
        this.workDays = value;
    }

}
