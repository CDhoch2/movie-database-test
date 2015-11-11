import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ActorsTest extends AbstractTestClass{
	
	@Test
	public void testOpenActors(){
	    driver.get(PageObjects.ACTORS_URL);
	    assertTrue(isElementPresent(By.linkText("Harrison Ford")));
	    assertTrue(isElementPresent(By.linkText("Add actor")));
	}
	
	@Test
	public void testAddActor() throws Exception {
	    driver.get(PageObjects.ACTORS_URL);
	    driver.findElement(By.linkText("Add actor")).click();
	    driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys("Steve");
	    driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys("Guttenberg");
	    driver.findElement(By.cssSelector("div.controls > button.btn.btn-primary")).click();
	    assertTrue(isElementPresent(By.linkText("Steve Guttenberg"))); 
	}
	
}
