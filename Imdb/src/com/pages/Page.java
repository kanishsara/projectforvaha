package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page extends Masterpage {
	WebDriver driver;
	public Page() throws Exception {
		
	}
	public  boolean login(String username,String password) throws Exception {
		initialsetup();
	
		clickelement("Sign_button");
		clickelement("Signinwithidmb_button");
		senddata("Enteremail",username);
		senddata("Enterpassword",password);
		clickelement("sign_in");
		clickelement("homelink");
		clickelement("Topratedmovies");

		clickelement("sortby");
	    clickelement("lastmovie");
	    clickelement("lastmovie");
	
	  
		return iselementexists("homelink");

}
	
}
