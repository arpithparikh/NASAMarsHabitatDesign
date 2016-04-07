package com.marsHousing;

public class Parameters {
	private Variable temperature;
	private boolean isWell;
	private Variable humidity;
	private Variable oxygenLevel;
	private Variable pressure;
	private Variable extWallInnerStrTemp;
	private boolean smoke;
	private boolean chlorineMethaneGas;
	private double outsideTemp;
     
        
       
        
	public void setTemperature(Variable temperature) {
		this.temperature = temperature;
	}
        
	public Variable getTemperature() {
		return temperature;
	}
        
	
	public Variable getHumidity() {
		return humidity;
	}
	public void setHumidity(Variable humidity) {
		this.humidity = humidity;
	}
	public Variable getOxygenLevel() {
		return oxygenLevel;
	}
	public void setOxygenLevel(Variable oxygenLevel) {
		this.oxygenLevel = oxygenLevel;
	}
	public Variable getPressure() {
		return pressure;
	}
	public void setPressure(Variable pressure) {
		this.pressure = pressure;
	}
	public Variable getExtWallInnerStrTemp() {
		return extWallInnerStrTemp;
	}
	public void setExtWallInnerStrTemp(Variable extWallInnerStrTemp) {
		this.extWallInnerStrTemp = extWallInnerStrTemp;
	}
	public boolean isSmoke() {
		return smoke;
	}
	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}
	public boolean isChlorineMethaneGas() {
		return chlorineMethaneGas;
	}
	public void setChlorineMethaneGas(boolean chlorineMethaneGas) {
		this.chlorineMethaneGas = chlorineMethaneGas;
	}
	public double getOutsideTemp() {
		return outsideTemp;
	}
	public void setOutsideTemp(double outsideTemp) {
		this.outsideTemp = outsideTemp;
	}
	public boolean isWell() {
		return isWell;
	}
	public void setWell(boolean isWell) {
		this.isWell = isWell;
	}
	
	

}
