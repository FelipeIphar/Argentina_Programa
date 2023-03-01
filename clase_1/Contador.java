public class Contador {
    // instance fields de comienzo y final
    int inicio;
    int fin;

    // constructor
    public Contador(int comienzo, int cierre) {
        inicio = comienzo;
        fin = cierre;
    }

    // funcion
    public void contar () {
        for (int x = fin; x>=inicio; x--) {
            System.out.println(x);
        }


    }

    public static void main(String[] args) {
        Contador intento1 = new Contador (1,10);
        intento1.contar();
    }
}
