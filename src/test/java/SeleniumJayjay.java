import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumJayjay {

    @Test
    public void helloJayjay() {
        //inisialisasi browser driver
        WebDriver driver = WebDriverManager.chromedriver().create();
        //navigasi url
        driver.get("https://jayjay.co/courses");
        //get element attribute
        String text = driver.findElement(By.cssSelector("name-tax")).getText();
        //assertion/pengecekan
        assertEquals("Semua Kursus", text);

    }
}
