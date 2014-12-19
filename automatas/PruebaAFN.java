package automatas;

import java.util.ArrayList;

public class PruebaAFN {

    public static void main(String args[]) {

	String Q = "1 2 3 ";
	String S = "0 1";
	String F = "3";
	String d = "(1,0,1) (1,0,2) (1,1,1) (2,1,3)";
	int q0 = 1;

	AF a = new AFN(Q, S, q0, d, F);

	System.out.println(a.reconoce("111000101"));

    }

}
