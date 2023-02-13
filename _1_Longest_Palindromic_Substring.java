import java.sql.SQLOutput;

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
    public static String longestPalindrome(String s) {

        if(isPalindrom(s)){
            return s;
        }
        StringBuffer stringBuffer1 = new StringBuffer(s);
        StringBuffer stringBuffer2 = new StringBuffer(s);
        String first = stringBuffer1.replace(s.length()-1,s.length(),"").toString();
        String second =stringBuffer2.replace(0,1,"").toString();

        if(longestPalindrome(first).length()>=longestPalindrome(second).length()){
            return longestPalindrome(first);
        }
        else
        {
            return longestPalindrome(second);
        }
    }

    public static void main(String[] args){
        System.out.println(longestPalindrome("xaabacxcabaaxcabaax"));
    }
}
