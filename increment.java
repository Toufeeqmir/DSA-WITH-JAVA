package chapter_one;

public class increment {
    // Pre decrement
    public static void main(String[] args) {
        int a = 20;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // post increment
        int c = 44;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

    }
}
