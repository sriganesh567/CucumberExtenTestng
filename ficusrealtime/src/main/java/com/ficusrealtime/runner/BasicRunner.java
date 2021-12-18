package com.ficusrealtime.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Test

@CucumberOptions(features = "Features", glue = "com.ficusrealtime.steps", plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class BasicRunner extends AbstractTestNGCucumberTests {
   
}
