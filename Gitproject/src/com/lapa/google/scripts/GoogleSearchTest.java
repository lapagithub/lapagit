package com.lapa.google.scripts;

import org.testng.annotations.Test;

import com.lapa.google.generic.BaseClass;
import com.lapa.google.pages.GoogleSearchPage;

public class GoogleSearchTest extends BaseClass{
	@Test
public void googleSearch() throws Throwable{
	
	GoogleSearchPage gsp = new GoogleSearchPage(driver);
	gsp.searchFor("virat kohli facebook");
	gsp.clickOnProfile();
	//gsp.clickOnProfilePic();
	gsp.takeScreenshot();
}
}
