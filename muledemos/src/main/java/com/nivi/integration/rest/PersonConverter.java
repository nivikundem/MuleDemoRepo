package com.nivi.integration.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
 
public class PersonConverter implements Converter {
 
    @Override
    public boolean canConvert(Class arg0) {
        if (Map.class.equals(arg0) || HashMap.class.equals(arg0)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
 
    @Override
    public void marshal(Object object, HierarchicalStreamWriter writer,
            MarshallingContext ctx) {
        Map map = (Map)object;
        Set names = map.keySet();
        writer.startNode("Person");
        for (Object name : names) {
            writer.startNode(name.toString());
            String value = (String)map.get(name);
            writer.setValue(value);
            writer.endNode();
        }
        writer.endNode();
 
    }
 
    @Override
    public Object unmarshal(HierarchicalStreamReader arg0,
            UnmarshallingContext arg1) {
        return null;
    }
}