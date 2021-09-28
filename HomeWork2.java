import java.sql.SQLOutput;

public class HomeWork2 {
    public static void main(String[] args) {
        within10and20(125, 2);
        isPositiveOrNegative(-1);
        isNegative(5);
        printLine(5, "java");

    }
    public static void within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
    public static void isPositiveOrNegative (int a) {
        if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }

    }
    public static boolean isNegative(int a) {
        if (a < 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    public static void printLine(int a, String word) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }

    }

}
