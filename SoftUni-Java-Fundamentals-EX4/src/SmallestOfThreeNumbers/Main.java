package SmallestOfThreeNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        int c=Integer.parseInt(sc.nextLine());

        System.out.println(smallestInt(a,b,c));
    }

    private static int smallestInt(int a, int b, int c) {
        if (a<=b&&a<=c){
            return a;
        }else if (b<=a&&b<=c){
            return b;
        }else {
            return c;
        }

    }

}
