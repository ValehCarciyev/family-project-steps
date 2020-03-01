package NewPack.homework1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Homework1 {
    private static void FindSecretNumber(int[] arr, Scanner sc, int i, int sec_num, String username) {
        int user_num;
        do{
            System.out.print("Enter your number: ");
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
            else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }while(true);
    }

    private static void ShowUserInputs(int[] arr) {
        System.out.print("Your numbers: ");
        for (int value : arr) {
            if (value != 0)
                System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int i=0;
        int sec_num = r.nextInt(100);
        System.out.println("Let the game begin!");
        System.out.print("Please enter your name: ");
        String username = sc.next();
        int user_num;
        FindSecretNumber(arr, sc, i, sec_num, username);
        Arrays.sort(arr);
        ShowUserInputs(arr);
    }
}
