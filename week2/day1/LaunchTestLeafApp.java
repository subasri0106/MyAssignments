package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchTestLeafApp {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("qa solutions");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suba");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ssv");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select obj= new Select(dropdown);
		obj.selectByVisibleText("Aerospace");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement dropdownState= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select obj1 = new Select(dropdownState);
		obj1.selectByVisibleText("Delaware");
		driver.findElement(By.name("submitButton")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
	}

}
