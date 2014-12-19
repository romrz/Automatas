package automatas;

import java.util.ArrayList;

public class PruebaAFD {

    public static void main(String args[]) {
	
	String Q = "1 2 3 4 5 6 7 8";
	String S = "+ - . e 0 1 2 3 4 5 6 7 8 9";
	String F = "3 4 5 8";
	String d = "(1,+,2) (1,-,2) (1,0,3) (1,1,3) (1,2,3) (1,3,3) (1,4,3) (1,5,3) (1,6,3) (1,7,3) (1,8,3) (1,9,3) (2,0,3) (2,1,3) (2,2,3) (2,3,3) (2,4,3) (2,5,3) (2,6,3) (2,7,3) (2,8,3) (2,9,3) (3,0,3) (3,1,3) (3,2,3) (3,3,3) (3,4,3) (3,5,3) (3,6,3) (3,7,3) (3,8,3) (3,9,3) (3,.,4)";

	int q0 = 1;

	AFD a = new AFD(Q, S, q0, d, F);

	System.out.println(a.reconoce("+-1345346456."));

    }

}
