package VowelsCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String word= sc.nextLine();

    System.out.println(vowelsInWord(word));
}

    private static int vowelsInWord(String word) {
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            char cur=word.toLowerCase().charAt(i);
            if (cur=='i'||cur=='e'||cur=='a'||cur=='o'||cur=='u'||cur=='y'){
                count++;
            }

        }
        return count;
    }

}
