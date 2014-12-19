package automatas;

import java.util.ArrayList;


/**
 * Interprete de Automatas Finitos Deterministas
 *
 */
public class AFD extends AF {

    public AFD() {
	super();
    }

    public AFD(String Q, String S, int q0, String d, String F) {
	super(Q, S, q0, d, F);
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
