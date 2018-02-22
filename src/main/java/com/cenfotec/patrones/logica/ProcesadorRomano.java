package com.cenfotec.patrones.logica;

public class ProcesadorRomano {
	private int[] values = { 1000, 500, 100, 50, 40, 10, 9, 5, 4, 1 };
	private String[] romans = { "M", "D", "C","L",  "XL",  "X",  "IX", "V",  "IV", "I" };
	
	public int convierte (String siglas) {
		if(siglas == "") {
			return 0;
		}
		return 0;
	}
	
	private int stringToNumber(String letter) {
     switch (letter) {
        case "I":  return 1;
        case "V":  return 5;
        case "X":  return 10;
        case "L":  return 50;
        case "C":  return 100;
        case "D":  return 500;
        case "M":  return 1000;
        default:   return -1;
     }
  }

}
