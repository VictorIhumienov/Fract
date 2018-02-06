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
public class Rectangle extends Figura {
   private double width;
   private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

  
     @Override
    public double getArea(){ //площадь
        return this.height*this.width;
    } 
     @Override
    public double getPer() { //периметр
        return 2*(this.height+this.width);
    }    
     @Override
    public double getDiag() { //диагональ
        return Math.sqrt(this.height*this.height+this.width*this.width);
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle " +super.toString()+" "+"width: " + width + ", height: " + height;
    }

   

   
    
    
}
