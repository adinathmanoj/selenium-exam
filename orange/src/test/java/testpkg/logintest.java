package testpkg;

import org.testng.annotations.Test;

import orangebase.base;


public class logintest extends base {
	@Test
	public void login_verification()
	{
		loginobj.loginmthd("Admin", "admin123");
	}

}
