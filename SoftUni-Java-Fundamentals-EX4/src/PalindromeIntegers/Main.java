package PalindromeIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input= sc.nextLine();
        while (!input.equals("END")){
            System.out.println(isPalindrome(input));
            input=sc.nextLine();
        }
    }

    private static boolean isPalindrome(String input) {
        String reverse="";
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse+=input.charAt(i);
        }
        if (reverse.equals(input)){
            return true;
        }else {
            return false;
        }
    }


}
