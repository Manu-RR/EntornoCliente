/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboral;


public class Nomina {
    
    /**
     * array estatico con el sueldo base
     */
     private static final int[] SUELDO_BASE = { 
        50000, 70000, 90000, 110000, 130000, 
        150000, 170000, 190000, 210000, 230000 
    };

     /**
      * metodo publico para calcular el sueldo
      * @param e
      * @return 
      */
    public int sueldo(Empleado e) {
        int base = SUELDO_BASE[e.getCategoria() - 1];
        return base + (5000 * e.getAnyos());
    }
    
}
