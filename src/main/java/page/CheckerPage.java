package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckerPage {
    private WebDriver driver;

    public CheckerPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cookies = By.id("nhsuk-cookie-banner__link_accept_analytics");
    private By startNow = By.id("next-button");
    private By walesRadio = By.id("radio-wales");
    private By nextButton = By.id("next-button");
    private By yesRadio = By.id("radio-yes");
    private By gpRadio = By.id("radio-wales");
    private By dayBox = By.cssSelector("input[id=\"dob-day\"]");
    private By monthBox = By.id("dob-month");
    private By yearBox = By.id("dob-year");
    private By noRadio = By.xpath("//div[@class='form-group']/fieldset/div[2]");
    private By resultText = By.xpath("//div[@class='done-panel']/h2");

    public void setCookies() {
        driver.findElement(cookies).click();
    }

    public void setStartNow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(startNow).click();
    }

    public void setWalesRadio() {
        driver.findElement(walesRadio).click();
    }

    public void setNextButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(nextButton).click();
    }

    public void setYesRadio() {
        driver.findElement(yesRadio).click();
    }

    public void setGpRadio() {
        driver.findElement(gpRadio).click();
    }

    public void setDOB(String day, String month, String year) {
        driver.findElement(dayBox).sendKeys(day);
        driver.findElement(monthBox).sendKeys(month);
        driver.findElement(yearBox).sendKeys(year);
    }


    public void setNoRadio() {
        driver.findElement(noRadio).click();
    }


    public String verifyCheckerToolResult() {
        return driver.findElement(resultText).getText();
    }

}



