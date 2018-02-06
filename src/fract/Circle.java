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
public class Circle extends Figura{
      private double radius;
      private final double p = 3.14;
    
 
    
    
    
    @Override
    public  double getArea() { //  площадь
       return Math.PI*(Math.pow(this.radius, 2));
    } 
    @Override
    public double getPer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDiag() { //диаметр
        return this.radius*2;
    }
    
    
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }
  
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle " + super.toString()+" "+ "radius: " + radius + ", p: " + p ;
    }

   
    
    public double getRadius() {
        return radius;
    }
    public double getP() {
        return p;
    }

    
}
