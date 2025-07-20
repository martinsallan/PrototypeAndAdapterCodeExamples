package br.edu.ifnmg.adapter;

/**
 *
 * @author marti
 */

public class Program {
    public static void main(String[] args) {
        // O sistema cliente
        WeatherSystem weatherSystem = new WeatherSystem();

        // A classe que queremos usar, mas é incompatível
        FahrenheitTemperatureSensor fahrenheitSensor = new FahrenheitTemperatureSensor();

        // Criamos o Adapter, envolvendo o sensor incompatível
        CelsiusTemperatureSensor adapter = new TemperatureAdapter(fahrenheitSensor);

        // O cliente usa o adapter sem saber que a medição original era em Fahrenheit
        weatherSystem.showTemperature(adapter);
    }
}