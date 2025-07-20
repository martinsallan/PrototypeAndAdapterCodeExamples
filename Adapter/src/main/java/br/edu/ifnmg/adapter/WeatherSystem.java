package br.edu.ifnmg.adapter;

/**
 *
 * @author marti
 */

//Sistema cliente, que só sabe lidar com a interface "Target".
public class WeatherSystem {

    public void showTemperature(CelsiusTemperatureSensor sensor) {
        System.out.printf("Temperatura atual: %.2f Celcius%n", sensor.getTemperatureInCelsius());
    }
}