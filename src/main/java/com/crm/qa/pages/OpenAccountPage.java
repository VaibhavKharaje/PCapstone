package com.crm.qa.pages;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class OpenAccountPage extends TestBase {
	@FindBy(xpath="//button[@ng-click='manager()']")
	WebElement bankmanager;
	
	@FindBy(xpath="//button[@ng-click='openAccount()']")
	WebElement addc;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropdown;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropdown;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public String openAccount(String customerName, String currency) {
    	bankmanager.click();
    	System.out.println("Clicked on Bank Manager Login button");
    	addc.click();
    	System.out.println("Clicked on Open Account button");
        Select customerSelect = new Select(customerDropdown);
        customerSelect.selectByVisibleText(customerName);
        System.out.println("Selected customer: " + customerName);


        Select currencySelect = new Select(currencyDropdown);
        currencySelect.selectByVisibleText(currency);
        System.out.println("Selected currency: " + currency);
        
        WebElement coninfo = driver.findElement(By.xpath("//button[contains(text(),'Process')]"));
	    coninfo.click();
	    System.out.println("Clicked on Process button");
	    Alert alt =driver.switchTo().alert();
	    alt.accept();
	    return coninfo.getText();
      
    }
}

