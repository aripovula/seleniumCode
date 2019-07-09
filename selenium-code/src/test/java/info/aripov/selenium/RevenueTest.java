package info.aripov.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class RevenueTest {

	@Test(groups= {"smoke"})
	public void Test1() {
		System.out.println("TEST");
	}

	@Test
	public void Test2() {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("/Users/myfamily/eclipse-workspace/SeleniumInit/data.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		} 
		System.out.println("TEST TWO - prop test = "+prop.getProperty("test"));
	}

}
