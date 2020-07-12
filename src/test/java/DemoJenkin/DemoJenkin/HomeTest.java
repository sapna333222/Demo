package DemoJenkin.DemoJenkin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeTest {
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sapna\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			driver.get("https://www.facebook.com/");
		 
	}
	
	@Test
	public void VerifyHomeTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Facebook - Log In or Sign Up","Home page title doesn't Match");
	}
	
	@Test
	public void findFriends() {
		
		System.out.println("hello friends");
	}
	
	@Test
	public void findFriends2() {
		
		System.out.println("hello friends");
	}
	
	@Test
	public void HelloFriends2() {
		
		System.out.println("hello friends");
	}

	@Test
	public void HelloFriends3() {

		System.out.println("hello friends");
	}

	@Test
	public void HelloFriends4() {

		System.out.println("hello friends");
	}

	@Test
	public void HelloFriends5() {

		System.out.println("hello friends");
	}

	@Test
	public void HelloFriends11() {

		System.out.println("hello friends");
	}

	@Test
	public void HelloFriends110() {

		System.out.println("hello friends");
	}

	@Test
	public void HelloFriendsLocal() {

		System.out.println("hello friends");
	}

	@Test
	public void HelloFriendsLocal2() {

		System.out.println("hello friends");
	}
	@Test
	public void HelloStash5() {

		System.out.println("hello Stash5");
	}

	@Test
	public void IamOnMaster() {

		System.out.println("hello Master");
	}


	@Test
	public void RemoteOnMaster() {

		System.out.println("hello Master");
	}

	@Test
	public void updated () {

		System.out.println("hello Master");
	}

	@AfterMethod
	public void TearDown() {
		driver.close();
	}


}
