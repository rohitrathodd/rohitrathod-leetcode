import java.util.ArrayList;
import java.util.List;

public class _49_Group_Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        boolean[] flag = new boolean[strs.length];
        List<List<String>> list = new ArrayList<List<String>>();
        for(int i=0;i<strs.length;i++){
            flag[i]=false;
        }

        int count=-1;
        for(int i=0;i<strs.length;i++){
            if(flag[i]==true){
                continue;
            }
            count++;
            list.add(new ArrayList<>());
            list.get(count).add(strs[i]);
            flag[i]=true;

            for(int j=i+1;j<strs.length;j++){

                if(isAnagram(strs[i],strs[j])){
                    list.get(count).add(strs[j]);
                    flag[j]=true;
                }
            }
        }

        return list;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<t.length();i++){
            s = s.replaceFirst()
            s= s.replace(t.charAt(i)+"","");
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        System.out.println(groupAnagrams(new String[]{"ddddddddddg","dgggggggggg"}));
    }



}
