package com.json.org;

public class FirstFirst extends Namer {
	 
	 public FirstFirst(String entry) {
	  int i = entry.lastIndexOf(" ");
	  if(i> 0) {
	   setFirst(entry.substring(0,i).trim());
	   setLast(entry.substring(i+1).trim());
	  } else {
	   setFirst("");
	   setLast(entry);
	  }
	 }
	 
	}