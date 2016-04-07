package com.marsHousing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SensorInterface {

    public static Parameters sensorInput() {
        System.out.println("in");
        Parameters parameter = new Parameters();
        String fileName = "C:\\Users\\arpitparikh\\Documents\\NetBeansProjects\\JavaApplication1\\src\\com\\marsHousing\\SensorInput.txt";
        String line = null;
        BufferedReader bufferedReader = null; 
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);
            bufferedReader = 
                    new BufferedReader(fileReader);
            boolean isWell = false;
            while((line = bufferedReader.readLine()) != null) {
                String[] in = line.split(" ");
                switch(in[0]) {
                case("isWell:") : isWell =(in[1].equalsIgnoreCase("False"))? false:true;
                            parameter.setWell(isWell);
                                break;
                case("Temperature:") : double temp = Double.parseDouble(in[1]);
                        //double nominal = NominalVals.TEMPERATURE.getValue();
                        if (isWell) {
                            if ((temp <= 90 && temp >=72) || (temp >= 35 && temp <= 72)) {
                                parameter.setTemperature(new Variable(temp,Status.GREEN));
                            } else if (temp >= 96.3 || temp <= 66.96) {
                                parameter.setTemperature(new Variable(temp,Status.REDALARM));
                            } else if (temp >= 94.5 || temp <= 68.5) {
                                parameter.setTemperature(new Variable(temp,Status.RED));
                            } else if(temp >= 91.8 || temp <= 70.56) {
                                parameter.setTemperature(new Variable(temp,Status.YELLOW));
                            } else if (temp <= 32.5 || temp >= 77.04) {
                                parameter.setTemperature(new Variable(temp,Status.REDALARM));
                            } else if (temp <= 33.25 || temp >= 75.6) {
                                parameter.setTemperature(new Variable(temp,Status.RED));
                            } else if (temp <= 34.3 || temp >= 73.44) {
                                parameter.setTemperature(new Variable(temp,Status.YELLOW));
                            } 
                        } else {
                            if (temp == 72.0) {
                                parameter.setTemperature(new Variable(temp,Status.GREEN));
                            } else if (temp >= 77.04 || temp <= 66.96) {
                                parameter.setTemperature(new Variable(temp,Status.REDALARM));
                            } else if (temp >= 75.6 || temp <= 68.5) {
                                parameter.setTemperature(new Variable(temp,Status.RED));
                            } else if (temp >= 73.44 || temp <= 70.56) {
                                parameter.setTemperature(new Variable(temp,Status.YELLOW));
                            }
                        }
                        break;
                case ("Humidity:"):  double humididty = Double.parseDouble(in[1]);
                                    //nominal = NominalVals.HUMIDITY.getValue();
                        if(isWell) {
                            if (humididty <= 75  && humididty >= 45) {
                                parameter.setHumidity(new Variable(humididty,Status.GREEN));
                            } else if (humididty <= 41.85 || humididty >= 77.04) {
                                parameter.setHumidity(new Variable(humididty,Status.REDALARM));
                            } else if (humididty <= 42.75 || humididty >= 75.6) {
                                parameter.setHumidity(new Variable(humididty,Status.RED));
                            } else if (humididty <= 44.1 || humididty >= 73.44) {
                                parameter.setHumidity(new Variable(humididty,Status.YELLOW));
                            } 
                        } else {
                            if (humididty == 45.0) {
                                parameter.setHumidity(new Variable(humididty,Status.GREEN));
                            } else if (humididty <= 41.85 || humididty >= 48.15) {
                                parameter.setHumidity(new Variable(humididty,Status.REDALARM));
                            } else if (humididty <= 42.75 || humididty >= 47.25) {
                                parameter.setHumidity(new Variable(humididty,Status.RED));
                            } else if (humididty <= 44.1 || humididty >= 45.9) {
                                parameter.setHumidity(new Variable(humididty,Status.YELLOW));
                            }
                        }
                        break;
                case ("OxygenLevel:") : double oxyLvl = Double.parseDouble(in[1]);
                        //nominal = NominalVals.OXYLEVEL.getValue();
                        if (oxyLvl == 21.0) {
                            parameter.setOxygenLevel(new Variable(oxyLvl,Status.GREEN));
                        } else if (oxyLvl <= 19.53 || oxyLvl >= 22.47) {
                            parameter.setOxygenLevel(new Variable(oxyLvl,Status.REDALARM));
                        } else if (oxyLvl <= 19.95 || oxyLvl >= 22.05) {
                            parameter.setOxygenLevel(new Variable(oxyLvl,Status.RED));
                        } else if (oxyLvl <= 20.58 || oxyLvl >= 21.42) {
                            parameter.setOxygenLevel(new Variable(oxyLvl,Status.YELLOW));
                        }
                        break;
                case ("Pressure:") : double pressure = Double.parseDouble(in[1]);
                    //nominal = NominalVals.PRESSURE.getValue();
                    if (pressure == 14.5) {
                        parameter.setPressure(new Variable(pressure,Status.GREEN));
                    } else if (pressure <= 13.485 || pressure >= 15.515) {
                        parameter.setPressure(new Variable(pressure,Status.REDALARM));
                    } else if (pressure <= 13.775 || pressure >= 15.225) {
                        parameter.setPressure(new Variable(pressure,Status.RED));
                    } else if (pressure <= 14.21 || pressure >= 14.79) {
                        parameter.setPressure(new Variable(pressure,Status.YELLOW));
                    }
                    break;
                case ("ExtWallInerStrTemp:") : double ext = Double.parseDouble(in[1]);
                    //nominal = NominalVals.PRESSURE.getValue();
                    if (ext == 14.5) {
                        parameter.setExtWallInnerStrTemp(new Variable(ext,Status.GREEN));
                    } else if (ext <= 13.485 || ext >= 15.515) {
                        parameter.setExtWallInnerStrTemp(new Variable(ext,Status.REDALARM));
                    } else if (ext <= 13.775 || ext >= 15.225) {
                        parameter.setExtWallInnerStrTemp(new Variable(ext,Status.RED));
                    } else if (ext <= 14.21 || ext >= 14.79) {
                        parameter.setExtWallInnerStrTemp(new Variable(ext,Status.YELLOW));
                    }
                    break;
                case ("Smoke:") : 
                    if (in[1].equalsIgnoreCase("False")) {
                        parameter.setSmoke(false);
                    } else {
                        parameter.setSmoke(true);
                    } 
                    break;
                case ("ChlorineMethaneGas:") : 
                    if (in[1].equalsIgnoreCase("False")) {
                        parameter.setChlorineMethaneGas(false);
                    } else {
                        parameter.setChlorineMethaneGas(true);
                    } 
                    break;
                case ("OutsideTemp:") :
                    double out = Double.parseDouble(in[1]);
                    parameter.setOutsideTemp(out);
                    break;
                    
                    
                    
                    
                    
                    
                }   
                
               
            }
            bufferedReader.close();
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Incorrect Input");
        }
        catch(FileNotFoundException ex) {
            //ex.printStackTrace();
            System.out.println(
                    "Unable to open file '" + 
                    fileName + "'");                
        } catch(IOException ex) {
            //ex.printStackTrace();
                System.out.println(
                    "Error reading file '" 
                    + fileName + "'");                  
                
        } 
        return parameter;
        
    }
}

