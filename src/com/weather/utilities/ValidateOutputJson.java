package com.weather.utilities;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.exc.UnrecognizedPropertyException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ValidateOutputJson {
    public static void jsonCompare(String filename, String filename2, String value) throws IOException {
        BufferedReader br = null;
        try {
            ObjectMapper mapper = new ObjectMapper();

            //This dematerialises the json. if the any of the variables are mising there will be a exception
            br = new BufferedReader(new FileReader(new File(filename2)));
            Output city1 = mapper.readValue(new File(filename), Output.class);
            Output city2 = mapper.readValue(new File(filename2), Output.class);

            if (value.contentEquals(Configuration.inputCoord)) {
                //verify that the expected city and the expected country are the same
                if ((city1.getCoord().getLat().toString().equalsIgnoreCase(city2.getCoord().getLat().toString())) && (city1.getCoord().getLon().toString().equalsIgnoreCase(city2.getCoord().getLon().toString()))) {
                    System.out.println("________________________________________________________________________________________________________");
                    System.out.println("Passing case");
                    System.out.println();
                    System.out.println("Coordinates Expected");
                    System.out.println();

                    System.out.println("Expected Lat : " + city1.getCoord().getLat());
                    System.out.println("Expected City : " + city1.getCoord().getLon());
                    System.out.println();
                    System.out.println();

                    System.out.println("Coordinates Actual");
                    System.out.println();

                    System.out.println("Actual Lat : " + city2.getCoord().getLat());
                    System.out.println("Actual Lon : " + city2.getCoord().getLat());
                    System.out.println("________________________________________________________________________________________________________");


                } else {
                    System.out.println("________________________________________________________________________________________________________");
                    System.out.println("Failing Case: Mismatch of Coordinates");
                    System.out.println();
                    System.out.println("Countries Expected");
                    System.out.println("Expected Country : " + city1.getSys().getCountry());
                    System.out.println("Expected City: " + city1.getName());
                    System.out.println();
                    System.out.println();

                    System.out.println("Countries Actual");
                    System.out.println();

                    System.out.println("Actual Co : " + city2.getSys().getCountry());
                    System.out.println("Actual City : " + city2.getName());
                    System.out.println("________________________________________________________________________________________________________");

                }
            } else if (value.contentEquals(Configuration.inputCity)) {
                if ((city1.getSys().getCountry().toString().equalsIgnoreCase(city2.getSys().getCountry().toString())) && (city1.getName().toString().equalsIgnoreCase(city2.getName().toString()))) {
                    System.out.println("________________________________________________________________________________________________________");
                    System.out.println("Passing case");
                    System.out.println();
                    System.out.println("Countries Expected");
                    System.out.println();

                    System.out.println("Expected Country : " + city1.getSys().getCountry());
                    System.out.println("Expected City: " + city1.getName());
                    System.out.println();
                    System.out.println();

                    System.out.println("Countries Actual");
                    System.out.println();

                    System.out.println("Actual Country : " + city2.getSys().getCountry());
                    System.out.println("Actual City : " + city2.getName());
                    System.out.println("________________________________________________________________________________________________________");

                } else {
                    System.out.println("________________________________________________________________________________________________________");
                    System.out.println("Countries Failed");
                    System.out.println();
                    System.out.println("Countries Expected");
                    System.out.println();

                    System.out.println("Expected Country : " + city1.getSys().getCountry());
                    System.out.println("Expected City: " + city1.getName());

                    System.out.println();
                    System.out.println();

                    System.out.println("Countries Actual");
                    System.out.println();

                    System.out.println("Actual Country: " + city2.getSys().getCountry());
                    System.out.println("Actual City: " + city2.getName());
                    System.out.println("________________________________________________________________________________________________________");

                }
            } else if (value.contentEquals(Configuration.inputId)) {
                if ((city1.toString()).equalsIgnoreCase(city2.getId().toString())) {
                    System.out.println("________________________________________________________________________________________________________");
                    System.out.println("Passing case");
                    System.out.println();
                    System.out.println("ID Expected");
                    System.out.println();

                    System.out.println("Expected id : " + city1.getId());
                    System.out.println();
                    System.out.println();

                    System.out.println("ID Actual");
                    System.out.println();

                    System.out.println("Actual ID : " + city2.getId());
                    System.out.println("________________________________________________________________________________________________________");

                } else {
                    System.out.println("________________________________________________________________________________________________________");
                    System.out.println("ID Failed");
                    System.out.println();
                    System.out.println("ID Expected");
                    System.out.println();

                    System.out.println("Expected ID : " + city1.getId());

                    System.out.println();
                    System.out.println();

                    System.out.println("ID Actual");
                    System.out.println();

                    System.out.println("Expected ID : " + city2.getId());

                    System.out.println("________________________________________________________________________________________________________");

                }

            }
        } catch (UnrecognizedPropertyException e) {
            System.out.println(e.getCause());
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("________________________________________________________________________________________________________");
            System.out.println(" Failing Case : Error Message is recieved");
            System.out.println();
            StringBuilder total = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                total.append(line);
            }
            System.out.println(total);
            System.out.println("________________________________________________________________________________________________________");
        }
    }
}




