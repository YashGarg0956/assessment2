package assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/login");
		
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("yashgarg2509@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		
		driver.findElement(By.name("password")).sendKeys("Yash@1234");
		driver.findElement(By.id("login-submit")).click();
		
	    WebDriverWait a= new WebDriverWait(driver, Duration.ofSeconds(10));
		a.until(ExpectedConditions.visibilityOfElementLocated(By.className("home-sticky-container")));
		
		driver.findElement(By.cssSelector("p.szBTSFrvPTLGHM")).click();
		driver.findElement(By.cssSelector("button.yTThzZMDkelhke")).click();
		
		driver.findElement(By.cssSelector("input.lsOhPsHuxEMYEb")).sendKeys("Yash Garg");
		driver.findElement(By.cssSelector("button[data-testid='create-board-submit-button']")).click();
		
		
		// adding list name
		driver.findElement(By.cssSelector("input.list-name-input")).sendKeys("Test");
		// clicking on add list button
		driver.findElement(By.xpath("//input[@value='Add list']")).click();
		driver.findElement(By.linkText("Add a card")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Card 1");
		driver.findElement(By.cssSelector("input[value='Add card']")).click();
		
		
        driver.findElement(By.cssSelector("input.list-name-input")).sendKeys("Test 2");
		driver.findElement(By.xpath("//input[@value='Add list']")).click();
		driver.findElement(By.linkText("Add a card")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Card 2");
		driver.findElement(By.cssSelector("input[value='Add card']")).click();
		
        
        Actions ab = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//span[text()='Card 1']"));
		WebElement target = driver.findElement(By.xpath("//span[text()='Card 2']"));
		ab.dragAndDrop(source, target).perform();
		
		WebElement cardbutton = driver.findElement(By.cssSelector("span.list-card-title.js-card-name"));
		Rectangle cardbtncrd = cardbutton.getRect();
		System.out.println(cardbtncrd.getX());
		System.out.println(cardbtncrd.getY());
		driver.close();
		
		
		
		
		
		
		
		// Enter card name
		//driver.findElement(By.cssSelector("textarea.list-card-composer-textarea js-card-title")).sendKeys("Card 1");
		
		
		
		
		
		
			
		
		
		
		
		
		
		//driver.close();
		// TODO Auto-generated method stub

	}

}
