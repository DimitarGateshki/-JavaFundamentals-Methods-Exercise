package TopNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numb=Integer.parseInt(sc.nextLine());

        topNumbers(numb);

    }

    private static void topNumbers(int numb) {

        for (int i = 0; i < numb; i++) {
            boolean first= firstCreate(i);
            boolean second= secondCreate(i);
            if (first&&second){
                System.out.println(i);
            }

        }
    }


    private static boolean secondCreate(int i) {
        int count=0;
        while (count==0&&i!=0) {
            if ((i%10)%2!=0){
                count++;
            }
            i/=10;
        }
        if (count==0){
            return false;
        }else {
            return true;
        }

    }


    private static boolean firstCreate(int i) {
        int sum=0;
        while (i!=0){
            sum+=i%10;
            i/=10;
        }
        return sum%8==0;
    }
    
}
