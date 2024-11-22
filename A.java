//Solid Rectangle Pattern

import java.util.Scanner;

class A{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of row: ");

    int m = sc.nextInt();

    System.out.println("Enter number of cols: ");

    int n = sc.nextInt();

    for(int i=1; i<=m; i++){
      for(int j=1; j<=n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}