package AddAndSubtract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Integer first=Integer.parseInt(sc.nextLine());
        Integer second=Integer.parseInt(sc.nextLine());
        Integer third =Integer.parseInt(sc.nextLine());

        int sum=sumNumbers(first,second);
        sum=substractNumbers(sum,third);
        System.out.println(sum);


    }

    private static int substractNumbers(int sum, Integer second) {
        return sum-second;
    }

    private static int sumNumbers(Integer first, Integer second) {
        return first+second;
    }

}
