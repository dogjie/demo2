package day03;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {
	WebDriver driver;
	@Before
	public void firefox() {
		//System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		driver=new ChromeDriver();
		String ur1="file:///D:/%E5%AD%A6%E4%B9%A0/%E9%BB%84%E7%BB%A2/index.html";		
		driver.get(ur1);
		
//		String a=driver.getTitle();
//		System.out.println(a);
//		System.out.println(ur1);

		
	}
	@Test
	public void shopping() throws InterruptedException, IOException {
		
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		WebElement  ac=driver.findElement(By.className("over"));
		a.moveToElement(ac).perform();
		Thread.sleep(5000);
		String aa=driver.findElement(By.id("over")).getText();
		System.out.println(aa);
		
//		WebElement b=driver.findElement(By.className("wait"));
//		b.click();
//		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"display\"]/div")));
//		WebElement a=driver.findElement(By.xpath("//*[@id=\"display\"]/div"));
//		
//		System.out.println(a.getText());
	}

}
