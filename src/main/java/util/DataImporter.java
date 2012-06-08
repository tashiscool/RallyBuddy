/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import model.Tasks;
import model.com.rallydev.webservice.v1_34.domain.DomainObject;
import model.com.rallydev.webservice.v1_34.domain.QueryResult;
import model.com.rallydev.webservice.v1_34.domain.Task;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Tash
 */
public class DataImporter {
    public static List<Tasks> getTasks(String state)
    {
        
        List<Tasks> returner = new LinkedList<Tasks>();
        List<String> refStrings = new  LinkedList<String>();
            Map<String, String> params = new HashMap<String, String>();
            params.put("query", "((Owner.Name = "+AppAuthenticator.username
                    + ") and (State != "+
                    state+ "))");
            params.put("order", "Rank");
            params.put("fetch", "true");
        JSONArray qr =(JSONArray) RESTClient.request("GET", "/task.js", AppAuthenticator.username, AppAuthenticator.password,params );
        for (Object dObj :qr)
        {
            Tasks e = new Tasks();
            JSONObject obj = (JSONObject) dObj;
            e.Estimate = (Double) obj.get("Estimate");
            e.Actuals = (Double) obj.get("Actuals");
            e.Name = (String) obj.get("Name");
            e.State = (String) obj.get("State");
            e.id = (Long) obj.get("ObjectID");
            e.WorkProduct = (String)((JSONObject) obj.get("WorkProduct")).get("_refObjectName");
            e.TA = (String) obj.get("FormattedID");	
            e.Description = (String) obj.get("Description") + (String) obj.get("Notes");
            returner.add(e);
        }
        return returner;
    }
    
    public static void updateTask(Tasks t)
    {
        
        RESTClient.requestUpdateTask("/task/" + t.id+".js", t.Actuals);
    }
    
    public static List<Tasks> getDefects(String state)
    {
        
        List<Tasks> returner = new LinkedList<Tasks>();
        List<String> refStrings = new  LinkedList<String>();
            Map<String, String> params = new HashMap<String, String>();
            params.put("query", "((Owner.Name = "+AppAuthenticator.username
                    + ") and (State != "+
                    state+ "))");
            params.put("order", "Rank");
            params.put("fetch", "true");
        JSONArray qr =(JSONArray) RESTClient.request("GET", "/defect.js", AppAuthenticator.username, AppAuthenticator.password,params );
        for (Object dObj :qr)
        {
            Tasks e = new Tasks();
            JSONObject obj = (JSONObject) dObj;
            e.Estimate = (Double) obj.get("Estimate");
            e.Actuals = (Double) obj.get("Actuals");
            e.Name = (String) obj.get("Name");
            e.State = (String) obj.get("State");
            e.id = (Long) obj.get("ObjectID");
            e.WorkProduct = (String)((JSONObject) obj.get("WorkProduct")).get("_refObjectName");
            e.TA = (String) obj.get("FormattedID");	
            e.Description = (String) obj.get("Description") + (String) obj.get("Notes");
            returner.add(e);
        }
        return returner;
    }
    
    public static void updateDefect(Tasks t)
    {
        
        RESTClient.requestUpdateTask("/defect/" + t.id+".js", t.Actuals);
    }
}
