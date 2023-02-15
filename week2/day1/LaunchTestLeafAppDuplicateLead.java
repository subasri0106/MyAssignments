package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchTestLeafAppDuplicateLead {
	public static void main(String[] args) {
		
		ChromeDriver driver2 =new ChromeDriver();
		driver2.get("http://leaftaps.com/opentaps/control/login");
		driver2.manage().window().maximize();
		driver2.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver2.findElement(By.id("password")).sendKeys("crmsfa");
		driver2.findElement(By.className("decorativeSubmit")).click();
		driver2.findElement(By.linkText("CRM/SFA")).click();
		driver2.findElement(By.linkText("Leads")).click();
		driver2.findElement(By.linkText("Create Lead")).click();
		driver2.findElement(By.id("createLeadForm_companyName")).sendKeys("qa solutions");
		driver2.findElement(By.id("createLeadForm_firstName")).sendKeys("Suba");
		driver2.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		driver2.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ssv");
		driver2.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		WebElement dropdown = driver2.findElement(By.id("createLeadForm_industryEnumId"));
		Select obj= new Select(dropdown);
		obj.selectByVisibleText("Aerospace");
		driver2.findElement(By.id("createLeadForm_description")).sendKeys("test");
		driver2.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement dropdownState= driver2.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select obj2 = new Select(dropdownState);
		obj2.selectByVisibleText("New York");
		driver2.findElement(By.name("submitButton")).click();
		String pageTitle1 = driver2.getTitle();
		System.out.println(pageTitle1);
		driver2.findElement(By.linkText("Duplicate Lead")).click();
		driver2.findElement(By.id("createLeadForm_companyName")).clear();
		driver2.findElement(By.id("createLeadForm_companyName")).sendKeys("NQAcorp");
		driver2.findElement(By.id("createLeadForm_firstName")).clear();
		driver2.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri");
		driver2.findElement(By.name("submitButton")).click();
		String pageTitleInDuplicate = driver2.getTitle();
		System.out.println(pageTitleInDuplicate);
		
	}
}
