//Write the following methods (instance methods):
//* Method named getRadius without any parameters, it needs to return the value of radius field.
//* Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.


public class Circle {
    double radius;

    public Circle(double radius) {
        if ( radius <= 0 ) {
            this.radius = 0;
        }
          else {
                 this.radius = radius;
          }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
}

}
