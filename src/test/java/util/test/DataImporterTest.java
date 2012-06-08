package util.test;

import java.util.List;
import model.Tasks;
import model.com.rallydev.webservice.v1_34.domain.Task;
import org.junit.Test;
import util.AppAuthenticator;
import util.DataImporter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tash
 */
public class DataImporterTest {
    public void testTaskImport()
    {
        AppAuthenticator.username = "tashdid.khan@pearson.com";
        AppAuthenticator.password = "Openup6568";
        List<Tasks> tasks = DataImporter.getTasks("Completed");
        
    }
    
    @Test
    public void testTaskIamport()
    {
        AppAuthenticator.username = "tashdid.khan@pearson.com";
        AppAuthenticator.password = "Openup6568";
        Tasks t = new Tasks();
        t.id = 6658972160l;
        t.Actuals = 90d;
        DataImporter.updateTask(t);
    }
}
