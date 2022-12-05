package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
    LoginPage loginPage = new LoginPage();



    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgot();
        String expectedM = "Reset Password";
        Assert.assertEquals(loginPage.verifyResetPassword(), expectedM, "not verify");


    }
}
