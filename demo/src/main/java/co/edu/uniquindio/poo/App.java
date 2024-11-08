package co.edu.uniquindio.poo;

/**
 * Hecho por: Tomás Castaño Ortiz, Amerika Esmeralda Giraldo Gonzalez y Nicolas Villegas Gonzalez
 *
 */
public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("1997", "Chevrolet");
        Barco barco = new Barco("1909", "TITANIC");
        Avion avion = new Avion("2000", "F18");
        Xplor xplor = new Xplor("2014", "ATV (All-Terrain Vehicle)");

        
    
    boolean menu= true;
    while (menu) {
        Vehiculo.mostrarMensaje("Bienvenidos: \n");
        int VehiculolSeleccionado= Vehiculo.ingresarEntero("Seleccione un tipo de vehiculo: \n1.Carro \n2.Avion \n3.Barco \n4.Xplor \n");

        switch (VehiculolSeleccionado) {
            case 1:
                Vehiculo.mostrarMensaje("Ha seleccionado el carro");
                mostrarCarroMenu(carro);
                break;
            case 2:
                Vehiculo.mostrarMensaje("Ha seleccionado el avion");
                mostrarAvionMenu(avion);
                break;
            case 3:
                Vehiculo.mostrarMensaje("Ha seleccionado el barco");
                mostrarBarcoMenu(barco);
                break;
            case 4:
                Vehiculo.mostrarMensaje("Ha seleccionado el vehiculo Xplor");
                mostrarXplorMenu(xplor);
                break;
            default:
                Vehiculo.mostrarMensaje("Error, opción no válida.");
                break;
        }
        Vehiculo.mostrarMensaje("--------------------------");
    }
}

public static void mostrarCarroMenu(Carro carro){
    
    boolean continuarMenu= true;
    while(continuarMenu){
        int opciones= Vehiculo.ingresarEntero("\nIndique que hacer con el carro\n1.Avanzar \n2.Retroceder \n3.Girar \n4.Detenerse.\n5. Volver al menu principal");

        switch (opciones) {
            case 1: 
                carro.avanzar();                    
                break;
            case 2:
                carro.retroceder();
                break;
            case 3:
                carro.girar();
                break;
            case 4:
                carro.detenerse();
                break;
            case 5:
                continuarMenu= false;
                Vehiculo.mostrarMensaje("Volviendo al menú principal....");
                break;
            default:
                Vehiculo.mostrarMensaje("Error, opción no válida.");
                break;
        }
   }
}

public static void mostrarAvionMenu(Avion avion){
    
    boolean continuarMenu= true;
    while(continuarMenu){
        int opciones= Vehiculo.ingresarEntero("\nIndique que hacer con el avion\n1.Despegar \n2.Aterrizar \n3.Volver al menu \n");

        switch (opciones) {
            case 1: 
                avion.despegar();                    
                break;
            case 2:
                avion.aterrizar();
                break;
            case 3:
                continuarMenu= false;
                Vehiculo.mostrarMensaje("Volviendo al menú principal....");
                break;
            default:
                Vehiculo.mostrarMensaje("Error, opción no válida.");
                break;
        }
   }
}

public static void mostrarBarcoMenu(Barco barco){
    
    boolean continuarMenu= true;
    while(continuarMenu){
        int opciones= Vehiculo.ingresarEntero("\nIndique que hacer con el barco\n1.Encender \n2.Apagar \n3.Volver al menu \n");

        switch (opciones) {
            case 1: 
                barco.encender();                  
                break;
            case 2:
                barco.apagar();
                break;
            case 3:
                continuarMenu= false;
                Vehiculo.mostrarMensaje("Volviendo al menú principal....");
                break;
            default:
                Vehiculo.mostrarMensaje("Error, opción no válida.");
                break;
        }
   }
}

public static void mostrarXplorMenu(Xplor xplor){
    
    boolean continuarMenu= true;
    while(continuarMenu){
        int opciones= Vehiculo.ingresarEntero("\nIndique que hacer con el Xplor\n1.Avanzar \n2.Retroceder \n3.Girar \n4.Detenerse.\n5.Encender\n6.Apagar\n7.Volver al menu principal\n");

        switch (opciones) {
            case 1: 
                xplor.avanzar();                    
                break;
            case 2:
                xplor.retroceder();
                break;
            case 3:
                xplor.girar();
                break;
            case 4:
                xplor.detenerse();
                break;
            case 5:
                xplor.encender();
            case 6:
                xplor.apagar();
            case 7:
                continuarMenu= false;
                Vehiculo.mostrarMensaje("Volviendo al menú principal....");
                break;
            default:
                Vehiculo.mostrarMensaje("Error, opción no válida.");
                break;
        }
   }
}

}

