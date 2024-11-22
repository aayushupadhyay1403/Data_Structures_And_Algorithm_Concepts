//STAR PYRAMID

import java.util.Scanner;

class N{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");

        int m = sc.nextInt();

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
    }
}