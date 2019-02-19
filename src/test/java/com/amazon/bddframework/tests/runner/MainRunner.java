package com.amazon.bddframework.tests.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
        features = {"/Users/admin/Downloads/IdeaProjects/com.amazon.bddframework/src/test/resources/features/"},
        glue = {"com.amazon.bddframework.tests.android.steps"},

        monochrome = true

)
public class MainRunner{

}