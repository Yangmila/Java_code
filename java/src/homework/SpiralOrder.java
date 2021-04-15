package homework;

import java.util.ArrayList;

public class SpiralOrder {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix.length == 0){
            return list;
        }
        int top = 0;
        int button = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top < (matrix.length + 1) / 2 && left < (matrix[0].length + 1) / 2){
            for(int i = left;i <= right;i++){
                list.add(matrix[top][i]);
            }
            for(int i = top + 1;i <= button;i++){
                list.add(matrix[i][right]);
            }
            for(int i = right - 1;top != button && i >= left;i--){
                list.add((matrix[button][i]));
            }
            for(int i = button - 1;left != right && i >= top + 1;i--){
                list.add(matrix[i][left]);
            }
            top++;
            button--;
            left++;
            right--;
        }
        return list;
    }
}
