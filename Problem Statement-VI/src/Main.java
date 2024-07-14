abstract class Shape {
    int length;
    int breadth;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

class Triangle extends Shape {
    Triangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        System.out.println("Area of triangle: " + (0.5 * length * breadth));
    }
}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    void printArea() {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6, 12);
        r.printArea();

        Triangle t = new Triangle(6, 6);
        t.printArea();

        Circle c = new Circle(4);
        c.printArea();
    }
}
