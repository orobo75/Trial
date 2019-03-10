package com.rady.tesco.cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",

        glue = {"com.rady.tesco.stepDefinition", "com.rady.tesco.cucumberRunner"},
          tags = {"@createaccount"},
             format= {

                       "html:target/site/cucumber-pretty"
})
class TestRunner {
}
