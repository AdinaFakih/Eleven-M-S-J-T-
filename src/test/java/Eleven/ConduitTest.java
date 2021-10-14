package Eleven;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class ConduitTest extends Conduit{
	
	Conduit myapp = new Conduit();
	
//    @BeforeTest
//    public void beforeMethod() {
//        
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//		driver.manage().window().maximize();
//    }
    
//    @Test
//    public void navigateToAUrl() {
//        // navigate to the web site
//        driver.get("https://react-redux.realworld.io/#/login?_k=uzmkku");
//        // Validate page title
//        Assert.assertEquals(driver.getTitle(), "Conduit");
//    }
	
	@Test
	public void login_invalid_1() {
		//valid user name, invalid password
		Assert.assertEquals(0, myapp.userLogin("abc", "abc@123"));	
	}
	
	@Test
	public void login_invalid_2() {
		//invalid user name, valid password
		Assert.assertEquals(0, myapp.userLogin("abc12", "abc123"));	
	}
	
	@Test
	public void login_invalid_3() {
		//invalid user name, invalid password
		Assert.assertEquals(0, myapp.userLogin("1234", "abc"));	
	}
	
	@Test
	public void login_valid_4() {
		//valid user name, valid password
		Assert.assertEquals(1, myapp.userLogin("abc", "abc123"));	
	}
}
//    @AfterTest
//    public void afterMethod() {
//        // close and quit the browser
//     driver.quit();
//    }
//}