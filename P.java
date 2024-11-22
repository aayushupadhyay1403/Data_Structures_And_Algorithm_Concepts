//Inverted Star Pyramid

import java.util.Scanner;

class P{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");

        int m = sc.nextInt();

        for(int i=m; i>=1; i--){
            //space
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