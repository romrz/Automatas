package automatas;

import java.util.Stack;

/**
 * Representa una transicion en la funcion de transicion
 * de la forma (qi, s, qf).
 * Donde qi es el estado de origen, s es el simbolo
 * y qf es el estado siguiente
 */
public class Transicion {
    
    // Estado inicial o de origen
    protected int qi;
    // Simbolo de entrada
    protected char s;
    // Estado siguiente
    protected int qf;

    public Transicion() {}

    /**
     * Crea una nueva transicion
     *
     * @param qi Estado origen
     * @param s Simbolo de entrada
     * @param qf Estado siguiente
     */
    public Transicion(int qi, char s, int qf) {
	this.qi = qi;
	this.s = s;
	this.qf = qf;
    }

    /**
     * Crea una nueva transicion
     *
     * @param t Cadena que representa una transicion. De la forma (qi,s,qf)
     */
    public Transicion(String t) {
	
	String tokens[] = t.substring(1, t.length() - 1).split(",");

	qi = Integer.parseInt(tokens[0]);
	s = tokens[1].equals("lambda") ? AFNL.LAMBDA : tokens[1].charAt(0);
	qf = Integer.parseInt(tokens[2]);
    }

    public int obtenerEstadoSiguiente(int q, char si) {
	return qi == q && s == si ? qf : 0;
    }

}
