package Eleven;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conduit {
	
	  public WebDriver driver;
	  
	  public Conduit(){
	    driver = new ChromeDriver();
	  }
	  
	  public WebDriver getdriver(){
	    if (driver == null){
	      driver = new ChromeDriver();
	      return driver;
	    }else{
	      return driver;
	    }
	  }
	
	public int userLogin(String in_user, String in_pwd) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String userName = rb.getString("username");
		String password = rb.getString("password");
	
		getdriver().findElement(By.id("txtUsername")).sendKeys(userName);
		getdriver().findElement(By.id("txtPassword")).sendKeys(password);
		getdriver().findElement(By.id("btnLogin")).click();
		
		if(in_user.equals(userName) && in_pwd.equals(password))
			return 1;  //pass
		else 
			return 0;  //fail
	}
}