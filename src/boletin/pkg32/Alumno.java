/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg32;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class Alumno {
    String nombre;
    int nota;
    Enderezo enderezo;

    public Alumno() {
    }

    public Alumno(String nombre, int nota, Enderezo enderezo) {
        this.nombre = nombre;
        this.nota = nota;
        this.enderezo = enderezo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }
    
     public void cambiarNota(String nombre, ArrayList<Alumno> alumno){
        int contador=0;
        for(Alumno al:alumno){
            if (al.getNombre().equals(nombre)){
                al.nota=Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca la nueva nota"));
                contador++;
            }
        }
        if(contador==0){
            JOptionPane.showMessageDialog(null,"No hay alumnos llamados "+ nombre);
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + ", enderezo=" + enderezo + '}';
    }
     
      public class Enderezo{
        String rua;
        int numero;

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public int getNumero() {
            return numero;
        }

        @Override
        public String toString() {
            return "rua= " + rua + "\n                      numero= " + numero;
        }
        
    }

    
}

