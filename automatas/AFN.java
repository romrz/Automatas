package automatas;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


/**
 * Interprete de Automatas Finitos No Deterministas
 *
 */
public class AFN extends AF {

    private Set<Integer> estadosActuales;
    private Set<Integer> estadosAuxiliar;

    /**
     * Construye un nuevo automata finito no determinista
     *
     * @param Q Estados del Automata
     * @param S Alfabeto
     * @param q0 Estado Inicial
     * @param d Funcion de transicion
     * @param F Estados Finales
     */
    public AFN(ArrayList<Integer> Q, ArrayList<Character> S, int q0, ArrayList<Transicion> d, ArrayList<Integer> F) {
	super(Q, S, q0, d, F);

	estadosActuales = new HashSet<Integer>();
	estadosAuxiliar = new HashSet<Integer>();
    }

    /**
     * Verifica si el automata reconoce la entrada
     *
     * @param entrada Una cadena de entrada
     *
     * @return True si se reconoce la entrada, false si no
     */
    @Override
    public boolean reconoce(String entrada) {
	
	char simbolos[] = entrada.toCharArray();
	
	estadosActuales.clear();
	estadosActuales.add(q0);

	for(char s : simbolos) {

	    estadosAuxiliar.clear();

	    for(int q : estadosActuales)
		if(q != 0)
		    transita(q, s);

	    estadosActuales.clear();
	    estadosActuales.addAll(estadosAuxiliar);
	}

	boolean acepta = false;
	for(int q : estadosActuales)
	    if( (acepta = F.contains(q)) == true )
		break;

	return acepta;
    }

    /**
     * Transita de un estado a varios y los almacena en estadosAuxiliar
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
		estadosAuxiliar.add(qf);

	return qf;
    }
}
