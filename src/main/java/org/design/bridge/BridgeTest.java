package org.design.bridge;

public class BridgeTest {


    public static void main(String[] args) {
        Shape greenCircle = new Circle(new GreenCircle());
        greenCircle.draw();
    }
}
