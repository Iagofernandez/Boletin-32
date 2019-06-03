
package boletin.pkg32;

import java.util.ArrayList;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin32 {

    
    public static void main(String[] args) {
         ArrayList<Alumno>alumnos=new ArrayList<>();
        Alumno obx=new Alumno();
        obx.setNota(10);
        obx.setNombre("Iago");
        Alumno.Enderezo direccion=obx.new Enderezo("estrada",666);
        obx.setEnderezo(direccion);
        System.out.println(obx.toString());
        alumnos.add(obx);
        obx.cambiarNota("Iago", alumnos);
        System.out.println(obx.toString());
    }
    }
    

