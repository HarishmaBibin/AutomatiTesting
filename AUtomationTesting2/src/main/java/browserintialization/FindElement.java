package browserintialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElement extends Base{
	public void finding() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> element1 =driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement element:element1) {
			element.sendKeys("hello");
	}
}

	public static void main(String[] args) {
		FindElement fnd_elmnt = new FindElement();
		fnd_elmnt.intialization();
		fnd_elmnt.finding();
	}

}
