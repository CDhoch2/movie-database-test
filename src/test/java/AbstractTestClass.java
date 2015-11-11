import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class AbstractTestClass {
	protected WebDriver driver;
	protected String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		//Damit sollen erstmal nervige Warnungen während des Maven-Builds ausgeschaltet werden
		Logger logger = Logger.getLogger ("");
		logger.setLevel (Level.OFF);
		
		baseUrl = PageObjects.BASE_URL;
		driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Einloggen mit Standard-User");
		driver.get(PageObjects.LOGIN_URL);
		driver.findElement(By.id(PageObjects.USERNAME_TEXTBOX_ID)).clear();
		driver.findElement(By.id(PageObjects.USERNAME_TEXTBOX_ID)).sendKeys(PageObjects.USERNAME_VALUE);
		driver.findElement(By.id(PageObjects.PASSWORD_TEXTBOX_ID)).clear();
		driver.findElement(By.id(PageObjects.PASSWORD_TEXTBOX_ID)).sendKeys(PageObjects.USERNAME_PASSWORD_VALUE);
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	    assertTrue(isElementPresent(By.xpath("(//button[@type='submit'])[2]")));
	}
	
	protected boolean isElementPresent(By by) {
	    try {
	        driver.findElement(by);
	        return true;
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
	
	@After
	public void closeDriver(){
		driver.close();
	}
}
