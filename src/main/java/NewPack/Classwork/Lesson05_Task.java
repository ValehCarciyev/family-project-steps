package NewPack.Classwork;

import java.util.Arrays;
import java.util.Random;

public class Lesson05_Task {
    private static void Combine(int m, int n, int[] odd, int[] even, int[] oddeven, int a, int b) {
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
    }

    private static void Fill(int m, int[] odd, int[] even, Random r) {
        for(int i = 0; i < m; i++){
            int o = r.nextInt(100);
            odd[i] = (o * 2) + 1;
            even[i] = o * 2;
        }
    }
    public static void main(String[] args) {
        int m = 10, n = 10;
        int[] odd = new int[m];
        int[] even = new int[n];
        int[] oddeven = new int[m+n];
        Random r = new Random();
        Fill(m, odd, even, r);
        int a = 0, b = 0;
        Combine(m, n, odd, even, oddeven, a, b);
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(oddeven));
    }
}