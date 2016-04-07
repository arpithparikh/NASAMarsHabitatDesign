package com.marsHousing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RobotControl {
    public static boolean checkIssue(Parameters parameters) {
        if (parameters.getTemperature().getColor() != Status.GREEN) {
            return true;
        } else if (parameters.getHumidity().getColor() != Status.GREEN) {
            return true;
        }  else if (parameters.getPressure().getColor() != Status.GREEN) {
            return true;
        } else if (parameters.getOxygenLevel().getColor() != Status.GREEN) {
            return true;
        } else if (parameters.getExtWallInnerStrTemp().getColor() != Status.GREEN) {
            return true;
        } else if (parameters.isSmoke()) {
            return true;
        } else if (parameters.isChlorineMethaneGas()) {
            return true;
        } 
        return false;        
    }
    
    public static void FixIssue(Parameters parameters) {
        if (checkIssue(parameters)) {
            Report.updateDatabase(parameters, "Robot Activated. Previous state - ");
            String fileName = "C:\\Users\\arpitparikh\\Documents\\NetBeansProjects\\JavaApplication1\\src\\com\\marsHousing\\SensorInput.txt";
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("isWell: False");
                bufferedWriter.newLine();
                bufferedWriter.write("Temperature: " + NominalVals.TEMPERATURE );
                bufferedWriter.newLine();
                bufferedWriter.write("Humidity: " + NominalVals.HUMIDITY );
                bufferedWriter.newLine();
                bufferedWriter.write("OxygenLevel: "+ NominalVals.OXYLEVEL); 
                bufferedWriter.newLine();
                bufferedWriter.write("Pressure: " + NominalVals.PRESSURE);
                bufferedWriter.newLine();
                bufferedWriter.write("ExtWallInerStrTemp: " + NominalVals.EXTWALLINSTTEMP);
                bufferedWriter.newLine();
                bufferedWriter.write("Smoke: False");
                bufferedWriter.newLine();
                bufferedWriter.write("ChlorineMethaneGas: False");
                bufferedWriter.newLine();
                bufferedWriter.write("OutsideTemp: " + parameters.getOutsideTemp());
                
                bufferedWriter.close();
                Report.updateDatabase(parameters, "Robot Fixed Issue. Corrected state - ");
            }  catch(IOException ex) {
                System.out.println(
                        "Error writing to file '"
                        + fileName + "'");
                }
        } else {
            Report.updateDatabase(parameters, "No issues found by Robot. ");
        }
        
    }

}