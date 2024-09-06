//Bubblesort
//Here we are not creating any object so no return type/value
//In this bubble sort we are returning the array if swapping is not happened in first pass
import java.util.Arrays;
class Bubble{
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    
    static void bubble(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length ; j++){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                    System.out.println("not swapped already");
                }
            }
            if (!swapped) {
                System.out.println("swapped already");
                 break;
            }
        }

    }
}