public class MyCircleTester {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle();
        MyCircle circle3 = new MyCircle();

        circle1.setX(1.0);
        circle1.setY(1.0);
        circle1.setRadius(10.0);
        System.out.println(circle1.getArea());

        circle2.setX(1.0);
        circle2.setY(2.0);
        circle2.setRadius(10.0);
        System.out.println(circle2.getArea());

        circle3.setX(100.0);
        circle3.setY(100.0);
        circle3.setY(1.0);
        System.out.println(circle3.getArea());


    }
}
