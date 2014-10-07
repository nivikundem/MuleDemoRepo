package com.crossing.www.BridgeCrossingWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

public class BridgeCrossingWSImpl implements BridgeCrossingWS {

	@Override
	@WebResult(name = "out", targetNamespace = "")
	@RequestWrapper(localName = "sendCrossingDetails", targetNamespace = "http://www.crossing.com/BridgeCrossingWS/", className = "com.crossing.www.BridgeCrossingWS.SendCrossingDetails")
	@WebMethod(action = "urn:SendCrossingDetails")
	@ResponseWrapper(localName = "sendCrossingDetailsResponse", targetNamespace = "http://www.crossing.com/BridgeCrossingWS/", className = "com.crossing.www.BridgeCrossingWS.SendCrossingDetailsResponse")
	public String sendCrossingDetails(
			@WebParam(name = "vrn", targetNamespace = "") String vrn,
			@WebParam(name = "gateno", targetNamespace = "") String gateno,
			@WebParam(name = "direction", targetNamespace = "") String direction) {
		
		return "vrn:  " +vrn+  " gateno: " +gateno+"  direction: "+direction ;
	}

}
