/* 
class Shape {
    String color;

}

class Triangle extends Shape {

}

public class Inheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
} 

*/

class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {

        System.out.println(1 / 2 * l * h);

    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}  

public class Inheritence {
    public static void main(String[] args) {

    }
}