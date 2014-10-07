package com.filecsv.org;


import java.util.List;
import java.util.Map;
 
public class CSVProcessor {
         
    public void processFile(List<Map<String, String>> maps) {
        System.out.println(maps);
        System.out.println("Size: " + maps.size());
    }
}