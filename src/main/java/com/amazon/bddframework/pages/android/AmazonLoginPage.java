package com.amazon.bddframework.pages.android;

import com.amazon.bddframework.pages.base.AndroidBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginPage extends AndroidBasePage {
    @FindBy(id = "sso_splash_logo")
    private WebElement amazonIcon;
    @FindBy(id = "signin_to_yourAccount")
    private WebElement primaryText;
    @FindBy(id = "view_your_wish_list")
    private WebElement secondaryText;
    @FindBy(id = "Find_purchase")
    private WebElement secondaryText2;
    @FindBy(id = "track_your_packages")
    private WebElement secondaryText3;
    @FindBy(id = "sign_in_button")
    private WebElement signInBtn;
    @FindBy(id = "new_user")
    private WebElement signUpBtn;
    @FindBy(id = "skip_sign_in_button")
    private WebElement skipSignInBtn;
    @FindBy(id = "ap_email_login")
    private WebElement loginUserName;
    @FindBy(id = "continue")
    private WebElement continueBtn;
    @FindBy(id = "auth-error-message-box")
    private WebElement wrongUserNameErrorMsg;
    @FindBy(id = "ap_password")
    private WebElement loginUserPassword;
    @FindBy(id = "signInSubmit")
    private WebElement loginBtn;
    @FindBy(id = "action_bar_home_logo")
    private WebElement amazonHomePageIcon;

    public AmazonLoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public boolean isAmazonIconPresent() {
        try {
            waitVisibilityOf(amazonIcon);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPrimaryTextPresent() {
        try {
            waitVisibilityOf(primaryText);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean isSecondaryTextPresent() {
        try {
            waitVisibilityOf(secondaryText);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean isSecondaryText2Present() {
        try {
            waitVisibilityOf(secondaryText2);
            return true;
        } catch (Exception e) {
            return false;
        }


    }

    public boolean isSecondaryText3Present() {
        try {
            waitVisibilityOf(secondaryText3);
            return true;
        } catch (Exception e) {
            return false;
        }

    }


    public boolean isSignInBtnPresent() {
        try {
            waitVisibilityOf(signInBtn);
            waitElementToBeClickable(signInBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isSignUpBtnPresent() {
        try {
            waitVisibilityOf(signUpBtn);
            waitElementToBeClickable(signUpBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isSkipSignInPresent() {
        try {
            waitVisibilityOf(skipSignInBtn);
            waitElementToBeClickable(skipSignInBtn);
            return true;
        } catch (Exception e) {

            return false;
        }
    }


    public AmazonHomePage clickOnSkipSignIn() {
        waitVisibilityOf(skipSignInBtn);
        skipSignInBtn.click();
        waitVisibilityOf(amazonHomePageIcon);
        return new AmazonHomePage(appiumDriver);
    }

    public AmazonHomePage login(String userName, String password) {
        waitElementToBeClickable(signInBtn);
        signInBtn.click();
        waitVisibilityOf(loginUserName);
        loginUserName.sendKeys(userName);
        waitElementToBeClickable(continueBtn);
        continueBtn.click();
        try {
            waitVisibilityOf(wrongUserNameErrorMsg);
            loginUserName.clear();
            loginUserName.sendKeys(userName);
            waitVisibilityOf(continueBtn);
            continueBtn.click();
            waitVisibilityOf(loginUserPassword);
            loginUserPassword.sendKeys(password);
            waitVisibilityOf(loginBtn);
            loginBtn.click();

            return new AmazonHomePage(appiumDriver);
        } catch (Exception e) {
            waitVisibilityOf(loginUserPassword);
            loginUserPassword.sendKeys(password);
            waitVisibilityOf(loginBtn);
            loginBtn.click();
            return new AmazonHomePage(appiumDriver);
        }

    }


    public AmazonHomePage skipSignIn() {
        waitVisibilityOf(skipSignInBtn);
        skipSignInBtn.click();

        return new AmazonHomePage(appiumDriver);
    }


    public boolean isAmazonHomePageIconDisplay() {
        try {
            waitVisibilityOf(amazonHomePageIcon);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
