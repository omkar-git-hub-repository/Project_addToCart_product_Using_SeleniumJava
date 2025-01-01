package baseClass;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Add_to_cart_extentReport implements ITestListener {

    public ExtentSparkReporter sparkReporter; // UI of the report
    public ExtentReports extent; // Populate common info on the report
    public ExtentTest test; // Creating test case entries in the report and updating status

    @Override
    public void onStart(ITestContext context) {
        // Configure the ExtentSparkReporter
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/Testdata/myReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report"); // Title of the report
        sparkReporter.config().setReportName("Functional Testing"); // Name of the report
        sparkReporter.config().setTheme(Theme.DARK); // Report theme

        // Initialize ExtentReports and attach the SparkReporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Set system information for the report
        extent.setSystemInfo("Computer Name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Omkar");
        extent.setSystemInfo("OS", "Windows10");
        extent.setSystemInfo("Browser Name", "Chrome");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(Status.PASS, "Test case PASSED is: " + result.getName()); // Log success status
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(Status.FAIL, "Test case FAILED is: " + result.getName()); // Log failure status
        test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); // Log failure cause
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(Status.SKIP, "Test case SKIPPED is: " + result.getName()); // Log skip status
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush(); // Write everything to the report
    }
}
