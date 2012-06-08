/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import model.com.rallydev.webservice.v1_34.domain.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.*;

/**
 *
 * @author Tash
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryResult"
})
@XmlRootElement(name = "ResultWrapper")
public class ResultWrapper {
    @XmlElement(name = "QueryResult")
    QueryResult queryResult;

    public QueryResult getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
    }
    
    
}
