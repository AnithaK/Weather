package com.weather.TestCases;


import com.weather.utilities.Configuration;
import com.weather.utilities.Connection;
import com.weather.utilities.GetInputParams;

import static com.weather.utilities.ValidateOutputJson.jsonCompare;

public class FindById {
    public static String[] Id;

    public static void FindByIdTestCase() throws Exception {
        Id = GetInputParams.returnValue(Configuration.inputId, Configuration.fileName, Configuration.inputParams);
        for (String input : Id) {
            String url=Configuration.BaseURL+Configuration.queryParamId+input;
            //System.out.println(url);
            Connection.Connect(url, Configuration.fileNameOutputCompareID);

            jsonCompare(Configuration.fileNameOutputID, Configuration.fileNameOutputCompareID, Configuration.inputId);

        }

    }
}
