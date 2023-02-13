package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
 driver.findElement(By.id("password")).sendKeys("crmsfa");
 driver.findElement(By.className("decorativeSubmit")).click();
 driver.findElement(By.linkText("CRM/SFA")).click();
 driver.findElement(By.linkText("Leads")).click();
 driver.findElement(By.linkText("Create Lead")).click();
 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("murugan");
 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("murugan");
 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
 driver.findElement(By.id("createLeadForm_description")).sendKeys("To teach the good coach");
 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("murugan91@gmail.com");
 WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select d1= new Select(state);
	d1.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	System.out.println("the title is : "+driver.getTitle());
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("use the capital letter");
	driver.findElement(By.name("submitButton")).click();
	
	}

}
