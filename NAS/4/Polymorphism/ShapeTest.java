
abstract class Shape {

   public abstract String getName();
   public abstract double getArea();
}

class Circle extends Shape {

   // Properties of the class...
   public double radius;

   // Constructor of the class...
   public Circle(double aRadius) {
      radius = aRadius;
   }

   // Methods of class...
   public String getName() {
       return "circle";
   }

   public double getArea() {
       return Math.PI * radius * radius;
   }
}

class Triangle extends Shape {

   // Properties of the class...
   public double base;
   public double height;

   // Constructor of the class...
   public Triangle(double aBase, double aHeight) {
      base = aBase;
      height = aHeight;
   }

   // Methods of class
   public String getName() {
       return "triangle";
   }

   public double getArea() {
       return 0.5 * base * height;
   }

}

class Rectangle extends Shape {

    // Properties of the class...
    public double width;
    public double length;

    // Constructor of class...
    public Rectangle(double aWidth, double aLength) {
        width = aWidth;
        length = aLength;
    }

    // Methods of class...
    public String getName() {
        return "rectangle";
    }

    public double getArea() {
        return width * length;
    }
}

class ShapeTest {

   public Shape[] myShapes;

   public void printAreas() {

      for (int i=0; i<myShapes.length; i++) {

         System.out.print("Shape " + i + " has area: ");

         System.out.println(myShapes[i].getArea());
      }
   }

   public void printNames() {

      for (int i=0; i<myShapes.length; i++) {

         System.out.print("Shape " + i + " is a: ");

         System.out.println(myShapes[i].getName());
      }
   }

   public void doStuff() {

      // create an empty shapes array...
      myShapes = new Shape[4];

      // fill in the values of the elements...
      myShapes[0] = new Circle(12.0);
      myShapes[1] = new Circle(6.3);
      myShapes[2] = new Triangle(3,8);
      myShapes[3] = new Rectangle(3,4);

      printNames();
      printAreas();
   }


   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      ShapeTest me = new ShapeTest();
      me.doStuff();

   }
}