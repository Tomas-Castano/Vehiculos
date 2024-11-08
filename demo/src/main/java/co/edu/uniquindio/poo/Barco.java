package co.edu.uniquindio.poo;

public class Barco extends Vehiculo implements Acuaticos{
    public Barco (String modelo, String marca) {
        super(modelo, marca);
    }
    @Override
    public void apagar() {
        System.out.println("El motor se ha apagado");
    }

    @Override
    public void encender() {
        System.out.println("El motor se ha encendido");
    }

}
