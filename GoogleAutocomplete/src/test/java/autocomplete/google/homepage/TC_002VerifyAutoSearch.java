package autocomplete.google.homepage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import autocomplete.google.base.Base;
import autocomplete.google.page.Homepage;

public class  TC_002VerifyAutoSearch extends Base {

	Homepage home;
	@BeforeTest
	private void setUP() {
		init();
	}
	@Test
	public void searchForSelenium() {
		home.searchFor("selenium");
	}
	public static void main(String[] args) {
		
	}
}
