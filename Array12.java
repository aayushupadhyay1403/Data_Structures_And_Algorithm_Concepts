//Search an element in an Array
class Array12{
    public void findNumber(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println("The number " + x + " is found at index " + i + " of the given array");
            }
        }
    }

    public static void main(String[] args){
        Array12 obj = new Array12();

        // int[] arr = {1, 3, 5, 7, 9};
        int[] arr = {7, 8, 9, 4, 6, 5, 2, 1, 3};

        obj.findNumber(arr, 5);
    }
}