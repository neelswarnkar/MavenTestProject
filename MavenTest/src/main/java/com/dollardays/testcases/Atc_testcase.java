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

public class Atc_testcase extends BaseTest{
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_B", testcaseID= "TC2", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_02_AddToCart_B(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {


		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 2 : Add Large Qty.(237) in Qty. Box");
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
		addtocartpage.getimgTM();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Item is Displayed");	

		Thread.sleep(500);
		addtocartpage.getqtyBox().clear();
		Thread.sleep(500);
		addtocartpage.getqtyBox().sendKeys("237");
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Large Qty.(237) is entered");

		Thread.sleep(500);
		addtocartpage.getupdateCart().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 7 : Update the cart");
		Thread.sleep(3000);
		
		String warning = addtocartpage.getwarningmsg().getText();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : Should Display '"+warning+"'");
		Thread.sleep(500);
		

}
	
}	
