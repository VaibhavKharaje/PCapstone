package com.crm.qa.testcases;



import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.invcustomerpage;


public class invcustomertest extends TestBase {
	invcustomerpage ad;

	public invcustomertest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		ad = new invcustomerpage();
	}
	@Test
	 public void invadd() {
     
        
		
		ad.addinv(prop.getProperty("invfn"), prop.getProperty("invln"), prop.getProperty("invps"));
		

	        // Assert that an error is displayed
	        assertTrue(isErrorDisplayed(), "Error message is not displayed for invalid data");
	    }

	    private boolean isErrorDisplayed() {
	        
	        return false;
	    }
	
		}


