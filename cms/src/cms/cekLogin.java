package cms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cekLogin {
	private WebDriver driver;
	public cekLogin(WebDriver driver) {
		this.driver = driver;
	}
	public void login() {
		assert driver.findElement(By.xpath("//h2[text()='LOGIN']")).getText().contains("LOGIN");
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("user_content");
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("login123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		assert driver.findElement(By.xpath("//h2[text()='Welcome, User Content']")).getText().contains("Welcome, User Content");
		driver.findElement(By.xpath("//span[text()='User Content']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		assert driver.findElement(By.xpath("//h2[text()='LOGIN']")).getText().contains("LOGIN");
		
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("user_content");
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("login123");
		driver.findElement(By.xpath("//input[@type='checkbox'][@name='remember']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		assert driver.findElement(By.xpath("//h2[text()='Welcome, User Content']")).getText().contains("Welcome, User Content");
		driver.findElement(By.xpath("//span[text()='User Content']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		assert driver.findElement(By.xpath("//h2[text()='LOGIN']")).getText().contains("LOGIN");
		
	}
}
