package salvando_walle;

/***
 * En esta clase de Walle se comprueban sus movimientos, se guardan y se ejectutan sus instrucciones, además se guarda el destino al que debe llegar.
 * @author Hugo
 * @version 1.1
 *
 */
public class WallE {

    private boolean isDestino = true;

    private boolean isMovimientoValido = true;

    private Instrucciones[] instruccion = new Instrucciones[40];

    private int destinoX;

    private int destinoY;


    public WallE() {

    }

    /***
     * Este método tiene como objetivo el comprobar si el movimiento realizado llevó a WallE a su destino
     * @return Se retorna true si ya se ha llegado al destino y false en caso contrario
     */
    public boolean comprobarDestino(int x , int y) {
        if (x == getDestinoX() && y == getDestinoY()){
            return isDestino;
        }
        else{
            return false;
        }
    }

    /***
     * El metodo se encarga de realizar una comprobación de la "integridad" de WallE, por si sale de los limites o
     * si tocó una bomba
     * @return Se retorna true si el movimiento es valido (No es una bomba o limite) y false en caso contrario
     * @param posicionWE
     * @param limite
     */
    public boolean comprobarValidez(int posicionWE, int limite) {
        if (posicionWE < 0 || posicionWE > limite){
            System.out.println("X");
            System.out.println("Datos de la falla: Fuera de los limites");
            System.exit(0);
        }
        return isMovimientoValido;
    }

    /***
     * Este método se encarga de hacer las acciones dadas por el archivo, cambiando la posición y/o orientacion de WallE
     * @param ordenActual Es un entero que indica la instruccion a realizar, dada por un orden numérico
     *
     */
    public char ejecutarInstruccion(int ordenActual) {
        return instruccion[ordenActual].getInstruccion();
    }

    /***
     * Este metodo se encarga de cargar las instrucciones en la colleción de instrucciones
     * @param orden Es un int que indica el orden numerico actual de la orden a cargar
     * @param accion Es el char que contiene la instrucción (I, D o A)
     */
    public void cargarInstrucciones(int orden, char accion){
        instruccion[orden] = new Instrucciones(accion);
    }

    public void setDestinoX(int pX){
        this.destinoX = pX;
    }
    public void setDestinoY(int pY){
        this.destinoY = pY;
    }
    public int getDestinoX(){
        return destinoX;
    }
    public int getDestinoY(){
        return  destinoY;
    }
}
