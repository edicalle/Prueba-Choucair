package com.choucair.formacion;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/EmpleosChoucair.feature")
public class RunnerFeatures {
}
