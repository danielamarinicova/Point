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
//3D

        Point3D p31=new Point3D(9,6,-7);
        Point3D p32=new Point3D();
        p32.generateRandomCoord();
        p31.print();
        p32.print();
        System.out.println("Distance between p31 and p32  is : "+p31.getDistanceFromOtherPoint(p32));



    }


}
