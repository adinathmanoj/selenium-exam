package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") WebElement username;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input") WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement loginbtn;
	 
	public loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String titlemthd() {
		String title=driver.getTitle();
		return title;
	}
	
	//public boolean logoverification() {
		//WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img"));
		//return driver.findElement((By) logo).isDisplayed();
	//}
	
	public  void loginmthd(String um, String pwd){
		username.sendKeys(um);
		password.sendKeys(pwd);
		loginbtn.click();
		
	}
}
