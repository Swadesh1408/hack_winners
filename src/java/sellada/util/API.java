/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellada.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Swadesh Sharma
 */
public class API {

    public static StringBuffer getApiKey() {
        String output=null;
        StringBuffer op=null;
        StringBuffer api=new StringBuffer();
        try {
//            URL url = new URL("http://13.48.136.54:8000/api/api-code/");
            URL url = new URL("http://api.openai.com/v1/images/generations");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer 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");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
            
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            System.out.println("Output from Server .... \n");
            while ((output = br.readLine())!=null) {
                  op.append(br.readLine());
            }
            

            conn.disconnect();
            return op;

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return op;
    }

    public static void main(String[] args) {
        StringBuffer api = API.getApiKey();
//        Pattern p = Pattern.compile("^.*$");
//        
//        Matcher apiKey=p.matcher(api);
        System.out.println(api);
    }
}
