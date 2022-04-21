package com.crossSkilling.pages;

import com.crossSkilling.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AdminLogin extends BaseClass {

    //Page Factory- OR;
    @FindBy(xpath = "//input[@placeholder='Enter your username']")
    WebElement Username;

    @FindBy(xpath = "//input[@placeholder='Enter your password']")
    WebElement password;

    @FindBy(xpath = "//button[@class='lgbt']")
    WebElement loginbtn;

    //initialize page objects
    public AdminLogin(){
        PageFactory.initElements(driver,this);
    }

    public void login(String username, String pswd) throws InterruptedException {
        Username.sendKeys(username);
        password.sendKeys(pswd);
        loginbtn.click();
    }

}
