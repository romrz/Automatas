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
     * Construye un nuevo automata finito determinista
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
