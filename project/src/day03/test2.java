package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test2 {
	WebDriver driver;
	@Before
	public void firefox() {
		//System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		driver=new ChromeDriver();
		String ur1="file:///D:/%E5%AD%A6%E4%B9%A0/%E9%BB%84%E7%BB%A2/index.html";		
		driver.get(ur1);
		
/*
 * 1.��ҳ��
 * 2.��λ�����
 * 3.����Ҽ�
 * 
 */

		
	}
	public void youji1() throws InterruptedException {
		
//		WebElement input=driver.findElement(By.id("user"));
		Actions a=new Actions(driver);
//		a.contextClick(input).perform();
//		WebElement  chrck=driver.findElement(By.name("checkbox1"));
/*
 * ������ƶ���action��ť��
 * ���hello world
 */
		Thread.sleep(5000);
		WebElement  ac=driver.findElement(By.className("over"));
		a.moveToElement(ac).perform();
		Thread.sleep(5000);
		String aa=driver.findElement(By.id("over")).getText();
		System.out.println(aa);
				
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		a.doubleClick(chrck).perform();
//		WebElement input1=driver.findElement(By.className("wait"));
//		a.contextClick(input1).perform();
	}
}
