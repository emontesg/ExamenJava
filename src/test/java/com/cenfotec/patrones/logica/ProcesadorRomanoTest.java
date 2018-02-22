package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcesadorRomanoTest {

	
	@Test
	public void testStringsValues() {
		ProcesadorRomano proc = new ProcesadorRomano();
		String num = "XVI";
		assertEquals(16, proc.convierte(num));
		
	}
	@Test
	public void testErrorStrings() {
		ProcesadorRomano proc = new ProcesadorRomano();
		String num = "IIII";
		assertEquals(0, proc.convierte(num));
	}
	@Test
	public void testDescendentStrings() {
		ProcesadorRomano proc = new ProcesadorRomano();
		String num = "XXL";
		assertEquals(0, proc.convierte(num));
	}
	@Test
	public void testStringEmpty() {
		ProcesadorRomano proc = new ProcesadorRomano();
		String num = "";
		assertEquals(0, proc.convierte(num));
		
	}
	

}
