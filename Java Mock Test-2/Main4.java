interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw(); 

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}
