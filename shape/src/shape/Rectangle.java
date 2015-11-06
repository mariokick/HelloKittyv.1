package shape;

public class Rectangle {
	  private double width;
      private double height;
      public Rectangle()
      {
          width = 7;
          height = 3;

      }
      public Rectangle(double w, double h)
      {
          width = w;
          height = h;

      }
      public double getArea()
      {
          return width * height;
      }
  }



