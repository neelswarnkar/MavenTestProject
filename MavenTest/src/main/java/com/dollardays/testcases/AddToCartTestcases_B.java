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

public class AddToCartTestcases_B extends BaseTest{

	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_B", testcaseID= "TC1", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_01_AddToCart_B(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {

		JavascriptExecutor js =(JavascriptExecutor)driver;

		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Add Valid Qty.(6) in Qty. Box");
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


		addtocartpage.getfleece().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3 : Click on Fleece");

		Thread.sleep(1000);
		addtocartpage.getcart().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Click on Cart");

		Thread.sleep(500);
		addtocartpage.getimgFL();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5 : Item is Displayed");	

		Thread.sleep(500);
		//Actions builder = new Actions(driver);

		addtocartpage.getqtyBox().clear();
		Thread.sleep(500);
		addtocartpage.getqtyBox().sendKeys("6");
		//Action seriesofActions=builder.moveToElement(qtyBox).click().keyDown(qtyBox, Keys.SHIFT).doubleClick(qtyBox).keyUp(qtyBox,Keys.SHIFT).build();
		//Thread.sleep(500);
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Valid Qty. entered");	

		/*seriesofActions.perform();
    Thread.sleep(500);
    qtyBox.sendKeys("6");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"ctl00_cphContent_btnUpdateCart\"]")).click();
		 */

		Thread.sleep(500);
		addtocartpage.getupdateCart().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 7 : Update the cart");
		
		Thread.sleep(500);
		addtocartpage.getclearCart().click();
		Thread.sleep(500);
		addtocartpage.getmsgBox().click();
		Thread.sleep(500);
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : Clear the cart");
		Thread.sleep(500);
		
	}

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
		Thread.sleep(500);
		
		addtocartpage.getclearCart().click();
		Thread.sleep(500);
		addtocartpage.getmsgBox().click();
		Thread.sleep(500);
		ExtentTestManager.getTest().log(Status.PASS, "Step 8 : Clear the cart");
		Thread.sleep(500);
	
	
	}
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_B", testcaseID= "TC3", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_03_AddToCart_B(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {


		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 3 : Add letter(g) in Qty. Box");
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
		addtocartpage.getqtyBox().sendKeys("g");
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Letter(g) is entered");

		Thread.sleep(500);
		addtocartpage.getupdateCart().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 7 : Update the cart");
		Thread.sleep(500);
		
			
	
	}
	
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_B", testcaseID= "TC4", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_04_AddToCart_B(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {


		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 4 : Add symbol(%) in Qty. Box");
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
		addtocartpage.getqtyBox().sendKeys("%");
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Symbol(%) is entered");

		Thread.sleep(500);
		addtocartpage.getupdateCart().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 7 : Update the cart");
		Thread.sleep(500);
		
	}
		
	@DDDataProvider(datafile= "testdata/testdata_A.xlsx", sheetName = "AddToCart_B", testcaseID= "TC5", runmode = "Yes" )
	@Test(dataProvider= "dd-dataprovider", dataProviderClass= TestUtil.class)
	public void TC_05_AddToCart_B(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {


		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 5 : Add invalid number(0) in Qty. Box");
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
		addtocartpage.getqtyBox().sendKeys("0");
		ExtentTestManager.getTest().log(Status.PASS, "Step 6 : Invalid Number(0) is entered");

		Thread.sleep(500);
		addtocartpage.getupdateCart().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 7 : Update the cart");
		Thread.sleep(500);
		
			
		
		
	}
	

}	
