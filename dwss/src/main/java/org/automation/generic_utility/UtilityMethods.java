package org.automation.generic_utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.Set;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

public class UtilityMethods implements FrameWorkConstants {
     
	public void switchToaSpecificTitleWindow(WebDriver driver, String title) {
		String parentwindowid = driver.getWindowHandle();
		Set<String> Allwindowids = driver.getWindowHandles();
		Allwindowids.remove(parentwindowid);
		for(String windowId : Allwindowids) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().equalsIgnoreCase(title)){
				break;
			}
		}
	}

	public void switchToSpecificWindow(WebDriver driver,  WebElement element) {
		String parentwindow = driver.getWindowHandle();
		Set<String> Allwindowid = driver.getWindowHandles();
		Allwindowid.remove(parentwindow);
		for (String sessionId : Allwindowid) {
			driver.switchTo().window(sessionId);
			if (element.isDisplayed()) {
				break;
			}
		}
	}

	public void captureScreen(WebDriver driver, ITestResult result) {
		LocalDateTime systemDate = LocalDateTime.now();
		String timeStamp = systemDate.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File tempFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(SCREENSHOT_PATH + result.getName() + timeStamp + ".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void selectDropDown(WebElement listbox, String option) {
		Select select = new Select(listbox);
		int counter = 0;

		try {
			int index = Integer.parseInt(option);
			select.selectByIndex(index);
			counter++;
		} catch (Exception e) {
			System.out.println("It is not a index");
		}

		if (counter == 0) {
			try {
				select.selectByVisibleText(option);
			} catch (Exception e) {
				select.selectByValue(option);
			}
		}
	}

	public void switchToFrame(WebDriver driver, String indexNameOrId) {
		try {
			int index = Integer.parseInt(indexNameOrId);
			driver.switchTo().frame(index);
		} catch (NumberFormatException e) {
			driver.switchTo().frame(indexNameOrId);
		}
	}

	public int giveRandomNumber(int boundary) {
		Random random = new Random();
		return random.nextInt(boundary);
	}

	public Date giveSystemDate() {
		return new Date();
	}
	
	public  void clickAction(WebElement Element)
	{
		Element.click();
	}
}
