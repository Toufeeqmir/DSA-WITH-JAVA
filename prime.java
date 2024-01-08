package chapter_one;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int div = 2;
        while (div < n) {
            if (n % div == 0) {
                System.out.println("not prime no");
            } else {
                div = div + 1;
                System.out.println("prime no");
            }
            n++;
            in.close();
        }

    }
}
