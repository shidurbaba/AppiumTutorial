import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) throws MalformedURLException {
		File filepath = new File("AppDemo");
		File fileObj = new File(filepath, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestMachine01");
		cap.setCapability(MobileCapabilityType.APP, fileObj.getAbsolutePath());
		
		URL link = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(link,cap);
		
	}

}
