//Hollow Rectangle Pattern 

import java.util.Scanner;

class B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");

        int m = sc.nextInt();

        System.out.println("Enter number of cols: ");

        int n = sc.nextInt();

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i == 1 || j == 1 || i == m || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}