public class _941_Valid_Mountain_Array {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int start=0;
        int end=arr.length-1;
        int index = 0;
        while(start<end){
            int mid= start + (end - start)/2;

            if(arr[mid]<=arr[mid+1]){
                start = mid +1;
            }else if(arr[mid]>arr[mid+1]){
                end=mid;
            }

        }

        index=start;
        if(index==0 || index==arr.length-1){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            if(i<index){
                if(arr[i]>=arr[i+1]){
                    return false;
                }
                continue;
            }
            if(i!=arr.length-1){
                if(arr[i]<=arr[i+1]){
                    return false;
                }
            }


        }

        return true;
    }
}
