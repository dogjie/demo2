package day01;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {
	WebDriver driver;
	@Before
	public void firefox() {
		System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		String ur1="file:///C://Users//ADMINI~1//AppData//Local//Temp//Rar$EXa0.559//%E9%A1%B5%E9%9D%A2//autotest.html";		
		driver.get(ur1);
		String a=driver.getTitle();
		System.out.println(a);
		System.out.println(ur1);
}
	@Test
	public void shopping() throws InterruptedException {
		WebElement input1=driver.findElement(By.id("accountID"));
		input1.sendKeys("÷£…ŸΩ‹");
		WebElement input2=driver.findElement(By.id("passwordID"));
		input2.sendKeys("1438");
		WebElement dq1=driver.findElement(By.id("areaID"));
		Select dq=new Select(dq1);
		dq.selectByValue("tianjin");
		WebElement xb1=driver.findElement(By.id("sexID1"));
		xb1.click();
		WebElement sj1=driver.findElement(By.id("u2"));
		sj1.click();
		WebElement sj2=driver.findElement(By.id("u3"));
		sj2.click();
		WebElement sj3=driver.findElement(By.id("u4"));
		sj3.click();
		String lujin="D:\\test.txt";
		WebElement up=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td/input"));
		up.sendKeys(lujin);
		
		WebElement dj1=driver.findElement(By.id("buttonID"));
		dj1.click();
		Alert dj=driver.switchTo().alert();
		System.out.println(dj.getText());
		dj.accept();//»∑∂®
	}
	}

