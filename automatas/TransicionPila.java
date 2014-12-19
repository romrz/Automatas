package automatas;

import java.util.Stack;

/**
 * Representa una transicion de un automata de pila en la funcion de transicion
 * de la forma (qi, s, z) => (qf, z').
 * Donde qi es el estado de origen, s es el simbolo, z es lo que hay en la pila
 * y qf es el estado siguiente
 */
public class TransicionPila extends Transicion {

    // Simbolo inicialmente en la pila
    private char zi;
    // Simbolo siguiuente en la pila
    private char zf[];

    /**
     * Crea una nueva transicion
     *

     */
    public TransicionPila(int qi, char s, char zi, int qf, String zf) {
	super(qi, s, qf);

	this.zi = zi;
	this.zf = zf.toCharArray();
    }

    /**
     * Crea una nueva transicion
     */
    public TransicionPila(String t) {
	String tokens[] = t.substring(1, t.length() - 1).split(",");

	qi = Integer.parseInt(tokens[0]);
	s = tokens[1].equals("lambda") ? AFNL.LAMBDA : tokens[1].charAt(0);
	zi = tokens[2].charAt(0);
	qf = Integer.parseInt(tokens[3]);
	zf = tokens[4].toCharArray();
    }
    
    public int obtenerEstadoSiguiente(int q, char si, Stack<Character> R) {
	if(qi == q && s == si && zi == R.peek()) {
	    R.pop();
	    for(int i = zf.length - 1; i >= 0; i--)
		R.push(zf[i]);
	    return qf;
	}
	
	return 0;
    }

}
