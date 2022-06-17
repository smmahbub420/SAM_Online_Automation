import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    static WebDriver driver;


    public static void main(String [] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://sam.rultest2.com/account/");

        //username
        driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter username')])[1]")).sendKeys("smalam11");
        //password
        driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter password')])[1]")).sendKeys("12345678");

        //login
        driver.findElement(By.xpath("//a[contains(@class,'btn btn-default')]")).click();

        Thread.sleep(3000);
        //settings
        driver.findElement(By.xpath("//span[@class='float_menu_item__title heading_font'][contains(.,'Settings')]")).click();

        Thread.sleep(4000);
        //My course
        driver.findElement(By.xpath("(//a[@href='https://sam.rultest2.com/courses/mycourse'])[2]")).click();

        Thread.sleep(3000);
        //Home
        driver.findElement(By.xpath("(//a[@href='https://sam.rultest2.com'][contains(.,'Home')])[2]")).click();

        //logout
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(.,'Log out')])[1]")).click();




    }


}
