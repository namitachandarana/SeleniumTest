import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccount {
@Test
    public void signUp(){
    /*

Scenario: Create a new account
Given I am not logged in
When I complete the sign-up form
Then I am logged in
And my username is displayed

Tip: do not put underscores in the username

     */
    System.setProperty("webdriver.gecko.driver", "C:/Users/ChandaN/Desktop/geckodriver-v0.23.0-win64/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.getTitle();
    }


}
