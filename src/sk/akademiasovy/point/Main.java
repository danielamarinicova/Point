package sk.akademiasovy.point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(8,12);
        System.out.println("Point p1 is in  "+ p1.getQuadrant()+ " quadrant. ");
        Point p2 = new Point ();
        p2.generateRandomCoord();
        System.out.println("Point p1 is in  "+ p2.getQuadrant()+ " quadrant. ");
        p2.print();
        System.out.println("Distance between p1 and p2 is: "+p1.getDistanceFromOtherPoint(p2));

    }


}
