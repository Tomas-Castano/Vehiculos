package co.edu.uniquindio.poo;

public class Xplor extends Vehiculo implements Terrestres, Acuaticos{
    public Xplor (String modelo, String marca) {
        super(modelo, marca);
    }
    @Override
    public void avanzar() {
        System.out.println("Broom broom");
    }

    public void retroceder() {
        System.out.println("Raum Raum");
    }

    public void girar() {
        System.out.println("Estoy dando un giro");
    }

    public void detenerse() {
        System.out.println("Los frenos funcionaron, nos hemos detenido");
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