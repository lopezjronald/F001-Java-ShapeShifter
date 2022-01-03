package com.foothillcollege;

public class ShapeShifter {
    public static void main(String[] args) {
        System.out.println("Vertical Line:");
        drawVerticalLine();
        System.out.println();

        System.out.println("Up Triangle:");
        drawUpTriangle();
        System.out.println();

        System.out.println("Rectangle:");
        drawRectangle();
        System.out.println();

        System.out.println("Horizontal Line:");
        drawHorizontalLine();
        System.out.println();

        System.out.println("Square:");
        drawSquare();
        System.out.println();

        System.out.println("Down Triangle:");
        drawDownTriangle();
        System.out.println();

        System.out.println("House:");
        drawUpTriangle();
        drawRectangle();
        System.out.println();

        System.out.println("Hour Glass:");
        drawDownTriangle();
        drawUpTriangle();
        System.out.println();


    }

    public static void drawHorizontalLine(){
        System.out.println("*********");
    }

    public static void drawVerticalLine() {
        System.out.println("    *");
        System.out.println("    *");
        System.out.println("    *");
    }

    public static void drawRectangle() {
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");
    }

    public static void drawSquare() {
        System.out.println("* *");
        System.out.println("* *");
    }

    public static void drawUpTriangle() {
        System.out.println("    *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*********");
    }

    public static void drawDownTriangle() {
        System.out.println("*********");
        System.out.println(" *     *");
        System.out.println("  *   *");
        System.out.println("    *");
    }

}
