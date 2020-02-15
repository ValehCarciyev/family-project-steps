package NewPack.Classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Task_Shift_ArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=10;
        int temp;
        int[] array = new int[m];
        int[] arr = new int[m];
        for(int i = 0 ; i < m; i++){
            array[i] = (int) (Math.random() * 200 -100);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > 0){

                    if(array[j] > 0){
                        arr[j] = array[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[i] > 0){
                    if(array[j] > 0){
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            for (int j = array.length - 2; j >= 0 ; j--) {
                if(array[i] < 0){
                    if(array[j] < 0){
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }*/
        //System.out.println(Arrays.toString(array));
    }
}
