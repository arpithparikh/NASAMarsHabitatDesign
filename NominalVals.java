package com.marsHousing;

public enum NominalVals {
	TEMPERATURE(72.0),HUMIDITY(45.0),OXYLEVEL(21.0),PRESSURE(14.5),EXTWALLINSTTEMP(28.0);
	private double value;

    private NominalVals(double value) {
            this.value = value;
    }

	public double getValue() {
		return value;
	}

}
