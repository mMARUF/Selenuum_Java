package io.github.mMARUF.Selenium_Java.pages;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class TestExecution extends BaseTestFile {


    @DataProvider
    public Iterator<Object[]> getLoginData() {
        List<Object[]> loginData = new ArrayList<>();
        loginData.add(new Object[]{"seleniumautomation2025@gmail.com", "samplE123@", true});
        return loginData.iterator();
    }

    @DataProvider
    public Iterator<Object[]> createWorkFlowFromScratch() {
        List<Object[]> loginData = new ArrayList<>();
        loginData.add(new Object[]{"WorkFlow1", "Description"});
        return loginData.iterator();
    }

    @Test(dataProvider = "getLoginData")
    public void testLoginFeature(String email, String password, boolean isValidUser) {

        driver.get("https://app.respond.io/user/login");
        PageObjectFile pageObjectFile = new PageObjectFile(driver);
        pageObjectFile.loginOperation(email, password);

        if (!isValidUser) {
            assertEquals(pageObjectFile.getErrorMessage(), "Incorrect username or password.");
        } else {
            MyDashBoard myDashBoard = new MyDashBoard(driver);
            assertEquals(myDashBoard.getPageTitle(), "Dashboard");
            Assert.assertEquals(myDashBoard.getPageTitle(), "Dashboard");
        }
    }

    @Test(dependsOnMethods = {"testLoginFeature"}, dataProvider = "createWorkFlowFromScratch")
    public void workFlowTest(String email, String password) {

        driver.get("https://app.respond.io/space/workflows");
        PageObjectFile pageObjectFile = new PageObjectFile(driver);

        pageObjectFile.workFlowOperation(email, password);





    }
}