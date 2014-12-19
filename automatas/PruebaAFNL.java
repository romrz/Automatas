package automatas;

import java.util.ArrayList;

public class PruebaAFNL {

    public static void main(String args[]) {
	
	String Q = "1 2 3 4 5 6";
	String S = "+ - . 0 1 2 3 4 5 6 7 8 9";
	String F = "6";
	String d = "(1,lambda,2) (1,+,2) (1,-,2) (2,.,3) (2,0,2) (2,1,2) (2,2,2) (2,3,2) (2,4,2) (2,5,2) (2,6,2) (2,7,2) (2,8,2) (2,9,2) (2,0,5) (2,1,5) (2,2,5) (2,3,5) (2,4,5) (2,5,5) (2,6,5) (2,7,5) (2,8,5) (2,9,5) (3,0,4) (3,1,4) (3,2,4) (3,3,4) (3,4,4) (3,5,4) (3,6,4) (3,7,4) (3,8,4) (3,9,4) (4,lambda,6) (4,0,4) (4,1,4) (4,2,4) (4,3,4) (4,4,4) (4,5,4) (4,6,4) (4,7,4) (4,8,4) (4,9,4) (5,.,4)";	

	int q0 = 1;

	AF a = new AFNL(Q, S, q0, d, F);

	System.out.println(a.reconoce("+142.23"));

    }

}
