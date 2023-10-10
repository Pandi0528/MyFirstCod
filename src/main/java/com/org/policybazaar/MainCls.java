package com.org.policybazaar;

import com.org.policybazaar.com.BrowserCls;
import com.org.polocybzaar.com.LocateCls;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainCls extends BrowserCls {
	LocateCls obj;
	
	@Given(":  user launch policy Bazaar app")
	public void user_launch_policy_Bazaar_app() {
		BrowserCls.getbrowserDriver("chrome");
	}
	@When(":  user click family health insurance option")
	public void user_click_family_health_insurance_option() {
		obj = new LocateCls();
	    obj.getFamilyInsurBtn().click();
	}

	@Then(":  user select fmily members")
	public void user_select_fmily_members() {
		obj = new LocateCls();
		obj.getMoreMemBtn().click();
		listOfElements(obj.getFamilyMembBtn());
	}
	@Then(": user click continue button")
	public void user_click_continue_button() {
		obj = new LocateCls();
		obj.getContiuneBtn().click();
	}
	@Then(": user enter family mumbers age")
	public void user_enter_family_mumbers_age() {
		obj = new LocateCls();
		ageSelect(obj.getYourageSelect(), obj.getYouareAge());
		ageSelect(obj.getSpouseageSelect(), obj.getSpouseAge());
		ageSelect(obj.getSonageSelect(), obj.getSonAge());
		ageSelect(obj.getDaughterageSelect(), obj.getDaughterAge());
		ageSelect(obj.getFatherageSelect(), obj.getFatherAge());
		ageSelect(obj.getMotherageSelect(), obj.getMotherAge());
		ageSelect(obj.getGrandFatherageSelect(), obj.getGrandFatherAge());
		ageSelect(obj.getGrandMotherageSelect(), obj.getGrandMotherAge());
		ageSelect(obj.getFatherinlawageSelect(), obj.getFatherinlawage());
		ageSelect(obj.getMotherinlawageSelect(), obj.getMotherinlawage());
		obj.getContiuneBtn().click();
	}
	@Then(": user enter current pin code")
	public void user_enter_current_pin_code() {
		obj = new LocateCls();
		sendValues(obj.getPinCodeBox(), "603209");
		obj.getCitySelect().click();
	}
	@Then(": user enter  personal details")
	public void user_enter_personal_details() {
		obj = new LocateCls();
		obj.getGenderBtn().click();
		sendValues(obj.getNameBox(), "GowthamKumar");
		sendValues(obj.getMobileNumberBox(), "70921964469");
		obj.getContiuneBtn2().click();
	}
}
