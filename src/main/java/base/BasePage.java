package base;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public static  WebDriver driver;
	public String browser = "chrome";

	public BasePage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
				driver = new ChromeDriver();

			}
			driver.manage().window().maximize();
			driver. manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://adactin.com/HotelApp/");

		}
	}
	public void naviBack()
	{
		driver.navigate().back();
	}
	public void switchWindow(int index)
	{
		Set<String> s=driver.getWindowHandles();
		List<String> list=new ArrayList<String>();
		list.addAll(s);
		driver.switchTo().window(list.get(index));
		
	}
	public void setText(WebElement element, String text )
	{
		element.click();
		element.clear();
		element.sendKeys(text);
	}
	public void click1(WebElement element)
	{
		element.click();
	}
	public String getTitle1()
	{
		return driver.getTitle();
	}
}
