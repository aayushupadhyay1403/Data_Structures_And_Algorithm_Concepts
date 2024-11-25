//Resize an Array
class Array9{
    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
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
        Array9 obj = new Array9();

        int[] arr = {2, 4, 6, 8};

        printArray(arr);

        int[] newArr = obj.resize(arr, arr.length*2);

        printArray(newArr);
    }
}