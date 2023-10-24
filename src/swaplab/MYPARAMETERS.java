package swaplab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MYPARAMETERS {

	static String Url = "https://www.saucedemo.com/";
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";
	static String PerformanceUserName = "performance_glitch_user";
	
	static String passWord = "secret_sauce";
	
//	static String LogOut ="logout_sidebar_link";
//	static String react_burger_menu_btn="react-burger-menu-btn";

	
	static WebDriver driver = new ChromeDriver();
	static void LoginFuncation(String UserName,String Pass) {
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
        userNameInputField.sendKeys(UserName);
        WebElement passInputField = driver.findElement(By.id("password"));
        passInputField.sendKeys(Pass);
        WebElement logInputField = driver.findElement(By.id("login-button"));
        logInputField.click();}
}