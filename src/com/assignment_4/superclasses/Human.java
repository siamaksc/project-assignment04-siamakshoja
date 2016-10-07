package com.assignment_4.superclasses;
/**
 * This is a superclass named Human
 * that has two attributes name:String and age:int and
 * has getters and setters for those attributes.
 */
public class Human {
	private String name;
	private int age;
	/**
	 * Method Human that get two variable name and age.
	 * @param name
	 * @param age
	 */
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
