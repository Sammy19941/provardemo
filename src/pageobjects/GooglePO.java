package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="GooglePO"                                
     , summary=""
     , relativeUrl=""
     , connection="Google"
     )             
public class GooglePO {

	@LinkType()
	@FindBy(xpath = "//a[text()=\"Sign in\"]")
	public WebElement signIn;
			
}
