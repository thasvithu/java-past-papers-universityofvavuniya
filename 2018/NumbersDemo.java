/*
CODED BY - : @VIMALATHAS VITHUSAN
2020/2021 BATCH😊

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
YOUTUBE - https://www.youtube.com/@codewithvithu

2018 JAVA(OOP) PRACTICAL PAPER - UNIVERSITY OF VAVUNIYA
SECOND SEMESTER - APRIL/MAY 2020 
SUBJECT CODE - TICT1234
*/


import java.util.Scanner;

class IntgerNumbers {
    int a[] = new int[10];

	// ***CONSTRUCTOR***
	IntgerNumbers() {}
	
    IntgerNumbers(int a[]) {
        this.a = a;
    }
	
	// ***RETURN THE SUM OF ARRAY***
    int sum(int x[]) {
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

	// ***PRINT THE ARRAY VALUES***
    void print(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}

final class NegativeNumbers extends IntgerNumbers {
	
    // ***CONSTRUCTOR***
    NegativeNumbers(int a[]) {
        super(a);
    }

    // ***COUNT NEGATIVE NUMBERS***
    int countNegative() {
		int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                count++;
        }
        return count;
    }
	
	// ***FIND AND STORE THE NEGATIVE NUMBERS***
    void printNegative() {
        int[] nArray = new int[countNegative()];
		int index = 0;
		
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                nArray[index] = a[i];
				index ++;
            }
        }

        System.out.println("The negative numbers in array are:");
        print(nArray);

        System.out.println("\nThe summation of the negative elements in the array is : \n" + sum(nArray));
    }
}

class WholeNumbers extends IntgerNumbers {
	static int x[];
	
	// ***CONSTRUCTOR***
	WholeNumbers() {}
	
	WholeNumbers(int a[]) {
		super(a);
		storeWhole();
	}
	
	// ***COUNT WHOLE NUMBERS***
	int countWhole() {
		int count = 0;
		 for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0)
                count++;
        }
		
		return count;
	}
	
	// ***FIND WHOLE NUMBERS AND STORE IN X[]***
	void storeWhole() {
		x = new int[countWhole()]; // INITIALIZE THE x ARRAY
		int index = 0;
		
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
				x[index] = a[i];
				index ++;
			}
        }
	}
}

class EvenNumbers extends WholeNumbers {
	// ***CONSTRUCTOR***
	EvenNumbers(int a[]) {
		super(a);
	}
	
	// ***FIND EVEN NUMBERS***
	void findEven() {
		System.out.println("\nEven numbers are:");
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0)
				System.out.println(x[i]);
		}
	}
}

class OddNumbers extends WholeNumbers {
	// ***CONSTRUCTOR***
	OddNumbers(int a[]) {
		super(a);
	}
	
	// ***FIND ODD NUMBERS***
	void findOdd() {
		System.out.println("\nOdd numbers are:");
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 1)
				System.out.println(x[i]);
		}
	}
}

// ***OBJECT CLASS***
public class NumbersDemo {
    Scanner sc = new Scanner(System.in);
    int[] y = new int[10];
	
	// ***GET ARRAY VALUES FROM USER***
    void getArray() {
        System.out.println("Enter the numbers for the array:");

        for (int i = 0; i < y.length; i++) {
            y[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        NumbersDemo numDemo = new NumbersDemo();
	
        numDemo.getArray();	// CALL THE getArray METHOD

        System.out.println("*******************************\n");

        // ***ACCESS IntgerNumbers CLASS***
        IntgerNumbers intNumbers = new IntgerNumbers(numDemo.y);
		System.out.println("The summation of the elements in the array is : \n\n" + intNumbers.sum(numDemo.y));

        System.out.println("\n******************************\n");


        // ***ACCESS NegativeNumbers CLASS***
        NegativeNumbers negativeNum = new NegativeNumbers(numDemo.y);
        negativeNum.printNegative();

        System.out.println("\n******************************\n");
	
		// ***ACCESS EvenNumbers CLASS***
		EvenNumbers evenNum = new EvenNumbers(numDemo.y);
		evenNum.findEven();
		
		System.out.println("\n******************************\n");
		
		// ***ACCESS OddNumbers CLASS***
		OddNumbers oddNum = new OddNumbers(numDemo.y);
		oddNum.findOdd();
    }
}
