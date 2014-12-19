package automatas;

/**
 * Representa una transicion en la funcion de transicion
 * de la forma (qi, s, qf).
 * Donde qi es el estado de origen, s es el simbolo
 * y qf es el estado siguiente
 */
public class Transicion {
    
    // Estado inicial o de origen
    private int qi;
    // Simbolo de entrada
    private char s;
    // Estado siguiente
    private int qf;

    /**
     * Construye una nueva transicion
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
    
    public int obtenerEstadoSiguiente(int q, char si) {
	return qi == q && s == si ? qf : 0;
    }

}
