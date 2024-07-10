package controlstatments;

public class ControlStatments {

    public ControlStatments() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // Selection Statements
        System.out.println("Selection Statements:");

        int num = 10;
        if (num > 0) {
            System.out.println("num is positive");
        } else if (num < 0) {
            System.out.println("num is negative");
        } else {
            System.out.println("num is zero");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Loop Iteration Statements
        System.out.println("\nLoop Iteration Statements:");

        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // While loop
        System.out.println("While loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("count: " + count);
            count++;
        }

        // Do-while loop
        System.out.println("Do-while loop:");
        int j = 0;
        do {
            System.out.println("j: " + j);
            j++;
        } while (j < 5);

        // Branching Transfer Statements
        System.out.println("\nBranching Transfer Statements:");

        // Break statement
        System.out.println("Break statement:");
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println("k: " + k);
        }

        // Continue statement
        System.out.println("Continue statement:");
        for (int l = 0; l < 10; l++) {
            if (l % 2 == 0) {
                continue;
            }
            System.out.println("l: " + l);
        }

        // Return statement
        System.out.println("Return statement:");
        System.out.println("Returned value: " + returnExample());

        // Labeled break and continue
        System.out.println("Labeled break and continue:");
        outerLoop:
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                if (m == 1 && n == 1) {
                    break outerLoop; // breaks the outer loop
                }
                System.out.println("m: " + m + ", n: " + n);
            }
        }

        outerLoop2:
        for (int o = 0; o < 3; o++) {
            for (int p = 0; p < 3; p++) {
                if (o == 1 && p == 1) {
                    continue outerLoop2; // continues the outer loop
                }
                System.out.println("o: " + o + ", p: " + p);
            }
        }
    }

    public static int returnExample() {
        return 42; // Example value to demonstrate return statement
    }
}
