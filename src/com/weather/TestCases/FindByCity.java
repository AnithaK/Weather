package com.weather.TestCases;

import com.weather.utilities.*;



import static com.weather.utilities.ValidateOutputJson.*;

public class FindByCity {
    public static String[] City;

    public static void FindByCityTestCase() throws Exception {
        City = GetInputParams.returnValue(Configuration.inputCity, Configuration.fileName, Configuration.inputParams);
        for (String input : City) {
            String url = Configuration.BaseURL + Configuration.queryParamCity + input;
            Connection.Connect(url, Configuration.fileNameOutputCompareCity);
            jsonCompare(Configuration.fileNameOutputCity, Configuration.fileNameOutputCompareCity,Configuration.inputCity);

        }

    }


}
