// GFG3 : REVERSE AN ARRAY CYCLICALLY 

public class Array16{
    
    public void reverseClockWise(int[] arr){
        int end = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
            arr[0] = end;
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        Array16 x = new Array16();

        int[] arr = {1, 2, 3, 4, 5};

        printArray(arr);
        
        x.reverseClockWise(arr);

        printArray(arr);
    }
}