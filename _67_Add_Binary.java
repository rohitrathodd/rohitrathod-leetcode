public class _67_Add_Binary {

    public static  String addBinary(String a, String b) {
        String sum = "";

        if(a.length()<b.length()){
           int padding= b.length()-a.length();
           for(int i=0;i<padding;i++){
               a="0"+a;
           }
        }else if(a.length()>b.length()) {
            int padding = a.length() - b.length();
            for (int i = 0; i < padding; i++) {
                b = "0" + b;
            }
        }
        int length = a.length();
        int carry = 0;
        for(int i=0;i<length;i++){

            int currentSum = carry + (int) ( a.charAt(length-1-i) -'0') + (int) (b.charAt(length-1-i)-'0');

            if(currentSum<=1){
                sum = currentSum + sum ;
                carry=0;
            }else if(currentSum == 2){
                sum = 0 + sum ;
                carry=1;
            }else if(currentSum==3){
                sum = 1+sum;
                carry=1;
            }
        }

        if(carry==1){
            sum = carry + sum;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(addBinary("1","1"));
    }
}
