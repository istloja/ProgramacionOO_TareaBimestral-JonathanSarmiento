/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ArchivoLec {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\Buri\\Desktop\\tarea.txt");
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader re = new BufferedReader(lector);
            String linea = "";
            int valor = lector.read();
            while (valor != -1) { //leer por linea el archivo
                if (valor != 32) {
                    System.out.print((char) valor);
                }
                valor = lector.read();
            }
            re.close();//para cerrar el archivo
        } catch (Exception e) {
            System.out.println("ocurrio el error" + e);
        }
    }
}

