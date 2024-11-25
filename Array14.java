// GFG1 : FIND MIN AND MAX VALUE IN AN ARRAY

public class Array14{
    
    public int findMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
       

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        Array14 x = new Array14();

        int[] arr = {2, 3, 4, 5, 6};

        printArray(arr);
        System.out.println(x.findMin(arr));
        System.out.println(x.findMax(arr));
    }
}