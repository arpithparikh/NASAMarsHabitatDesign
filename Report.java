package com.marsHousing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Report {
    
    public static void updateDatabase(Parameters parameters, String message) {
         String fileName = "C:\\Users\\arpitparikh\\Documents\\NetBeansProjects\\JavaApplication1\\src\\com\\marsHousing\\SensorInput.txt";

            try {
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                bufferedWriter.write(dateFormat.format(date) + " - " + message +
                        " isWell:" + parameters.isWell() +
                        " Temperature: " + parameters.getTemperature().getValue() +
                        " Humidity: " + parameters.getHumidity().getValue() +
                        " OxygenLevel: "+ parameters.getOxygenLevel().getValue() +
                        " Pressure: " + parameters.getPressure().getValue() +
                        " ExtWallInerStrTemp: " + parameters.getExtWallInnerStrTemp().getValue() +
                        " Smoke: " + parameters.isSmoke() +
                        " ChlorineMethaneGas: " + parameters.isChlorineMethaneGas() +
                        " OutsideTemp: " + parameters.getOutsideTemp()
                        );
                
                bufferedWriter.close();
            }
            catch(IOException ex) {
                System.out.println(
                    "Error writing to file '"
                    + fileName + "'");
            }
    }

}