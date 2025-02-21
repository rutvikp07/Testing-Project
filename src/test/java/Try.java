import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Try {
	ChromeDriver driver = new ChromeDriver();
	@Test
	 public void start() {
		driver.get("https://myflixerz.to/watch-tv/chernobyl-42212.5372965");
	}
	
}
