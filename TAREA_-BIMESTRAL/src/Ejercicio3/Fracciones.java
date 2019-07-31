package Ejercicio3;

import java.util.Scanner;

public class Fracciones {

    private int num;
    private int den;

    public Fracciones() {
    }

    public Fracciones(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public void mostrar_datos() {
        System.out.println(num / den);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fracciones objeto = new Fracciones();
        System.out.println("Ingrese el numerador");
        objeto.setNum(entrada.nextInt());
        System.out.println("Ingrese el denominador");
        objeto.setDen(entrada.nextInt());
        objeto.mostrar_datos();
    }
}
