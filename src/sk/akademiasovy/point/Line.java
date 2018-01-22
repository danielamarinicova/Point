package sk.akademiasovy.point;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Line(int xa , int ya , int xb , int yb){
        a=new Point(xa,ya);
        b=new Point (xb,yb);
    }

    public double getLength(){
        return a.getDistanceFromOtherPoint(b);

    }


}
