package br.edu.ifnmg.prototype;

/**
 *
 * @author marti
 */

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Dentro do método draw() do Retângulo.");
    }
}
