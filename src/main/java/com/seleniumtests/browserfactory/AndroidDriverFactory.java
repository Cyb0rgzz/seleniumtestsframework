package com.seleniumtests.browserfactory;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

import com.seleniumtests.driver.WebDriverConfig;

public class AndroidDriverFactory extends AbstractWebDriverFactory implements IWebDriverFactory{

	public AndroidDriverFactory(WebDriverConfig webDriverConfig) {
		super(webDriverConfig);
	}

	@Override
	public WebDriver createWebDriver() throws MalformedURLException {
		AndroidDriver driver = null;
		WebDriverConfig cfg = this.getWebDriverConfig();
		
		driver = new AndroidDriver(new AndroidCapabilitiesFactory().createCapabilities(cfg));
		
		this.setWebDriver(driver);
		return driver;
	}

}
