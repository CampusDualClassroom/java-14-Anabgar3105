package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public void getDetails(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ")
				.append(name)
				.append("\nApellido: ")
				.append(surname);
		System.out.println(sb);
	}
}
