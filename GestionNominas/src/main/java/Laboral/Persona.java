/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Laboral;
import java.util.*;

/**
 *
 * @author usuario_
 */
public class Persona {

    /**
     * atributos 
     */
    public String nombre;
    public String dni;
    public char sexo;

     /**
      * Constructor con nombre, dni y sexo
      * @param nombre
      * @param dni
      * @param sexo 
      */
    public Persona(String nombre, String dni, char sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
    }
     /**
      * Constructor con nombre y sexo
      * @param nombre
      * @param sexo 
      */
    public Persona(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    /**
     * metodo publico para modificar el dni
     * @param nuevoDni 
     */
    public void setDni(String nuevoDni){
         this.dni  = nuevoDni;
    }
    
    /**
     * metodo publico para imprimir por pantalla el nombre y el dni de la persona
     */
    public void Imprime(){
        System.out.println(nombre + "-"  + dni);
    }
}
