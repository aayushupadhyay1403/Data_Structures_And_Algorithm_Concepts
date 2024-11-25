//Remove Even Integers From an Array
public class Array4{
    int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Array4 obj = new Array4();

        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};

        printArray(array);
        int[] newArray = obj.removeEven(array);
        printArray(newArray);
        
    }

}