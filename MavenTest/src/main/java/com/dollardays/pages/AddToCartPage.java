package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\\\"aspnetForm\\\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
	private WebElement signInImg;
	
	public WebElement getsignInImg() {
		return (signInImg);
	}
	
	@FindBy(xpath="//*[@id=\\\"aspnetForm\\\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[2]")
	private WebElement signInSelect;
	
	public WebElement getsignInSelect() {
		return (signInSelect);
	}
			
	@FindBy(xpath="//img[@title='Baby']")
	private WebElement baby;
		
	public WebElement getbaby() {
		return (baby);
	}
	
	@FindBy(xpath="//input[contains(@data-sku,'2348262')]")
	private WebElement thermometer;
	
	public WebElement getthermometer() {
		return (thermometer);
	}
	
	@FindBy(className="header-cart")
	private WebElement cart;
	
	public WebElement getcart() {
		return (cart);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[6]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/figure/a/img")
	public WebElement imgTM;
	
	public WebElement getimgTM() {
		return (imgTM);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[6]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/img")
	private WebElement upArrow;
	
	public WebElement getupArrow(){
		return (upArrow);
	}
	
	@FindBy(xpath="//*[@class=\"aspnetForm\"]/div[6]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]")
	private WebElement downArrow;
	
	public WebElement getdownArrow(){
		return (downArrow);
	}
	
	@FindBy(xpath="//*[@id=\"central-content\"]/div[3]/div[1]/div/div/div[2]/div/div[2]/div/input[5]")
	private WebElement fleece;
	
	public WebElement getfleece(){
		return (fleece);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[6]/div/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/figure/a/img")
	private WebElement imgFL;
	
	public WebElement getimgFL(){
		return (imgFL);
	}
	
	@FindBy(xpath="//*[@id=\"central-content\"]/div[3]/div[1]/div/div/div[3]/div/div[2]/div/input[5]")
	private WebElement diaper;
	
	public WebElement getdiaper(){
		return (diaper);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[6]/div/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/figure/a/img")
	private WebElement imgDP;
	
	public WebElement getimgDP(){
		return (imgDP);
	}
	
	@FindBy(xpath="//*[@id=\"central-content\"]/div[3]/div[1]/div/div/div[4]/div/div[2]/div/input[5]")
	private WebElement kit;
	
	public WebElement getkit(){
		return (kit);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[6]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/figure/a/img")
	public WebElement imgKT;
	
	public WebElement imgKT(){
		return (imgKT);
	}
	
	@FindBy(xpath="//*[@id=\"ctl00_cphContent_btnUpdateCart\"]")
	private WebElement updateCart;
	
	public WebElement getupdateCart() {
		return (updateCart);
	}
	
	@FindBy(className="btnClearCart_clear")
	private WebElement clearCart;
	
	public WebElement getclearCart() {
		return (clearCart);
	}
	
	@FindBy(xpath="//*[@id=\"cartconfirm\"]/div/div/div[3]/button[1]")
	private WebElement msgBox;
	
	public WebElement getmsgBox() {
		return (msgBox);
	}
	
	@FindBy(className="form-quantity")
	private WebElement qtyBox;
	
	public WebElement getqtyBox() {
		return (qtyBox);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[6]/div/div[1]/div/div/div/div/text()")
	private WebElement warningmsg;
	
	public WebElement getwarningmsg() {
		return (warningmsg);
	}
	
	public String getWarnmsg() throws InterruptedException {
		String msg=null;
		String result=getwarningmsg().getText();
		System.out.println("-->"+result);
		
		if(result.contains("You've exceeded the number of available units for item Nuby™ Digital Thermometer, please revise your quantity or call 877-837-9569.")) {
			
			msg = getwarningmsg().getText();
		}else {
			msg= getmsgBox().getText();
		}
		
		return msg;
	
	
	
	
}
}
