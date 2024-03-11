package com.crm.qa.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class Transactionpage extends TestBase {
	
	
	

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerButton;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement usernameDropdown;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//button[@ng-click='transactions()']")
    WebElement transactionsButton;
    
    @FindBy(xpath="//strong[contains(text(),'XYZ Bank')]")
   	WebElement pgtitle;
    
    @FindBy(xpath = "//input[@id='start']")
    WebElement sdate;
    
    @FindBy(xpath = "//input[@id='end']")
    WebElement edate;

	
	  @FindBy(xpath = "//button[contains(text(),'>')]") 
	  WebElement nextButton;
	  
	  @FindBy(xpath = "//button[contains(text(),'Top')]") 
	  WebElement middleButton;
	  
	  @FindBy(xpath = "//button[contains(text(),'<')]") 
	  WebElement previousButton;
	  
	  @FindBy(xpath = "//button[contains(text(),'Reset')]") 
	  WebElement resetButton;
	 

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutButton;

    public Transactionpage() {
        PageFactory.initElements(driver, this);
    }

    
    public String selectUsername(String username) {
    	
    	customerButton.click();
    	 System.out.println("Clicked on Customer Login button");
        Select usernameSelect = new Select(usernameDropdown);
        usernameSelect.selectByVisibleText(username);
        System.out.println("Selected username: " + username);

        loginButton.click();
        System.out.println("Clicked on Login button");
        transactionsButton.click();
        System.out.println("Clicked on Transactions button");
        
        sdate.click();
		System.out.println("User selects start date");
		
		edate.click();
		System.out.println("User selects end date");
		
		  nextButton.click(); 
		  System.out.println("Clicked on Next button");
		  
		  middleButton.click();
		  System.out.println("Clicked on Middle button");
		  
		  resetButton.click();
		  System.out.println("Clicked on Reset button");
		 
        logoutButton.click();
        System.out.println("Clicked on Logout button");
        return pgtitle.getText();
    }

   
}
