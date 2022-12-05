package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.UtilityClass;
import org.openqa.selenium.By;

public class LoginPage extends UtilityClass {
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By verifyText= By.xpath("//span/h6 [text()='Dashboard']");

    By clickOnForgot = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");

    By resetPassword = By.xpath("//button[@type='submit']");





    public void enterUserName(String username1) {

        sendTextToElement(usernameField, username1);
    }

    public void enterPassword(String password1) {
        sendTextToElement(passwordField, password1);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String verifyText(){
        return getTextFromElement(verifyText);

    }
    public void clickOnForgot(){
        clickOnElement(clickOnForgot);
    }
    public String verifyResetPassword(){
        return getTextFromElement(resetPassword);

    }


}
