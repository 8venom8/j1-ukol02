package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

    }

    private void drawRectangle() {
        for (int i = 0; i < 2; i++) {
            zofka.penDown();
            zofka.move(50);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
    }

    private void drawSquare() {
        for (int i = 0; i < 4; i++) {
            zofka.penDown();
            zofka.move(80);
            zofka.turnRight(90);
        }
    }

    private void drawCircle() {
        for (int i = 0; i < 72; i++) {
            zofka.penDown();
            zofka.turnRight(5);
            zofka.move(5);
        }
    }

    private void drawTriangle() {
        zofka.penDown();
        zofka.turnRight(90);
        zofka.turnLeft(60);
        zofka.move(80);
        zofka.turnRight(120);
        zofka.move(80);
        zofka.turnRight(120);
        zofka.move(80);
        zofka.turnRight(90);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
