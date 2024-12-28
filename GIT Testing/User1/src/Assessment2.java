import java.time.Duration;
import java.util.List;
test import

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Assessment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("learning");	
		////label[@class = 'customradio'][2]/span[2]
		driver.findElement(By.xpath("//label[@class = 'customradio'][2]/span[2]")).click();
		//Thread.sleep(3000);
		//System.out.println(driver.switchTo().alert().getText());
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(7));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		//driver.switchTo().alert().accept();
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement dropDownBox = driver.findElement(By.xpath("//Select[@class = 'form-control']"));
		Select dropDown = new Select(dropDownBox);
        ////Select[@class = 'form-control']
		dropDown.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id = 'terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		//https://rahulshettyacademy.com/angularpractice/shop
		
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/shop");
		//System.out.println("yeahh");
		
		//h4.card-title a
		
		List<WebElement> object = driver.findElements(By.xpath("//button[@class = 'btn btn-info']"));
		//System.out.println(object.get(0).getText());
		
		for (int i = 0; i<object.size(); i++)
		{
			object.get(i).click();	
			
		}
		
		
		driver.findElement(By.xpath("//a[@class = 'nav-link btn btn-primary']")).click();
		

	}

}
