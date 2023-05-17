package apptes;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class test {

	
		// TODO Auto-generated method stub
		static AppiumDriver<MobileElement> driver;
		
		
		public static void main(String[]args) throws Exception {
			
			DesiredCapabilities cap= new DesiredCapabilities();
			
			cap.setCapability("deviceName","pixel 5 Api 31");
			cap.setCapability("udid","emulator-5554");
			cap.setCapability("platformName","Android");
			cap.setCapability("platformVersion","12");
			
			
			cap.setCapability("appPackage","com.google.android.youtube");
			cap.setCapability("appActivity","com.google.android.youtube.MainActivity");
			
//			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver= new AppiumDriver<MobileElement>(url,cap);
		}

	}


