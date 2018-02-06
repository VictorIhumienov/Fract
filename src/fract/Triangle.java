/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fract;

/**
 *
 * @author lordv
 */
public class Triangle extends Figura{
    private double base;
    private double height;
    private double heigth2;
    private double heigth3;
    
  

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(String color, double base, double height ) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public Triangle(double height, double heigth2, double heigth3) {
     
        this.height = height;
        this.heigth2 = heigth2;
        this.heigth3 = heigth3;
    }

    public Triangle(String color,double base, double height, double heigth2, double heigth3 ) {
        super(color);
        this.base = base;
        this.height = height;
        this.heigth2 = heigth2;
        this.heigth3 = heigth3;
    }
    
    
    
    @Override
    public double getArea(){ //площадь
    return (this.base*this.height)/2;
    }

    
    @Override
    public double getPer() { //периметр
        return this.height+this.heigth2+this.heigth3;
    }

    @Override
    public double getDiag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public double getHeigth2() {
        return heigth2;
    }

    public double getHeigth3() {
        return heigth3;
    }

    public void setHeigth2(double heigth2) {
        this.heigth2 = heigth2;
    }

    public void setHeigth3(double heigth3) {
        this.heigth3 = heigth3;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public void setBase(double base) {
        this.base = base;
    }    

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle " + super.toString()+ " "+ "base: " + base + ", height: " + height ;
    }

    

   

   
    
    
}
