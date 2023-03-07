package Argentina_Programa.clase_3;

public class LetraRepetida {

    public static void main(String[] args) {
        //Palabra y letra
        String palabra = "oportuno";
        char caracter = 'o';

        //Variables de cantidad de repeticiones, longitud de la palbra, array de caracteres
        int rep = 0;
        int longitud = palabra.length();
        char[] caracteres;
        caracteres = new char[longitud];

        //Se arma el array con los caracteres de la palabra
        for (int x = 0; x<longitud; x++){
            caracteres[x] = palabra.charAt(x);
        }

        //Se cuenta en 'rep' cuantas veces se repite la letra
        for (int i = 0; i<longitud; i++){
            if (caracteres[i] == caracter) {
                rep++;
            }
        }

        //Respuesta
        System.out.println("La letra \""+ caracter + "\" se repite " + rep + " veces en la palabra \"" + palabra + "\"" );
    }
}
