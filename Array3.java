//Print Elements Of An Array
public class Array3{
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        printArray(new int[]{5, 8, 7, 6, 1});
    }
}