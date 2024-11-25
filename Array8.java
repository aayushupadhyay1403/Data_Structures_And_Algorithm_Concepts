//Move Zeros to the End of the array
class Array8{
    public void moveZeros(int[] arr){ 
       int j = 0;
       for(int i=0; i<arr.length; i++){
        if(arr[i] != 0 && arr[j] == 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        if(arr[j] != 0){
            j++;
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
        Array8 obj = new Array8();

        int[] arr = {8, 1, 0, 2, 1, 0, 3};

        printArray(arr);

        obj.moveZeros(arr);

        printArray(arr);
    }
}