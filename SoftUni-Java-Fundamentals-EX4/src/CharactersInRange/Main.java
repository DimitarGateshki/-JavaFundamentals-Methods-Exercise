package CharactersInRange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);

        System.out.println(charsBetweenGiven(first, second));

    }

    private static String charsBetweenGiven(char first, char second) {
        String out = "";

        if (first < second) {
            for (char i = (char) (first + 1); i < second; i++) {
                out += i + " ";
            }

        } else {
            for (char i = (char) (second + 1); i < first; i++) {
                out += i + " ";
            }

        }
        return out.trim();
    }

}
