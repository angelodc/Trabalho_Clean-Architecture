package persistence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class BankDatabaseTest {
	BankDatabase banco = new BankDatabase();

	@Test
	void testAuthenticateUserPass() {

		assertEquals(true, banco.authenticateUser(12345, 54321));
	}

	@Test
	void testAuthenticateUserDontPass() {
		assertEquals(false, banco.authenticateUser(00000, 54321));
	}

	@Test
	void testAuthenticatePinDontPass() {
		assertEquals(false, banco.authenticateUser(12345,000000));
	}

}
