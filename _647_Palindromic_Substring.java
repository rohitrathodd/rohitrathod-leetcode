public class _647_Palindromic_Substring {
    public static int countSubstrings(String s) {

        int totalPalindrom = 0;

        if(s.isBlank()){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){

                String substring = s.substring(i,j);
                if(isPalindrom(substring)){
                    totalPalindrom++;
                }

            }
        }

        return totalPalindrom;
    }

    public static boolean isPalindrom(String s){
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
        System.out.println(countSubstrings("abc"));
    }

}
