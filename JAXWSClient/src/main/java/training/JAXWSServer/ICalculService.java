package training.JAXWSServer;

/**
 * Hello world!
 *
 */

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface ICalculService {
   
   @WebMethod
   public int add(int number1,int number2);
}
