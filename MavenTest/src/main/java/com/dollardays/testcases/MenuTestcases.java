package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.AddToCartPage;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.MenuPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class MenuTestcases extends BaseTest{
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "Menu", testcaseID= "TC1", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_01_MenuList(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Menu List display");
	LoginPage loginpage = new LoginPage(driver);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 1 : Login with valid credentials");
	loginpage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);
	
	MenuPage menupage = new MenuPage(driver);
	Thread.sleep(500);
	
	menupage.getmenuList().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2 : Click on MenuList");
	Thread.sleep(500);
	
	
	Thread.sleep(500);
	menupage.getnowTrending().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Check if 'Now Trending' is displayed");
	
	Thread.sleep(1000);
	menupage.getcategories().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Check if 'Categories' is displayed");
	
	Thread.sleep(1000);
	//menupage.getiFrame().click();
	//driver.switchTo().frame(0);
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	//Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0, 500)", "");
	
	Thread.sleep(1000);
	menupage.getprograms().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Check if 'Programs' is displayed");	
	
	
	Thread.sleep(500);
	menupage.gethelpSetting().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Check if 'Help & Setting' is displayed");	
		
	
	}
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "Menu", testcaseID= "TC2", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_02_MenuList(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
	
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Now Trending List display");
	LoginPage loginpage = new LoginPage(driver);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 1 : Login with valid credentials");
	loginpage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);
	
	MenuPage menupage = new MenuPage(driver);
	Thread.sleep(500);
	
	menupage.getmenuList().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2 : Click on MenuList");
	Thread.sleep(500);
	
	
	Thread.sleep(500);
	menupage.getnewItems().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Check if 'New Wholesale Items' is displayed");
	
	Thread.sleep(1000);
	menupage.getmask().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Check if 'Masks, Sanitizer and PPE' is displayed");
	
	Thread.sleep(10000);
	
	menupage.getwinterShop().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Check if 'WinterShop' is displayed");	
	Thread.sleep(500);
			
	}
	
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "Menu", testcaseID= "TC3", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_03_MenuList(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
	
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Clothing & Shoes List display");
	LoginPage loginpage = new LoginPage(driver);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 1 : Login with valid credentials");
	loginpage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);
	
	MenuPage menupage = new MenuPage(driver);
	Thread.sleep(500);
	
	menupage.getmenuList().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2 : Click on MenuList");
	Thread.sleep(500);
	
	
	Thread.sleep(500);
	menupage.getnewItems().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Check if 'New Wholesale Items' is displayed");
	
	Thread.sleep(1000);
	menupage.getmask().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Check if 'Masks, Sanitizer and PPE' is displayed");
	
	Thread.sleep(10000);
	
	menupage.getwinterShop().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Check if 'WinterShop' is displayed");	
	Thread.sleep(500);
	
		
	}

}
