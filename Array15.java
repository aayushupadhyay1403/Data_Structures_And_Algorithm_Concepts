// GFG2 : REVERSE AN ARRAY

public class Array15{

    public void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Array15 x = new Array15();

        int[] arr = {1, 2, 3, 4, 5};

        printArray(arr);

        x.reverseArray(arr, 0, 4);

        printArray(arr);
    }
}