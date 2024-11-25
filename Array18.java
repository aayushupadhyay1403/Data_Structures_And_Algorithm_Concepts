// GFG5 : FIND DUPLICATE ELEMENT IN AN ARRAY

public class Array18{
    
    public int findDuplicate(int[] arr){
        int duplicate = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j])
                duplicate = arr[i];
            }
        }
        return duplicate;
    } 

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        Array18 x = new Array18();

        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 8, 6};

        printArray(arr);

        System.out.println(x.findDuplicate(arr));
    }
}