import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumJayjay {
    public static WebDriver driver;

    @Test
    public void helloJayjay() {
        //inisialisasi browser driver
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //navigasi url
        driver.get("https://jayjay.co/courses");
        //get element attribute
        String text = driver.findElement(By.xpath("//h1")).getText();
        //assertion/pengecekan
        assertEquals("Semua Kursus", text);
        driver.quit();

    }
}
