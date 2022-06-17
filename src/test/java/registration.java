import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registration {

    static WebDriver driver;


    public static void main(String [] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://sam.rultest2.com/account/");


        //SAM online//

        //username
        driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).sendKeys("smalam12");

        //email
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sm12@gmail.com");

        //password
        driver.findElement(By.xpath("(//input[contains(@name,'password')])[2]")).sendKeys("12345678");

        //confirm password
        driver.findElement(By.xpath("//input[contains(@name,'password_re')]")).sendKeys("12345678");

        //fullname
        driver.findElement(By.xpath("//input[contains(@name,'first_name')]")).sendKeys("Alam");

        //phone
        driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("01712345678");

        //gender
        Select gender= new Select(driver.findElement(By.name("Gender")));
        gender.selectByVisibleText("Male");


        //age
        driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("25");

        //designation
        Select designation = new Select(driver.findElement(By.name("Designation")));
        designation.selectByVisibleText("Student");


        //institution
        driver.findElement(By.xpath("//input[contains(@name,'institution_name')]")).sendKeys("AIUB");

        //Register
        //driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Register')]")).click();

        driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Register')]")).submit();


        //username
        driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter username')])[1]")).sendKeys("smalam11");
        //password
        driver.findElement(By.xpath("(//input[contains(@placeholder,'Enter password')])[1]")).sendKeys("12345678");

        //login
        driver.findElement(By.xpath("//a[contains(@class,'btn btn-default')]")).click();



        //course
        //driver.findElement(By.xpath("(//a[@href='https://sam.rultest2.com/courses'][contains(.,'Course')])[2]")).click();



        //logout
//        boolean b = driver.findElements(By.xpath("//a[@href='https://sam.rultest2.com/wp-login.php?action=logout&redirect_to=https%3A%2F%2Fsam.rultest2.com&_wpnonce=5d6ea4068e']")).isEmpty();
//        System.out.println(b);

        //driver.findElement(By.xpath("//a[@href='https://sam.rultest2.com/wp-login.php?action=logout&redirect_to=https%3A%2F%2Fsam.rultest2.com&_wpnonce=4698bbdb69']")).submit();


    }

}
