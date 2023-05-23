package com.HIT;

public class Line {
    private Point pointA;
    private Point pointB;

    public Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double calcLength(){

        return this.pointA.calcDistance(pointB);
    }
}
