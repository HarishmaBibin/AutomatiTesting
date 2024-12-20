package browserintialization;

public class NavigationCammand extends Base{
	public void navigationcmd() {
		
	
				//to navigate to another url
				driver.navigate().to("https://www.amazon.in/");
		//to go back to previous  url
				driver.navigate().back();
		//to go back to the next url
				driver.navigate().forward();
		//to refresh page 
				driver.navigate().refresh();
				
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCammand navicmnd = new NavigationCammand() ;
		navicmnd.intialization();
		navicmnd.navigationcmd();
	}

}
