package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddcustomerPage;


public class Addcustomer  extends TestBase  {
	AddcustomerPage add;
	
	@Test
	public Addcustomer(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		add = new AddcustomerPage();	
	}
	
	@Test
	public void addcustest(){
	    
		
		
		AddcustomerPage ad = new AddcustomerPage();
        String title= ad.addcus(prop.getProperty("fisrtname"), prop.getProperty("lastname"),prop.getProperty("postcode"));
        Assert.assertEquals(title, "Add Customer");
        System.out.println(title);
		
	}
	
	
	

}
