// Selenium Java Example: Verify Homepage Title
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        driver.quit();
    }
}
