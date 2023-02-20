public class _242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<t.length();i++){

            s= s.replace(t.charAt(i)+"","");
        }

        if(s.isEmpty()){
            return true;
        }
        return false;
    }
}
