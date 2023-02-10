public class _1_Longest_Palindromic_Substring {

    public static boolean isPalindrom(String string){

        int start =0;
        int end = string.length()-1;

        while(start<end){
            if(string.charAt(start)!=string.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        return null;
    }

    public static void main(String[] args){
        System.out.println(isPalindrom("acbaba"));
    }
}
