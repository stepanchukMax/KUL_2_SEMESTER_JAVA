public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6.7f,8.3f);
        System.out.println("Your length is "+rectangle.getLength());
        System.out.println("Your width is "+rectangle.getWidth());
        System.out.println("Your area is "+rectangle.getArea());
        System.out.println("Your diagonal is "+rectangle.getDiagonal());
        System.out.println("Your perimeter is "+rectangle.getPerimeter());
    }
}