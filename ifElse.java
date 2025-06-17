/*
Task
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format
A single line containing a positive integer, .

Constraints

Output Format
Print Weird if the number is weird; otherwise, print Not n Weird.

Sample Input 0
3

Sample Output 0
Weird

Sample Input 1
24

Sample Output 1
Not Weird

Explanation
Sample Case 0: n=3
 nis odd and odd numbers are weird, so we print Weird.

Sample Case 1: n=24
 n>20 and n is even, so it isn't weird. Thus, we print Not Weird
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 1) {  // n is odd
            System.out.println("Weird");
        } else {
            // n is even
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
