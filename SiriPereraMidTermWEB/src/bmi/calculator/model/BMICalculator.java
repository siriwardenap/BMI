package bmi.calculator.model;

import bmi.calculator.exceptions.InvalidInputException;

public class BMICalculator {
	
		private double height;  // stored in meters
		private double weight;  // stored in kilograms
		
	public BMICalculator() {
		super();
	}
	
	public double getBMI() {
		if ( getHeight() == 0 || getWeight() == 0 ) {
			return 0;
		}
		return getWeight() / ( getHeight() * getHeight() );
	}

	private double getHeight() {
		return height;
	}
    
	// arg is height in centimeters
	public void setHeightMetric(double height) throws InvalidInputException {
		if ( height < 1.0 || height > 300.0 ) {
			throw new InvalidInputException ("Specified height out of acceptable range");
		}
		this.height = height/100;
	}
	
	// arg is height in inches
	public void setHeightImperial(double height) throws InvalidInputException {
		setHeightMetric( height * 2.54 );
	}

	private double getWeight() {
		return weight;
	}

	// arg is weight in kilograms
	public void setWeightMetric(double weight) throws InvalidInputException {
		if ( weight < 1.0 || weight > 400.0 ) {
			throw new InvalidInputException ("Specified weight out of acceptable range");
		}
		this.weight = weight;
	}
	
	// arg is weight in pounds
	public void setWeightImperial(double weight) throws InvalidInputException {
		setWeightMetric( weight * 0.45359);
	}
}

