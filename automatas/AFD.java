package automatas;

import java.util.ArrayList;


/**
 * Interprete de Automatas Finitos Deterministas
 *
 */
public class AFD {

    // Counjunto de estados
    private ArrayList<Integer> Q;
    // Conjunto de simbolos del alfabeto
    private ArrayList<Character> S;
    // Estado inicial
    private int q0;
    // Conjunto de estados finales
    private ArrayList<Integer> F;
    // Funcion de transicion
    private ArrayList<Transicion> d;

    /**
     * Construye un nuevo automata finito determinista
     *
     * @param Q Estados del Automata
     * @param S Alfabeto
     * @param q0 Estado Inicial
     * @param d Funcion de transicion
     * @param F Estados Finales
     */
    public AFD(ArrayList<Integer> Q, ArrayList<Character> S, int q0, ArrayList<Transicion> d, ArrayList<Integer> F) {
	
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
	
	char simbolos[] = entrada.toCharArray();
    
	int q = q0;
	for(char s : simbolos)
	    if(q != 0)
		q = transita(q, s);

	return F.contains(q) ? true : false;
    }

    /**
     * Transita de un estado a otro, con un simbolo
     *
     * @param q Estado de origen
     * @param s Simbolo
     *
     * @return El estado siguiente o 0 si no hay una transicion
     */
    private int transita(int q, char s) {

	int qf = 0;

	for(Transicion t : d)
	    if((qf = t.obtenerEstadoSiguiente(q, s)) != 0)
		break;

	return qf;

    }

}
