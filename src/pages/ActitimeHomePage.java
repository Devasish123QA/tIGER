package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeHomePage {
	public WebDriver driver;
	
	@FindBy(id="container_tasks")
	private WebElement taskbaroptionlink;
	
	@FindBy(id="logoutLink")
	private WebElement loggoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void tasksmethod()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(taskbaroptionlink));
		taskbaroptionlink.click();
	}
	public void logoutmethod()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(loggoutLink));
		loggoutLink.click();
	}

}
