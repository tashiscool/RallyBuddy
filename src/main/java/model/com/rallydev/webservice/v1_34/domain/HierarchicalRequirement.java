//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.07 at 09:26:43 PM EDT 
//


package model.com.rallydev.webservice.v1_34.domain;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HierarchicalRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HierarchicalRequirement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}Requirement">
 *       &lt;sequence>
 *         &lt;element name="AcceptedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Blocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Blocker" type="{http://rallydev.com/webservice/v1_34/domain}Blocker" minOccurs="0"/>
 *         &lt;element name="Children" type="{http://rallydev.com/webservice/v1_34/domain}HierarchicalRequirementChildrenType" minOccurs="0"/>
 *         &lt;element name="DefectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Defects" type="{http://rallydev.com/webservice/v1_34/domain}HierarchicalRequirementDefectsType" minOccurs="0"/>
 *         &lt;element name="InProgressDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Iteration" type="{http://rallydev.com/webservice/v1_34/domain}Iteration" minOccurs="0"/>
 *         &lt;element name="Parent" type="{http://rallydev.com/webservice/v1_34/domain}HierarchicalRequirement" minOccurs="0"/>
 *         &lt;element name="PlanEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PortfolioItem" type="{http://rallydev.com/webservice/v1_34/domain}PortfolioItem" minOccurs="0"/>
 *         &lt;element name="Predecessors" type="{http://rallydev.com/webservice/v1_34/domain}HierarchicalRequirementPredecessorsType" minOccurs="0"/>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Recycled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Release" type="{http://rallydev.com/webservice/v1_34/domain}Release" minOccurs="0"/>
 *         &lt;element name="ScheduleState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Successors" type="{http://rallydev.com/webservice/v1_34/domain}HierarchicalRequirementSuccessorsType" minOccurs="0"/>
 *         &lt;element name="TaskActualTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaskEstimateTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaskRemainingTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaskStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{http://rallydev.com/webservice/v1_34/domain}HierarchicalRequirementTasksType" minOccurs="0"/>
 *         &lt;element name="TestCaseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TestCases" type="{http://rallydev.com/webservice/v1_34/domain}HierarchicalRequirementTestCasesType" minOccurs="0"/>
 *         &lt;element name="AffectsDocumentation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EpicUserStory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaintenanceDefectStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPlanEstimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PearsonProject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanningCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanningDevSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanningItrDevStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanningProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanningProductPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlanningStoryPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ready" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReadyforQA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RiskFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SVNLinkField" type="{http://rallydev.com/webservice/v1_34/domain}WebLink" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchicalRequirement", propOrder = {
    "acceptedDate",
    "blocked",
    "blocker",
    "children",
    "defectStatus",
    "defects",
    "inProgressDate",
    "iteration",
    "parent",
    "planEstimate",
    "portfolioItem",
    "predecessors",
    "rank",
    "recycled",
    "release",
    "scheduleState",
    "successors",
    "taskActualTotal",
    "taskEstimateTotal",
    "taskRemainingTotal",
    "taskStatus",
    "tasks",
    "testCaseStatus",
    "testCases",
    "affectsDocumentation",
    "businessPriority",
    "epicUserStory",
    "lob",
    "maintenanceDefectStatus",
    "organization",
    "originalPlanEstimate",
    "pearsonProject",
    "phase",
    "planningCycle",
    "planningDevSize",
    "planningItrDevStart",
    "planningProduct",
    "planningProductPriority",
    "planningStoryPriority",
    "ready",
    "readyforQA",
    "riskFactor",
    "svnLinkField"
})
public class HierarchicalRequirement
    extends Requirement
{

    @XmlElement(name = "AcceptedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptedDate;
    @XmlElement(name = "Blocked")
    protected Boolean blocked;
    @XmlElement(name = "Blocker")
    protected Blocker blocker;
    @XmlElement(name = "Children")
    protected HierarchicalRequirementChildrenType children;
    @XmlElement(name = "DefectStatus")
    protected String defectStatus;
    @XmlElement(name = "Defects")
    protected HierarchicalRequirementDefectsType defects;
    @XmlElement(name = "InProgressDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inProgressDate;
    @XmlElement(name = "Iteration")
    protected Iteration iteration;
    @XmlElement(name = "Parent")
    protected HierarchicalRequirement parent;
    @XmlElement(name = "PlanEstimate")
    protected Double planEstimate;
    @XmlElement(name = "PortfolioItem")
    protected PortfolioItem portfolioItem;
    @XmlElement(name = "Predecessors")
    protected HierarchicalRequirementPredecessorsType predecessors;
    @XmlElement(name = "Rank")
    protected BigDecimal rank;
    @XmlElement(name = "Recycled")
    protected Boolean recycled;
    @XmlElement(name = "Release")
    protected Release release;
    @XmlElement(name = "ScheduleState")
    protected String scheduleState;
    @XmlElement(name = "Successors")
    protected HierarchicalRequirementSuccessorsType successors;
    @XmlElement(name = "TaskActualTotal")
    protected Double taskActualTotal;
    @XmlElement(name = "TaskEstimateTotal")
    protected Double taskEstimateTotal;
    @XmlElement(name = "TaskRemainingTotal")
    protected Double taskRemainingTotal;
    @XmlElement(name = "TaskStatus")
    protected String taskStatus;
    @XmlElement(name = "Tasks")
    protected HierarchicalRequirementTasksType tasks;
    @XmlElement(name = "TestCaseStatus")
    protected String testCaseStatus;
    @XmlElement(name = "TestCases")
    protected HierarchicalRequirementTestCasesType testCases;
    @XmlElement(name = "AffectsDocumentation")
    protected Boolean affectsDocumentation;
    @XmlElement(name = "BusinessPriority")
    protected String businessPriority;
    @XmlElement(name = "EpicUserStory")
    protected String epicUserStory;
    @XmlElement(name = "LOB")
    protected String lob;
    @XmlElement(name = "MaintenanceDefectStatus")
    protected String maintenanceDefectStatus;
    @XmlElement(name = "Organization")
    protected String organization;
    @XmlElement(name = "OriginalPlanEstimate")
    protected String originalPlanEstimate;
    @XmlElement(name = "PearsonProject")
    protected String pearsonProject;
    @XmlElement(name = "Phase")
    protected String phase;
    @XmlElement(name = "PlanningCycle")
    protected String planningCycle;
    @XmlElement(name = "PlanningDevSize")
    protected String planningDevSize;
    @XmlElement(name = "PlanningItrDevStart")
    protected String planningItrDevStart;
    @XmlElement(name = "PlanningProduct")
    protected String planningProduct;
    @XmlElement(name = "PlanningProductPriority")
    protected String planningProductPriority;
    @XmlElement(name = "PlanningStoryPriority")
    protected String planningStoryPriority;
    @XmlElement(name = "Ready")
    protected Boolean ready;
    @XmlElement(name = "ReadyforQA")
    protected Boolean readyforQA;
    @XmlElement(name = "RiskFactor")
    protected String riskFactor;
    @XmlElement(name = "SVNLinkField")
    protected WebLink svnLinkField;

    /**
     * Gets the value of the acceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptedDate() {
        return acceptedDate;
    }

    /**
     * Sets the value of the acceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptedDate(XMLGregorianCalendar value) {
        this.acceptedDate = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlocked(Boolean value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the blocker property.
     * 
     * @return
     *     possible object is
     *     {@link Blocker }
     *     
     */
    public Blocker getBlocker() {
        return blocker;
    }

    /**
     * Sets the value of the blocker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocker }
     *     
     */
    public void setBlocker(Blocker value) {
        this.blocker = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalRequirementChildrenType }
     *     
     */
    public HierarchicalRequirementChildrenType getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalRequirementChildrenType }
     *     
     */
    public void setChildren(HierarchicalRequirementChildrenType value) {
        this.children = value;
    }

    /**
     * Gets the value of the defectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectStatus() {
        return defectStatus;
    }

    /**
     * Sets the value of the defectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectStatus(String value) {
        this.defectStatus = value;
    }

    /**
     * Gets the value of the defects property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalRequirementDefectsType }
     *     
     */
    public HierarchicalRequirementDefectsType getDefects() {
        return defects;
    }

    /**
     * Sets the value of the defects property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalRequirementDefectsType }
     *     
     */
    public void setDefects(HierarchicalRequirementDefectsType value) {
        this.defects = value;
    }

    /**
     * Gets the value of the inProgressDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInProgressDate() {
        return inProgressDate;
    }

    /**
     * Sets the value of the inProgressDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInProgressDate(XMLGregorianCalendar value) {
        this.inProgressDate = value;
    }

    /**
     * Gets the value of the iteration property.
     * 
     * @return
     *     possible object is
     *     {@link Iteration }
     *     
     */
    public Iteration getIteration() {
        return iteration;
    }

    /**
     * Sets the value of the iteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iteration }
     *     
     */
    public void setIteration(Iteration value) {
        this.iteration = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalRequirement }
     *     
     */
    public HierarchicalRequirement getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalRequirement }
     *     
     */
    public void setParent(HierarchicalRequirement value) {
        this.parent = value;
    }

    /**
     * Gets the value of the planEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlanEstimate() {
        return planEstimate;
    }

    /**
     * Sets the value of the planEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlanEstimate(Double value) {
        this.planEstimate = value;
    }

    /**
     * Gets the value of the portfolioItem property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioItem }
     *     
     */
    public PortfolioItem getPortfolioItem() {
        return portfolioItem;
    }

    /**
     * Sets the value of the portfolioItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioItem }
     *     
     */
    public void setPortfolioItem(PortfolioItem value) {
        this.portfolioItem = value;
    }

    /**
     * Gets the value of the predecessors property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalRequirementPredecessorsType }
     *     
     */
    public HierarchicalRequirementPredecessorsType getPredecessors() {
        return predecessors;
    }

    /**
     * Sets the value of the predecessors property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalRequirementPredecessorsType }
     *     
     */
    public void setPredecessors(HierarchicalRequirementPredecessorsType value) {
        this.predecessors = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRank(BigDecimal value) {
        this.rank = value;
    }

    /**
     * Gets the value of the recycled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecycled() {
        return recycled;
    }

    /**
     * Sets the value of the recycled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecycled(Boolean value) {
        this.recycled = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link Release }
     *     
     */
    public Release getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link Release }
     *     
     */
    public void setRelease(Release value) {
        this.release = value;
    }

    /**
     * Gets the value of the scheduleState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleState() {
        return scheduleState;
    }

    /**
     * Sets the value of the scheduleState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleState(String value) {
        this.scheduleState = value;
    }

    /**
     * Gets the value of the successors property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalRequirementSuccessorsType }
     *     
     */
    public HierarchicalRequirementSuccessorsType getSuccessors() {
        return successors;
    }

    /**
     * Sets the value of the successors property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalRequirementSuccessorsType }
     *     
     */
    public void setSuccessors(HierarchicalRequirementSuccessorsType value) {
        this.successors = value;
    }

    /**
     * Gets the value of the taskActualTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaskActualTotal() {
        return taskActualTotal;
    }

    /**
     * Sets the value of the taskActualTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaskActualTotal(Double value) {
        this.taskActualTotal = value;
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

    /**
     * Gets the value of the taskRemainingTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaskRemainingTotal() {
        return taskRemainingTotal;
    }

    /**
     * Sets the value of the taskRemainingTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaskRemainingTotal(Double value) {
        this.taskRemainingTotal = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatus(String value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalRequirementTasksType }
     *     
     */
    public HierarchicalRequirementTasksType getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalRequirementTasksType }
     *     
     */
    public void setTasks(HierarchicalRequirementTasksType value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the testCaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCaseStatus() {
        return testCaseStatus;
    }

    /**
     * Sets the value of the testCaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCaseStatus(String value) {
        this.testCaseStatus = value;
    }

    /**
     * Gets the value of the testCases property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalRequirementTestCasesType }
     *     
     */
    public HierarchicalRequirementTestCasesType getTestCases() {
        return testCases;
    }

    /**
     * Sets the value of the testCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalRequirementTestCasesType }
     *     
     */
    public void setTestCases(HierarchicalRequirementTestCasesType value) {
        this.testCases = value;
    }

    /**
     * Gets the value of the affectsDocumentation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAffectsDocumentation() {
        return affectsDocumentation;
    }

    /**
     * Sets the value of the affectsDocumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAffectsDocumentation(Boolean value) {
        this.affectsDocumentation = value;
    }

    /**
     * Gets the value of the businessPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPriority() {
        return businessPriority;
    }

    /**
     * Sets the value of the businessPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPriority(String value) {
        this.businessPriority = value;
    }

    /**
     * Gets the value of the epicUserStory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpicUserStory() {
        return epicUserStory;
    }

    /**
     * Sets the value of the epicUserStory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpicUserStory(String value) {
        this.epicUserStory = value;
    }

    /**
     * Gets the value of the lob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOB() {
        return lob;
    }

    /**
     * Sets the value of the lob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOB(String value) {
        this.lob = value;
    }

    /**
     * Gets the value of the maintenanceDefectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceDefectStatus() {
        return maintenanceDefectStatus;
    }

    /**
     * Sets the value of the maintenanceDefectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceDefectStatus(String value) {
        this.maintenanceDefectStatus = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the originalPlanEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPlanEstimate() {
        return originalPlanEstimate;
    }

    /**
     * Sets the value of the originalPlanEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPlanEstimate(String value) {
        this.originalPlanEstimate = value;
    }

    /**
     * Gets the value of the pearsonProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPearsonProject() {
        return pearsonProject;
    }

    /**
     * Sets the value of the pearsonProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPearsonProject(String value) {
        this.pearsonProject = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the planningCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningCycle() {
        return planningCycle;
    }

    /**
     * Sets the value of the planningCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningCycle(String value) {
        this.planningCycle = value;
    }

    /**
     * Gets the value of the planningDevSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningDevSize() {
        return planningDevSize;
    }

    /**
     * Sets the value of the planningDevSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningDevSize(String value) {
        this.planningDevSize = value;
    }

    /**
     * Gets the value of the planningItrDevStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningItrDevStart() {
        return planningItrDevStart;
    }

    /**
     * Sets the value of the planningItrDevStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningItrDevStart(String value) {
        this.planningItrDevStart = value;
    }

    /**
     * Gets the value of the planningProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningProduct() {
        return planningProduct;
    }

    /**
     * Sets the value of the planningProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningProduct(String value) {
        this.planningProduct = value;
    }

    /**
     * Gets the value of the planningProductPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningProductPriority() {
        return planningProductPriority;
    }

    /**
     * Sets the value of the planningProductPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningProductPriority(String value) {
        this.planningProductPriority = value;
    }

    /**
     * Gets the value of the planningStoryPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningStoryPriority() {
        return planningStoryPriority;
    }

    /**
     * Sets the value of the planningStoryPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningStoryPriority(String value) {
        this.planningStoryPriority = value;
    }

    /**
     * Gets the value of the ready property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReady() {
        return ready;
    }

    /**
     * Sets the value of the ready property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReady(Boolean value) {
        this.ready = value;
    }

    /**
     * Gets the value of the readyforQA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadyforQA() {
        return readyforQA;
    }

    /**
     * Sets the value of the readyforQA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadyforQA(Boolean value) {
        this.readyforQA = value;
    }

    /**
     * Gets the value of the riskFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskFactor() {
        return riskFactor;
    }

    /**
     * Sets the value of the riskFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskFactor(String value) {
        this.riskFactor = value;
    }

    /**
     * Gets the value of the svnLinkField property.
     * 
     * @return
     *     possible object is
     *     {@link WebLink }
     *     
     */
    public WebLink getSVNLinkField() {
        return svnLinkField;
    }

    /**
     * Sets the value of the svnLinkField property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLink }
     *     
     */
    public void setSVNLinkField(WebLink value) {
        this.svnLinkField = value;
    }

}
