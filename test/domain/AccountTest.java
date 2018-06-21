package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	Account a1 = new Account(12345, 54321, 1000.0, 1200.0);
	
	@Test
	void testValidatePIN() {
		assertEquals(true, a1.validatePIN(54321));
		
	}

	@Test
	void testCredit() {
		
		//assertEquals(a1.getAvailableBalance(),0);
		// ainda não funcionacorretamente
		
	}

	@Test
	void testDebit() {
		fail("Not yet implemented");
	}

}
