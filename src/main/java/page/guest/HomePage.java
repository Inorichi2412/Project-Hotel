package page.guest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    // Selector dieu huong
    By buttonDirectionalHomeSelector = By.xpath("//a[@href='/']");
    By buttonDirectionalRoomsSelector = By.xpath("//a[@href='/rooms']");
    By buttonDirectionalAboutSelector = By.xpath("//a[@href='/about']");
    By buttonDirectionalBlogsSelector = By.xpath("//a[@href='/blogs']");
    By buttonDirectionalContactUsSelector = By.xpath("//a[@href='/contact']");
    By buttonDirectionalFaqsSelector = By.xpath("//a[@href='/faqs']");

    // TextBox search
    By buttonTextBoxSearchSelector = By.xpath("//*[@id='searchForm']/span");
    By textBoxSearchSelector = By.name("bookingUID");
    By clickButtonSearchTBSelector = By.xpath("//input[@class='sb-search-submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void directionalMenu() {
        driver.findElement(buttonDirectionalHomeSelector).click();
        driver.findElement(buttonDirectionalRoomsSelector).click();
        driver.findElement(buttonDirectionalAboutSelector).click();
        driver.findElement(buttonDirectionalBlogsSelector).click();
        driver.findElement(buttonDirectionalContactUsSelector).click();
        driver.findElement(buttonDirectionalFaqsSelector).click();
    }

    public void textBoxSearchHome() {
        driver.findElement(buttonDirectionalHomeSelector).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(d->d.findElement(buttonTextBoxSearchSelector).isDisplayed());
        driver.findElement(buttonTextBoxSearchSelector).click();
        driver.findElement(textBoxSearchSelector).sendKeys("3434-388208980");
        driver.findElement(clickButtonSearchTBSelector).click();
    }
}
