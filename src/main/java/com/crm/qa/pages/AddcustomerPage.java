package com.crm.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;
public class AddcustomerPage extends TestBase  {
	
	@FindBy(xpath="//button[@ng-click='manager()']")
	WebElement bankmanager;
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	WebElement addc;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement fisrtname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	WebElement postcode;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement addbutton;
	
	public AddcustomerPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String addcus(String fn,String ln,String ps) {
		
		
		bankmanager.click();
		System.out.println("Clicked on Bank Manager");
		
		addc.click();
		System.out.println("Clicked on Add Customer");

		fisrtname.sendKeys(fn);
		 System.out.println("First Name entered: " + fisrtname.getAttribute("value"));

		
		lastname.sendKeys(ln);
		System.out.println("Last Name entered: " + lastname.getAttribute("value"));

		
		postcode.sendKeys(ps);
		System.out.println("Post Code entered: " + postcode.getAttribute("value"));
		
		addbutton.click();
		System.out.println("Clicked on Add Customer");
	
		 
		  Alert alt =driver.switchTo().alert(); 
		  String alerttext = alt.getText();
	      alt.accept();
	      System.out.println(alerttext);
		  return addbutton.getText();
		 
		

	
	}
	 
	 
}
