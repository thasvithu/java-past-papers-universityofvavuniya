/*
CODED BY - : @VIMALATHAS VITHUSAN
2020/2021 BATCH😊

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
YOUTUBE - https://www.youtube.com/@codewithvithu


ICAE 2
*/


import java.util.*;


class Student {
    //declaring instance variables
    private String name;
    private char gender;
    private String regNum;
    private int academicYear;

    //default constructor
    Student() {}

    Student(int acYear) {
        this.academicYear = acYear;
    }

    //parameterized constructor
    Student(String name, char gender, String regNum, int academicYear) {
        this.name = name;
        this.gender = gender;
        this.regNum = regNum;
        this.academicYear = academicYear;
    }

    //getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    //registration number
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getRegNum() {
        return regNum;
    }

    //academic year - readonly
    public int getAcYear() {
        return academicYear;
    }
}


class Course {
    //declaring instance variables
    private String courseName;
    private int credits;
    private String inCharge;
    private int totalHours;

    //default constructor
    Course() {}

    //parameterized constructor
    Course(String courseName, int credits, String incharge, int totalHours) {
        this.courseName = courseName;
        this.credits = credits;
        this.inCharge = incharge;
        this.totalHours = totalHours;
    }

    //getters and setters
    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getcourseName() {
        return courseName;
    }

    //credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    //incharge
    public void setinCharge(String inCharge) {
        this.inCharge = inCharge;
    }

    public String getIncharge() {
        return inCharge;
    }

    //total hours
    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public int getTotalHours() {
        return totalHours;
    }

    //method - checkcourse
    public boolean checkCourse(String crsName) {
        if (courseName.contains(crsName))
            return true;
        else
            return false;
    }

    //method-checkduration
    public void checkDuration() {
        if (totalHours > 15)
            System.out.println("The duration exceeds the limit");
        else
            System.out.println("Duration is limited");
    }

    //method-printcoursedetails
    public void printCourseDetails() {
        System.out.println("*****\nCourse Name: " + courseName + "\nCredits: " + credits + "\nIncharge: " + inCharge + "\nTotal Hours: " + totalHours + "\n*****");
    }

    //methodcalculatecoursegpa
    public double calculateCourseGPA(double gpa) {
        double crsgpa = credits * gpa;
        return crsgpa;
    }
}


class NonCredit extends Course {
    //declaring instance variable
    private int minMarks;

    //getter and setter
    //minmarks
    public int getMinMarks() {
        return minMarks;
    }

    public void setMinMarks(int minMarks) {
        this.minMarks = minMarks;
    }

    //overloading method calculatecoursegpa
    public double calculateCourseGPA() {
        System.out.println("Non credit subject");
        return 0;
    }
}

//defining class academy appa
class AcademyApp {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student(2017);
        System.out.println("-------------The Techzie Academy------------");

        st1.setName("Jhon");
        System.out.println("Name: " + st1.getName());

        st1.setGender('M');
        System.out.println("Gender: " + st1.getGender());

        st1.setRegNum("2017/ICT/009");
        System.out.println("Registration Number: " + st1.getRegNum());

        System.out.println("Accademic Year : " + st1.getAcYear());

        System.out.println("---------------------------------------------");

        //object initializer - Class Course
        Course crsArr[] = new Course[]
                {
                        new Course("OOP Concepts", 2, "Mrs.A.Harish", 30),
                        new Course("Database Design", 2, "Mrs.A.D.Bandara", 15)

                };


        System.out.print("Enter the course you want to find: ");
        String cname = sc.nextLine();
        int available = 0;

        for (int i = 0; i < crsArr.length; i++) {
            if (crsArr[i].checkCourse(cname)) {
                available = 1;
                break;
            } else {
                continue;
            }

        }
        if (available == 1)
            System.out.println("The Course is Available");
        else
            System.out.println("The Course is Unavailable");

        System.out.println("---------------------------------------------");

        crsArr[0].printCourseDetails();
        crsArr[0].checkDuration();
        crsArr[0].calculateCourseGPA(3.5);

        System.out.println("---------------------------------------------");

        NonCredit nc = new NonCredit();
        nc.setMinMarks(30);
        nc.getMinMarks();
        nc.calculateCourseGPA();

        sc.close();
    }
}
