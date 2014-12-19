package automatas;

import java.util.ArrayList;

public class PruebaAFD {

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
	Q.add(7);
	Q.add(8);

	S.add('+');
	S.add('-');
	S.add('.');
	S.add('e');
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
	
	F.add(3);
	F.add(4);
	F.add(5);
	F.add(8);

	d.add(new Transicion(1, '+', 2));
	d.add(new Transicion(1, '-', 2));
	d.add(new Transicion(1, '0', 3));
	d.add(new Transicion(1, '1', 3));
	d.add(new Transicion(1, '2', 3));
	d.add(new Transicion(1, '3', 3));
	d.add(new Transicion(1, '4', 3));
	d.add(new Transicion(1, '5', 3));
	d.add(new Transicion(1, '6', 3));
	d.add(new Transicion(1, '7', 3));
	d.add(new Transicion(1, '8', 3));
	d.add(new Transicion(1, '9', 3));

	d.add(new Transicion(2, '0', 3));
	d.add(new Transicion(2, '1', 3));
	d.add(new Transicion(2, '2', 3));
	d.add(new Transicion(2, '3', 3));
	d.add(new Transicion(2, '4', 3));
	d.add(new Transicion(2, '5', 3));
	d.add(new Transicion(2, '6', 3));
	d.add(new Transicion(2, '7', 3));
	d.add(new Transicion(2, '8', 3));
	d.add(new Transicion(2, '9', 3));

	d.add(new Transicion(3, '0', 3));
	d.add(new Transicion(3, '1', 3));
	d.add(new Transicion(3, '2', 3));
	d.add(new Transicion(3, '3', 3));
	d.add(new Transicion(3, '4', 3));
	d.add(new Transicion(3, '5', 3));
	d.add(new Transicion(3, '6', 3));
	d.add(new Transicion(3, '7', 3));
	d.add(new Transicion(3, '8', 3));
	d.add(new Transicion(3, '9', 3));
	d.add(new Transicion(3, '.', 4));	

	q0 = 1;

	AFD a = new AFD(Q, S, q0, d, F);

	System.out.println(a.reconoce("11w111111111"));

    }

}
