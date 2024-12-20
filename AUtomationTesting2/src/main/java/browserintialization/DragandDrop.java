package browserintialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends Base {
	public void dragdrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drag).click();
		actions.doubleClick(drag).perform();
	//	actions.contextClick(drag).perform();
		WebElement drop=driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(drag, drop).build().perform();
	}

	public static void main(String[] args) {
		DragandDrop drag_drop = new DragandDrop();
		drag_drop.intialization();
		drag_drop.dragdrop();
		

	}

}
