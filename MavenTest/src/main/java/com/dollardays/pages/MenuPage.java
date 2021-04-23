package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	WebDriver driver;
	
	public MenuPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="GTM-KM8SS5")
	private WebElement iFrame;
	
	public WebElement getiFrame() {
		return (iFrame);
	}
	
	
	@FindBy(xpath="//*[@id=\"sm_menu_ham\"]")
	private WebElement menuList;
	
	public WebElement getmenuList() {
		return (menuList);
	}
	
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[1]/ul/li[1]/a")
	private WebElement newItems;
	
	public WebElement getnewItems() {
		return (newItems);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[1]/ul/li[2]/a")
	private WebElement mask;
	
	public WebElement getmask() {
		return (mask);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[1]/ul/li[3]/a")
	private WebElement winterShop;
	
	public WebElement getwinterShop() {
		return (winterShop);
	}
	
	@FindBy(xpath="//*[@id=\"sm_menu_ham\"]")
	private WebElement nowTrending;
	
	public WebElement getnowTrending() {
		return (nowTrending);
	}
	
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[2]/h3")
	private WebElement categories;
	
	public WebElement getcategories() {
		return (categories);
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[19]/h3")
	private WebElement programs;
	
	public WebElement getprograms() {
		return (programs);			
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[20]/h3")
	private WebElement helpSetting;
	
	public WebElement gethelpSetting() {
		return (helpSetting);			
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]")
	private WebElement clothing;
	
	public WebElement getclothing() {
		return (clothing);			
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[3]")
	private WebElement accessories;
	
	public WebElement getaccessories() {
		return (accessories);			
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[4]")
	private WebElement kids;
	
	public WebElement getkids() {
		return (kids);			
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[5]")
	private WebElement men;
	
	public WebElement getmen() {
		return (men);			
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[6]")
	private WebElement schoolUniform;
	
	public WebElement geschoolUniform() {
		return (schoolUniform);			
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[7]")
	private WebElement shoes;
	
	public WebElement getshoes() {
		return (shoes);			
	}
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[8]")
	private WebElement socks;
	
	public WebElement getsocks() {
		return (socks);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[9]")
	private WebElement winterWear;
	
	public WebElement getwinterWear() {
		return (winterWear);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]")
	private WebElement women;
	
	public WebElement getwomen() {
		return (women);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[11]")
	private WebElement workWear;
	
	public WebElement getworkWear() {
		return (workWear);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[4]")
	private WebElement activeWear;
	
	public WebElement getactiveWear() {
		return (activeWear);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[5]")
	private WebElement bottoms;
	
	public WebElement getbottoms() {
		return (bottoms);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[6]")
	private WebElement dresses;
	
	public WebElement getdresses() {
		return (dresses);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[7]")
	private WebElement fleece;
	
	public WebElement getfleece() {
		return (fleece);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[8]")
	private WebElement intimates;
	
	public WebElement getintimates() {
		return (intimates);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[9]")
	private WebElement jackets;
	
	public WebElement getjackets() {
		return (jackets);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[10]")
	private WebElement maternity;
	
	public WebElement getmaternity() {
		return (maternity);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[11]")
	private WebElement plusSize;
	
	public WebElement getplusSize() {
		return (plusSize);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[12]")
	private WebElement swinWear;
	
	public WebElement getswinWear() {
		return (swinWear);			
	}

	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[3]/div[2]/ul/li[6]/ul/li[10]/ul/li[13]")
	private WebElement tops;
	
	public WebElement gettops() {
		return (tops);			
	}

	@FindBy(xpath="//*[@id=\"facetrefinements\"]/aside[1]/div/h3")
	private WebElement category1;
	
	public WebElement getcategory1() {
		return (category1);			
	}

	@FindBy(xpath="//*[@id=\"accordion\"]/div[1]/div[1]/a")
	private WebElement feature;
	
	public WebElement getfeature() {
		return (feature);			
	}

	@FindBy(xpath="//*[@id=\"accordion\"]/div[2]/div[1]/a")
	private WebElement piecePrice;
	
	public WebElement getpiecePrice() {
		return (piecePrice);			
	}

	@FindBy(xpath="//*[@id=\"accordion\"]/div[3]/div[1]/a")
	private WebElement casePrice;
	
	public WebElement getcasePrice() {
		return (casePrice);			
	}

	@FindBy(xpath="//*[@id=\"accordion\"]/div[4]/div[1]/a")
	private WebElement casePack;
	
	public WebElement getcasePack() {
		return (casePack);			
	}

	@FindBy(xpath="//*[@id=\"accordion\"]/div[5]/div[1]/a")
	private WebElement brands;
	
	public WebElement getbrands() {
		return (brands);			
	}

	@FindBy(xpath="//*[@id=\"accordion\"]/div[6]/div[1]/a")
	private WebElement attributes;
	
	public WebElement getattributes() {
		return (attributes);			
	}

	



}


