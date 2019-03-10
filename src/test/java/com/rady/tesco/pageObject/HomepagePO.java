package com.rady.tesco.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePO {

    private static WebElement element = null;

    public static WebElement SignIn_lnk(WebDriver driver){
                  WebElement element;
                  element = driver.findElement(By.linkText("Sign In"));
                  return element;
    }
}
