public class _1011_Capacitive_To_Ship_Packages {
    public int shipWithinDays(int[] weights, int days) {
        int minWeight = weights[0];
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(weights[i]<minWeight){
                minWeight=weights[i];
            }
        }

        int mid = sum/2;
        for(int i=0;i<weights.length;i++){


        }

    }
}
