package com.crm.qa.testcases;






import org.testng.Assert;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;

import com.crm.qa.pages.Transactionpage;

public class Transactiontest extends TestBase {

	Transactionpage tc;



	@BeforeMethod
    public void setUp() {
        initialization();
        
        tc = new Transactionpage();
       
        
    }

    @Test
    public void testCustomerActions() {
    	

    	//tc.selectUsername("Harry Potter");
    	String title = tc.selectUsername("Hermoine Granger");
		  Assert.assertEquals(title, "XYZ Bank");
		  
			
    }

	
	  
	 
}

