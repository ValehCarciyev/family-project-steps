package NewPack.Classwork;

import java.util.Arrays;
import java.util.Random;

public class Lesson05_Task {
    public static void main(String[] args) {
        int m = 10, n = 10;
        int[] odd = new int[m];
        int[] even = new int[n];
        int[] oddeven = new int[m+n];
        Random r = new Random();
        for(int i = 0; i < m; i++){
            int o = r.nextInt(100);
            odd[i] = (o * 2) + 1;
        }
        for (int i = 0; i < n; i++) {
            int e = r.nextInt(100);
            even[i] = e * 2;
        }
        int a = 0, b = 0;
        for(int i = 0; i < m + n; i ++){
            if(i % 2 == 0){
                oddeven[i] = odd[a];
                a++;
            }
            else{
                oddeven[i] = even[b];
                b++;
            }
        }
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(oddeven));
    }
}
