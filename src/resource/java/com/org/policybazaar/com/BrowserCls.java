package com.org.policybazaar.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.polocybzaar.com.LocateCls;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCls {
	public static WebDriver driver;
	public static WebDriverWait waits;
	
	public static WebDriver getbrowserDriver(String browser) {
		switch(browser) {
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			co.addArguments("start-maximized");
			driver = new ChromeDriver(co);
			break;

		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("browser.tabs.remote.autostart");
			fo.addArguments("--start-maximized");
			driver= new FirefoxDriver(fo);
			break;

		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		}
		waits=new WebDriverWait(driver,Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.policybazaar.com/");
		return driver;
	}
	public static void listOfElements(List<WebElement> web) {
		for(int i =1;i<web.size();i++) {
			web.get(i).click();
		}
	}
	public static void sendValues(WebElement web ,String val) {
		web.sendKeys(val);
	}
	public static void clickMethod(WebElement ele) {
		WebElement elementClk = waits.until(ExpectedConditions.elementToBeClickable(ele));
		elementClk.click();
	}
	public static void ageSelect(WebElement web ,WebElement ele) {
		web.click();
		WebElement elementClk = waits.until(ExpectedConditions.elementToBeClickable(ele));
		elementClk.click();
	}
}
