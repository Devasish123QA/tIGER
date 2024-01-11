package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage 
{
	@FindBy(id="username")
	private WebElement usernametextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkboxclick;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginmethod()
	{
		usernametextfield.sendKeys("mohantydebasis417@gmail.com");
		passwordtextfield.sendKeys("debasish123");
		checkboxclick.click();
		loginbutton.click();
	}
}
