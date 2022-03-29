package MiddleCharacters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word= sc.nextLine();
        printMiddleChars(word);

    }

    private static void printMiddleChars(String word) {
        if (word.length()%2==0){
            int first=word.length()/2-1;
            int second=first+1;
            System.out.print(word.charAt(first));
            System.out.print(word.charAt(second));
        }else {
            int middle=(word.length()-1)/2;
            System.out.println(word.charAt(middle));
        }
    }

}
