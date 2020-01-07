package com.lapa.google.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class GoogleSearchPage {
	@FindBy(name="q") private WebElement searchBox;
	public WebElement searchFor() {
		return searchBox;
	}
	public void searchFor(String key) throws InterruptedException
	{
		searchBox.sendKeys(key);
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
	}
	@FindBy(xpath="(//h3[.=\"Virat Kohli - Home | Facebook\"])[1]") private WebElement profilelink;
	public WebElement profilefb()
	{
		return profilelink;
	}
	public void clickOnProfile()
	{
		profilelink.click();
	}
	@FindBy(xpath="//img[@class=\"_6tb5 img\"]") private WebElement profileImg;
	
	public WebElement profilePic()
	{
		return profileImg;
	}
	public void clickOnProfilePic() throws InterruptedException
	{
		profileImg.click();
		Thread.sleep(2000);
	}
	public void takeScreenshot() throws IOException
	{
		
		File src=profileImg.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Sourabh\\lapagit\\Gitproject\\screenshots\\virat.png");
		Files.copy(src, dest);
	}
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
