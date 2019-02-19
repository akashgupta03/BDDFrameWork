package com.amazon.bddframework.pages.android;

import com.amazon.bddframework.pages.base.AndroidBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonHomePage extends AndroidBasePage {
    @FindAll({
            @FindBy(id = "rs_search_src_text"),
            @FindBy(id = "search_edit_text")

    })
    private WebElement searchProductField;
    @FindAll({
            @FindBy(id = "rs_search_src_text"),
            @FindBy(id = "search_auto_text")
    })
    private WebElement searchProduct;
    @FindBy(id = "iss_search_dropdown_item_text")
    private WebElement firstSearchProductIteam;
    @FindBy(id = "item_title")
    private WebElement searchProductpageFirstproduct;
    @FindBy(id = "action_bar_burger_icon")
    private WebElement actionBarIcon;
    @FindBy(id = "drawer_item_title")
    private List<WebElement> actionBarElement;

    @FindBy(id = "action_bar_cart_image")
    private WebElement addCartIcon;
    @FindBy(xpath = "//android.widget.TextView[@text='Prime']")
    private WebElement primeTextBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Grocery']")
    private WebElement groceryTextBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Mobiles']")
    private WebElement mobilesTextBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Fashion']")
    private WebElement fashionTextBtn;
    @FindBy(xpath = "//android.view.View[@text='Amazon Pay']")
    private WebElement amazonPayBtn;
    @FindBy(xpath = "//android.view.View[@text='Scan']")
    private WebElement scanBtn;
    @FindBy(xpath = "//android.view.View[@text='Recharges']")
    private WebElement rechargesBtn;
    @FindBy(xpath = "//android.view.View[@text='Pay Bills']")
    private WebElement payBillsBtn;
    @FindBy(xpath = "//android.view.View[@text='Offers']")
    private WebElement offersBtn;
    @FindBy(id = "bottomSheetDone")
    private WebElement locationPopUp;


    public AmazonHomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void searchProduct(String productName) {
        waitVisibilityOf(searchProductField);
        searchProductField.click();
        waitVisibilityOf(searchProduct);
        searchProduct.click();
        searchProduct.sendKeys(productName);
        waitVisibilityOf(firstSearchProductIteam);
        firstSearchProductIteam.click();
        if(locationPopUp.isDisplayed())
        {
            locationPopUp.click();
        }
    }
    public boolean isSearchProductPresent() {
        try {
            waitVisibilityOf(searchProductpageFirstproduct);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isActionBarPresent() {
        waitVisibilityOf(actionBarIcon);
        actionBarIcon.click();
        try {
            waitVisibilityOfAllElements(actionBarElement);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isaddCartIconDisplay() {
        try {
            waitVisibilityOf(addCartIcon);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isPrimeTextDisplay() {
        try {
            waitVisibilityOf(primeTextBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isGroceryTextDisplay() {
        try {
            waitVisibilityOf(groceryTextBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isFashionTextDisplay() {
        try {
            waitVisibilityOf(fashionTextBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isMobilesTextDisplay() {
        try {
            waitVisibilityOf(mobilesTextBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isAmazonPayBtmnDisplay() {
        try {
            waitVisibilityOf(amazonPayBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isScanTextDisplay() {
        try {
            waitVisibilityOf(scanBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isRechargesBtnDisplay() {
        try {
            waitVisibilityOf(rechargesBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPayBillsDisplay() {
        try {
            waitVisibilityOf(payBillsBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isOffersBtnDisplay() {
        try {
            waitVisibilityOf(offersBtn);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
