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
 * <p>Java class for TestFolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestFolder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}WorkspaceDomainObject">
 *       &lt;sequence>
 *         &lt;element name="Children" type="{http://rallydev.com/webservice/v1_34/domain}TestFolderChildrenType" minOccurs="0"/>
 *         &lt;element name="FormattedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent" type="{http://rallydev.com/webservice/v1_34/domain}TestFolder" minOccurs="0"/>
 *         &lt;element name="Project" type="{http://rallydev.com/webservice/v1_34/domain}Project" minOccurs="0"/>
 *         &lt;element name="TestCases" type="{http://rallydev.com/webservice/v1_34/domain}TestFolderTestCasesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestFolder", propOrder = {
    "children",
    "formattedID",
    "name",
    "parent",
    "project",
    "testCases"
})
public class TestFolder
    extends WorkspaceDomainObject
{

    @XmlElement(name = "Children")
    protected TestFolderChildrenType children;
    @XmlElement(name = "FormattedID")
    protected String formattedID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Parent")
    protected TestFolder parent;
    @XmlElement(name = "Project")
    protected Project project;
    @XmlElement(name = "TestCases")
    protected TestFolderTestCasesType testCases;

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link TestFolderChildrenType }
     *     
     */
    public TestFolderChildrenType getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestFolderChildrenType }
     *     
     */
    public void setChildren(TestFolderChildrenType value) {
        this.children = value;
    }

    /**
     * Gets the value of the formattedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedID() {
        return formattedID;
    }

    /**
     * Sets the value of the formattedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedID(String value) {
        this.formattedID = value;
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
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link TestFolder }
     *     
     */
    public TestFolder getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestFolder }
     *     
     */
    public void setParent(TestFolder value) {
        this.parent = value;
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
     * Gets the value of the testCases property.
     * 
     * @return
     *     possible object is
     *     {@link TestFolderTestCasesType }
     *     
     */
    public TestFolderTestCasesType getTestCases() {
        return testCases;
    }

    /**
     * Sets the value of the testCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestFolderTestCasesType }
     *     
     */
    public void setTestCases(TestFolderTestCasesType value) {
        this.testCases = value;
    }

}
