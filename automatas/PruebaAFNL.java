package automatas;

import java.util.ArrayList;

public class PruebaAFNL {

    public static void main(String args[]) {
	
	ArrayList<Integer> Q = new ArrayList<Integer>();
	ArrayList<Character> S = new ArrayList<Character>();
	ArrayList<Integer> F = new ArrayList<Integer>();
	ArrayList<Transicion> d = new ArrayList<Transicion>();
	Integer q0;

	Q.add(1);
	Q.add(2);
	Q.add(3);
	Q.add(4);
	Q.add(5);
	Q.add(6);

	S.add('+');
	S.add('-');
	S.add('.');
	S.add('0');
	S.add('1');
	S.add('2');
	S.add('3');
	S.add('4');
	S.add('5');
	S.add('6');
	S.add('7');
	S.add('8');
	S.add('9');
	
	F.add(6);

	d.add(new Transicion(1, AFNL.LAMBDA, 2));
	d.add(new Transicion(1, '+', 2));
	d.add(new Transicion(1, '-', 2));

	d.add(new Transicion(2, '.', 3));
	d.add(new Transicion(2, '0', 2));
	d.add(new Transicion(2, '1', 2));
	d.add(new Transicion(2, '2', 2));
	d.add(new Transicion(2, '3', 2));
	d.add(new Transicion(2, '4', 2));
	d.add(new Transicion(2, '5', 2));
	d.add(new Transicion(2, '6', 2));
	d.add(new Transicion(2, '7', 2));
	d.add(new Transicion(2, '8', 2));
	d.add(new Transicion(2, '9', 2));

	d.add(new Transicion(2, '0', 5));
	d.add(new Transicion(2, '1', 5));
	d.add(new Transicion(2, '2', 5));
	d.add(new Transicion(2, '3', 5));
	d.add(new Transicion(2, '4', 5));
	d.add(new Transicion(2, '5', 5));
	d.add(new Transicion(2, '6', 5));
	d.add(new Transicion(2, '7', 5));
	d.add(new Transicion(2, '8', 5));
	d.add(new Transicion(2, '9', 5));

	d.add(new Transicion(3, '0', 4));
	d.add(new Transicion(3, '1', 4));
	d.add(new Transicion(3, '2', 4));
	d.add(new Transicion(3, '3', 4));
	d.add(new Transicion(3, '4', 4));
	d.add(new Transicion(3, '5', 4));
	d.add(new Transicion(3, '6', 4));
	d.add(new Transicion(3, '7', 4));
	d.add(new Transicion(3, '8', 4));
	d.add(new Transicion(3, '9', 4));

	d.add(new Transicion(4, AFNL.LAMBDA, 6));
	d.add(new Transicion(4, '0', 4));
	d.add(new Transicion(4, '1', 4));
	d.add(new Transicion(4, '2', 4));
	d.add(new Transicion(4, '3', 4));
	d.add(new Transicion(4, '4', 4));
	d.add(new Transicion(4, '5', 4));
	d.add(new Transicion(4, '6', 4));
	d.add(new Transicion(4, '7', 4));
	d.add(new Transicion(4, '8', 4));
	d.add(new Transicion(4, '9', 4));

	d.add(new Transicion(5, '.', 4));	

	q0 = 1;

	AF a = new AFNL(Q, S, q0, d, F);

	System.out.println(a.reconoce("+12.23"));

    }

}
