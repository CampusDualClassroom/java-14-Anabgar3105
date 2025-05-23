package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}
	@Override
	public void getDetails(){
		StringBuilder sb = new StringBuilder();
				sb.append("Especialización: ")
				.append(specialization);
		super.getDetails();
		System.out.println(sb);
	}
}
