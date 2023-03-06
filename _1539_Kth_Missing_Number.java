public class _1539_Kth_Missing_Number {

    public static int findKthPositive(int[] arr, int k) {

        int[] positiveIntegers = new int[k];
        int intValue = 1;

        int arrIndex =0;
        int positiveIntegersIndex = 0;

        while(positiveIntegersIndex<k & arrIndex<arr.length){

            if(arr[arrIndex] != intValue){
                positiveIntegers[positiveIntegersIndex]=intValue;
                positiveIntegersIndex++;
                intValue++;
                continue;
            }
            arrIndex++;
            intValue++;
        }

        while(positiveIntegersIndex<k){

            positiveIntegers[positiveIntegersIndex]= intValue;
            intValue++;
            positiveIntegersIndex++;
        }

        return positiveIntegers[k-1];

    }

    public static void main(String[] args){
        System.out.println(findKthPositive(new int[] {1,2,3,4},2));
    }
}
