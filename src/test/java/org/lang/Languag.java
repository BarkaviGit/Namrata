package org.lang;

import org.helper.LibGlobal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Languag extends LibGlobal {

	static WebDriver driver;
	
@Test
   public static void beforeScenario() {
	   WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	//	openFirefox();
driver.get("https://www.donamix.com.br/");
}
}
