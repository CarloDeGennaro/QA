package qaAlpian;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.qaAlpian.UpdateComputer;
import classes.qaAlpian.util.LoginLocal;
import classes.qaAlpian.util.Logout;
import classes.qaAlpian.util.Set;

public class UpdateComputerJunit extends Set {

	@BeforeClass
	public static void BeforeClass() throws Exception {

		Set set = new Set();
		set.SetMethod();
	}

	@Before

	public void Before() throws Exception {

		LoginLocal login = new  LoginLocal(); 
		login.setUp(driver, wait);

	}

	@Test
	public void test() throws Exception {

		UpdateComputer pc = new UpdateComputer();
		pc.UpdateComputerMethod(driver, wait);

		Logout logout = new Logout();
		logout.logout(driver, wait);

	}

}

