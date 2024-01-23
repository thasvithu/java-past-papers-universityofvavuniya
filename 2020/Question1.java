/*
CODED BY - : @VIMALATHAS VITHUSAN
2020/2021 BATCH😊

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
YOUTUBE - https://www.youtube.com/@codewithvithu


2020 JAVA(OOP) PRACTICAL PAPER - UNIVERSITY OF VAVUNIYA
SECOND SEMESTER - DECEMBER/JANUARY 2022/2023
SUBJECT CODE - TICT1234
*/

import java.util.Scanner;

class Question1 {
	Scanner sc = new Scanner(System.in);
	int num1, num2;

	// get user input
	void getNum() {
		System.out.print("Enter first number: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = sc.nextInt();
	}
	
	// add
	void add() {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	// sub
	void sub() {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}
	
	// mul
	void mul() {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}
	
	// div
	void div() {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
	
	public static void main(String[] args) {
		Question1 obj = new Question1();
		
		obj.getNum();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}