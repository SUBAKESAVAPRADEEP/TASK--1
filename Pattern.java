package Task;

import java.util.Scanner;

//write a java program to print a bellowed pattern
//55555
//54444
//54333
//54321
//54321



public class Pattern {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            for (int k = i; k >= 2; k--) {
                System.out.print(i);
            }
            System.out.println();
        }
        }
    }






