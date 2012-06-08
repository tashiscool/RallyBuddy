/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Tash
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import model.com.rallydev.webservice.v1_34.domain.CreateResult;
import model.com.rallydev.webservice.v1_34.domain.OperationResult;
import model.com.rallydev.webservice.v1_34.domain.QueryResult;
import model.com.rallydev.webservice.v1_34.domain.Task;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.xc.JaxbAnnotationIntrospector;

import org.apache.http.HttpVersion;
import org.apache.http.auth.Credentials;
import org.apache.commons.httpclient.SimpleHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.http.entity.StringEntity;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class RESTClient
{
    public static final String GET = "GET";
    public static final String PUT = "PUT";
    public static final String DELETE = "DELETE";
    public static final String POST = "POST";
    private static final ObjectMapper mapper = new ObjectMapper();
   
    private RESTClient()
    {
        super();
    }
   
    private static void usage()
    {
        System.out.println("Usage:");
        System.out.println("  For get and delete:");
        System.out.println("    java -jar restclient.jar [-quiet] user pass GET/DELETE url");
        System.out.println("");
        System.out.println("  For put and post, sending the contents of a file as the body:");
        System.out.println("    java -jar restclient.jar [-quiet] user pass PUT/POST url filename");
        System.out.println("");
        System.out.println("  -quiet will cause only the response body to be printed, otherwise");
        System.out.println("  the response headers and timing information is included.");
        System.exit(1);
    }
   
    public static void main(String arguments[])
    {
//        List argsList = new ArrayList(arguments.length);
//        for (int i=0; i<arguments.length; i++) argsList.add(arguments[i]);
//       
//        Iterator args = argsList.iterator();
//       
//        boolean quiet = false;
//        if (!args.hasNext()) usage();
//        String quietFlag = (String)argsList.iterator().next();
//        if ("-quiet".equalsIgnoreCase(quietFlag))
//        {
//            args.next();
//            quiet = true;
//        }
//       
//        if (!args.hasNext()) usage();
//        String user = (String)args.next();
//
//        if (!args.hasNext()) usage();
//        String pass = (String)args.next();
//       
        try
        {
//            if (!args.hasNext()) usage();
//            String method = (String)args.next();
//           
//           
//            if (GET.equalsIgnoreCase(method))
//            {
//                if (args.hasNext()) usage();
            Map<String, String> params = new HashMap<String, String>();
            params.put("query", "((Owner.Name = tashdid.khan@pearson.com) and (State != Completed))");
            params.put("order", "Rank");
            params.put("fetch", "true");
            request(GET, "/task.js", "tashdid.khan@pearson.com", "Openup6568", params);
//            }
//            else if (PUT.equalsIgnoreCase(method))
//            {
//                if (!args.hasNext()) usage();
//                String file = (String)args.next();
//                request(PUT, "", user, pass, new FileInputStream(new File(file)));
//            }
//            else if (POST.equalsIgnoreCase(method))
//            {
//                if (!args.hasNext()) usage();
//                String file = (String)args.next();
//                request(POST, "", user, pass, new FileInputStream(new File(file)));
//            }
//            else if (DELETE.equalsIgnoreCase(method))
//            {
//                if (args.hasNext()) usage();
//                request(DELETE, "", user, pass, null);
//            }
//            else
//            {
//                usage();
//            }
        }
        catch (Exception x)
        {
            System.err.println(x);
            System.exit(1);
        }
    }
   
    public static Object request(String method, String service, String username, String password, Map<String, String> vars)
    {
        String urlstr = (String)"https://rally1.rallydev.com/slm/webservice/1.34";
        urlstr += service;
        // sigh.  openConnection() doesn't actually open the connection,
        // just gives you a URLConnection.  connect() will open the connection.
        DefaultHttpClient httpclient = new DefaultHttpClient();
        httpclient.getParams().setParameter("http.protocol.version",
				HttpVersion.HTTP_1_1);
		httpclient.getParams().setParameter("http.socket.timeout",
				new Integer(10000));
		httpclient.getParams().setParameter("http.connection.timeout",
				new Integer(10000));
		httpclient.getParams().setParameter("http.protocol.content-charset",
				"UTF-8");
                
        Credentials defaultcreds = new UsernamePasswordCredentials(username,password);
        httpclient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT), defaultcreds);
        List<NameValuePair> params = generateParameters(vars);

        String normalizedPath = urlstr.toLowerCase();
	StringBuilder sb = new StringBuilder();

        HttpUriRequest request = buildMethod(method, urlstr, params);

	request.addHeader(new BasicHeader("User-Agent", "coding sux"));
	request.addHeader(new BasicHeader("Accept", "application/json"));   
		HttpResponse response;
		try {
			response = httpclient.execute(request);
			HttpEntity entity = response.getEntity();

			Header[] contentTypeHeaders = response.getHeaders("Content-Type");
			String responseBody = "";
			
			if (entity != null) {
				responseBody = EntityUtils.toString(entity);
			}
                        System.out.println(responseBody);
			StatusLine status = response.getStatusLine();
			int statusCode = status.getStatusCode();
                        if (GET.equals(method))
                        {
                            ObjectMapper objMapper = new ObjectMapper();
                            objMapper.setVisibility(JsonMethod.ALL, JsonAutoDetect.Visibility.ANY);
                            
//                            QueryResult qr = objMapper.readValue(responseBody.replace("{\"QueryResult\":", "").substring(0, responseBody.replace("{\"QueryResult\":", "").lastIndexOf("}")), QueryResult.class);
                            JSONObject obj = (JSONObject) JSONValue.parse(responseBody);
//                            System.out.println(qr.getResults());
                            return ((JSONObject)obj.get("QueryResult")).get("Results");
                        }
                        else
                        {
                            JSONObject obj = (JSONObject) JSONValue.parse(responseBody);
                            return obj;
                        }


		} catch (ClientProtocolException e1) {
                        e1.printStackTrace();
			throw new RuntimeException(e1);
		} catch (IOException e1) {
                    e1.printStackTrace();
			throw new RuntimeException(e1);
		}    
        
            
    }
    
     public static List<Task> requestTasks(List<String> refs,  String username, String password)
    {
        List<Task> tasks = new LinkedList<Task>();
        DefaultHttpClient httpclient = new DefaultHttpClient();
        httpclient.getParams().setParameter("http.protocol.version",
				HttpVersion.HTTP_1_1);
		httpclient.getParams().setParameter("http.socket.timeout",
				new Integer(10000));
		httpclient.getParams().setParameter("http.connection.timeout",
				new Integer(10000));
		httpclient.getParams().setParameter("http.protocol.content-charset",
				"UTF-8");
                
        Credentials defaultcreds = new UsernamePasswordCredentials(username,password);
        httpclient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT), defaultcreds);
        for (String ref : refs)
        {
        HttpUriRequest request = buildMethod("GET", ref, null);

	request.addHeader(new BasicHeader("User-Agent", "coding sux"));
	request.addHeader(new BasicHeader("Accept", "application/json"));   
		HttpResponse response;
		try {
			response = httpclient.execute(request);
			HttpEntity entity = response.getEntity();

			Header[] contentTypeHeaders = response.getHeaders("Content-Type");
			String responseBody = "";
			
			if (entity != null) {
				responseBody = EntityUtils.toString(entity);
			}
                        System.out.println(responseBody);
			StatusLine status = response.getStatusLine();
			int statusCode = status.getStatusCode();
                        tasks.add(new ObjectMapper().readValue(responseBody, Task.class));

		} catch (ClientProtocolException e1) {
                        e1.printStackTrace();
			throw new RuntimeException(e1);
		} catch (IOException e1) {
                    e1.printStackTrace();
			throw new RuntimeException(e1);
		}                    
        }
        return tasks;
    }
    
    	/**
	 * Generate parameters.
	 * 
	 * @param vars
	 *            the vars
	 * @return the list
	 */
	private static List<NameValuePair> generateParameters(
			Map<String, String> vars) {
		List<NameValuePair> qparams = new ArrayList<NameValuePair>();

		if (vars != null) {
			for (String var : vars.keySet()) {
				qparams.add(new BasicNameValuePair(var, vars.get(var)));
			}
		}

		return qparams;
	}

	/*
	 * 
	 * Method builders
	 */
	/**
	 * Builds the method.
	 * 
	 * @param method
	 *            the method
	 * @param path
	 *            the path
	 * @param params
	 *            the params
	 * @return the http uri request
	 */
	private static HttpUriRequest buildMethod(String method, String path,
			List<NameValuePair> params) {
		if (method.equalsIgnoreCase("GET")) {
			return generateGetRequest(path, params);
		} else if (method.equalsIgnoreCase("POST")) {
			return generatePostRequest(path, params);
		} else if (method.equalsIgnoreCase("PUT")) {
			return generatePutRequest(path, params);
		} else if (method.equalsIgnoreCase("DELETE")) {
			return generateDeleteRequest(path, params);
		} else {
			throw new IllegalArgumentException("Unknown Method: " + method);
		}
	}

	/**
	 * Generate get request.
	 * 
	 * @param path
	 *            the path
	 * @param params
	 *            the params
	 * @return the http get
	 */
	private static HttpGet generateGetRequest(String path, List<NameValuePair> params) {

		URI uri = buildUri(path, params);
		return new HttpGet(uri);
	}

	/**
	 * Generate post request.
	 * 
	 * @param path
	 *            the path
	 * @param params
	 *            the params
	 * @return the http post
	 */
	private static HttpPost generatePostRequest(String path, List<NameValuePair> params) {
		URI uri = buildUri(path);

		UrlEncodedFormEntity entity = buildEntityBody(params);

		HttpPost post = new HttpPost(uri);
		post.setEntity(entity);

		return post;
	}

	/**
	 * Generate put request.
	 * 
	 * @param path
	 *            the path
	 * @param params
	 *            the params
	 * @return the http put
	 */
	private static HttpPut generatePutRequest(String path, List<NameValuePair> params) {
		URI uri = buildUri(path);

		UrlEncodedFormEntity entity = buildEntityBody(params);

		HttpPut put = new HttpPut(uri);
		put.setEntity(entity);

		return put;
	}

	/**
	 * Generate delete request.
	 * 
	 * @param path
	 *            the path
	 * @param params
	 *            the params
	 * @return the http delete
	 */
	private static HttpDelete generateDeleteRequest(String path,
			List<NameValuePair> params) {
		URI uri = buildUri(path);

		HttpDelete delete = new HttpDelete(uri);
		return delete;
	}

	/*
	 * 
	 * Helper functions for building methods
	 */
	/**
	 * Builds the entity body.
	 * 
	 * @param params
	 *            the params
	 * @return the url encoded form entity
	 */
	private static UrlEncodedFormEntity buildEntityBody(List<NameValuePair> params) {
		UrlEncodedFormEntity entity = null;
		try {
			entity = new UrlEncodedFormEntity(params, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}

		return entity;
	}

	/**
	 * Builds the uri.
	 * 
	 * @param path
	 *            the path
	 * @return the uRI
	 */
	private static URI buildUri(String path) {
		return buildUri(path, null);
	}

	/**
	 * Builds the uri.
	 * 
	 * @param path
	 *            the path
	 * @param queryStringParams
	 *            the query string params
	 * @return the uRI
	 */
	private static URI buildUri(String path, List<NameValuePair> queryStringParams) {
		StringBuilder sb = new StringBuilder();
		sb.append(path);

		if (queryStringParams != null && queryStringParams.size() > 0) {
			sb.append("?");
			sb.append(URLEncodedUtils.format(queryStringParams, "UTF-8"));
		}

		URI uri;
		try {
			uri = new URI(sb.toString());
		} catch (URISyntaxException e) {
			throw new IllegalStateException("Invalid uri", e);
		}

		return uri;
	}
        
          public static void requestUpdateTask(String service, Double acutal)
    {
        String URL = "https://rally1.rallydev.com/slm/webservice/1.34" + service;
        List<Task> tasks = new LinkedList<Task>();
        DefaultHttpClient httpclient = new DefaultHttpClient();
        httpclient.getParams().setParameter("http.protocol.version",
				HttpVersion.HTTP_1_1);
		httpclient.getParams().setParameter("http.socket.timeout",
				new Integer(10000));
		httpclient.getParams().setParameter("http.connection.timeout",
				new Integer(10000));
		httpclient.getParams().setParameter("http.protocol.content-charset",
				"UTF-8");
                
        Credentials defaultcreds = new UsernamePasswordCredentials(AppAuthenticator.username,AppAuthenticator.password);
        httpclient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT), defaultcreds);
        try
        {
        HttpEntity entity = new StringEntity("{\"Tasks\":{\"Actuals\":"+String.format("%6.2f", acutal)
                + "}}");
        
        System.out.println("SUCCESS?"+EntityUtils.toString(entity));
        URI uri = buildUri(URL);
	HttpPost post = new HttpPost(uri);
	post.setEntity(entity);
        post.addHeader(new BasicHeader("User-Agent", "coding sux"));
	post.addHeader(new BasicHeader("Accept", "application/json"));   
	post.addHeader(new BasicHeader("Content-Type", "application/json"));   
        
        HttpResponse response;
		try {
			response = httpclient.execute(post);
			HttpEntity entity2 = response.getEntity();

			Header[] contentTypeHeaders = response.getHeaders("Content-Type");
			String responseBody = "";
			
			if (entity2 != null) {
				responseBody = EntityUtils.toString(entity2);
			}
                        System.out.println("SUCCESS?"+responseBody);
			StatusLine status = response.getStatusLine();
			int statusCode = status.getStatusCode();

		} catch (ClientProtocolException e1) {
                        e1.printStackTrace();
			throw new RuntimeException(e1);
		} catch (IOException e1) {
                    e1.printStackTrace();
			throw new RuntimeException(e1);
		}        
        }
        catch (Exception e)
        {
            e.printStackTrace();;
            throw new RuntimeException(e);
        }
    }
}
