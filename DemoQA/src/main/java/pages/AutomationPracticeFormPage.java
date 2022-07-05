package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeFormPage extends Page {

	By txtFirstName = By.id("firstName");
public AutomationPracticeFormPage (WebDriver dr) {
	super(dr);
	this.driverWeb = dr;
} 

public void inputFirstName(String firstName) {
	driverWeb.findElement(txtFirstName).sendKeys("abcc");
}

}
