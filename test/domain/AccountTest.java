package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testValidatePIN() {
		Account conta = new Account(12345, 54321, 1000.0, 1200.0);
		assertEquals(true, conta.validatePIN(54321));
	}

	@Test
	void testCredit() {
		Account aconta = new Account(12345, 54321, 1000.0, 1200.0);
		double valorAdicionado =aconta.getTotalBalance();
		aconta.credit(100);
		assertEquals(valorAdicionado+100,aconta.getTotalBalance());
	}

	@Test
	void testDebit() {
		Account conta = new Account(12345, 54321, 1000.0, 1200.0);
		double valorAdicionado =conta.getTotalBalance();
		conta.debit(100);
		assertEquals(valorAdicionado-100,conta.getTotalBalance());
		
	}

}
