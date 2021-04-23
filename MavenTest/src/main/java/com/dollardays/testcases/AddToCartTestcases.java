package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.AddToCartPage;
import com.dollardays.pages.LoginPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class AddToCartTestcases extends BaseTest{
	/*
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_A", testcaseID= "TC1", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_01_AddToCart_A(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Add one item to cart");
	LoginPage loginpage = new LoginPage(driver);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 1 : Login with valid credentials");
	loginpage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);
	
	AddToCartPage addtocartpage = new AddToCartPage(driver);
	//js.executeScript("arguments[0].scrollIntoView();", baby);
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	
	addtocartpage.getbaby().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2 : Click on BabyImg on HomePage");
	Thread.sleep(500);
	
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	addtocartpage.getthermometer().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Click on Thermometer");
	
	Thread.sleep(1000);
	addtocartpage.getcart().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Click on Cart");
	
	Thread.sleep(500);
	addtocartpage.getimgTM().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Item is Displayed");	
		
	
	}*/
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_A", testcaseID= "TC2", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_02_AddToCart_A(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 2 : Increase Qty. of item by using up-arrow");
	LoginPage loginpage = new LoginPage(driver);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 1 : Login with valid credentials");
	loginpage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);
	
	AddToCartPage addtocartpage = new AddToCartPage(driver);
	//js.executeScript("arguments[0].scrollIntoView();", baby);
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	
	addtocartpage.getbaby().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2 : Click on BabyImg on HomePage");
	Thread.sleep(500);
	
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	addtocartpage.getthermometer().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Click on Thermometer");
	
	Thread.sleep(1000);
	addtocartpage.getcart().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Click on Cart");
	
	Thread.sleep(2000);
	addtocartpage.getupArrow().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Click on up-arrow in Qty. Box");
	
	Thread.sleep(2000);
	addtocartpage.getupdateCart().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Click on Update Cart");
	
		
	}
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_A", testcaseID= "TC3", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_03_AddToCart_A(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 3 : Decrease Qty. of item by using down-arrow");
	LoginPage loginpage = new LoginPage(driver);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 1 : Login with valid credentials");
	loginpage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);
	
	AddToCartPage addtocartpage = new AddToCartPage(driver);
	//js.executeScript("arguments[0].scrollIntoView();", baby);
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	
	addtocartpage.getbaby().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2 : Click on BabyImg on HomePage");
	Thread.sleep(500);
	
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	addtocartpage.getthermometer().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Click on Thermometer");
	
	Thread.sleep(1000);
	addtocartpage.getcart().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Click on Cart");
	
	Thread.sleep(2000);
	addtocartpage.getdownArrow().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Click on down-arrow in Qty. Box");
	
	Thread.sleep(2000);
	addtocartpage.getupdateCart().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Click on Update Cart");
			
	}
	/*
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_A", testcaseID= "TC4", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_04_AddToCart_A(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 4 : Add Multiple items in the Cart");
	LoginPage loginpage = new LoginPage(driver);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 1 : Login with valid credentials");
	loginpage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);
	
	AddToCartPage addtocartpage = new AddToCartPage(driver);
	//js.executeScript("arguments[0].scrollIntoView();", baby);
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	
	addtocartpage.getbaby().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2 : Click on BabyImg on HomePage");
	Thread.sleep(500);
	
	
	Thread.sleep(500);
	addtocartpage.getfleece().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Click on Fleece");
	
	Thread.sleep(500);
	addtocartpage.getdiaper().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Click on Diaper");
	
	Thread.sleep(500);
	
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	addtocartpage.getkit().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Click on kit");
	
	Thread.sleep(500);
	addtocartpage.getcart().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Click on cart");
	
	Thread.sleep(500);
	addtocartpage.getimgFL().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 7 : Fleece is Displayed");
	
	Thread.sleep(500);
	addtocartpage.getimgDP().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 8 : Diaper Exchange Kit is Displayed");
	

	Thread.sleep(500);
	addtocartpage.imgKT.isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 9 : Kit is Displayed");
			
	}
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_A", testcaseID= "TC5", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_05_AddToCart_A(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 5 : Clear the cart");
	LoginPage loginpage = new LoginPage(driver);
	
	ExtentTestManager.getTest().log(Status.PASS, "Step 1 : Login with valid credentials");
	loginpage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);
	
	AddToCartPage addtocartpage = new AddToCartPage(driver);
	//js.executeScript("arguments[0].scrollIntoView();", baby);
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	
	addtocartpage.getbaby().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2 : Click on BabyImg on HomePage");
	Thread.sleep(500);
	
	js.executeScript("window.scrollBy(0, 500)", "");
	Thread.sleep(500);
	addtocartpage.getthermometer().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Click on Thermometer");
	
	Thread.sleep(1000);
	addtocartpage.getcart().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Click on Cart");
	
	Thread.sleep(500);
	addtocartpage.getimgTM().isDisplayed();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Item is Displayed");	
		
	Thread.sleep(500);
	addtocartpage.getclearCart().click();
	Thread.sleep(1000);
	
	addtocartpage.getmsgBox().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Clear the cart");
	
	
	}*/
	

}


