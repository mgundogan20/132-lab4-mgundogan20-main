package sports;

import java.util.ArrayList;

public class Athlete {
	private String jersey_number;
	private String name;
	private String surname;
	public enum Gender {FEMALE, MALE};
	private Gender gender;
	
	private int salary;
	private boolean on_contract;
	private Team team;
	
	private static ArrayList<Athlete> all_athletes = new ArrayList<Athlete>();
	public static ArrayList<Athlete> searchByName(String name) {
		ArrayList<Athlete> withName = new ArrayList();
		for(Athlete athlete : all_athletes) {
			if(athlete.getName() == name) {
				withName.add(athlete);
			}
		}
		return withName;
	}
	public static ArrayList<Athlete> searchByJersey(String jersey) {
		ArrayList<Athlete> withJersey = new ArrayList();
		for(Athlete athlete : all_athletes) {
			if(athlete.getJerseyNumber() == jersey) {
				withJersey.add(athlete);
			}
		}
		return withJersey;
	}
	
	public Athlete (String jersey_number, String name, String surname, Gender gender) {
		setJerseyNumber(jersey_number);
		setName(name);
		setSurname(surname);
		setGender(gender);
		
		team = null;
		setSalary(0);
		setOnContract(false);
		
		all_athletes.add(this);
	}
	public Athlete (String jersey_number, String name, String surname, Gender gender, int salary) {
		this(jersey_number, name, surname, gender);
		setSalary(salary);
	}
	
	
	
	
	//*****************getters setters printers*************
	public String getJerseyNumber() {
		return jersey_number;
	}
	public void setJerseyNumber(String jersey_number) {
		this.jersey_number = jersey_number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getFullname() {
		String fullName;
		fullName = getName() + " " + getSurname();
		return fullName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public boolean getOnContract() {
		return on_contract;
	}
	public void setOnContract(boolean on_contract) {
		this.on_contract = on_contract;
	}
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return this.jersey_number + "," + this.surname + "," + this.name + "," + this.salary + " TL" ;
	}
	//-----------------------------------------------------
}

















