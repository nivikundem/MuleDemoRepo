package com.nivi.integration.rest;

import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("restClass")
public class RestClass {

 public Response getExample(@QueryParam("param1")String param1)
 {
  return Response.status(Status.OK).entity("hello " + param1).build();
 }
 
}