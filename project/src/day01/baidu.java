package day01;


	import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class baidu {
		@Test
		public void firefox() {
			System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			WebDriver driver=new FirefoxDriver();
//			driver.get("http://localhost:8080/mobile_mysql/index.jsp");				
//			String a=driver.getTitle();
//			System.out.println(a);
//			String b=driver.getCurrentUrl();
//			System.out.println(b);
//			driver.manage().window().maximize();
			driver.get("http://www.baidu.com");
			driver.findElement(By.linkText("新闻")).click();
//			driver.findElement(By.partialLinkText("今年习近平4次踏出国门"));
//			driver.findElement(By.className("imgview")).click();
			int aa=driver.findElements(By.tagName("a")).size();
			System.out.println(aa);
//			String c=driver.getTitle();
//			System.out.println(c);
//			String d=driver.getCurrentUrl();
//			System.out.println(d);
//			driver.navigate().back();
//			driver.navigate().forward();
			//给输入框中输入内容
//			WebElement a1=driver.findElement(By.name("account"));
//			a1.sendKeys("admin");
//			WebElement a2=driver.findElement(By.name("password"));
//			a2.sendKeys("admin");
//			WebElement a3=driver.findElement(By.name("Submit"));
//			a3.click();
		}
}
