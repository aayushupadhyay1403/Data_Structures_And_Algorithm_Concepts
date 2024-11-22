//BUTTER FLY PATTERN

import java.util.Scanner;

class J{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");

        int m = sc.nextInt();

        //Upper Half
        for(int i=1; i<=m; i++){
            //First Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Spaces
            int space = 2 * (m-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //Second Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //Lower Half
        for(int i=m; i>=1; i--){
            //First Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            int space = 2 * (m-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //Second Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}