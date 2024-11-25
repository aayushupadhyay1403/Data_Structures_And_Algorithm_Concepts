class Array11{
    public boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        Array11 obj = new Array11();

        // String word = "madam";
        String word = "that";

        System.out.println(obj.isPalindrome(word));

    }
}