package data;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	final static String SD_PIC = "https://course_report_production.s3.amazonaws.com/"
								+ "rich/rich_files/rich_files/298/s300/skill-distillery.png";
	
	private static Integer newTeamAbr = 0;
	
	private String city;
	private String mascot;
	private String state;
	private String stadium;
	private Integer capacity;
	private String league;
	private String division;
	private String abr;
	private String picturePath;
	private List<Player> hitterRoster;
	private List<Player> pitcherRoster;
	
	public Team(){}
	
	public Team(String city, String mascot, String state, String stadium, Integer capacity, String league,
			String division, String abr, String picturePath) {
		this.city = city;
		this.mascot = mascot;
		this.state = state;
		this.stadium = stadium;
		this.capacity = capacity;
		this.league = league;
		this.division = division;
		this.abr = abr;
		this.picturePath = picturePath;
		this.hitterRoster = new ArrayList<>();
		this.pitcherRoster = new ArrayList<>();
	}
	
	public Team(String city, String mascot, String state, String league, String division, String picturePath) {
		this.city = city;
		this.mascot = mascot;
		this.state = state;
		this.stadium = null;
		this.capacity = null;
		this.league = league;
		this.division = division;
		this.abr = "" + newTeamAbr;
		newTeamAbr++;
		
		if(picturePath == "" || picturePath == null) {
			this.picturePath = SD_PIC;
		} else {
			this.picturePath = picturePath;
		}
		
		this.hitterRoster = new ArrayList<>();
		this.pitcherRoster = new ArrayList<>();
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
	public String getAbr() {
		return abr;
	}

	public void setAbr(String abr) {
		this.abr = abr;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public List<Player> getHitterRoster() {
		return hitterRoster;
	}

	public void setHitterRoster(List<Player> hitterRoster) {
		this.hitterRoster = hitterRoster;
	}

	public List<Player> getPitcherRoster() {
		return pitcherRoster;
	}

	public void setPitcherRoster(List<Player> pitcherRoster) {
		this.pitcherRoster = pitcherRoster;
	}
	
	public void addPlayerToRoster(Player p) {
		if(p instanceof Hitter){
			this.hitterRoster.add(p);
		} else {
			this.pitcherRoster.add(p);			
		}
	}

	@Override
	public String toString() {
		return "Team [city=" + city + ", mascot=" + mascot + ", state=" + state + ", stadium=" + stadium + ", capacity="
				+ capacity + ", league=" + league + ", division=" + division + ", abr=" + abr + ", picturePath="
				+ picturePath + ", hitterRoster=" + hitterRoster + ", pitcherRoster=" + pitcherRoster + "]";
	}

}
