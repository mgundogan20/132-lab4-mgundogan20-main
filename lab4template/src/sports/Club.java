package sports;
import java.util.ArrayList;

public class Club {
	private String name;
	private int yearEstablished;
	private ArrayList<Team> teams;
	
	public Club(String name, int yearEstablished) {
		setName(name);
		setYearEstablished(yearEstablished);
		teams = new ArrayList<>();
	}
	public Club(String name, int yearEstablished, ArrayList<Team> teams) {
		setName(name);
		setYearEstablished(yearEstablished);
		this.teams = teams;
	}
	
	public int clubSalary() {
		int clubSalary = 0;
		for(Team team : teams) {
			clubSalary += team.teamSalary();
		}
		
		return clubSalary;
	}
	
	public void addTeam(Team team) {
		teams.add(team);
		team.setClub(this);
	}
	public void removeTeam(Team team) {
		teams.remove(team);
		team.setClub(null);
	}
	
	//*********In Lab question***************
	public int genderCount(Athlete.Gender gender) {
		int count = 0;
		for(Team team : teams) {
			for(Athlete ath : team.getAthletes()) {
				if(ath.getGender()  == gender) {
					count++;
				}
			}
		}
		return count;
	}
	
	//****************getters setters printers**************
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Team> getTeams(){
		return teams;
	}
	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	
	public int getYearEstablished() {
		return yearEstablished;
	}
	public void setYearEstablished(int year) {
		yearEstablished = year;
	}
	
	//print with gender
	public String toString() 
	{
		String t = "";
		for(Team team: teams)
		{
			t += team.toString() + "\n";
		}
		
		String out = "Club: " + this.name + "\n" + "Year Established: " + this.yearEstablished + "\n" + "Teams: " + "\n" + t;
		out = out + "Total Club Salary: " + this.clubSalary() + "TL\n";
		out = out + "Number of female athletes:  " + this.genderCount(Athlete.Gender.FEMALE) + "\nNumber of male athletes:  " + this.genderCount(Athlete.Gender.MALE) + "\n";
		
		return out;
	}
	
	//print without gender
	/*
	public String toString() 
	{
		String t = "";
		for(Team team: teams)
		{
			t += team.toString() + "\n";
		}	
		String out = "Club: " + this.name + "\n" + "Year Established: " + this.yearEstablished + "\n" + "Teams: " + "\n" + t;
		out = out + "Total Club Salary: " + this.clubSalary() + "TL\n";
		return out;
	}
	*/
}
