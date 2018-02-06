
package fract;

import java.util.Random;

public class Fract {

    public static void main(String[] args) {
        System.out.println("-------------Масив фигур-----------------------");
        Figura figura[] = new Figura[3];
        figura[0] = new Circle("black", 20); //конструктор круга
        figura[1] = new Triangle("red", 13.5, 10.0); //конструктор трехугольника
        figura[2] = new Rectangle("gold", 5.0, 5.0);
        for(Figura x : figura){
            System.out.println(x);
            System.out.println(x.getColor()); // получить цвет
            System.out.println();
            
    }
        System.out.println("--------------Переопределение методов----------");
        
      Triangle t1  = new Triangle( 30, 40, 10);
        System.out.println(t1.getPer());// периметр
      Rectangle r1 = new Rectangle("Gold", 40, 20);
        System.out.println(r1.getDiag()); // диагональ
      Circle c1 = new Circle("white", 50);
        System.out.println(c1.getArea()); //площадь
        
        System.out.println("---------------Рандомные параметры фигур-------"); 
        
        Random r2 = new Random();
        Triangle t2 = new Triangle("gold", r2.nextDouble(), r2.nextDouble(), r2.nextDouble(), r2.nextDouble());
        Rectangle re1 = new Rectangle("silver", r2.nextDouble(), r2.nextDouble());
        Circle c3 = new Circle("red", r2.nextDouble());
        
        Figura fig[]= {t2,re1,c3};
        for(Figura x: figura){
            System.out.println(x);
            System.out.println(x.getArea());
            System.out.println(x.getColor());    
        }
    }
    }
    

