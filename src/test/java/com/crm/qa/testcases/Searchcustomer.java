package com.crm.qa.testcases;





import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddcustomerPage;
import com.crm.qa.pages.searchpage;

public class Searchcustomer extends TestBase {

	searchpage sc;

	@BeforeMethod
    public void setUp() {
        initialization();
        sc = new searchpage();
    }

    @Test
    public void testBankCustomer() {
        //sc.clickBankButton();
		
		 
		/*
		 * String title = sc.clickBankButton(); Assert.assertEquals(title, "XYZ Bank");
		 */
    	
    	searchpage ad = new searchpage();
        String title= ad.clickBankButton(prop.getProperty("searchField"));
        Assert.assertEquals(title, "XYZ Bank");
        System.out.println(title);
		 

        
    }

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}
