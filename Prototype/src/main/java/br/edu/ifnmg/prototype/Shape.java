package br.edu.ifnmg.prototype;

/**
 *
 * @author marti
 */

//A classe abstrata Prototype. A implementação da interface Cloneable é uma
//forma padrão do Java para indicar que um objeto pode ser clonado.
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;
    private String color;

    public abstract void draw();

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //</editor-fold>
  
    //O método clone, que usa o super.clone() do Object.
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}