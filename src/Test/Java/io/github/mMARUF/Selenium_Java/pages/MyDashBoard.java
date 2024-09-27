package io.github.mMARUF.Selenium_Java.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyDashBoard {

    private final WebDriver driver;

    public MyDashBoard(final WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {


        return driver.findElement(By.cssSelector("[class='v-toolbar-title__placeholder']")).getText();
    }
}
