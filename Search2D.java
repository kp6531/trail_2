//2D-Array search(Matrix search)
//It's not a sorted array so searching each element
import java.util.Arrays;
class Search2D{
     public static void main(String[] args) {
        int[][] arr = {
            {10, 12, 3},
            {11, 22, -1},
            {6, 9, 5}
        };
        int target = 70;

        System.out.println(Arrays.toString(search(arr, target)));
     }

     static int[] search(int[][] arr, int target){
        
        for (int row =0; row < 3; row++){
            for (int col =0; col < 3; col++){
                if (target == arr[row][col]) {
                    return new int[] {row, col};
                }
        }
     }
      return new int[] {-1, -1};
}
}