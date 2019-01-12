package springjdbcmvcmmbank;

import java.util.List;

import org.junit.Test;

import com.cg.app.account.SavingsAccount;
import com.cg.app.account.service.SavingsAccountService;
import com.cg.app.account.service.SavingsAccountServiceImpl;

public class SavingsAccountTest {

	//private SavingsAccount savingsAccount;
	private SavingsAccountService savingsAccountservice = new SavingsAccountServiceImpl();

	/*
	 * @Before public void setUp() { savingsAccountservice = new
	 * SavingsAccountServiceImpl();
	 * 
	 * }
	 */

	@Test
	public void testForCreatingAnAccount() {
		//System.out.println(12345);
		List<SavingsAccount> accountList = savingsAccountservice.getAllSavingsAccount();
		// System.out.println(balance);
	}

}
