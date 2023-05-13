import java.util.ArrayList;
import java.util.List;

public class _54_Spiral_Matrix {

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
    public static List<Integer> spiralOrder(int[][] matrix){

        int row = matrix.length;
        int column = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        int index=0;
        int i=0;
        int j=0;
        boolean flag=false;
        while(true){
            //left to right
            while(j<column){
                list.add(matrix[i][j]);
                ++j;
                flag=true;
            }
            --j;
            if(flag){
                flag=false;
            }else{
                break;
            }
            //top to bottom
            ++i;
            while(i<row){
                list.add(matrix[i][j]);
                i++;
                flag=true;
            }
            --i;
            if(flag){
                flag=false;
            }else{
                break;
            }
            //right to left
            --j;
            while(j>=index){
                list.add(matrix[i][j]);
                --j;
                flag=true;
            }
            ++j;
            if(flag){
                flag=false;
            }else{
                break;
            }
            //bottom to up
            --i;
            while(i>index){
                list.add(matrix[i][j]);
                --i;
                flag=true;
            }
            if(flag){
                flag=false;
            }else{
                break;
            }

            index++;
            row--;
            column--;
            i=index;
            j=index;
        }

        return list;
    }
}
