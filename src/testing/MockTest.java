package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MockTest {

	private static WebDriver webDriver;
	private static String baseUrl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ajdin/Downloads/chromedriver_win32/chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://ibu.edu.ba";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.close();
	}

	@Test
	void testTitle() throws InterruptedException {
		webDriver.get(baseUrl);
		
		String title = webDriver.getTitle();
		System.out.println("Title: " + title);
		
		assertEquals("University Home - International Burch University", title);
		Thread.sleep(5000);
	}

}
