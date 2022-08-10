import java.util.Scanner;

abstract class Shape{
  private double height;
  private double width;
  abstract void area();
  abstract void perimeter();
  void setHeight(double h){
       this.height=h;
       
  }
  void setWidth(double w){
       
       this.width=w;
  }
  double getHeight(){
      return this.height;
  }
  double getWidth(){
       return this.width;
  }
}


//Add Square class that extends Shape class
class Square extends Shape{
     void area(){
         double a=getWidth()*getWidth();
         System.out.println("area of a square is: "+a);
     }
     void perimeter(){
          double p=4*getWidth();
          System.out.println("perimeter of a square is: "+p);
     }
}
//Add Rectangle class that extends Shape class
class Rectangle extends Shape{
     void area(){
         double a=getHeight()*getWidth();
         System.out.println("area of a rectangle is: "+a);
     }
     void perimeter(){
          double p=2*(getHeight()+getWidth());
          System.out.println("perimeter of a rectangle is: "+p);
     }
     
}
//Add EquilateralTriangle class that extends Shape class
class EquilateralTriangle extends Shape{
    void area(){
         double a = getHeight()*getHeight()*(Math.sqrt(3) / 4);
         
         System.out.println("area of a equilateral triangle is: "+a);
     }
     void perimeter(){
          double p=3*getHeight();
          System.out.println("perimeter of a eqilateral triangle is: "+p);
     }
     
}
class AreaPerimeter {

//Add the main method here and find Area and Perimeter 
    public static void main(String arg[]){
      
//Use the scanner class to provide height and width at execution time

/*
Scanner s= new Scanner(System.in);
System.out.println("Enter the height of triangle");
EquilateralTriangle triangle=new EquilateralTriangle();
triangle.setHeight(s.nextInt());
*/   
      Scanner s= new Scanner(System.in);
      
      System.out.println("Enter the height of triangle");
      Shape shape;
      EquilateralTriangle triangle=new EquilateralTriangle();
      shape=triangle;
      triangle.setHeight(s.nextDouble());
      
      System.out.println("Enter the width of rectangle");
      Rectangle rectangle=new Rectangle();
      shape=rectangle;
      rectangle.setWidth(s.nextDouble());
      System.out.println("Enter the height of rectangle");
      rectangle.setHeight(s.nextDouble());
      
      System.out.println("Enter the width of square");
      Square square=new Square();
      shape=square;
      square.setWidth(s.nextDouble());
      
      System.out.println("<<<<<EquilateralTriangle Details>>>>>>");
      triangle.area();
      triangle.perimeter();
      System.out.println();
      
      System.out.println("<<<<<Rectangle Details>>>>>>");
      rectangle.area();
      rectangle.perimeter();
      System.out.println();
      
      System.out.println("<<<<<Square Details>>>>>>");
      square.area();
      square.perimeter();
      System.out.println();
    }
}