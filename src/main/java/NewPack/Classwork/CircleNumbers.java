package NewPack.Classwork;

public class CircleNumbers {
    public static void main(String[] args) {
        int m = 6, n = 1, a = 1;
        for(int i = 1 ;i <= m; i++){
            for (int j = 1; j <= m; j++) {
                if(i == a || j == a || i == m || j == m){
                    System.out.print(n + " ");
                }
                else if(j <= m / 2  && i <= m / 2){
                    System.out.print(n+1 + " ");
                }
            }System.out.println();
            n = 1;
        }
    }
}
