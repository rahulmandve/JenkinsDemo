package jdemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDem {
	@Test
	public void testJenkin()
	{
		System.out.println("welcome to jenkin");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.facebook.com");
		System.out.println(d.getTitle());
		d.quit();
	}

}
  