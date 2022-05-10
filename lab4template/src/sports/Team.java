package sports;
import java.util.ArrayList;
public class Team {
	private String name;
	private ArrayList<Athlete> athletes;
	private Athlete captain;
	private Club club;
	
	public Team(String name) {
		setName(name);
		athletes = new ArrayList();
		club = null;
		captain = null;
	}
	
	public int teamSalary() {
		int teamSalary = 0;
		for(Athlete athlete : athletes) {
			teamSalary += athlete.getSalary();
		}
		return teamSalary;
	}
	
	
	//*****setters getters printers********
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Athlete> getAthletes(){
		return athletes;
	}
	
	public void addAthlete(Athlete athlete) {
		athlete.setTeam(this);
		athlete.setOnContract(true);
		athletes.add(athlete);
	}
	public void removeAthlete(Athlete athlete) {
		athlete.setTeam(null);
		athlete.setOnContract(false);
		athletes.remove(athlete);
	}
	
	public Athlete getCaptain() {
		return captain;
	}
	public void setCaptain(Athlete captain) {
		if(athletes.contains(captain))
			this.captain = captain;
		else
			System.out.printf("%s is not a part of the team", captain.getFullname());
	}
	
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	
	public String toString() {
		String members = "";
		for(Athlete ath: athletes)
		{
			members += ath.toString() + "\n";
		}
		
		String out = this.name + "\n" + "Team Captain: " + "\n" + this.captain.toString() + "\n" + "Members: \n" + members;
		
		return out;
	}
}








