

		import java.util.Iterator;
		import java.util.Set;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WindowType;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class multipleWindows {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				

				System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
				
		              WebDriver driver = new ChromeDriver();
		              driver.manage().window().maximize();
		              
		              driver.get("https://www.rahulshettyacademy.com/#/practice-project");
		              
		              driver.findElement(By.id("name")).sendKeys("raghavendra");
		              driver.findElement(By.id("email")).sendKeys("raghavendra84anrt@gmail.com");
		              driver.findElement(By.id("form-submit")).click();
		              Thread.sleep(3000);
		              String Heading = driver.findElement(By.xpath("//*[text()='OUR PROJECTS']")).getText();
		              System.out.println(driver.getTitle());
		              Thread.sleep(5000);
		              driver.switchTo().newWindow(WindowType.WINDOW);
		              
		              Set<String> Window = driver.getWindowHandles();
		             Iterator<String> s1= Window.iterator();
		           String p= s1.next();
		          String c=s1.next();
		          
		          driver.switchTo().window(c);                  
		          driver.get("https://rahulshettyacademy.com/angularpractice/");
		          System.out.println(driver.getTitle());
		          driver.findElement(By.id("exampleInputPassword1")).sendKeys(Heading);
		          
		          
		             
		              
		          
		              
		              
		              
		              
		              

			}

		




}
