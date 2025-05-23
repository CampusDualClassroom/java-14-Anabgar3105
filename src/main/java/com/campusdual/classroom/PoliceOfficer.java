package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public void getDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Comisaría: ").append(squad);
		super.getDetails();
		System.out.println(sb);
	}
}
