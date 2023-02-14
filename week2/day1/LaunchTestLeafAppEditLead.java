package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchTestLeafAppEditLead {
	public static void main(String[] args) {
		ChromeDriver driver1 =new ChromeDriver();
		driver1.get("http://leaftaps.com/opentaps/control/login");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver1.findElement(By.id("password")).sendKeys("crmsfa");
		driver1.findElement(By.className("decorativeSubmit")).click();
		driver1.findElement(By.linkText("CRM/SFA")).click();
		driver1.findElement(By.linkText("Leads")).click();
		driver1.findElement(By.linkText("Create Lead")).click();
		driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("qa solutions");
		driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Suba");
		driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		driver1.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ssv");
		driver1.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		WebElement dropdown = driver1.findElement(By.id("createLeadForm_industryEnumId"));
		Select obj= new Select(dropdown);
		obj.selectByVisibleText("Aerospace");
		driver1.findElement(By.id("createLeadForm_description")).sendKeys("test");
		driver1.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement dropdownState= driver1.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select obj1 = new Select(dropdownState);
		obj1.selectByVisibleText("Delaware");
		driver1.findElement(By.name("submitButton")).click();
		String pageTitle = driver1.getTitle();
		System.out.println(pageTitle);
	}


}
