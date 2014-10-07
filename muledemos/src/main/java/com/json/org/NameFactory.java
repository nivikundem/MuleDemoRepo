package com.json.org;


public class NameFactory {

 public Namer getNamer(String entry) {
  int i = entry.indexOf(",");
  if(i > 0) {
   return new LastFirst(entry);
  } else {
   return new FirstFirst(entry);
  }
 }
}