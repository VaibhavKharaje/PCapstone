package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;

import com.crm.qa.pages.deletepage;

public class deletetest extends TestBase {

	deletepage dc;

	@BeforeMethod
    public void setUp() {
        initialization();
        dc = new deletepage();
    }

    @Test
    public void testBankCustomer() {
		/*
		 * String title = dc.clickBankButton(); Assert.assertEquals(title, "XYZ Bank");
		 */
		 
		  
		
		  deletepage ad = new deletepage(); String title=
		  ad.clickBankButton(prop.getProperty("searchField"));
		  Assert.assertEquals(title, "XYZ Bank"); System.out.println(title);
		 
        

        
    }

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}
