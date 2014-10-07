package com.nivi.integration.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("/schools")
public class RestImpl2 {
 
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{id}")
    public Response getSchoolDetails(@PathParam("id")String param) {
        System.out.println("Retrieving School details Nivi"); 
        StringBuilder sb = new StringBuilder();
        sb.append("<Schools>\n");
        if ("1".equals(param)) {
            sb.append("<School>\n");
            createIdTag(param, sb);
            createNameTag("Father Agnel's school", sb);
            createRatingTag("3.5", sb);
            sb.append("</School>\n");
        } else if ("2".equals(param)) {
            sb.append("<School>\n");
            createIdTag(param, sb);
            createNameTag("Gurukul school", sb);
            createRatingTag("3.0", sb);
            sb.append("</School>\n");         
        } else {
            sb.append("<Error>");
            sb.append("School not found!");
            sb.append("</Error>\n");
            sb.append("</Schools>\n");
         //   return Response.ok(sb.toString()).build();
            return Response.status(Status.OK).entity(sb.toString()).build();
          //  return sb;
        }
        sb.append("</Schools>\n");
      //  return Response.ok(sb.toString()).build();
        return Response.status(Status.OK).entity(sb.toString()).build();
      //  return null;
    }
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{id}/children")
    public Response getChildrenDetails(@PathParam("id")String id, @QueryParam("childid")String childId) {
        System.out.println("Retrieving Children details"); 
        StringBuilder sb = new StringBuilder();
        sb.append("<Schools>\n");
        if ("1".equals(id)) {
            sb.append("<School>\n");
            createIdTag(id, sb);
            createNameTag("Father Agnel's school", sb);
            createRatingTag("3.5", sb);
            addChildren(childId, sb);
            sb.append("</School>\n");
        } else if ("2".equals(id)) {
            sb.append("<School>\n");
            createIdTag(id, sb);
            createNameTag("Gurukul school", sb);
            createRatingTag("3.0", sb);
            addChildren(childId, sb);
            sb.append("</School>\n");         
        } else {
            sb.append("<Error>");
            sb.append("School not found!");
            sb.append("</Error>\n");
            sb.append("</Schools>\n");
          //  return Response.ok(sb.toString()).build();
            return null;
        }
        sb.append("</Schools>\n");
        
      //  return Response.status(Status.OK).entity("hello ").build();
        
      //  return Response.ok(sb.toString()).build();
        return Response.status(Status.OK).entity(sb.toString()).build();
    }
 
private void createIdTag(String param, StringBuilder sb) {
        sb.append("<Id>");
        sb.append(param);
        sb.append("</Id>\n");
    }
 
    private void createNameTag(String param, StringBuilder sb) {
        sb.append("<Name>");
        sb.append(param);
        sb.append("</Name>\n");
    }
 
    private void createRatingTag(String param, StringBuilder sb) {
        sb.append("<Rating>");
        sb.append(param);
        sb.append("</Rating>\n");
    }
 
    private void addChildren(String childId, StringBuilder sb) {
        sb.append("<Children>\n");
        if ("1".equals(childId)) {
            createNameTag("Star1", sb);
        } else if ("2".equals(childId)) {
            createNameTag("Star2", sb);
        } else {
             
            if(childId != null) {
                sb.append("<Error>");
                sb.append("No children associated with this school");
                sb.append("</Error>\n");
            } else {
                createNameTag("Star1", sb);
                createNameTag("Star2", sb);
                createNameTag("Star3", sb);
            }
        }
        sb.append("</Children>\n");
    }
}