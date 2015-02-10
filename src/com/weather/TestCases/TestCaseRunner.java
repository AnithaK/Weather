package com.weather.TestCases;

import org.testng.annotations.Test;

import static com.weather.TestCases.FindByCity.FindByCityTestCase;
import static com.weather.TestCases.FindByCoord.FindByCoordTestCase;
import static com.weather.TestCases.FindById.FindByIdTestCase;


public class TestCaseRunner
{
    @Test
    public void RunTestCity() throws Exception {
        FindByCityTestCase();
    }
    @Test
    public void RunTestCord() throws Exception {
        FindByCoordTestCase();
    }
    @Test
    public void RunTestID() throws Exception {
        FindByIdTestCase();
    }

}
