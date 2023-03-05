public class _28_haystack_needle {
    public static int strStr(String haystack, String needle) {

        if(needle.length()>haystack.length()){
            return -1;
        }

        for(int i=0,j=0;i<haystack.length();i++){

            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==needle.length()-1){
                    return i-j;
                }
                i=i-j+1;
                j++;

                continue;
            }
            j=0;
        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println(strStr("mississippi","issip"));
    }
}
