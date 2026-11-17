package orangebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.loginpage;

public class base {
	 WebDriver driver;
	 public loginpage loginobj;
	 
	 @BeforeTest
	 public void setup() {
		 ChromeOptions option=new ChromeOptions();
		 option.addArguments("--incognito");
		 driver=new ChromeDriver(option);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 }
	 @BeforeMethod
	 public void objectmthd() {
		 loginobj=new loginpage(driver);
	 }
	

}
