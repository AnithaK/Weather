package com.weather.utilities;


public class Configuration {
    public static String BaseURL="http://api.openweathermap.org/data/2.5/weather";

    //input Configuration
    public static String inputParams="params";
    public static String inputCity="name";
    public static String inputId="id";
    public static String inputCoord="coord";
    public static String inputlat="lat";
    public static String inputlon="lon";
    public static String queryParamCity="?q=";
    public static String queryParamId="?id=";



    public static String fileName="/Users/MooMoo/Desktop/Weather/resources/Input.json";


    //output
    public static String fileNameOutputCity="/Users/MooMoo/Desktop/Weather/resources/OutputbyCity.json";
    public static String fileNameOutputID="/Users/MooMoo/Desktop/Weather/resources/OutputbyId.json";
    public static String fileNameOutputCoord="/Users/MooMoo/Desktop/Weather/resources/OutputbyCoord.json";


    //output
    public static String fileNameOutputCompareCity="/Users/MooMoo/Desktop/Weather/resources/OutputCompareCity.json";
    public static String fileNameOutputCompareID="/Users/MooMoo/Desktop/Weather/resources/OutputCompareId.json";
    public static String FileNameOutputCompareCoord="/Users/MooMoo/Desktop/Weather/resources/OutputCompareCoord.json";





}
