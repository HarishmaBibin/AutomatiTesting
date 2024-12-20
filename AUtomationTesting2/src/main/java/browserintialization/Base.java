package browserintialization;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public void intialization() {
	//Launch different browsers	
	//driver=new ChromeDriver();
	//driver=new FirefoxDriver ();
	driver=new EdgeDriver ();
	
	//how to launch a URL
	driver.	get("http://selenium.qabible.in/index.php");
	
	//How to maximize the window
	driver.manage().window().maximize();
	//how to close a window
	//driver.close();
	//driver.quit();
	}

	public static void main(String[] args) {
		Base base=new Base();
		base.intialization();
	}

}
