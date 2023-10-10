package com.org.polocybzaar.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.policybazaar.com.BrowserCls;

public class LocateCls extends BrowserCls  {
	@FindBy(xpath = "(//div[@class='shadowHandlerBox'])[6]//following-sibling::p")
	private WebElement familyInsurBtn;
	@FindBy(xpath = "//p[text()='More members']")
	private WebElement moreMemBtn;
	@FindBy(xpath = "//form//div[2]//label")
	private List<WebElement> familyMembBtn;
	@FindBy(id = "submitButton")
	private WebElement contiuneBtn;
	@FindBy(id = "Self")
	private WebElement yourageSelect;
	@FindBy(xpath = "//select[@id='Self']//child::option[text()='26 yr']")
	private WebElement youareAge;
	@FindBy(id = "Spouse")
	private WebElement spouseageSelect;
	@FindBy(xpath = "//select[@id='Spouse']//child::option[text()='25 yr']")
	private WebElement spouseAge;
	@FindBy(id = "Son")
	private WebElement sonageSelect;
	@FindBy(xpath = "//select[@id='Son']//child::option[text()='6 yr']")
	private WebElement sonAge;
	@FindBy(id = "Daughter")
	private WebElement daughterageSelect;
	@FindBy(xpath = "//select[@id='Daughter']//child::option[text()='5 yr']")
	private WebElement daughterAge;
	@FindBy (id = "Father")
	private WebElement fatherageSelect;
	@FindBy(xpath = "//select[@id='Father']//child::option[text()='47 yr']")
	private WebElement fatherAge;
	@FindBy(id = "Mother")
	private WebElement  motherageSelect;
	@FindBy(xpath = "//select[@id='Mother']//child::option[text()='44 yr']")
	private WebElement motherAge;
	@FindBy(id = "GrandFather")
	private WebElement  grandFatherageSelect;
	@FindBy(xpath = "//select[@id='GrandFather']//child::option[text()='69 yr']")
	private WebElement grandFatherAge;
	@FindBy(id = "GrandMother")
	private WebElement  grandMotherageSelect;
	@FindBy(xpath = "//select[@id='GrandMother']//child::option[text()='67 yr']")
	private WebElement grandMotherAge;
	@FindBy(id = "Father-in-law")
	private WebElement  fatherinlawageSelect; 
	@FindBy(xpath = "//select[@id='Father-in-law']//child::option[text()='68 yr']")
	private WebElement fatherinlawage;
	@FindBy(id = "Mother-in-law")
	private WebElement  motherinlawageSelect; 
	@FindBy(xpath = "//select[@id='Mother-in-law']//child::option[text()='67 yr']")
	private WebElement motherinlawage;
	@FindBy(id = "txtcity")
	private WebElement pinCodeBox;
	@FindBy(xpath = "//span[text()='Chennai']")
	private WebElement citySelect;
	@FindBy(xpath = "(//input[@name='gender']//following-sibling::p)[1]")
	private WebElement genderBtn;
	@FindBy(name = "name")
	private WebElement nameBox;
	@FindBy(name = "number")
	private WebElement mobileNumberBox;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement contiuneBtn2;
	
	public WebElement getFamilyInsurBtn() {
		return familyInsurBtn;
	}
	public WebElement getMoreMemBtn() {
		return moreMemBtn;
	}
	public List<WebElement> getFamilyMembBtn() {
		return familyMembBtn;
	}
	public WebElement getContiuneBtn() {
		return contiuneBtn;
	}
	public WebElement getYourageSelect() {
		return yourageSelect;
	}
	public WebElement getYouareAge() {
		return youareAge;
	}
	public WebElement getSpouseageSelect() {
		return spouseageSelect;
	}
	public WebElement getSpouseAge() {
		return spouseAge;
	}
	public WebElement getSonageSelect() {
		return sonageSelect;
	}
	public WebElement getSonAge() {
		return sonAge;
	}
	public WebElement getDaughterageSelect() {
		return daughterageSelect;
	}
	public WebElement getDaughterAge() {
		return daughterAge;
	}
	public WebElement getFatherageSelect() {
		return fatherageSelect;
	}
	public WebElement getFatherAge() {
		return fatherAge;
	}
	public WebElement getMotherageSelect() {
		return motherageSelect;
	}
	public WebElement getMotherAge() {
		return motherAge;
	}
	public WebElement getGrandFatherageSelect() {
		return grandFatherageSelect;
	}
	public WebElement getGrandFatherAge() {
		return grandFatherAge;
	}
	public WebElement getGrandMotherageSelect() {
		return grandMotherageSelect;
	}
	public WebElement getGrandMotherAge() {
		return grandMotherAge;
	}
	public WebElement getFatherinlawageSelect() {
		return fatherinlawageSelect;
	}
	public WebElement getFatherinlawage() {
		return fatherinlawage;
	}
	public WebElement getMotherinlawageSelect() {
		return motherinlawageSelect;
	}
	public WebElement getMotherinlawage() {
		return motherinlawage;
	}
	public WebElement getPinCodeBox() {
		return pinCodeBox;
	}
	public WebElement getCitySelect() {
		return citySelect;
	}
	public WebElement getGenderBtn() {
		return genderBtn;
	}
	public WebElement getNameBox() {
		return nameBox;
	}
	public WebElement getMobileNumberBox() {
		return mobileNumberBox;
	}
	public WebElement getContiuneBtn2() {
		return contiuneBtn2;
	}
	public LocateCls() {
		PageFactory.initElements(driver,this );
	}
	
}
