package Patterns;

public class Main {
    public static void main(String[] args) {

        int n = 5;

        // Pattern 01
        System.out.println("Pattern 01");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 02
        System.out.println("Pattern 02");
        // First for loop defines the amount of rows that will be printed
        // int i = 1 sets value for variable i
        // i <= n means that loop will keep executing while variable i is less or equal to value of n
        // i++ means that each time loop is executed, value of variable i increases by 1
        // Output: * * * * *
        for (int i = 1; i <= n; i++) {
            // Second for loop defines amount of columns and how it's gonna be printed
            // int j = 1 sets value for variable c
            // j <= i means that each column that is being printed, has less or equal value to variable i
            // j++ means that each time loop is executed, value of variable j increases by 1
            // While both loops may seem the same, each of them defines interaction between row column
            // Output in this case: * * * * * * * * * * * * * * *
            //And reason for this output is the first print command, where everything is being printed in single line
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // To fix the previous issue, another print command has to be added, which sole purpose is to print
            // loop in a new line whenever it is executed and with that
            //Output: *
            //        * *
            //        * * *
            //        * * * *
            //        * * * * *
            System.out.println();
        }

        System.out.println();



        // Pattern 03
        System.out.println("Pattern 03");
        for (int i = 1; i <= n; i++) {
            // In this situation, instead of * increasing in number with each row, it's doing the opposite by
            // telling, that variable j value is 5 (int n = 5) meaning, that all 5 columns are printed on first
            // execution of loop and while j is bigger or equal to i (j >= i), loop
            // will keep printing lines with j value decreasing each time (j--)
            for (int j = n; j >= i; j--) {
                // Can also write for (int j = i; j <= n; j++)
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 04
        System.out.println("Pattern 04");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 05
        System.out.println("Pattern 05");
        for (int i = 1; i <= n; i++) {
            // j <= i or 2 <= 1 means that first row of first triangle is gonna be empty
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 06
        System.out.println("Pattern 06");
        for (int i = 1; i <= n; i++) {
            // Also can be written as - for (int j = n - i; j > 0; j--) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println();



        // Pattern 07
        System.out.println("Pattern 07");
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 08
        System.out.println("Pattern 08");
        // a='A' defines character and with a++ calls for the next character when loop is executed
        // ex. a+=2 would mean that it calls every second character, meaning, instead of "A B C ..." it would be
        // "A C E ..."
        for (int i = 1, a='A'; i <= n; i++, a++) {
            for (int j = 1; j <= i; j++) {
                // Of my understanding, (char)a simply calls for previously defined character
                System.out.print((char)a + " ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 09
        System.out.println("Pattern 09");
        for (int i = 1; i <= n; i++) {
            for (int j = 1, a='A'; j <= i; j++, a++) {
                System.out.print((char)a + " ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 10
        System.out.println("Pattern 10");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("B ");
                } else
                    System.out.print("A ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 11
        System.out.println("Pattern 11");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("B ");
                } else
                    System.out.print("A ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 12
        System.out.println("Pattern 12");
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n, a='A'; j >= i; j--, a++) {
                System.out.print((char)a + " ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 13
        System.out.println("Pattern 13");
        for (int i = 1; i <= n; i++) {
            int a = 'A';
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)a++ + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print((char)a++ + " ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 14
        System.out.println("Pattern 14");
        for (int i = 1, b='E'; i <= n; i++, b--) {
            int a = b ;
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print((char)a-- + " ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 15
        System.out.println("Pattern 15");
        //2 * n is needed, cuz pattern has 9 rows
        for (int i = 1, k='A'; i <= 2 * n; i++, k++) {
            int a = k;
            // With my understanding, what comes after ? sets a condition for when b = i > n
            // after : it says that if condition is not met, then b = i
            int b = i > n ? 2 * n - i: i;
            for (int j = 1; j <= b; j++) {
                System.out.print((char)a++ + " ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 16
        System.out.println("Pattern 16");
        for (int i = 1, k='A'; i <= 2 * n; i++, k++) {
            int a = k;
            int b = i > n ? 2 * n - i: i;

            int space = n - b;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= b; j++) {
                System.out.print((char)a++ + " ");
            }
            System.out.println();
        }

        System.out.println();



        // Pattern 17 Character "A"
        System.out.println("Pattern 17");

        int row = 8;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (j == 0 || j == n / 2 && i != 0 ||
                        i == 0 && j != n / 2 ||
                        i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
                System.out.println();
            }
        }



    }
}