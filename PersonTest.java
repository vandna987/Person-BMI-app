package com.monocept.test;

import com.monocept.model.BMI;
import com.monocept.model.GenderOption;
import com.monocept.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person(18, 1.227, 52.0, GenderOption.female,"vandna");
		Person person2 = new Person(18, 2.22, 50, GenderOption.male,"ashvin");
		BMI obj = new BMI(person1);
		System.out.println(person1.getName());
		System.out.println("BMI score is:- " + obj.getBMIScore());
		System.out.println("Body type is:- " + obj.getBodyType());
	}

}
