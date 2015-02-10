package com.weather.utilities;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GetInputParams {
    public static void main(String args[]) throws Exception {
        String[] QueryParam = getCoordinates(Configuration.inputCoord, Configuration.fileName, Configuration.inputParams, Configuration.inputlon, Configuration.inputlat);
        for (String coord : QueryParam) {
            System.out.println(coord);
        }
    }

    //get Id and Get ID
    public static String[] returnValue(String value, String file, String rootName) throws Exception {
        ObjectMapper m = new ObjectMapper();
        JsonNode rootNode = m.readTree(new File(file));
        JsonNode nameNode = rootNode.path(rootName);
        int size = nameNode.size();
        String[] returnValue = new String[size];

        if (value.contains(Configuration.inputCity)) {
            if (nameNode.isArray()) {
                for (final JsonNode objNode : nameNode) {
                    size--;
                    String city = objNode.get(value).getTextValue();
                    returnValue[size] = city;
                    //System.out.println(objNode);
                    //System.out.println(returnValue[size]);
                }
            } else {
                System.out.println("not an array");
            }

            //value of id happens to be a long
        } else if (value.contains(Configuration.inputId)) {
            for (final JsonNode objNode : nameNode) {
                size--;
                Long id = objNode.get(value).getLongValue();
                returnValue[size] = id.toString();
                //System.out.println(objNode);
                //System.out.println(returnValue[size]);
                //sSystem.out.println(returnValue[size]);
            }
        } else {
            System.out.print(value);
            System.out.print("fail");
        }
        returnValue=Remove(returnValue);
        return returnValue;
    }

    //Gets the Coordinates parses the innernodes and returns as an array

    public static String[] getCoordinates(String value, String File, String rootName, String lonin, String latin) throws Exception {
        ObjectMapper m = new ObjectMapper();
        JsonNode rootNode = m.readTree(new File(File));
        JsonNode nameNode = rootNode.path(rootName);
        int size = nameNode.size();
        String latlong[] = new String[size];
        for (final JsonNode objNode : nameNode) {
            size--;
            JsonNode jsonNode2 = objNode.get(value);
            String lat = jsonNode2.get(latin).asText();
            String lon = jsonNode2.get(lonin).asText();
            latlong[size] = "?lat=" + lat + "&" + "lon=" + lon;
        }
        latlong=Remove(latlong);
        return latlong;
    }
    public static String[] Remove(String []data){
        List<String> list = Arrays.asList(data);
        Set<String> set = new HashSet<String>(list);

        //System.out.println("Remove duplicate result: ");

        String[] result = new String[set.size()];
        set.toArray(result);
        for (String s : result) {
            //System.out.println(s + ", ");
        }
        return result;
    }
}
