package FactorialDivision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first=Integer.parseInt(sc.nextLine());
        int second=Integer.parseInt(sc.nextLine());

        double f1=factoriel(first);
        double f2=factoriel(second);

        double sum=f1/f2;

        System.out.printf("%.2f",sum);

    }


    private static double factoriel(int first) {
        if (first==1){
            return 1;
        }
        return first*factoriel(first-1);

    }


}
