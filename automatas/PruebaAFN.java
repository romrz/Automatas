package automatas;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAFN {

    public static void main(String args[]) {

	String Q = "1 2 3 ";
	String S = "0 1";
	String F = "3";
	String d = "(1,0,1) (1,0,2) (1,1,1) (2,1,3)";
	int q0 = 1;

	AF a = new AFN(Q, S, q0, d, F);

	Scanner s = new Scanner(System.in);
	String entrada = null;

	System.out.println("Automata que reconoce cadenas de 0's y 1's que terminan con 01");
	System.out.print("Introduce una cadena: ");
	
	while((entrada = s.next()).equals("exit") == false) {
	    System.out.println(a.reconoce(entrada) ? "Aceptado" : "No aceptado");
	    System.out.print("Introduce una cadena: ");
	}

    }

}
