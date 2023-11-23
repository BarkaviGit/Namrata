package org.runnerclass;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\Eclipsesepproj\\DonamixProjCucum\\src\\test\\resources\\Feature1.feature",glue="org.stepdef",dryRun=true)
public class RunAllClass {
}
