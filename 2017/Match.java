/*
CODED BY - : @VIMALATHAS VITHUSAN
2020/2021 BATCH😊

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
YOUTUBE - https://www.youtube.com/@codewithvithu


2017 JAVA(OOP) PRACTICAL PAPER - UNIVERSITY OF VAVUNIYA
SECOND SEMESTER - MARCH/APRIL 2019 
SUBJECT CODE - TICT1234
*/


import java.util.Arrays;
import java.util.Scanner;

class Cricketer {
	protected String name, birthday, country, role;
	protected double height;
	
	// ***CONSTRUCTOR***
	Cricketer(String name, String birthday, double height, String country) {
		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.country = country;
	}
	
	// ***SETTERS***
	public void setRole(String role) {
		this.role = role;
	}
	
	// ***GETERS***
	String getRole() {
		return role;
	}
}

class Batsman extends Cricketer {
	protected int runs, innings, ballfaced;
	
	// ***CONSTRUCTOR***
	Batsman(String name, String birthday, double height, String country, int runs, int innings, int ballfaced) {
		super(name, birthday, height, country);
		
		this.runs = runs;
		this.innings = innings;
		this.ballfaced = ballfaced;
	}
	
	// ***METHODS***
	public double getBattingAverage() {
		double battingAverage = runs / innings;
		return battingAverage;
	}
	
	public double getBattingStrikerate() {
		double battingStrikeRate = 100 * runs / ballfaced;
		return battingStrikeRate;
	}
	
	public boolean checkSuitability() {
		if (getBattingStrikerate() > 100) {
			System.out.println("Batsman Suitability : Eligible to play for the Twenty20 Matches");
			return true;
		}
		else {
			System.out.println("Batsman Suitability : Not Eligible to play for the Twenty20 Matches");
			return false;
		}
	}
	
	public int calculateHighest(int array[]) {
		Arrays.sort(array);
		
		int highestScore = array[array.length - 1];
		return highestScore;
	}
}

class Bowler extends Cricketer {
	protected int runs, wickets, balls;
	
	Bowler(String name, String birthday, double height, String country, int runs, int wickets, int balls) {
		super(name, birthday, height, country);
		this.runs = runs;
		this.wickets = wickets;
		this.balls = balls;
	}
	
	// ***METHODS***
	public double getBowlingAverage() {
		double bowlingAverage = runs / wickets;
		return bowlingAverage;
	}
	
	public double getBowlingEconomyrate() {
		int overs = balls / 6;
		
		double bowlingEconomyRate = runs / overs;
		return bowlingEconomyRate;
	}
	
	public double getBowlingStrikerate() {
		
		double bowlingStrikeRate = balls / wickets;
		return bowlingStrikeRate;
	}
}


public class Match {
	protected String team1, team2;
	
	Match(String team1, String team2) {
		this.team1 = team1;
		this.team2 = team2;
	}
	
	public String getWinningTeam() {
		int[] rank = {1, 2, 3, 4, 5, 6, 7};
		String[] country = {"India", "South Africa", "England", "Australia", "Sri Lanka", "Bangladesh"};
		
		int team1Rank = 0;
		int team2Rank = 0;

		for (int i = 0; i < country.length; i ++) {
			if (country[i].contains(team1)) {
				team1Rank = i;
			}

			if (country[i].contains(team2)) {
				team2Rank = i;
			}
		}

		if (rank[team1Rank] < rank[team2Rank])
			return "\nWinning Team = " + country[team1Rank];
		else
			return "\nWinning Team = " + country[team2Rank];
		
	}
	
	public static void main(String[] args) {
		Batsman batsMAN = new Batsman("Dinesh Chandimal", "18/11/1989", 5.8, "Sri Lanka", 774, 46, 746);
		batsMAN.setRole("batsman");
		

		Bowler bowler = new Bowler("Lasith Malinga", "28/08/1983", 5.6, "Sri Lanka", 1780, 90, 1451);
		bowler.setRole("bowler");

		// ***WINNING TEAM***
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter team 1 : ");
		String team1 = sc.nextLine();

		System.out.print("Enter team 2 : ");
		String team2 = sc.nextLine();

		Match m1 = new Match(team1, team2);

		System.out.println(m1.getWinningTeam());

		// ***BATSMAN***
		System.out.println("\n***Batsman Deatils***");
		System.out.println("Name : " + batsMAN.name);
		System.out.println("Birthday : " + batsMAN.birthday);
		System.out.println("Height : " + batsMAN.height);
		System.out.println("Country : " + batsMAN.country);
		System.out.println("Runs : " + batsMAN.runs);
		System.out.println("Innings : " + batsMAN.innings);
		System.out.println("Ball Faced : " + batsMAN.ballfaced);
		System.out.println("\nBatting Average : " + batsMAN.getBattingAverage());
		System.out.println("Batting Strike Rate : " + batsMAN.getBattingStrikerate());
		batsMAN.checkSuitability();
		int score[] = {12, 45, 96, 78, 23, 69, 85, 3, 45, 10};
		System.out.println("Highest Score : " + batsMAN.calculateHighest(score));

		// ***BOWLER***
		System.out.println("\n***Bowler Deatils***");
		System.out.println("Name : " + bowler.name);
		System.out.println("Birthday : " + bowler.birthday);
		System.out.println("Height : " + bowler.height);
		System.out.println("Country : " + bowler.country);
		System.out.println("Runs : " + batsMAN.runs);
		System.out.println("Wickets : " + bowler.wickets);
		System.out.println("Balls : " + bowler.balls);
		System.out.println("\nBowling Average : " + bowler.getBowlingAverage());
		System.out.println("Bowling Economy Rate : " + bowler.getBowlingEconomyrate());
		System.out.println("Bowling Strike Rate : " + bowler.getBowlingStrikerate());
	}
}