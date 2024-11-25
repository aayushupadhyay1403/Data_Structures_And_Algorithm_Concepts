//Find the Missing number in an Array
class Array10{
    public static int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = n * (n + 1)/2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }

    public void showInfo(){
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(findMissingNumber(arr));
    }

    public static void main(String[] args){
        Array10 newArr = new Array10();

        newArr.showInfo();
    }
}