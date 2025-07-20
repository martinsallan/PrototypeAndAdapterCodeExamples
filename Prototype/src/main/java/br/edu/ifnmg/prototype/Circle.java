package br.edu.ifnmg.prototype;

/**
 *
 * @author marti
 */

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Dentro do método draw() do Círculo.");
    }
}