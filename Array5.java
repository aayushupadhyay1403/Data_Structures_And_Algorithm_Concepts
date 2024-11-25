//Reverse an Array
public class Array5{
    public static void reverseArray(int[] numbers, int start, int end){
        while(start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
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
        int[] num = {2, 3, 4, 5, 6};
        printArray(num);
        reverseArray(num, 0, 4);
        printArray(num);
    }
}