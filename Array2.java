//Adding or Updating Elements in Array
public class Array2{
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myarr = new int[5];
        printArray(myarr);
        myarr[0] = 4;
        myarr[1] = 5;
        myarr[2] = 9;
        myarr[3] = 7;
        myarr[4] = 3;
        myarr[2] = 8;
        printArray(myarr);
        // myarr[5] = 10;ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args){
        Array2 arrutil = new Array2();
        arrutil.arrayDemo();
    }
}