package br.edu.ifnmg.prototype;

/**
 *
 * @author marti
 */

import java.util.Hashtable;

//O registro que armazena os protótipos prontos para serem clonados.
public class PrototypeRegistry {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        //O cliente recebe um clone, não o protótipo original.
        return (Shape) cachedShape.clone();
    }

    //Para cada forma, um protótipo é criado e armazenado.
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}