/**
* Interface for creating JAX-WS Service with CXF in Mule
*/
package com.nivi.org;
 
import java.util.List;
import javax.jws.WebService;
 
@WebService
public interface CXFWebservice
{
 
String sayHello( String strUser );
 
String serviceOperation ( List list );
}