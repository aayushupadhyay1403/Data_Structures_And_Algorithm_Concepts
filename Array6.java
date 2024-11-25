//Find Minimum Number in an Array
public class Array6{
    public int findMin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Array6 obj = new Array6();

        int[] array = new int[]{4, 7, 6, 33, 24};

        printArray(array);

        int minVal = obj.findMin(array);

        System.out.println(minVal);
    }
}