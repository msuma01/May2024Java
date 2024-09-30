package exceptionHandling_21;

public class AmazonTest {

	public static void main(String[] args) {
		String browser = "Naveen";
		
		switch(browser) {
		
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;	
		default:
			System.out.println("plz pass the right browser...." + browser);
			throw new MyException("====WRONG BROWSER PASSED====");
		}
		System.out.println("launch url");
		System.out.println("login to app");
		System.out.println("shop a product");
		System.out.println("close browser");
		

	}

}
