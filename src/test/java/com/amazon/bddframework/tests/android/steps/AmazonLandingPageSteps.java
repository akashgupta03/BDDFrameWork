package com.amazon.bddframework.tests.android.steps;
import com.amazon.bddframework.AppiumServerUtil;
import com.amazon.bddframework.pages.android.AmazonHomePage;
import com.amazon.bddframework.pages.android.AmazonLoginPage;
import com.amazon.bddframework.tests.base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import java.io.IOException;

import static com.amazon.bddframework.tests.builder.AndroidDriverBuilder.setUp;

public class AmazonLandingPageSteps  {

    private AppiumDriver appiumDriver;
    AmazonLoginPage lg;

    @Given("^User On landing page$")
    public void userOnLandingPage() throws IOException {
        AppiumServerUtil.start();
        appiumDriver = setUp();
       lg=new AmazonLoginPage(appiumDriver);
        lg.isAmazonIconPresent();
    }

    @When("^User check the all UI Element$")
    public void userCheckTheAllUIElement() {

        lg.isAmazonIconPresent();
        lg.isPrimaryTextPresent();
        lg.isSecondaryTextPresent();
        lg.isSecondaryText2Present();
        lg.isSecondaryText3Present();
        lg.isSignInBtnPresent();
        lg.isSignUpBtnPresent();
        lg.isSkipSignInPresent();
    }



    @And("^User log in as \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLogInAsAndPassword(String username, String password) throws Throwable {
        lg.login(username,password);
        throw new PendingException();
    }


    @Then("^user land on Amazon Home page$")
    public void userLandOnAmazonHomePage() {
        AmazonHomePage aHome =new AmazonHomePage(appiumDriver);
        aHome.isaddCartIconDisplay();
    }
}
