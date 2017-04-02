package com.lpp.entity;

public class Person {
private String namep;
private int age;private int age1;
	
	private int age2;
public String getNamep() {
	return namep;
}
public void setNamep(String namep) {
	this.namep = namep;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [namep=" + namep + ", age=" + age + ", getNamep()="
			+ getNamep() + ", getAge()=" + getAge() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

}
