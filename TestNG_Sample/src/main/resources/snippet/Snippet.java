package snippet;

public class Snippet {
	WebDriver c;
			
			
			String Browser = fileb.getKeyAndValuePair("Browser");
			String URL = fileb.getKeyAndValuePair("url");
			String UN=fileb.getKeyAndValuePair("username");
			String PW=fileb.getKeyAndValuePair("password");
	
			if(Browser.equalsIgnoreCase("chrome"))
			{
				c=new ChromeDriver();
			}
			else if(Browser.equalsIgnoreCase("firefox"))
			{
				c=new FirefoxDriver();
			}
			else if(Browser.equalsIgnoreCase("edge"))
			{
				c=new EdgeDriver();
			}
			else 
			{
				c=new ChromeDriver();
			}
	
			c.get(URL);
			
				
			//using business logics
			LoginVtigerPage login=new LoginVtigerPage(c);
			login.loginIntoVtiger(UN,PW);
}

