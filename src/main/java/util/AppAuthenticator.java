/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.ByteArrayInputStream;
import util.RESTClient;
/**
 *
 * @author Tash
 */
public class AppAuthenticator {
    public static boolean loginned = false;
    public static String username = "";
    public static String password = "";
    public static boolean authUser(String user, String password)
    {
        try{
            util.RESTClient.request(RESTClient.GET, "/tasks.js", user, password, null);
            loginned = true;
            username = user;
            AppAuthenticator.password = password;
        }
        catch (Exception e)
        {
            loginned = false;
            return false;
        }
        return true;
    }
}
