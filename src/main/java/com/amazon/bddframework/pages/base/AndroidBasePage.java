package com.amazon.bddframework.pages.base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AndroidBasePage {
    public AppiumDriver appiumDriver;
    WebDriverWait wait;

    public AndroidBasePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        wait = new WebDriverWait(appiumDriver, 20);
        init();
    }

    public void init() {
        PageFactory.initElements(this.appiumDriver, this);
    }

    public void waitVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void waitElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitVisibilityOfAllElements(List<WebElement> elements) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
}

