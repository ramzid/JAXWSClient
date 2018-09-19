package training.JAXWSClient;

import java.net.URL;

import javax.xml.namespace.QName;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import training.JAXWSServer.ICalculService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
            URL url = new URL("http://localhost:8888/ws/add?wsdl");
     
            QName qname = new QName("http://JAXWSServer.training/", "CalculServiceImplService");
     
            Service service = Service.create(url, qname);
     
            ICalculService calcul = service.getPort(ICalculService.class);
     
            System.out.println(calcul.add(1, 2));
            
        
    }
}
