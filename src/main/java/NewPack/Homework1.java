package NewPack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int i=0;
        int sec_num = r.nextInt(100);
        System.out.println("Let the game begin!");
        String username = sc.next();
        int user_num = -1;

        while(sec_num != user_num){
            user_num = sc.nextInt();
            arr[i] = user_num;
            i++;
            if (user_num == sec_num){
                System.out.println("Congratulations, " + username);
                break;
            }
            else if(sec_num > user_num){
                System.out.println("Your number is too small. Please, try again.");
            }
            else if(sec_num < user_num){
                System.out.println("Your number is too big. Please, try again.");
            }
        }
        Arrays.sort(arr);
        System.out.print("Your numbers: ");
        for(int j=0;j<i;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
