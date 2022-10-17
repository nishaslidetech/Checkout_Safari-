package setupClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;





public class TakeImageStep extends BaseClass {
	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {

			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	//		scenario.(screenshot, "image/png");
			scenario.attach(screenshot, "image/png", "Failed ScreenShot");
		}
	}
}