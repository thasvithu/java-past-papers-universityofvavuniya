/*
CODED BY - : @VIMALATHAS VITHUSAN
2020/2021 BATCH😊

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
YOUTUBE - https://www.youtube.com/@codewithvithu


2021 JAVA(OOP) PRACTICAL PAPER - UNIVERSITY OF VAVUNIYA
SECOND SEMESTER - AUGUST/SEPTEMBER 2023
*/


class Movie {
	private String title, productionCompany;
	private int year;
	private double budget, worldwideEarnings;
	private Actor leadActor;
	
	// ***Constructor***
	public Movie(String title, int year, double budget, double worldwideEarnings, Actor leadActor, String productionCompany) {
		this.title = title;
		this.year = year;
		this.budget = budget;
		this.worldwideEarnings = worldwideEarnings;
		this.leadActor = leadActor;
		this.productionCompany = productionCompany;
	}
	
	// ***getters Methods***
	public String getTitle() {
		return this.title;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public double getBudget() {
		return this.budget;
	}
	
	public double getWorldwideEarnings() {
		return this.worldwideEarnings;
	}
	
	public Actor getLeadActor() {
		return this.leadActor;
	}
	
	public String getProductionCompany() {
		return this.productionCompany;
	}
	
	public void play() {
		System.out.println("Movie : " + getTitle() + " (" + getYear() +")");
		System.out.println("productionCompany : " + getProductionCompany());
		System.out.println("Budget : $" + getBudget());
		System.out.println("WorldwideEarnings : $" + getWorldwideEarnings());
		System.out.println("LeadActor : " + getLeadActor().getName());
	}
	
	// ***Set worldwideEarnings***
	public void setWorldwideEarnings(double worldwideEarnings) {
		this.worldwideEarnings = worldwideEarnings;
	}
}

class Actor {
	private String name, gender, country;
	private int age;
	
	// ***Constructor***
	public Actor(String name, String gender, int age, String country) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}
	
	// ***getters Methods***
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void displayInfo() {
		System.out.println("Name : " + getName());
		System.out.println("Gender : " + getGender());
		System.out.println("Age : " + getAge());
		System.out.println("Country : " + getCountry());
	}
}

public class MovieApp {
	public static void main(String[] args) {
		//i. Create the following Actors.
		Actor[] a = new Actor[] {
			new Actor("Christian Bale", "Male", 47, "United Kingdom"),
			new Actor("Jim Carrey", "Male", 60, "Canada"),
			new Actor("Leonardo DiCaprio", "Male", 47, "United States"),
			new Actor("Tom Cruise", "Male", 59, "United States"),
			new Actor("Scarlett Johansson", "Female", 37, "United States"),
			new Actor("Chris Hemsworth", "Male", 38, "Australia")
		};
		
		//ii. Create the following Movies.
		Movie[] m = new Movie[] {
			new Movie("The Dark Knight", 2008, 185, 1004, a[0], "Warner Bros"),
			new Movie("Mission:Impossible", 2018, 178, 791, a[3], "Paramount Pictures"),
			new Movie("Avengers:Endgame", 2019, 356, 2798, a[4], "Marvel Studios"),
			new Movie("John Wick", 2014, 20, 89, a[5], "Lionsgate"),
			new Movie("Inception", 2010, 160, 828.3, a[2], "Warner Bros"),
			new Movie("Interstellar", 2014, 165, 677.47, a[2], "Paramount Pictures"),
			new Movie("The Matrix", 1999, 63, 463.57, a[3], "Warner Bros"),
			new Movie("Blade Runner 2049", 2017, 150, 259.24, a[0], "Warner Bros"),
			new Movie("Star Wars: Episode VII", 2015, 245, 2068.2, a[4], "Lucasfilm"),
			new Movie("Dumb and Dumber", 1994, 17, 247.28, a[1], "NewLine Cinema")
		};
		

		//iii. Set the World wide Earning of the film “Interstellar” to 701.27.
		for (int i = 0; i < m.length; i++) {
			if (m[i].getTitle().contains("Interstellar")) {
				m[i].setWorldwideEarnings(701.27);
				break;
			}
		}
		
		//iv. Display the details of the highest grossing movie
		System.out.println("##################################################################\nHighest Grossing Movie:");
		
		double maxGross = m[0].getWorldwideEarnings();
		int getIndex = 0;
		
		for (int i = 1; i < m.length; i++) {
			if (m[i].getWorldwideEarnings() > maxGross) {
				maxGross = m[i].getWorldwideEarnings();
				getIndex = i;
			}
		}
		
		m[getIndex].play();
		
		
		//v. List the movies released after 2017.
		System.out.println("##################################################################\nMovies Released after 2017:");
		
		for (int i = 0; i < m.length; i++) {
			if (m[i].getYear() > 2017) {
				m[i].play();
				System.out.println();
			}
		}
		
		
		//vi. Display the production company with the highest total collection.
		System.out.println("##################################################################");
		System.out.println("Production Company with the Highest Total Collection : " + m[getIndex].getProductionCompany());
		
		
		//vii. Find the total collection earned by ”Warner Bros”.
		System.out.println("\n##################################################################");
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getProductionCompany().contains("Warner Bros"))
				sum += m[i].getWorldwideEarnings();
		}
		
		System.out.println("Total Collection Earned by Warner Bros : $" + sum);
		
		
		//viii. List the Movie names played by the actor “Tom Cruise”.
		System.out.println("\n##################################################################");
		System.out.println("Movies acted by the actor Tom Cruise:");
		
		for (int i = 0; i < m.length; i++) {
			if (m[i].getLeadActor().getName().contains("Tom Cruise"))
				System.out.println(m[i].getTitle());
		}
		
		
		//ix. Display the details of the actors from the United States.
		System.out.println("\n##################################################################");
		System.out.println("Actors from United States");
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].getCountry().contains("United States"))
				a[i].displayInfo();
		}
	} 
}