/*
Sample Input
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Sample Output
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
*/
import java.util.Scanner;

public class DataTypeFitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine()); // number of test cases

        for (int i = 0; i < t; i++) {
            String value = scanner.nextLine();
            try {
                long num = Long.parseLong(value);
                System.out.println(value + " can be fitted in:");
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE)
                    System.out.println("* long");
            } catch (NumberFormatException e) {
                System.out.println(value + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
