import rectangles.Rectangle;

public class Exercise1 {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(4.5, 2.2);
        firstRectangle.stampaRettangolo();
        Rectangle secondRectangle = new Rectangle(7.5, 4.2);

        Rectangle.stampaDueRettangoli(firstRectangle, secondRectangle);

    }
}
