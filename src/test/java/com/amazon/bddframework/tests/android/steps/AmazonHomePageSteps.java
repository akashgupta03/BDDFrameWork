package com.amazon.bddframework.tests.android.steps;
import com.amazon.bddframework.AppiumServerUtil;
import com.amazon.bddframework.pages.android.AmazonHomePage;
import com.amazon.bddframework.pages.android.AmazonLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

import java.io.IOException;

import static com.amazon.bddframework.tests.builder.AndroidDriverBuilder.setUp;

public class AmazonHomePageSteps  {
    AmazonLoginPage lgPage;
    AmazonHomePage aHome;
   AppiumDriver appiumDriver;



    @Given("^User on Amazon home page$")
    public void userOnAmazonHomePage() throws IOException {
        AppiumServerUtil.start();
         appiumDriver = setUp();
       lgPage = new AmazonLoginPage(appiumDriver);
       aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());

    }

    @And("^User check all the UI element$")
    public void userCheckAllTheUIElement() {

        aHome.isaddCartIconDisplay();
        aHome.isAmazonPayBtmnDisplay();
        aHome.isScanTextDisplay();
        aHome.isRechargesBtnDisplay();
        aHome.isPayBillsDisplay();
        aHome.isOffersBtnDisplay();


    }

    @Then("^User try to search \"([^\"]*)\"$")
    public void userTryToSearch(String product) throws Throwable {
        aHome.searchProduct(product);
        aHome.isSearchProductPresent();
        throw new PendingException();
    }


    @Then("^User check that Mobile page should be display$")
    public void userCheckThatMobilePageShouldBeDisplay() {
        aHome.isSearchProductPresent();
    }
}
