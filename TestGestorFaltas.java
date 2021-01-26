/**
 * Punto de entrada a la aplicación
 * @author - Xabier Ruiz Melero
 */
public class TestGestorFaltas {
    /**
     * Se acepta como argumento del main() el nº máximo de estudiantes
     * y una vez creado el gestor de faltas se muestra la información solicitada
     * (ver enunciado)
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("¡Error en la sintaxis! (java TestGestorFaltas 'nº estudiantes')");
        }
        else {
            GestorFaltas GF = new GestorFaltas(Integer.parseInt(args[0]));
            GF.leerDeFichero();
            GF.ordenar();
        }
    }
}