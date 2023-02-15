public class _42_Trapping_Rain_Water {

    public static int trap(int[] height) {
        int trapWater = 0;

        int currentHeightIndex=0;

        if(height[0]==0){
            currentHeightIndex=1;
        }
        for(int i=currentHeightIndex+1;i<height.length;i++){

            if(height[currentHeightIndex]<=height[i]){

                trapWater+= ((i-currentHeightIndex-1)*height[currentHeightIndex]);

                for(int j=currentHeightIndex+1;j<i;j++){

                    trapWater = trapWater - height[j];
                }

                currentHeightIndex = i;
            }


        }

        if(currentHeightIndex<height.length-1){

            if(height[currentHeightIndex]>height[currentHeightIndex+1]){
                height[currentHeightIndex]=height[currentHeightIndex]-1;

                int[] arr = new int[height.length-currentHeightIndex];

                for(int i=0,j=currentHeightIndex;i<arr.length;i++){
                    arr[i]=height[j];
                    j++;
                }
                return trapWater+trap(arr);
            }

        }
        return trapWater;
    }



    public static void main(String[] args){
        System.out.println(trap(new int[]{4,2,3}));
    }
}
