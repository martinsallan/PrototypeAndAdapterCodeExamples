package br.edu.ifnmg.adapter;

/**
 *
 * @author marti
 */

//Classe existente a ser adaptada (Adaptee).
//Possui uma interface incompatível pois mede em Fahrenheit.
public class FahrenheitTemperatureSensor {

    public double getTemperatureInFahrenheit() {
        //Simula a leitura de um sensor em Fahrenheit
        return 77.0;
    }
}