package com.foothillcollege;

public class ShapeShifter {
    public static void main(String[] args) {

        // Primary Shapes

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

        // Complex Shapes

        System.out.println("House:");
        drawUpTriangle();
        drawRectangle();
        System.out.println();

        System.out.println("Hour Glass:");
        drawDownTriangle();
        drawUpTriangle();
        System.out.println();

        // Created by Bryan Madrigal
        System.out.println("Dumbbell:");
        drawRectangle();
        drawVerticalLine();
        drawRectangle();
        System.out.println();

        // Created by: Chris Payne
        System.out.println("Arrow:");
        drawUpTriangle();
        drawVerticalLine();
        drawVerticalLine();
        drawHorizontalLine();
        drawUpTriangle();

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
