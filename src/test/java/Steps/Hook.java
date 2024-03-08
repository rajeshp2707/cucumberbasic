package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by raj .
 */
public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

        System.out.println("Opening the browser : Firefox");

        //Passing a dummy WebDriver instance step info
     //  base.StepInfo = "FirefoxDriver";
        
       System.setProperty("webdriver.chrome.driver","c:\\libs\\chromedriver.exe");
    
        WebDriver driver = new ChromeDriver();
 
        // Maximize the browser
        driver.manage().window().maximize();
     driver.get("");
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }

}
