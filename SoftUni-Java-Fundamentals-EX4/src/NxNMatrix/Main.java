package NxNMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numb=Integer.parseInt(sc.nextLine());

        printMatrix(numb);



    }

    private static void printMatrix(int numb) {
        for (int i = 0; i < numb; i++) {
            for (int j = 0; j < numb; j++) {
                System.out.print(numb+" ");
            }
            System.out.println();
        }
    }

}
