package Argentina_Programa.clase_3;

public class Numeros {

    public static void main(String[] args) {
        int a = 717;
        int b = 9;
        int c = 78;
        String orden = "ascendente";
        
        int[] desordenado;
        desordenado = new int[3];
        desordenado[0] = a;
        desordenado[1] = b;
        desordenado[2] = c; 
        if (desordenado[1]<desordenado[0]) {
            int x = desordenado[0];
            desordenado[0] = desordenado[1];
            desordenado[1] = x;
        }
        if (desordenado[2]<desordenado[1]) {
            int y = desordenado[1];
            desordenado[1] = desordenado[2];
            desordenado[2] = y;
        }
        if (desordenado[1]<desordenado[0]) {
            int z = desordenado[0];
            desordenado[0] = desordenado[1];
            desordenado[1] = z;
        }
        if (orden=="ascendente") {
            System.out.println(desordenado[0]);
            System.out.println(desordenado[1]);
            System.out.println(desordenado[2]);
        } else {
            System.out.println(desordenado[2]);
            System.out.println(desordenado[1]);
            System.out.println(desordenado[0]);
        }
        
    }
}
