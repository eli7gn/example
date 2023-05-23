package com.HIT;

public class Main {

    public static void main(String[] args) {
	    Point point_a = new Point(3,2);
        Point point_b = new Point(9,7);
        point_a.calcDistance(point_b);
        point_b.calcDistance(point_a);

        Line lineA = new Line(point_a, point_b);
        System.out.println(lineA.calcLength());

        Point point_c = new Point(-3,5);
        Point point_d= new Point(7,-1);
        Line line_b= new Line(point_c, point_d);
        System.out.println(line_b.calcLength());
    }
}
