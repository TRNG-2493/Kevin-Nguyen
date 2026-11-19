package com.revature.qea.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

/** Opens and closes the shared browser around every scenario, with a screenshot when one fails. */
public class Hooks extends BaseSteps {

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    // @After hooks run from the highest order to the lowest:
    // 1 (screenshot) runs while the browser is still open; 0 (close) runs last.
    @After(order = 1)
    public void screenshotIfFailed(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] png = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(png, "image/png", scenario.getName());
        }
    }

    @After(order = 0)
    public void closeBrowser() {
        driver.quit();
    }
}
