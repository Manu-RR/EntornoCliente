/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboral;


public class Empleado extends Persona {
    /**
     * Atributos privados
     */
    private int categoria; //valor de 1 a 10
    private int anyos; //debe ser positivo
    
     /**
      * Constructor con nombre, dni y sexo con super ya que es de la clase que extiende
      * Tambien inicializamos categoria a 1 y años a 0
      * @param nombre
      * @param dni
      * @param sexo 
      */
    public Empleado(String nombre, String dni, char sexo) {
        super(nombre, dni, sexo);
        this.categoria = 1;
        this.anyos = 0;
    }

   
    /**
     * Constructor con todos los atributos y un if para controlar el error que nos puee saltar
     * @param nombre
     * @param dni
     * @param sexo
     * @param categoria
     * @param anyos
     * @throws DatosNoCorrectosException 
     */
    public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) 
    throws DatosNoCorrectosException{
        super(nombre, dni, sexo);
        if(categoria < 1 || categoria > 10 || anyos < 0){
            throw new DatosNoCorrectosException("Datos no correctos");
        }
        this.setCategoria(categoria);
        this.anyos = anyos;
    
    }
    
    /**
     * Metodo publico para cambiar la categoria de un empleado
     * Tambien ponemos doble if para controlar que el numero de la categoria siempre este entre los valore que debe
     * @param categoria 
     */
     public void setCategoria(int categoria) {
        if (categoria < 1){
            categoria = 1;
        }
        if (categoria > 10){
            categoria = 10;
        }
        this.categoria = categoria;
    }

     /**
      * metoodo publico para devolver categoria
      * @return 
      */
    public int getCategoria() {
        return categoria;
    }

    /**
     * metodo publico para devolver años para hacerlo mas facil luego a la hora de llamarlo
     * @return 
     */
    public int getAnyos() {
        return anyos;
    }

    /**
     * metodo publico para incrementar los años
     */
    public void incrAnyo() {
        anyos++;
    }

    /**
     * metodo publico para imprimir los datos del empleado
     */
    public void imprime() {
        System.out.println(nombre + " - " + dni + " -  Sex:"+ sexo + " - Cat:" + categoria + " - Años:" + anyos);
    }
    
}
