package com.intiformation.sonar.demo;

import static org.junit.Assert.*;
import org.junit.Test;



public class CalculatorTest {

	@Test
	public void testAdd() {
		Calcultaor calcultaor = new Calcultaor();
				assertEquals("est ce que la valeur est correcte", 10, calcultaor.add(5, 5));
	}

	@Test
	public void testMul() {
		Calcultaor calcultaor = new Calcultaor();
		assertEquals("est ce que la valeur est correcte", 10, calcultaor.mul(2, 5));
	}

}
