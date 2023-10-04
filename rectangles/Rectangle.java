package rectangles;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public static void stampaDueRettangoli(Rectangle first, Rectangle second) {
        double firstArea = first.width * first.height;
        double firstPerimeter = (first.width + first.height) * 2;

        double secondArea = second.width * second.height;
        double secondPerimeter = (second.width + second.height) * 2;

        double sumArea = firstArea + secondArea;
        double sumPerimeter = firstPerimeter + secondPerimeter;

        System.out.println("L'area del primo rettangolo e': " + " " + firstArea);
        System.out.println("Il perimetro del primo rettangolo e': " + " " + firstPerimeter);
        System.out.println("L'are del secondo rettangolo e': " + " " + secondArea);
        System.out.println("Il perimetro del secondo rettangolo e': " + " " + secondPerimeter);
        System.out.println("La somma delle area dei due rettangoli e': " + " " + sumArea);
        System.out.println("La somma dei perimetri dei due rettangoli e': " + " " + sumPerimeter);

    }

    public void stampaRettangolo() {
        double area = this.width * this.height;
        double perimeter = (this.width + this.height) * 2;
        System.out.println("L'area e il perimetro del rettangolo fornito sono: " + " " + area + " " + "e" + " " + perimeter);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
