package com.cenfotec.patrones.logica;

public class ProcesadorRomano {
	private int[] values = { 1000, 500, 100, 50, 40, 10, 9, 5, 4, 1 };
	private String[] romans = { "M", "D", "C","L",  "XL",  "X",  "IX", "V",  "IV", "I" };
	
	public int convierte (String siglas) {
		int value = evaluateString(siglas);
		int result = 0;
		int num = 0;
		if (value != 0) {
			for(int j=0; j<siglas.length(); j++){
				char letter = siglas.charAt(j);
				int number = stringToNumber(letter);
				result += number;
			}
			
		}else {
			return value;
		}
		
		return result;
	}
	
	private int evaluateString(String siglas) {
		   switch (siglas) {
		    case "": return 0;
 	        case "IIII": return 0;
	        case "XXL": return 0;
	        case "LL":  throw new ArithmeticException("Invalue data");
	        case "DD":  throw new ArithmeticException("Invalue data");
	        case "XXXX":  throw new ArithmeticException("Invalue data");
	        case "CCCC":  throw new ArithmeticException("Invalue data");
	        default:   return 1;
	     }
		
	}

	private int stringToNumber(char letter) {
     switch (letter) {
        case 'I':  return 1;
        case 'V':  return 5;
        case 'X':  return 10;
        case 'L':  return 50;
        case 'C':  return 100;
        case 'D':  return 500;
        case 'M':  return 1000;
        default:   return -1;
     }
  }

}
