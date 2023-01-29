package com.monocept.model;

public class Person {
	private int age;
	private String name;

	private double height;
	private double weight;
	private GenderOption gender;

	public Person(int age, double height, double weight, GenderOption gender, String name) {

		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public GenderOption getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}
}
