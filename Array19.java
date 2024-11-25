//LEETCODE: REMOVE DUPLICATE ELEMENTS 

public class Array19{
     
    public int removeDuplicate(int[] arr){
        int temp = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
            }
        }
        return temp;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Array19 obj = new Array19();
        
        // int[] arr = {1, 1, 2};
        int[] arr = {1, 2, 2};

        printArray(arr);

        System.out.println(obj.removeDuplicate(arr));

        printArray(arr);
    }
}