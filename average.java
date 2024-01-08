package chapter_one;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int sum = 0, i = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the exam score :");
        int n = in.nextInt();
        sum = sum + n;
        i = i + 1;
        if (i == 25) {
            int av = sum / 25;
            System.out.println(av);
        } else {
            System.out.println("end programe");
        }
        in.close();

    }
}
