package com.nivi.integration.http;


import java.util.Map;

public class DataEcho {

	public DataEcho() {
	}

	public void echo() {
		System.out.println("Reached echo method--------");
	}

	public void echoInput(String input) {
		System.out.println("Reached echoInput method********");
		System.out.println("Input: " + input);
	}

	public void echoMap(Map map) {
		System.out.println("Reached echoMap method");
		System.out.println("Map: " + map);
	}

}