package com.Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.Page;
import com.utility.Exceldata;




public class Tests {
	@DataProvider
	public Object[][] provideData() throws IOException {
		return(Exceldata.readdata("Sheet1"));
	}
		
		
		Page lp;
		@Test(dataProvider="provideData")
		public void logintest(String uname,String pass) throws Exception {
			
		
		lp=new Page();
		
		Assert.assertTrue(lp.login(uname,pass),"login failed");
		

}
		
		}

