package br.edu.ifnmg.prototype;

/**
 *
 * @author marti
 */

public class Demo {
    public static void main(String[] args) {
        //Carrega os protótipos iniciais no registro
        PrototypeRegistry.loadCache();

        //Obtém um clone do círculo
        Shape clonedCircle = PrototypeRegistry.getShape("1");
        clonedCircle.setColor("Azul");
        System.out.println("Clone do Círculo: " + clonedCircle.getType() + ", Cor: " + clonedCircle.getColor());

        //Obtém outro clone, desta vez do retângulo
        Shape clonedRectangle = PrototypeRegistry.getShape("2");
        clonedRectangle.setColor("Vermelho");
        System.out.println("Clone do Retângulo: " + clonedRectangle.getType() + ", Cor: " + clonedRectangle.getColor());

        //Verificando que são objetos diferentes
        Shape clonedCircle2 = PrototypeRegistry.getShape("1");
        clonedCircle2.setColor("Verde");
        System.out.println("Clone 2 do Círculo: " + clonedCircle2.getType() + ", Cor: " + clonedCircle2.getColor());
        System.out.println("Cor do primeiro clone do círculo ainda é: " + clonedCircle.getColor());
    }
}