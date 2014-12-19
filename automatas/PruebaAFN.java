package automatas;

import java.util.ArrayList;

public class PruebaAFN {

    public static void main(String args[]) {
	
	ArrayList<Integer> Q = new ArrayList<Integer>();
	ArrayList<Character> S = new ArrayList<Character>();
	ArrayList<Integer> F = new ArrayList<Integer>();
	ArrayList<Transicion> d = new ArrayList<Transicion>();
	int q0;

	Q.add(1);
	Q.add(2);
	Q.add(3);

	S.add('0');
	S.add('1');
	
	F.add(3);

	d.add(new Transicion(1, '0', 1));
	d.add(new Transicion(1, '0', 2));
	d.add(new Transicion(1, '1', 1));
	d.add(new Transicion(2, '1', 3));

	q0 = 1;

	AF a = new AFN(Q, S, q0, d, F);

	System.out.println(a.reconoce("111101"));

    }

}
