/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

public class Funciones {
    
    private double num1;
    private double num2;
    
    public Funciones(double Num1, double Num2){
        num1 = Num1;
        num2 = Num2;
    }
    
    public void setNum1(double Num1){
        this.num1 = Num1;
    }
    
    public void setNum2(double Num2){
        this.num2 = Num2;
    }
    
    public double getSuma(){
        return num1 + num2;
    }
    
    public double getResta(){
        return num1 - num2;
    }
    
    public double getProducto(){
        return num1 * num2;
    }
    
    public double getDivision(){
        return num1 / num2;
    }
    
    public double getResto(){
        return num1 % num2;
    }
}
