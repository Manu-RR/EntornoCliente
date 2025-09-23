/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboral;


public class CalcularNominas {
    
    /**
     * Método privado para escribir los atributos y el suelo del empleado
     * @param e
     * @param sueldo 
     */
    private static void escribe(Empleado e, int sueldo) {
        System.out.println(e.nombre + " con DNI " + e.dni + " con sexo " +e.sexo + " con categoria "+ e.getCategoria()+ " ,años trabajados "+ e.getAnyos()+ " ,tiene un sueldo de: " + sueldo);
    }

    public static void main(String[] args) {
        try {
          
            Empleado e1 = new Empleado("James Cosling", "32000032G", 'M', 4, 7);

            Empleado e2 = new Empleado("Ada Lovelace", "32000031R", 'F');

            /**
             * Nuevo objeto de nomina
             */
            Nomina nomina = new Nomina();

            /**
             * Mostrar sueldo con el metodo escribe
             */
            escribe(e1, nomina.sueldo(e1));
            escribe(e2, nomina.sueldo(e2));

            /**
             *  Incrementar años de e2 con el metodo publico de la clase Persona
             *  Enseñarlo por pantalla con el metodo escribe
             */
            e2.incrAnyo();
            escribe(e2, nomina.sueldo(e2));

            /**
             * Cambiar categoría de e1con el metodo publico de la clase Persona
             * Enseñarlo por pantalla con el metodo escribe
             */
            e1.setCategoria(9);
            escribe(e1, nomina.sueldo(e1));

        } catch (DatosNoCorrectosException e) {
            System.out.println("Datos no correctos: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Error en el programa: " + ex.getMessage());
        }
    }
    
}
