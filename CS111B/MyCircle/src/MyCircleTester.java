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
        circle3.setRadius(1.0);
        System.out.println(circle3.getArea());

        if (circle1.doesOverlap(circle2)) {
            System.out.println("circle1 and circle2 overlap");
        }
        if (circle2.doesOverlap(circle3)) {
            System.out.println("circle2 and circle3 overlap");
        }
        if (circle1.doesOverlap(circle3)) {
            System.out.println("circle1 and circle3 overlap");
        }
    }
}
