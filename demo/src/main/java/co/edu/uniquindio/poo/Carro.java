package co.edu.uniquindio.poo;

public class Carro extends Vehiculo implements Terrestres{

    public Carro (String modelo, String marca) {
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
}
