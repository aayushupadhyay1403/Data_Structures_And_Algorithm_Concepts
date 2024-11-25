// GFG4 : SORT AN ARRAY

public class Array17{
    
    public void sort(int[] arr){
       
       for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-i-1; j++){
            if(arr[j]>=arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
       }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        Array17 x = new Array17();

        int[] arr = {5, 6, 3, 2, 1};

        printArray(arr);

        x.sort(arr);

        printArray(arr);
    }
}