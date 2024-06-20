package InterviewPrgrams;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Intr1covalensedigital {
	
	public static void main(String[] args) {
		// Prgm to close third window in browser.
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.ex.com");
		Set<String> hands = driver.getWindowHandles();
		
		
		for ( String hd: hands)
		{
			driver.switchTo().window(hd).getTitle();
			/*
			 * String text = Syso 3rd window == is having some title.
			 * if(actual_text!=Parent_window) { driver.close(); }
			 */
		}
		
		
		
	}
	}
	