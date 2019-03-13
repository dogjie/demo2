package day02;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
	WebDriver driver;
	@Before
	public void firefox() {
		System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		String ur1="file:///D:/%E5%AD%A6%E4%B9%A0/%E9%BB%84%E7%BB%A2/%E9%A1%B5%E9%9D%A2/dialogs.html";		
		driver.get(ur1);
		String a=driver.getTitle();
		System.out.println(a);
		System.out.println(ur1);
	}
	@Test
	public void shopping() throws InterruptedException {
		driver.findElement(By.id("alert")).click();
		Alert aa=driver.switchTo().alert();
		System.out.println(aa.getText());
		aa.accept();
		driver.findElement(By.id("confirm")).click();
		Alert bb=driver.switchTo().alert();
		System.out.println(bb.getText());
		bb.accept();
		driver.findElement(By.id("prompt")).click();
		Alert cc=driver.switchTo().alert();
		cc.sendKeys("123");
		Thread.sleep(2000);
		cc.accept();
		WebElement sd=driver.findElement(By.xpath("/html/body"));
		System.out.println(sd.getText());	
	}
}
