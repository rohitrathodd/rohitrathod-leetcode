import java.util.Locale;
import java.util.regex.Pattern;

public class _125_Valid_Palindrome {

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s= s.replaceAll(Pattern.quote(" "),"");
        String string="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=48 && s.charAt(i)<=57) ){
                string+=s.charAt(i);
            }
        }

        s=string;

        int start =0;
        int end = s.length()-1;

        while(start<end){

            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("0P"));;
    }
}
