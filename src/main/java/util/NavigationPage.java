package util;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {

    WebDriver driver;
    ConfigReader configReader = new ConfigReader();

    //initialising driver
    public NavigationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //navigating to url
    public void NavigateToURL() throws Exception {

        driver.navigate().to(configReader.getURL());
    }

    //verify title of home page
    public void verifyHomePage() throws Exception {

        String expTitle = configReader.getTitle();
        String actTitle = driver.getTitle();
        Assert.assertEquals(expTitle,actTitle);
    }

}
