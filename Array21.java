//SEARCH FOR A NUMBER IN A TWO-D ARRAY

import java.util.Scanner;

class Array21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of cols: ");
        int cols = sc.nextInt();

        int[][] nums = new int[rows][cols];

        System.out.println("Enter the elements in the array: ");
        
        //Input
        //Outer Loop --> Rows
        for(int i=0; i<rows; i++){
            //Inner Loop --> Cols
            for(int j=0; j<cols; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the number to be seached: ");

        int val = sc.nextInt();

        //Output
        //Outer Loop --> Rows
        for(int i=0; i<rows; i++){
            //Inner Loop --> Cols
            for(int j=0; j<cols; j++){
                if(val == nums[i][j]){
                    System.out.println("The given number is found at [" + i + "," + j + "]");
                }
            }
        }
    }
}