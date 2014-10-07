/**
* Class to implement CXFWebservice interface
*/
package com.nivi.org;
 
import java.util.List;
import javax.jws.WebService;
import com.nivi.org.CXFWebservice;
 
@WebService( endpointInterface = "com.confluex.service.CXFWebservice", serviceName="CXFWebservice")
public class CXFWebserviceImpl implements CXFWebservice
{
/* (non-Javadoc)
* @see com.confluex.service.CXFWebservice#sayHello(java.lang.String)
*/
@Override
public String sayHello(String strUser)
{
return "Welcome to Confluex!!! 'The Mule ESB experts.' " + strUser;
}
 
/* (non-Javadoc)
* @see com.confluex.service.CXFWebservice#serviceOperation(java.util.List)
*/
@Override
public String serviceOperation(List list) {
// TODO Auto-generated method stub
return null;
}
}