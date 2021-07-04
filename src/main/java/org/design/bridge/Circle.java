package org.design.bridge;

public class Circle extends Shape {

    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    public void draw() {
        drawAPI.drawCircle();
    }
}