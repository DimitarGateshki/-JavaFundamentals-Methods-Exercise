package PasswordValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String pass= sc.nextLine();

        boolean first=LenghtValidator(pass);
        boolean second=ContainValidator(pass);
        boolean third=DigitValidator(pass);

        finalCheck(first,second,third);


    }

    private static void finalCheck(boolean first, boolean second, boolean third) {
        if (first&&second&&third){
            System.out.println("Password is valid");
        }
    }

    private static boolean DigitValidator(String pass) {
        int count=0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                count++;
            }
        }
        if (count>=2){
            return true;
        }else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }

    }

    private static boolean ContainValidator(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isLetterOrDigit(pass.charAt(i))){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    private static boolean LenghtValidator(String pass) {
        if (pass.length()<=10&&pass.length()>=6){
            return true;
        }else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }

    }

}
