package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Vehiculo {
    public String modelo;
    public String marca;
    
    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static void mostrarMensaje (String mensaje) {
        System.out.println(mensaje);
    }    

    public static int ingresarEntero(String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }
}
