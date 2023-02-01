package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickonLoginLink();
        String actualMsg = loginPage.getWelcomeText();
        String expectedMsg = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMsg, expectedMsg, "Login page verified");

    }
    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){

        homePage.clickonLoginLink();
        loginPage.enterEmailField("test_true@yahoo.com");
        loginPage.enterpassword("12345678");
        loginPage.clickonLoginButton();
        String actualMsg = loginPage.errorMsg();
        String expectedMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualMsg, expectedMsg, "Error message verified");

    }
    @Test
    public void verifyTheuserShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickonRegisterLink();
        registerPage.enterFirstName("treat4");
        registerPage.enterLastName("tasty");
        registerPage.enterEmail("treat4_tasty@gmail.com");
        registerPage.enterPasswordField("123456TT");
        registerPage.enterConfirmPassword("123456TT");
        registerPage.clickonRegisterButton();
        homePage.clickonLoginLink();
        loginPage.enterEmailField("treat4_tasty@gmail.com");
        loginPage.enterpassword("123456TT");
        loginPage.clickonLoginButton();
        String actualMsg = homePage.verifyLogoutLink();
        String expectedMsg = "Log out";
        Assert.assertEquals(actualMsg, expectedMsg, "Logout Link verified");

    }
    @Test
    public void userShouldLogOutSuccessfully(){
        homePage.clickonRegisterLink();
        registerPage.enterFirstName("treat5");
        registerPage.enterLastName("tasty");
        registerPage.enterEmail("treat5_tasty@gmail.com");
        registerPage.enterPasswordField("123456TT");
        registerPage.enterConfirmPassword("123456TT");
        registerPage.clickonRegisterButton();
        homePage.clickonLoginLink();
        loginPage.enterEmailField("treat5_tasty@gmail.com");
        loginPage.enterpassword("123456TT");
        loginPage.clickonLoginButton();
        homePage.clickonLogoutLink();
        String actualMsg = homePage.verifyLoginLink();
        String expectedMsg = "Log in";
        Assert.assertEquals(actualMsg, expectedMsg, "Login Link verified");

    }


}
