package day02;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {
	WebDriver driver;
	@Before
	public void firefox() {
		System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		String ur1="file:///D:/%E5%AD%A6%E4%B9%A0/%E9%BB%84%E7%BB%A2/%E9%A1%B5%E9%9D%A2/frame.html";		
		driver.get(ur1);
		String a=driver.getTitle();
		System.out.println(a);
		System.out.println(ur1);

		
	}
	@Test
	public void shopping() throws InterruptedException {
		driver.switchTo().frame(0);
		driver.findElement(By.id("input1")).sendKeys("≤‚ ‘”√¿˝");
	}
	
}
