package FunctionInterface;

import java.util.function.Function;

//User-defined class
class SensorData {

 private double temperature;
 private double humidity;

 // Parameterized Constructor
 public SensorData(double temperature, double humidity) {
     this.temperature = temperature;
     this.humidity = humidity;
 }

 // Getter and Setter for temperature
 public double getTemperature() {
     return temperature;
 }

 public void setTemperature(double temperature) {
     this.temperature = temperature;
 }

 // Getter and Setter for humidity
 public double getHumidity() {
     return humidity;
 }

 public void setHumidity(double humidity) {
     this.humidity = humidity;
 }
}

public class Main {

 public static void main(String[] args) {

     // Creating SensorData object
     SensorData data = new SensorData(30.5, 70.0);

     // Threshold value
     double threshold = 25.0;

     // Function to extract temperature
     Function<SensorData, Double> extractTemperature =
             new Function<SensorData, Double>() {

         @Override
         public Double apply(SensorData data) {
             return data.getTemperature();
         }
     };

     // Extract temperature
     Double temperature = extractTemperature.apply(data);

     System.out.println("Extracted Temperature: " + temperature);

     // Function to check threshold
     Function<Double, Boolean> checkThreshold =
             new Function<Double, Boolean>() {

         @Override
         public Boolean apply(Double temp) {
             return temp > threshold;
         }
     };

     // Check result
     Boolean result = checkThreshold.apply(temperature);

     System.out.println("Is Temperature Above Threshold? " + result);
 }
}