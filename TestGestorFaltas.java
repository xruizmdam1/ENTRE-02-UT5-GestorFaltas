/**
 * Punto de entrada a la aplicaci�n
 * @author - Xabier Ruiz Melero
 */
public class TestGestorFaltas {
    /**
     * Se acepta como argumento del main() el n� m�ximo de estudiantes
     * y una vez creado el gestor de faltas se muestra la informaci�n solicitada
     * (ver enunciado)
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("�Error en la sintaxis! (java TestGestorFaltas 'n� estudiantes')");
        }
        else {
            GestorFaltas GF = new GestorFaltas(Integer.parseInt(args[0]));
            GF.leerDeFichero();
            GF.ordenar();
        }
    }
}