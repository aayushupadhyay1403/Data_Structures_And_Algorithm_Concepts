//Inverted Half Pyramid(Rotated by 180 deg)

import java.util.Scanner;

class E{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");

        int m = sc.nextInt();

        for(int i=1; i<=m; i++){
            //inner loop -> space print
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            //inner loop -> star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}