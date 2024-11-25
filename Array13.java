//Find Maximum value in an Array
class Array13{
    public void findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The maximum value of the given array is: " + max);
    }

    public static void main(String[] args){
        Array13 obj = new Array13();
        
        int[] arr = {33, 78, 58, 99, 21};

        obj.findMax(arr);
    }
}