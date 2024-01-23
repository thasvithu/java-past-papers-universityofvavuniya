/*
CODED BY - : @VIMALATHAS VITHUSAN
<<<<<<< HEAD
2020/2021 BATCH😊

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
YOUTUBE - https://www.youtube.com/@codewithvithu

=======
2020 BATCH

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84

2016 JAVA(OOP) PRACTICAL PAPER - UNIVERSITY OF VAVUNIYA
SECOND SEMESTER - NOVERMBER/DECEMBER 2017 
SUBJECT CODE - TICT1234
*/


class Person {
	private String name, nic;
	private int age;
	
<<<<<<< HEAD
	// ***CONSTRUCTOR***
=======
	//CONSTRUCTOR
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public Person() {}
	
	public Person(String name, String nic, int age) {
		this.name = name;
		this.nic = nic;
		this.age = age;
	}
	
<<<<<<< HEAD
	// ***METHODS***
=======
	//METHODS
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public void print() {
		System.out.println("Name : " + name);
		System.out.println("Nic : " + nic);
		System.out.println("age : " + age);
	}
}

class Student extends Person {
	private double gpa1, gpa2, gpa3, gpa4, finalgpa;
	private String result;
	
<<<<<<< HEAD
	// ***CONSTRUCTOR***
=======
	//CONSTRUCTOR
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public Student(String name, String nic, int age, double gpa1, double gpa2, double gpa3, double gpa4) {
		super(name, nic, age);
		
		this.gpa1 = gpa1;
		this.gpa2 = gpa2;
		this.gpa3 = gpa3;
		this.gpa4 = gpa4;
	}
	
<<<<<<< HEAD
	// ***METHODS***
=======
	//METHODS
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public double calculateFinalGpa() {
		finalgpa = (gpa1 + gpa2 + gpa3 + gpa4) / 4;
		return finalgpa;
	}
	
	public String getFinalResult() {
		if (finalgpa >= 3.70) 
			result = "First Class";
		else if(finalgpa >= 3.30 && finalgpa < 3.70)
			result = "Second Class (Upper Division)";
		else if(finalgpa >= 3.00 && finalgpa < 3.30)
			result = "Second Class (Lower Division)";
		else if(finalgpa < 3.00)
			result = "Pass";
		
		return result;
	}
}

abstract class StaffMember extends Person {
	double basicsalary, loaninstallment;
	final double allowance = 7800;
	
<<<<<<< HEAD
	// ***CONSTRUCTOR***
=======
	//CONSTRUCTOR
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public StaffMember() {}
	
	public StaffMember(String name, String nic, int age, double basicsalary, double loaninstallment) {
		super(name, nic, age);
		
		this.basicsalary = basicsalary;
		this.loaninstallment = loaninstallment;
	}
	
<<<<<<< HEAD
	// ***ABSTRACT METHOD***
=======
	//ABSTRACT METHOD
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public abstract double getSalary();
}

class AcedemicStaff extends StaffMember {
	final double academicallowance = 10;
	
<<<<<<< HEAD
	// ***CONSTRUCTOR***
=======
	//CONSTRUCTOR
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public AcedemicStaff(String name, String nic, int age, double basicsalary, double loaninstallment) {
		super(name, nic, age, basicsalary, loaninstallment);
	}
	
	@Override
	public double getSalary() {
		return basicsalary + allowance + (basicsalary / 100) * academicallowance - loaninstallment;
	}
}

class NonAcedemicStaff extends StaffMember {
	private double overtimehours, overtimepayment;
	
<<<<<<< HEAD
	// ***CONSTRUCTOR***
=======
	//CONSTRUCTOR
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public NonAcedemicStaff(String name, String nic, int age, double basicsalary, double loaninstallment) {
		super(name, nic, age, basicsalary, loaninstallment);
	}
	
<<<<<<< HEAD
	// ***METHODS***
=======
	//METHODS
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
	public double overtimeAmount() {
		return (basicsalary / (20 * 8)) * overtimehours;
	}
	
	@Override
	public double getSalary() {
		return basicsalary + allowance + overtimepayment - loaninstallment;
	}
}


<<<<<<< HEAD
// ***OBJECT CLASS***
=======
//OBJECT CLASS
>>>>>>> 4806100d48383a70b88fdca24014c7f2528feb84
public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "123456789V", 20, 3.5, 3.8, 3.6, 3.7);
        System.out.println("Student Details:");
        student.print();
        System.out.println("Final GPA: " + student.calculateFinalGpa());
        System.out.println("Result: " + student.getFinalResult());

        AcademicStaff academicStaff = new AcademicStaff("Jane Doe", "987654321V", 35, 50000, 2000);
        System.out.println("\nAcademic Staff Details:");
        academicStaff.print();
        System.out.println("Salary: " + academicStaff.getSalary());

        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff("Bob Smith", "654321987V", 40, 40000, 1500);

        System.out.println("\nNon-Academic Staff Details:");
        nonAcademicStaff.print();
        System.out.println("Salary: " + nonAcademicStaff.getSalary());
    }
}
