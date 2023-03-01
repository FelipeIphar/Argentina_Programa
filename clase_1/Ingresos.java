public class Ingresos {

    // instance fields de nombre, ingresos, vehicuos, inmuebles y activos de lujo
    String nombre;
    double ingresosMensuales;
    int vehiculos;
    int inmuebles;
    boolean activoLujoso;

    // constructor
    public Ingresos( String name, double ingr, int automovil, int cantInmuebles, boolean lujos) {
        nombre = name;
        ingresosMensuales = ingr;
        vehiculos = automovil;
        inmuebles = cantInmuebles;
        activoLujoso = lujos;
    }

    // funcion que determina si pertenece al sector de ingresos altos
    public void esIngresosAltos() {

        if (ingresosMensuales >= 489083 || vehiculos >=3 || inmuebles >= 3 || activoLujoso == true) {
            System.out.println(nombre + " pertenece al segmento de ingresos altos");
        } else {
            System.out.println(nombre + " no pertenece al segmento de ingresos altos");
        }
    }

    public static void main(String[] args) {
        Ingresos martin = new Ingresos("Martin Serrano", 674489, 1, 1, false);
        martin.esIngresosAltos();
        Ingresos patricia = new Ingresos("Patricia Sosa", 127582, 2, 2, false);
        patricia.esIngresosAltos();
    }
}
