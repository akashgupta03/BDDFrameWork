package com.amazon.bddframework.tests.base;

import com.amazon.bddframework.AppiumServerUtil;
import com.amazon.bddframework.tests.builder.AndroidDriverBuilder;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;

import org.junit.Test;


import java.io.IOException;

public class BaseStep extends AndroidDriverBuilder {
    public AppiumDriver appiumDriver;


    @Before
    public AppiumDriver startAppiumServer() throws IOException {
        System.out.println("before test");
        AppiumServerUtil.start();
        appiumDriver = setUp();
        System.out.println("before class");
        this.appiumDriver = setUp();
        return this.appiumDriver;
    }
    @After
    public void tearDown() {
        AppiumServerUtil.stop();
    }
}
