package testCases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import baseClass.BaseClass;
import pageObjects.HomePage_addToCart;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;

public class TC_001Product_add_to_cart extends BaseClass {
    
    @Test
    public void addToCartProducts() throws IOException {
        HomePage_addToCart atc = new HomePage_addToCart(driver);
        
        atc.clickSearchBar();
        atc.searchProductName(p.getProperty("ProductName"));
        atc.clkserchbtn();
        
        atc.productlink(); // Step 4: Execute product link action

        // Generate a timestamp
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Capture a screenshot immediately after Step 4
        TakesScreenshot sc1 = (TakesScreenshot) driver;   
        File sourceFile1 = sc1.getScreenshotAs(OutputType.FILE);
        File targetFile1 = new File(System.getProperty("user.dir") + "\\screenshots\\Searched_product_" + timestamp + ".png");

        // Save the first screenshot
        FileUtils.copyFile(sourceFile1, targetFile1);
        System.out.println("Screenshot captured after Step 4 and saved at: " + targetFile1.getAbsolutePath());

        // Continue with remaining steps
        atc.addtocartbtn();
        atc.chkCart();

        // Capture a screenshot after the last step
        TakesScreenshot sc2 = (TakesScreenshot) driver;
        File sourceFile2 = sc2.getScreenshotAs(OutputType.FILE);
        File targetFile2 = new File(System.getProperty("user.dir") + "\\screenshots\\Cart_final_state_" + timestamp + ".png");

        // Save the second screenshot
        FileUtils.copyFile(sourceFile2, targetFile2);
        System.out.println("Screenshot captured after the last step and saved at: " + targetFile2.getAbsolutePath());
    }
}