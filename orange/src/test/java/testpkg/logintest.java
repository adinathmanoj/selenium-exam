package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;
import orangebase.base;

public class logintest extends base {
	@Test(priority=1)
	public void titleverification() {
		String actualtilte=loginobj.titlemthd();
		Assert.assertEquals(actaultile, "OrangeHRM");
	}

    @Test
    public void loginvalidation(priority=2) {

        loginobj.loginmthd("Admin", "admin123");

    }

}