package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import com.sun.xml.internal.ws.resources.UtilMessages;
import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RegisterPage extends BasePage {

    public static String signIn_xpath = "//a[@title='Log in to your customer account']";
    public static String email_id = "email_create";
    public static String createAccount_xpath = "//form[@id='create-account_form']//span[1]";
    public static String errorMsg_Id = "create_account_error";

    public RegisterPage(BrowserDriver driver) {
        super(driver);
    }

    public static void openApplicaiton() {
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    public static void clickSignIn() {
        driver.findElement(By.xpath(signIn_xpath)).click();
    }

    public static void createAccount(String emailid) {
        emailid = emailid.replaceAll("Random", Integer.toString(generateRandomIntIntRange(00000, 99999)));
        driver.findElement(By.id(email_id)).sendKeys(emailid);
        driver.findElement(By.xpath(createAccount_xpath)).click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void invalidEmailErrorMsg() {
        driver.findElement(By.id(errorMsg_Id)).getText();
        System.out.println("error message captured by selenium is ---> " + driver.findElement(By.id(errorMsg_Id)).getText());
    }
}