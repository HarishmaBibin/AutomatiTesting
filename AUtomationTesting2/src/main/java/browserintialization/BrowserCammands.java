package browserintialization;

public class BrowserCammands extends Base {
	public void browsercommand() {
		
		//tofetch title from the url
				String title = driver.getTitle();
				System.out.print(title);
				
		//tofetch url of the current opened website
				String url =driver.getCurrentUrl();
				System.out.println(url);
				
		//tofetch page source of website
				String pagesource = driver.getPageSource();
				System.out.println(pagesource);
			
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCammands brscmnd=new BrowserCammands();
		brscmnd.intialization();
		brscmnd.browsercommand();
	}

}
