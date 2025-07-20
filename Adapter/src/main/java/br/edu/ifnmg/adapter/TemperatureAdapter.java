package br.edu.ifnmg.adapter;

/**
 *
 * @author marti
 */

//Adapter que implementa a interface do sistema (Target)
//e envolve (compõe) a classe incompatível (Adaptee).
public class TemperatureAdapter implements CelsiusTemperatureSensor {

    private final FahrenheitTemperatureSensor fahrenheitSensor;

    public TemperatureAdapter(FahrenheitTemperatureSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    @Override
    public double getTemperatureInCelsius() {
        //Chama o método da classe adaptada
        double tempInFahrenheit = fahrenheitSensor.getTemperatureInFahrenheit();
        
        //Realiza a "tradução" (adaptação) para a unidade esperada
        double tempInCelsius = (tempInFahrenheit - 32.0) * 5.0 / 9.0;
        
        return tempInCelsius;
    }
}