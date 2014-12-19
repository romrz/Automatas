package automatas;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Superclase para interpretes de Automatas  de Pila
 *
 */
public class AP {

    // Counjunto de estados
    protected ArrayList<Integer> Q;
    // Conjunto de simbolos del alfabeto
    protected ArrayList<Character> S;
    // Conjunto de simbolos del alfabeto de la pila
    protected ArrayList<Character> R;
    // Estado inicial
    protected int q0;
    // Funcion de transicion
    protected ArrayList<Transicion> d;
    // Simbolo inicial de la pila
    protected char z0;
    // Conjunto de estados finales
    protected ArrayList<Integer> F;

    // Pila
    protected Stack<Character> pila;

    /**
     * Crea un nuevo automata de pila vacio
     */
    public AP() {
	Q = new ArrayList<Integer>();
	S = new ArrayList<Character>();
	R = new ArrayList<Character>();
	d = new ArrayList<Transicion>();
	F = new ArrayList<Integer>();

	int q0 = 0;
	char z0 = 0;

	pila = new Stack<Character>();
    }

   /**
     * Crea un nuevo automata finitbo descrito por
     * Q, S, R, q0, d, z0, F en forma de Cadenas de texto
     *
     * @param Q Estados del Automata. Numeros enteros deparados por espacios.
     * @param S Alfabeto. Caracteres separados por espacios.
     * @param R Alfabeto de la pila. Caracteres separados por espacios
     * @param q0 Estado Inicial. Entero perteneciente a Q.
     * @param d Funcion de transicion. Transiciones de la forma (q, s) separadas por espacios.
     * @param z0 Simbolo inicial de la pila. Caracter
     * @param F Estados Finales. Numeros enteros separados por espacios pertenecientes a Q.
     */
    public AP(String Q, String S, String R, int q0, String d, char z0, String F) {
	this();

	String tokens[] = Q.split(" ");
	for(String q : tokens)
	    addEstado(Integer.parseInt(q));

	tokens = S.split(" ");
	for(String s : tokens)
	    addSimbolo(s.charAt(0));

	tokens = R.split(" ");
	for(String z : tokens)
	    addSimboloPila(z.charAt(0));

	tokens = F.split(" ");
	for(String q : tokens)
	    addEstadoFinal(Integer.parseInt(q));

	tokens = d.split(" ");
	for(String t : tokens)
	    addTransicion(new TransicionPila(t));

	setEstadoInicial(q0);
	setSimboloInicial(z0);

    }

    public void addEstado(int q) {
	Q.add(q);
    }

    public void addEstadoFinal(int q) {
	F.add(q);
    }

    public void setEstadoInicial(int q) {
	q0 = q;
    }

    public void addTransicion(Transicion t) {
	d.add(t);
    }

    public void addSimbolo(char s) {
	S.add(s);
    }
    
    public void addSimboloPila(char s) {
	R.add(s);
    }
    
    public void setSimboloInicial(char z) {
	z0 = z;
	pila.clear();
	pila.push(z);
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
