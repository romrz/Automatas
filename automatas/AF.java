package automatas;

import java.util.ArrayList;


/**
 * Superclase para interpretes de Automatas Finitos
 *
 */
public class AF {

    // Counjunto de estados
    protected ArrayList<Integer> Q;
    // Conjunto de simbolos del alfabeto
    protected ArrayList<Character> S;
    // Estado inicial
    protected int q0;
    // Conjunto de estados finales
    protected ArrayList<Integer> F;
    // Funcion de transicion
    protected ArrayList<Transicion> d;

    /**
     * Crea un nuevo automata finito vacio
     */
    public AF() {
	Q = new ArrayList<Integer>();
	S = new ArrayList<Character>();
	int q0 = 0;
	d = new ArrayList<Transicion>();
	F = new ArrayList<Integer>();
    }

    /**
     * Crea un nuevo automata finito descrito por
     * Q, S, q0, d, F en forma de listas
     *
     * @param Q Estados del Automata
     * @param S Alfabeto
     * @param q0 Estado Inicial
     * @param d Funcion de transicion
     * @param F Estados Finales
     */
    public AF(ArrayList<Integer> Q, ArrayList<Character> S, int q0, ArrayList<Transicion> d, ArrayList<Integer> F) {
	
	this.Q = Q;
	this.S = S;
	this.q0 = q0;
	this.F = F;
	this.d = d;

    }

   /**
     * Crea un nuevo automata finito descrito por
     * Q, S, q0, d, F en forma de Cadenas de texto
     *
     * @param Q Estados del Automata. Numeros enteros deparados por espacios.
     * @param S Alfabeto. Caracteres separados por espacios.
     * @param q0 Estado Inicial. Entero perteneciente a Q.
     * @param d Funcion de transicion. Transiciones de la forma (q, s) separadas por espacios.
     * @param F Estados Finales. Numeros enteros separados por espacios pertenecientes a Q.
     */
    public AF(String Q, String S, int q0, String d, String F) {
	this();

	setEstadoInicial(q0);

	String tokens[] = Q.split(" ");
	for(String q : tokens)
	    addEstado(Integer.parseInt(q));

	tokens = S.split(" ");
	for(String s : tokens)
	    addSimbolo(s.charAt(0));

	tokens = F.split(" ");
	for(String q : tokens)
	    addEstadoFinal(Integer.parseInt(q));

	tokens = d.split(" ");
	for(String t : tokens)
	    addTransicion(new Transicion(t));

    }

    public void addEstado(int q) {
	Q.add(q);
    }

    public void addEstadoFinal(int q) {
	F.add(q);
    }

    public void addTransicion(Transicion t) {
	d.add(t);
    }

    public void addSimbolo(char s) {
	S.add(s);
    }
    
    public void setEstadoInicial(int q) {
	q0 = q;
    }

    /**
     * Verifica si el automata reconoce la entrada
     *
     * @param entrada Una cadena de entrada
     *
     * @return True si se reconoce la entrada, false si no
     */
    public boolean reconoce(String entrada) {
	return false;
    }

}
