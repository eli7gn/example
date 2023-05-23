package com.HIT;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point() {
        this(0,0);  // self this
    }
    public Point(int coordinateY) {
        this(0, coordinateY);
    }

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double calcDistance(Point pointB){
        int horizontalDistance = this.coordinateX - pointB.coordinateX;
        int verticalDistance = this.coordinateY - pointB.coordinateY;
        return Math.sqrt( Math.pow(verticalDistance, 2) + Math.pow(horizontalDistance, 2));
    }

    public int geCoordinateY() {

        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }


    public int getCoordinateX(){
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX)
    {
        this.coordinateX = coordinateX;
    }
}
