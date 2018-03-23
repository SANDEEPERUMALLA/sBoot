package com.psk.sBoot;

import com.psk.sBoot.model.resources.TestResource;

import javax.xml.bind.JAXBElement;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SOAPTest {



    public static void main(String args[]) throws IOException {

        JAXBElement<TestResource> el;


        URL obj = new URL("https://wd2-impl-services1.workday.com/ccx/service/informatica_pt1/Human_Resources/v25.0");


        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        connection.setDoInput(true);
        connection.setDoOutput(false);

        String soapBody = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"><SOAP-ENV:Header><wsse:Security xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\" SOAP-ENV:mustUnderstand=\"1\"><wsse:UsernameToken wsu:Id=\"UsernameToken-94ac8c8e-02e6-4ac9-b4ef-f41f371af498\"><wsse:Username>ragarwal@informatica_pt1</wsse:Username><wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">1qazXSW@</wsse:Password></wsse:UsernameToken></wsse:Security></SOAP-ENV:Header><SOAP-ENV:Body><ns2:Get_Workers_Request xmlns:ns2=\"urn:com.workday/bsvc\" ns2:version=\"v25.0\"><ns2:Request_References ns2:Skip_Non_Existing_Instances=\"false\"><ns2:Worker_Reference><ns2:ID ns2:type=\"WID\">3aa5550b7fe348b98d7b5741afc65534</ns2:ID></ns2:Worker_Reference></ns2:Request_References></ns2:Get_Workers_Request></SOAP-ENV:Body></SOAP-ENV:Envelope>";
       // connection.setRequestProperty("User-Agent", );




        //DataOutputStream wr = new DataOutputStream(connection.getOutputStream());

       // wr.writeBytes(soapBody);

        //wr.flush();

        int responseCode = connection.getResponseCode();
       // System.out.println("\nSending 'POST' request to URL : " + url);
        //System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader( connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());



    }
}
