/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author christiansantosflores
 */
public class POOP5 {

   public static void main(String[] args) {
        
        Fecha fecha1 = new Fecha(25, 9, 2000);

        
        Persona persona1 = new Persona("Valeria", "Santos", fecha1);

        
        persona1.mostrarInfo();

       
        System.out.println("Día de nacimiento: " + persona1.getfNacimiento().getDia());
        System.out.println("Mes de nacimiento: " + persona1.getfNacimiento().getMes());
        System.out.println("Año de nacimiento: " + persona1.getfNacimiento().getAnio());
    }
    
}
