package com.weather.TestCases;

import com.weather.utilities.Configuration;
import com.weather.utilities.Connection;
import com.weather.utilities.GetInputParams;
import static com.weather.utilities.ValidateOutputJson.jsonCompare;

public class FindByCoord {
    public static String[] coord;

    public static void FindByCoordTestCase() throws Exception {
        coord = GetInputParams.getCoordinates(Configuration.inputCoord, Configuration.fileName, Configuration.inputParams, Configuration.inputlon, Configuration.inputlat);
        for (String input : coord) {
            String url=Configuration.BaseURL+input;
            Connection.Connect(url, Configuration.FileNameOutputCompareCoord);
            jsonCompare(Configuration.fileNameOutputCoord, Configuration.FileNameOutputCompareCoord,Configuration.inputCoord);

        }

    }


}

