package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side){
        String text = String.format("Square area with side %f is = %f", side, squareArea(side));
        System.out.println(text);
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
