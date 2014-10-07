package com.json.org;



public class LastFirst extends Namer {
 
 public LastFirst(String entry) {
  int i = entry.lastIndexOf(",");
  if(i> 0) {
   setLast(entry.substring(0,i).trim());
   setFirst(entry.substring(i+1).trim());
  } else {
   setFirst("");
   setLast(entry);
  }
 }
}