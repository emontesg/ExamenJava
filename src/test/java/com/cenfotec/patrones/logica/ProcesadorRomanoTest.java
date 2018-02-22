package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	@Test
	public void testStringEmpty() {
		ProcesadorRomano proc = new ProcesadorRomano();
		String num = "";
		assertEquals(0, proc.convierte(num));
		
	}
	@Test
	public void testStringsValues() {
		ProcesadorRomano proc = new ProcesadorRomano();
		String num = "I";
		assertEquals(1, proc.convierte(num));
		
	}
	@Test
	public void testErrorStrings() {
		ProcesadorRomano proc = new ProcesadorRomano();
		String num = "IIII";
		assertEquals("error", proc.convierte(num));
	}

}
