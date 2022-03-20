package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;

public class MegaMenuPage extends BasePage{

    public static String dresses_xpath = "(//li//a[@title='Dresses' and not(img)])[2]";
    public static String summer_xpath = "(//li//a[@title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.' and not(img)])[1]";
    public static String summerDress_title = "//span[@class='cat-name']";

    public MegaMenuPage(BrowserDriver driver) {
        super(driver);
    }

    public static void megaMenudisplayed() {
        driver.findElement(By.xpath(dresses_xpath)).isDisplayed();
        driver.findElement(By.xpath(dresses_xpath)).isEnabled();
    }

    public static void selectDresses() {

        driver.findElement(By.xpath(dresses_xpath)).click();
    }

    public static void selectSummerDresses() {

        driver.findElement(By.xpath(summer_xpath)).click();
    }

    public static void summerDressPageTitle() {
        driver.findElement(By.xpath(summerDress_title)).getText();

    }
}
