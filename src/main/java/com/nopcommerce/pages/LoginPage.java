
/*1.LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators
and create appropriate methods for it.*/
package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public void enterEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterpassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickonLoginButton() {
        clickOnElement(loginButton);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String errorMsg() {
        return getTextFromElement(errorMessage);

    }








}
