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
 * <p>Java class for TestCaseStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestCaseStep">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rallydev.com/webservice/v1_34/domain}WorkspaceDomainObject">
 *       &lt;sequence>
 *         &lt;element name="ExpectedResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Input" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StepIndex" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TestCase" type="{http://rallydev.com/webservice/v1_34/domain}TestCase" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestCaseStep", propOrder = {
    "expectedResult",
    "input",
    "stepIndex",
    "testCase"
})
public class TestCaseStep
    extends WorkspaceDomainObject
{

    @XmlElement(name = "ExpectedResult")
    protected String expectedResult;
    @XmlElement(name = "Input")
    protected String input;
    @XmlElement(name = "StepIndex")
    protected Long stepIndex;
    @XmlElement(name = "TestCase")
    protected TestCase testCase;

    /**
     * Gets the value of the expectedResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedResult() {
        return expectedResult;
    }

    /**
     * Sets the value of the expectedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedResult(String value) {
        this.expectedResult = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the stepIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStepIndex() {
        return stepIndex;
    }

    /**
     * Sets the value of the stepIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStepIndex(Long value) {
        this.stepIndex = value;
    }

    /**
     * Gets the value of the testCase property.
     * 
     * @return
     *     possible object is
     *     {@link TestCase }
     *     
     */
    public TestCase getTestCase() {
        return testCase;
    }

    /**
     * Sets the value of the testCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestCase }
     *     
     */
    public void setTestCase(TestCase value) {
        this.testCase = value;
    }

}