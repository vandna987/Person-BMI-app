package com.monocept.model;

public class BMI {
	Person person;
	private double bmi;

	public BMI(Person person) {

		this.person = person;
		bmi = calculateBMI();
	}

	private double calculateBMI() {
		return (person.getWeight() / (person.getHeight() * person.getHeight()));

	}

	public double getBMIScore() {

		return bmi;

	}

	public String getBodyType() {
		
		if (bmi < 18.5)
			return "UnderWeight";
		if (bmi > 18.5 && bmi < 24.9)
			return "Healthy Weight";
		if (bmi > 25 && bmi < 29.9)
			return "Overweight";

		return "Obese";

	}

}
