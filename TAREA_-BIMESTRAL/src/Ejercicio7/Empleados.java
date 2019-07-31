/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio7;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Empleados {
  private String nombre;
    private int Edad;
    private double salario;
    private int PLUS = 300;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPLUS() {
        return PLUS;
    }

    public void setPLUS(int PLUS) {
        this.PLUS = PLUS;
    }
    
    
    public double plus(){
        return 300;
        
    }
    
    public double comercial (){
        if(Edad > 30){
            salario = salario + 300;
        }
        return salario;
    }
    public boolean repartidor(){
        if(Edad < 25){
            return true;
        } else {
            return false;
        }
    }
    
}
