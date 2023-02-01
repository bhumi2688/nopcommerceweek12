
//6 Register Page
package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//div[@class='page-title']/h1");
    By malefemaleRadioButton = By.xpath("//div[@class='form-fields']/div/div/span[2]");
    By firstnameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By dateofBirthDay = By.name("DateOfBirthDay");
    By dateofBirthMonth = By.name("DateOfBirthMonth");
    By dateofBirthYear = By.name("DateOfBirthYear");
    By emailField = By.xpath(" //input[@id='Email']");
    By passwordField = By.xpath(" //input[@id='Password']");
    By confirmPasswordField = By.xpath(" //input[@id='ConfirmPassword']");
    By registerButton = By.xpath(" //button[@id='register-button']");
    By firstNameRequired = By.id("FirstName-error");
    By lastnameRequired = By.id("LastName-error");
    By emailRequired = By.id("Email-error");
    By passwordrequired = By.id("Password-error");
    By confirmPasswordRequired = By.id("ConfirmPassword-error");
    By registrationCompletedMsg = By.xpath("//div[@class='result']");
    By continueButton = By.xpath("//div[@class='buttons']/a");

    public String verifyRegisterText(){
        return getTextFromElement(registerText);
    }
    public void selectMaleFemaleRadioButton(){
        clickOnElement(malefemaleRadioButton);
    }
    public void enterFirstName(String firstname){
        sendTextToElement(firstnameField,firstname);
    }
    public void enterLastName(String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void selectDateofBirthDay(String day){
        new Select(driver.findElement(dateofBirthDay)).selectByValue(day);
    }
    public void selectDateofBirthMonth(String month){
        selectByVisibleTextFromDropDown(dateofBirthMonth,month);
    }
    public void selectDateofBirthYear(String year){
        new Select(driver.findElement(dateofBirthYear)).selectByValue(year);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmpassword){
        sendTextToElement(confirmPasswordField,confirmpassword);
    }
    public void clickonRegisterButton(){
        clickOnElement(registerButton);
    }
    public String verifyFirstnameRequired(){
        return getTextFromElement(firstNameRequired);
    }
    public String verifyLastNameRequired(){
        return getTextFromElement(lastnameRequired);
    }
    public String verifyEmailRequired(){
        return getTextFromElement(emailRequired);
    }
    public String verifyPasswordRequired(){
        return getTextFromElement(passwordrequired);
    }
    public String verifyConfirmPasswordRequired(){
        return getTextFromElement(confirmPasswordRequired);
    }
    public String verifyRegistrationCompleteMsg(){
        return getTextFromElement(registrationCompletedMsg);
    }
    public void clickonContinueButton(){
        clickOnElement(continueButton);
    }









}
