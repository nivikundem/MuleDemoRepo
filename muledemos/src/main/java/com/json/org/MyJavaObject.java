package com.json.org;


public class MyJavaObject {

	 public Namer greet(String name) {
	  NameFactory nameFactory = new NameFactory();
	  Namer namer = nameFactory.getNamer("Nivi kundem");
	  return namer;
	 }
	}