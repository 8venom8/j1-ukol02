package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();



    public void start() {

//ICECREAM
        zofka.setLocation(100.0, 100.0);

        drawCircle(7);

        zofka.turnLeft(180);

        zofka.setLocation(260,120);

        drawTriangle(160);

//SNOWMEN

        //HEAD
        zofka.setLocation(260, 300);

        zofka.turnLeft(90);

        drawCircle(2);

        //BODY
        zofka.penUp();
        zofka.move(45);
        zofka.turnRight(90);
        zofka.move(95);

        drawCircle(4);

        //HANDS
        zofka.turnRight(180);
        drawCircle(1);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(105);
        zofka.turnRight(90);
        zofka.move(10);
        zofka.turnLeft(90);

        zofka.turnLeft(180);
        drawCircle(1);

        //BODY
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(10);
        zofka.turnLeft(90);

        zofka.turnRight(180);
        drawCircle(6);

//TRAIN
        zofka.setLocation(700,500);

        drawRightTriangle(100);
        zofka.turnRight(135);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(160);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnRight(90);

        //LITTLE CIRCLES
        drawCircle(2.5);

        zofka.penUp();
        zofka.move(100);

        drawCircle(2.5);

        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnRight(90);

        //BIG CIRCLE
        drawCircle(4);

        zofka.penUp();
        zofka.move(42);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.turnRight(180);
        drawRectangle(90, 160);

        zofka.penUp();
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);

        drawRectangle(210,100);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(50);
    }

    private void drawRightTriangle(double sizeSide) {

        var sizeOfHypotenuse = Math.sqrt(2*Math.pow(sizeSide, 2));

        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(sizeSide);
        zofka.turnLeft(90);
        zofka.move(sizeSide);
        zofka.turnLeft(135);
        zofka.move(sizeOfHypotenuse);


    }

    private void drawRectangle(double sizeSideA, double sizeSideB) {
        for (int i = 0; i < 2; i++) {
            zofka.penDown();
            zofka.move(sizeSideA);
            zofka.turnRight(90);
            zofka.move(sizeSideB);
            zofka.turnRight(90);
        }
    }

    private void drawSquare(double sizeSide) {
        for (int i = 0; i < 4; i++) {
            zofka.penDown();
            zofka.move(sizeSide);
            zofka.turnRight(90);
        }
    }

    private void drawCircle(double sizeSide) {
        for (int i = 0; i < 72; i++) {
            zofka.penDown();
            zofka.turnRight(5);
            zofka.move(sizeSide);
        }
    }

    private void drawTriangle(double sizeSide) {

        zofka.penDown();
        zofka.turnRight(90);
        zofka.turnLeft(60);
        zofka.move(sizeSide);
        zofka.turnRight(120);
        zofka.move(sizeSide);
        zofka.turnRight(120);
        zofka.move(sizeSide);
        zofka.turnRight(90);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
