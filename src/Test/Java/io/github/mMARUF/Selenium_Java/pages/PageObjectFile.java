package io.github.mMARUF.Selenium_Java.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;

public class PageObjectFile {

    private WebDriver driver;

    public PageObjectFile(WebDriver driver) {this.driver = driver;}

    private WebElement emailAddr() { return driver.findElement(By.id("input-7")); }

    private WebElement passwordAddr() { return driver.findElement(By.id("input-9")); }

    public WebElement signInBtn () {return driver.findElement(By.cssSelector("button[type='submit'] span[class='dls-txt-button dls-inline-flex dls-items-center']"));}


    private WebElement workSpaceButton() { return driver.findElement(By.cssSelector("div[role='listbox'] div[class='dls-w-full dls-h-full dls-items-center dls-justify-center dls-flex dls-duration-150']")); }

    private WebElement addWorkSpaceButton() { return driver.findElement(By.cssSelector("[class='isax isax-add dls-line-height-0 dls-me-4 dls-h-icon-lg dls-w-icon-lg dls-text-icon-lg dls-me-4']")); }

    public WebElement startFromScratch () {return driver.findElement(By.cssSelector("button[class='v-btn v-btn--elevated v-theme--light v-btn--density-default elevation-0 v-btn--size-default v-btn--variant-elevated dls-min-w-0 dls-select-none dls-items-center dls-justify-center dls-transition-colors disabled:dls-pointer-events-none rtl:flex-row-reverse dls-normal-case disabled:dls-cursor-not-allowed disabled:dls-bg-button-disabled disabled:dls-border-button-disabled disabled:dls-text-text-disabled dls-fill-neutral-white dls-text-neutral-white data-[disabled=true]:dls-border-button-disabled dls-bg-button-primary dls-border-button-primary dls-border dls-border-solid active:dls-border-primary-pressed active:dls-bg-button-primary-pressed hover:dls-bg-button-primary-on-hover hover:dls-border-button-primary-on-hover dls-rounded-button dls-h-[32px] dls-pl-14 dls-pr-14 dls-py-0 data-[iconstart=true]:dls-pl-[8px] data-[iconend=true]:dls-pr-[8px] [&_svg]:dls-h-icon-sm [&_svg]:dls-w-icon-sm [&_svg]:dls-text-icon-sm [&_i]:dls-text-icon-sm [&_i]:dls-w-icon-sm [&_i]:dls-h-icon-sm data-[variant=link]:dls-px-0 dls-relative']"));}

    private WebElement dialog() { return driver.findElement(By.cssSelector(".v-form.fill-height")); }

    private WebElement deleteDialog() { return driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/form/div")); }

    private WebElement workFlowContextMenuOptions() { return driver.findElement(By.cssSelector("body > div.v-overlay-container > div > div > div")); }

    private WebElement nav() { return driver.findElement(By.xpath("//div[@role='listbox']")); }

    private WebElement workFlowName() { return dialog().findElement(By.xpath("/html/body/div[7]/div/div[2]/form/div/div[3]/div/div[1]/div[2]/div/div/div[4]/input")); }

    private WebElement workFlowDescription() { return driver.findElement(By.cssSelector("[class='#input-188']")); }

    private WebElement workFlowCreateButton() { return driver.findElement(By.cssSelector("button[class='v-btn v-btn--disabled v-theme--light v-btn--density-default elevation-0 v-btn--size-default v-btn--variant-elevated dls-min-w-0 dls-select-none dls-items-center dls-justify-center dls-transition-colors disabled:dls-pointer-events-none rtl:flex-row-reverse dls-normal-case disabled:dls-cursor-not-allowed disabled:dls-bg-button-disabled disabled:dls-border-button-disabled disabled:dls-text-text-disabled dls-fill-neutral-white dls-text-neutral-white data-[disabled=true]:dls-border-button-disabled dls-bg-button-primary dls-border-button-primary dls-border dls-border-solid active:dls-border-primary-pressed active:dls-bg-button-primary-pressed hover:dls-bg-button-primary-on-hover hover:dls-border-button-primary-on-hover dls-rounded-button dls-h-[32px] dls-pl-14 dls-pr-14 dls-py-0 data-[iconstart=true]:dls-pl-[8px] data-[iconend=true]:dls-pr-[8px] [&_svg]:dls-h-icon-sm [&_svg]:dls-w-icon-sm [&_svg]:dls-text-icon-sm [&_i]:dls-text-icon-sm [&_i]:dls-w-icon-sm [&_i]:dls-h-icon-sm data-[variant=link]:dls-px-0 dls-relative']")); }

    private WebElement workFlowSuccessOverlay() { return driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/section/ol/li/div/div/div/div/div/div/p/span")); }

    private WebElement workFlowContextMenu() {return driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/main/div/div[2]/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[7]/span/button")); }

    private WebElement addWorkSpace() { return driver.findElement(By.cssSelector("div[class='dls-shrink dls-me-12'] button[type='button']")); }

    private WebElement navmenu() { return driver.findElement(By.cssSelector(".v-navigation-drawer__content")); }

    private WebElement nameOfWorkSpace() {return driver.findElement(By.xpath("//input[contains(@placeholder, 'Name your workspace e.g. Customer Support')]")); }

    private WebElement nextBtn() {return driver.findElement(By.cssSelector("button[type='submit']")); }

    private WebElement invite() {return driver.findElement(By.cssSelector("button[type='submit']")); }

    private WebElement workSpaceContextMenu()  { return driver.findElement(By.cssSelector("button[class='v-btn v-btn--elevated v-theme--light v-btn--density-default elevation-0 v-btn--size-default v-btn--variant-elevated dls-min-w-0 dls-select-none dls-items-center dls-justify-center dls-transition-colors disabled:dls-pointer-events-none rtl:flex-row-reverse data-[disabled=true]:dls-border-border-default dls-normal-case dls-bg-[transparent] hover:dls-bg-button-secondary-on-hover active:dls-bg-button-secondary-pressed disabled:dls-text-text-disabled data-[disabled=true]:dls-bg-[rgba(0,0,0,0)] dls-text-text-primary dls-rounded-button dls-h-[28px] dls-w-[28px] dls-p-4 [&_svg]:dls-h-icon-md [&_svg]:dls-w-icon-md [&_svg]:dls-text-icon-md [&_i]:dls-text-icon-md [&_i]:dls-w-icon-md [&_i]:dls-h-icon-md dls-relative']")); }

    private WebElement deleteWorkSpace() { return driver.findElement(By.xpath("//div[@class='v-overlay-container']//div[2]")); }

    private WebElement workSpaceNameField() { return driver.findElement(By.xpath("//input[contains(@placeholder, 'WorkSpace 1')]")); }

    private WebElement workSpaceDel() { return driver.findElement(By.cssSelector("button[class='v-btn v-btn--elevated v-theme--light v-btn--density-default elevation-0 v-btn--size-default v-btn--variant-elevated dls-min-w-0 dls-select-none dls-items-center dls-justify-center dls-transition-colors disabled:dls-pointer-events-none rtl:flex-row-reverse dls-normal-case disabled:dls-cursor-not-allowed disabled:dls-bg-button-disabled disabled:dls-border-button-disabled disabled:dls-text-text-disabled dls-fill-neutral-white dls-text-neutral-white data-[disabled=true]:dls-border-button-disabled dls-bg-button-danger dls-border-button-danger dls-border dls-border-solid active:dls-bg-button-danger-pressed hover:dls-bg-button-danger-on-hover active:dls-border-button-danger-pressed hover:dls-border-button-danger-on-hover dls-rounded-button dls-h-[32px] dls-pl-14 dls-pr-14 dls-py-0 data-[iconstart=true]:dls-pl-[8px] data-[iconend=true]:dls-pr-[8px] [&_svg]:dls-h-icon-sm [&_svg]:dls-w-icon-sm [&_svg]:dls-text-icon-sm [&_i]:dls-text-icon-sm [&_i]:dls-w-icon-sm [&_i]:dls-h-icon-sm data-[variant=link]:dls-px-0 dls-relative']")); }





    public void loginOperation (String email, String password) {
        emailAddr().clear();
        emailAddr().sendKeys(email);

        passwordAddr().clear();
        passwordAddr().sendKeys(password);

        signInBtn().click();

        Assert.assertTrue(navmenu().isDisplayed(), "Element is not present on the page");
    }

    public void workFlowOperation (String name, String description) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        addWorkSpaceButton().click();
        startFromScratch().click();

        WebElement workFlowNameField = dialog().findElement(By.xpath("/html/body/div[7]/div/div[2]/form/div/div[3]/div/div[1]/div[2]/div/div/div[4]/input"));
        workFlowNameField.sendKeys(name);



        WebElement workFlowDescriptionField = dialog().findElement(By.xpath("/html/body/div[7]/div/div[2]/form/div/div[3]/div/div[2]/div[2]/div/div/div[4]/input"));
        workFlowDescriptionField.sendKeys(description);

        WebElement workFlowCreationButton = dialog().findElement(By.xpath("/html/body/div[7]/div/div[2]/form/div/div[4]/div/button[2]/span[3]/span"));
        workFlowCreationButton.click();


        Assert.assertEquals(workFlowSuccessOverlay().getText(), "Workflow WorkFlow1 added successfully.");


        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().back();
        driver.navigate().back();

        workFlowContextMenu().click();

        WebElement deleteOption = driver.findElement(By.xpath("//div[@class='v-overlay-container']//div[7]"));

        WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(3));


        expWait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();


        WebElement delAction = driver.findElement(By.cssSelector("button[class='v-btn v-btn--elevated v-theme--light v-btn--density-default elevation-0 v-btn--size-default v-btn--variant-elevated dls-min-w-0 dls-select-none dls-items-center dls-justify-center dls-transition-colors disabled:dls-pointer-events-none rtl:flex-row-reverse dls-normal-case disabled:dls-cursor-not-allowed disabled:dls-bg-button-disabled disabled:dls-border-button-disabled disabled:dls-text-text-disabled dls-fill-neutral-white dls-text-neutral-white data-[disabled=true]:dls-border-button-disabled dls-bg-button-danger dls-border-button-danger dls-border dls-border-solid active:dls-bg-button-danger-pressed hover:dls-bg-button-danger-on-hover active:dls-border-button-danger-pressed hover:dls-border-button-danger-on-hover dls-rounded-button dls-h-[32px] dls-pl-14 dls-pr-14 dls-py-0 data-[iconstart=true]:dls-pl-[8px] data-[iconend=true]:dls-pr-[8px] [&_svg]:dls-h-icon-sm [&_svg]:dls-w-icon-sm [&_svg]:dls-text-icon-sm [&_i]:dls-text-icon-sm [&_i]:dls-w-icon-sm [&_i]:dls-h-icon-sm data-[variant=link]:dls-px-0 dls-relative'] span[class='dls-txt-button dls-inline-flex dls-items-center']"));
        delAction.click();

        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(workFlowSuccessOverlay().getText(), "Workflow was deleted successfully.");


    }

    public String getErrorMessage(){
        return driver.findElement(By.cssSelector("[class='elevation-1 text']")).getText();
    }

    public void createNewWorkSpace (String namOfTheWorkSpace, String invitee) {


        addWorkSpace().click();

        nameOfWorkSpace().sendKeys(namOfTheWorkSpace);

        nextBtn().click();

        Assert.assertEquals(workFlowSuccessOverlay().getText(), "Workspace added Successfully.");

        invite().click();

        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(workFlowSuccessOverlay().getText(), "Users added to workspace Successfully.");

        workSpaceContextMenu().click();

        WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(3));

        expWait.until(ExpectedConditions.elementToBeClickable(deleteWorkSpace())).click();

        workSpaceNameField().sendKeys(namOfTheWorkSpace);

        workSpaceDel().click();


        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(workFlowSuccessOverlay().getText(), "Deleted Successful.");









    }




}