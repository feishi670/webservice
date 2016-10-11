package com.wendell.web;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class MyClient {
	public static void main(String[] args) throws Exception {  
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();  
        Client client = clientFactory.createClient("http://localhost:8080/web/cxf/HelloWorld?wsdl");  
        Object[] result = client.invoke("sayHi", "KEVIN");  
        System.out.println(result[0]);  
    } 
}
