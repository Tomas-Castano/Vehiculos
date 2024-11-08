package co.edu.uniquindio.poo;

public class Avion extends Vehiculo implements Aereos{
    public Avion (String modelo, String marca) {
        super(modelo, marca);
    }
    @Override
    public void despegar() {
        System.out.println("Comenzamos a despegar");
    }

    public void aterrizar() {
        System.out.println("Estamos aterrizando, permanezca en sus asientos");
    }
}
