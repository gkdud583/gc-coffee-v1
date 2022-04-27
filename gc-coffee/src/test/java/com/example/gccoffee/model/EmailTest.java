package com.example.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
	@Test
	public void testInvalidEmail() {
		assertThrows(IllegalArgumentException.class, () -> {
			Email acccccc = new Email("acccccc");
		});

	}

	@Test
	public void testValidEmail() {
		Email email = new Email("acccccc@gmail.com");
		assertTrue(email.getAddress().equals("acccccc@gmail.com"));

	}

	@Test
	public void testEqEmail() {
		Email email1 = new Email("acccccc@gmail.com");
		Email email2 = new Email("acccccc@gmail.com");
		assertEquals(email1, email2);

	}

}