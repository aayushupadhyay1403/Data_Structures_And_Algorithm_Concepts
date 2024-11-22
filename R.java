//STAR DIAMOND PATTERN

import java.util.Scanner;

class R{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");

        int m = sc.nextInt();
        
        //Upper Half
        for(int i=1; i<=m; i++){
            //spaces 
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lower Half
        for(int i=m; i>=1; i--){
            //spaces
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}