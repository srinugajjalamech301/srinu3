
public class login {
	
	
	static String url = "https://test.lubesqr.bpcl.in/central/site/login";
	static Actions action;
	

	public static WebDriver intializeWebDriver() {
		

		//System.setProperty("webdriver.chrome.driver", ".\\resources\\drivers\\chromedriver.exe");
		WebDriver driver;
		//driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action = new Actions(driver);
		return driver;
		
		
	
		
		


		}

}
