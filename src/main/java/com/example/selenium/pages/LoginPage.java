package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "username")
    private WebElement username;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "fa-sign-in")
    private WebElement login;

    @FindBy(how = How.CSS , using = "h2")
    private WebElement element;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String text) {
        username.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        password.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        login.click();
        return new MainPage(driver);
    }

    public String getTitle() {
        return element.getText();
    }
}
