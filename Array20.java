//TWO-D ARRAY

import java.util.Scanner;

class Array20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of cols: ");
        int cols = sc.nextInt();

        int[][] nums = new int[rows][cols];

        System.out.println("Enter elements in an array: ");

        //Input
        //Outer loop --> For Rows
        for(int i=0; i<rows; i++){
            //Inner Loop --> For Cols
            for(int j=0; j<cols; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        //Output
        //Outer Loop --> For Rows
        for(int i=0; i<rows; i++){
            //Inner Loop --> For Cols
            for(int j=0; j<cols; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}