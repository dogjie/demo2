package day01;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testbaidu {
	
	WebDriver driver;
	@Before
	public void firefox() {
		System.setProperty("webdriver.firefox.bin", "E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		String ur1="file:///D:/%E5%AD%A6%E4%B9%A0/%E9%BB%84%E7%BB%A2/index.html";		
		driver.get(ur1);
		String a=driver.getTitle();
		System.out.println(a);
		System.out.println(ur1);

		
	}
	@Test
	public void shopping() throws InterruptedException {
//		//定位输入框
//				WebElement input1=driver.findElement(By.id("user"));
//				input1.sendKeys("测试用例");
//		//定位下拉框
//				WebElement s1=driver.findElement(By.id("moreSelect"));
//				Select s=new Select(s1);
//				s.selectByIndex(3);
//				Thread.sleep(1000);
//				s.selectByValue("iphone");
//				Thread.sleep(1000);
//				s.selectByVisibleText("oppe");
//		//定位单选按钮
//				WebElement r1=driver.findElement(By.className("Saab"));
//				System.out.println(r1.isSelected());
//				r1.click();
//				System.out.println(r1.isSelected());
//		//定位多选按钮
//				WebElement c1=driver.findElement(By.name("checkbox1"));
//				c1.click();
//				WebElement c2=driver.findElement(By.name("checkbox2"));
//				c2.click();
//		
//				WebElement b1=driver.findElement(By.name("buttonhtml"));
//				System.out.println(b1.isSelected());
//				
//				WebElement a1=driver.findElement(By.className("alert"));
//				a1.click();
//				Alert aa=driver.switchTo().alert();
//				//System.out.println(aa.getText());
//				aa.accept();//确定
//		//定位confirm框
//				WebElement com1=driver.findElement(By.className("confirm"));
//				com1.click();
//				Alert com=driver.switchTo().alert();				
//				com.dismiss();//取消
//				com.accept();//确定
//				
//				WebElement pr1=driver.findElement(By.className("prompt"));
//				pr1.click();
//				Alert prm=driver.switchTo().alert();
//				prm.sendKeys("test");
//				prm.accept();//确定
//				System.out.println(prm.getText());
//				prm.accept();//确定
//		//上传按钮
//				String lujin="D:\\test.txt";
//				WebElement up=driver.findElement(By.id("load"));
//				up.sendKeys(lujin);
//		
//		//定位页面跳转
//				WebElement link1=driver.findElement(By.linkText("Open new window"));
//				link1.click();
//		//获取所有的句柄
//				Set<String> windowHandles=driver.getWindowHandles();
//				for(String handler:windowHandles) {
//			//打印了当前页面的句柄
//					System.out.println(handler);
//			//获取当前页面的标题
//					driver.switchTo().window(handler);
//			//对比标题，如果标题和我想要的一致，执行以下操作
//					String title=driver.getTitle();
//					if("UIAutomation iFrame".equals(title)) {
//						WebElement user=driver.findElement(By.id("user"));
//						user.sendKeys("test");
//					}
//				}
//				driver.switchTo().frame("aa");//直接写frame的ID或者name
				driver.switchTo().frame(0);//索引
				driver.findElement(By.id("user")).sendKeys("test");
		//一层一层的往外跳
//				driver.switchTo().parentFrame();
				driver.switchTo().defaultContent();
				driver.findElement(By.id("user")).sendKeys("test");
				WebElement link1=driver.findElement(By.linkText("Open new window"));
				link1.click();
				
//		driver.findElement(By.linkText("注册")).click();
//		driver.findElement(By.name("name")).sendKeys("AQA");
//		driver.findElement(By.name("password")).sendKeys("123");
//		driver.findElement(By.name("passwordOne")).sendKeys("123");
//		driver.findElement(By.name("reallyName")).sendKeys("王二");
//		driver.findElement(By.name("age")).sendKeys("18");
//		driver.findElement(By.name("profession")).sendKeys("学生");
//		driver.findElement(By.name("email")).sendKeys("123@qq.com");
//		driver.findElement(By.name("question")).sendKeys("你是谁？");
//		driver.findElement(By.name("result")).sendKeys("王二");	
//		driver.findElement(By.className("input1")).click();
		
	}
	
	
	@After
public void login() throws InterruptedException{
		
//		Thread.sleep(10000);
//		driver.findElement(By.name("name")).sendKeys("AQA");
//		driver.findElement(By.name("password")).sendKeys("123");
//		driver.findElement(By.className("input1")).click();
	}
}
