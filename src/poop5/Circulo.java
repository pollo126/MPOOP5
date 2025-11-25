/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author christiansantosflores
 */
public class Circulo {
    double PI = Math.PI; //constantes con mayusculas
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    }
            
    public double perimetro(){
        double perimetro = 2*PI*radio;
        return perimetro;
    } 
    public double area(){
        double area = PI*Math.pow(radio, 2);
        return area;
    }
}
