import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumJU {

    private static WebDriver webDriver;
    Dotenv dotenv = Dotenv.configure().load();
    String APP_URL  = dotenv.get("APP_URL");
    String url;


    @BeforeAll
    public static void setup() {

        Dotenv dotenv = Dotenv.configure().load();
        String APP_URL  = dotenv.get("APP_URL");
        String CHROME_DRIVER_PATH  = dotenv.get("CHROME_DRIVER_PATH");


        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        webDriver = new ChromeDriver();
        webDriver.get(APP_URL+"/login");

    }

    @Test
    public void testLogin() {
        Dotenv dotenv = Dotenv.configure().load();

        String USER_COMPANY_1_EMAIL = dotenv.get("USER_COMPANY_1_EMAIL");
        String USER_COMPANY_1_EMAIL2 = dotenv.get("USER_COMPANY_1_EMAIL2");
        String USER_COMPANY_1_EMAIL3 = dotenv.get("USER_COMPANY_1_EMAIL3");
        String USER_COMPANY_1_EMAIL4 = dotenv.get("USER_COMPANY_1_EMAIL4");
        String USER_COMPANY_1_EMAIL5 = dotenv.get("USER_COMPANY_1_EMAIL5");
        String USER_COMPANY_1_EMAIL6 = dotenv.get("USER_COMPANY_1_EMAIL6");
        String USER_COMPANY_1_EMAIL7 = dotenv.get("USER_COMPANY_1_EMAIL7");
        String USER_COMPANY_1_EMAIL8 = dotenv.get("USER_COMPANY_1_EMAIL8");
        String USER_COMPANY_1_EMAIL9 = dotenv.get("USER_COMPANY_1_EMAIL9");

        String USER_COMPANY_1_PASSWORD = dotenv.get("USER_COMPANY_1_PASSWORD");
        String USER_COMPANY_1_PASSWORD2 = dotenv.get("USER_COMPANY_1_PASSWORD2");
        String USER_COMPANY_1_PASSWORD3 = dotenv.get("USER_COMPANY_1_PASSWORD3");
        String USER_COMPANY_1_PASSWORD4 = dotenv.get("USER_COMPANY_1_PASSWORD4");
        String USER_COMPANY_1_PASSWORD5 = dotenv.get("USER_COMPANY_1_PASSWORD5");
        WebElement email = webDriver.findElement(By.name("email"));

        email.sendKeys(USER_COMPANY_1_EMAIL2);
        WebElement password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD);
        WebElement login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL3);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL4);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL5);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL6);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL7);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD2);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD3);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD4);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD5);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertNotEquals(url, APP_URL + "/company/dashboard");
        webDriver.navigate().refresh();

        email = webDriver.findElement(By.name("email"));
        email.sendKeys(USER_COMPANY_1_EMAIL);
        password = webDriver.findElement(By.name("password"));
        password.sendKeys(USER_COMPANY_1_PASSWORD);
        login = webDriver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div[3]/button"));
        login.click();
        url = webDriver.getCurrentUrl();
        assertEquals(url, APP_URL + "/company/dashboard");
    }
    @Test
    public void testCreateOffer() {
        WebElement createOffer = webDriver.findElement(By.xpath("/html/body/div/main/div/div/a[2]"));
        createOffer.click();
        WebElement offer = webDriver.findElement(By.xpath("/html/body/div[1]/main/div/h3"));
        String newOffer = offer.getText();
        assertEquals(newOffer, "Nowa oferta");
    }


    @Test
    public void testWesprzyj() {
        WebElement wesprzyj = webDriver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[1]/div[1]/div[2]/a"));
        wesprzyj.click();
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        String wesprzyjURL = webDriver.getCurrentUrl();
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        assertEquals(wesprzyjURL, "https://zrzutka.pl/h7xs9j");
    }
    @Test
    public void testWeekendCheckbox() {
        WebElement weekendCheckbox = webDriver.findElement(By.id("is_weekend"));
        weekendCheckbox.click();
        assertTrue(weekendCheckbox.isSelected());
        weekendCheckbox.click();
        assertFalse(weekendCheckbox.isSelected());
        WebElement weekendCheckboxText = webDriver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[2]/div[1]/div[1]/label"));
        weekendCheckboxText.click();
        assertTrue(weekendCheckbox.isSelected());
        weekendCheckboxText.click();
        assertFalse(weekendCheckbox.isSelected());
    }
    @Test
    public void testNightCheckbox() {
        WebElement nightCheckbox = webDriver.findElement(By.id("is_night"));
        nightCheckbox.click();
        assertTrue(nightCheckbox.isSelected());
        nightCheckbox.click();
        assertFalse(nightCheckbox.isSelected());
        WebElement nightCheckboxText = webDriver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[2]/div[1]/div[3]/label"));
        nightCheckboxText.click();
        assertTrue(nightCheckbox.isSelected());
        nightCheckboxText.click();
        assertFalse(nightCheckbox.isSelected());
    }
    @Test
    public void testExpCheckbox() {
        WebElement expCheckbox = webDriver.findElement(By.id("is_expected_experience"));
        expCheckbox.click();
        assertTrue(expCheckbox.isSelected());
        expCheckbox.click();
        assertFalse(expCheckbox.isSelected());
        WebElement expCheckboxText = webDriver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[2]/div[1]/div[4]/label"));
        expCheckboxText.click();
        assertTrue(expCheckbox.isSelected());
        expCheckboxText.click();
        assertFalse(expCheckbox.isSelected());
    }


    @AfterAll
    public static void close() {
        webDriver.close();
        webDriver.quit();
    }
}
