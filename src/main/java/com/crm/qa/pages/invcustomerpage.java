package com.crm.qa.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class invcustomerpage extends TestBase {
	
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

	public invcustomerpage() {
		PageFactory.initElements(driver, this);
	}
	        
	 public void addinv(String invfn, String invln, String invps) {
		 bankmanager.click();
			System.out.println("Clicked on Bank Manager");
			
			addc.click();
			System.out.println("Clicked on Add Customer");

			fisrtname.sendKeys(invfn);
			 System.out.println("First Name entered: " + fisrtname.getAttribute("value"));

			
			lastname.sendKeys(invln);
			System.out.println("Last Name entered: " + lastname.getAttribute("value"));

			
			postcode.sendKeys(invps);
			System.out.println("Post Code entered: " + postcode.getAttribute("value"));
			
			addbutton.click();
			System.out.println("Clicked on Add Customer");
	        
	        // Validate if an alert is displayed for invalid data
	        if (isAlertPresent()) {
	            Alert alert = driver.switchTo().alert();
	            String alertText = alert.getText();
	            alert.accept();
	            System.out.println("Alert Message: " + alertText);
	        } else {
	            System.out.println("No alert message displayed for invalid data.");
	        }
	    }
	    
	    private boolean isAlertPresent() {
	        try {
	            driver.switchTo().alert();
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }
	}
	

