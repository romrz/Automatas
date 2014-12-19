package automatas;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


/**
 * Interprete de Automatas Finitos No Deterministas
 * con trnasiciones Lambda
 *
 */
public class AFNL extends AF {

    // Constante para representar lambda
    public static final char LAMBDA = 0;

    private Set<Integer> estadosActuales;
    private Set<Integer> estadosAuxiliar;
    private Set<Integer> auxiliarClausuraLambda;

    public AFNL() {
	super();
    }    

    public AFNL(ArrayList<Integer> Q, ArrayList<Character> S, int q0, ArrayList<Transicion> d, ArrayList<Integer> F) {
	super(Q, S, q0, d, F);

	estadosActuales = new HashSet<Integer>();
	estadosAuxiliar = new HashSet<Integer>();
	auxiliarClausuraLambda = new HashSet<Integer>();
    }

    public AFNL(String Q, String S, int q0, String d, String F) {
	super(Q, S, q0, d, F);

	estadosActuales = new HashSet<Integer>();
	estadosAuxiliar = new HashSet<Integer>();
	auxiliarClausuraLambda = new HashSet<Integer>();
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
	
	auxiliarClausuraLambda.clear();
	clausuraLambda(q0);

	estadosActuales.clear();
	estadosActuales.addAll(auxiliarClausuraLambda);
	// Clausura lambda
	for(char s : simbolos) {

	    estadosAuxiliar.clear();

	    // Transiciones de los estados con el simbolo
	    for(int q : estadosActuales)
		if(q != 0)
		    transita(q, s);

	    auxiliarClausuraLambda.clear();
	    for(int q : estadosAuxiliar)
		clausuraLambda(q);

	    estadosActuales.clear();
	    estadosActuales.addAll(auxiliarClausuraLambda);
	    // Clausura lambda de los estados
	}

	boolean acepta = false;
	for(int q : estadosActuales)
	    if( (acepta = F.contains(q)) == true )
		break;

	return acepta;
    }

    /**
     * Obtiene la clausura lamda de un estado
     * y almacena el conjunto resultante en 
     * auxiliarClausuraLambda
     *
     * @param q El estado
     */
    private void clausuraLambda(int q) {
	
	int qf;
	for(Transicion t : d)
	    if((qf = t.obtenerEstadoSiguiente(q, LAMBDA)) != 0)
		clausuraLambda(qf);

	auxiliarClausuraLambda.add(q);
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
