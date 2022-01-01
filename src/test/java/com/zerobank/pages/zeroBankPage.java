package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.utilities.*;

import javax.xml.xpath.XPath;

public class zeroBankPage {

    public zeroBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id= "signin_button")
    public WebElement logInButton;

    @FindBy(id= "user_login")
    public WebElement username;

    @FindBy(id= "user_password")
    public WebElement userPassword;

    @FindBy(name = "submit")
    public  WebElement submit;


    public void login(String u, String p){
        username.sendKeys(u);
        userPassword.sendKeys(p);
        submit.click();
    }
}
