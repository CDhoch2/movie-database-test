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

public class MoviesTest extends AbstractTestClass{
	
	@Test
	public void testAddMovie() throws Exception {
	    System.out.println("Teste 'Film hinzufügen'!");
	    
	    driver.get(PageObjects.MOVIES_URL);
	    System.out.println("Aktuelle Driver-URL: " + driver.getCurrentUrl());
	    
	    driver.findElement(By.linkText("Add movie")).click();
	    driver.findElement(By.id("title")).clear();
	    driver.findElement(By.id("title")).sendKeys("Police Academy");
	    driver.findElement(By.id("description")).clear();
	    driver.findElement(By.id("description")).sendKeys("blabla..");
	    driver.findElement(By.cssSelector("div.controls > button.btn.btn-primary")).click();
	    assertTrue(isElementPresent(By.linkText("Police Academy")));
	}
	
}
