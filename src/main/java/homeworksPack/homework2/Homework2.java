package homeworksPack.homework2;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    private static void GiveValueToArray(String[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int  j = 0 ; j < matrix.length; j++){
                matrix[i][j] = "-";
            }
        }
    }

    private static void PrintMatrix(String[][] matrix) {
        for(int i = 0 ; i < matrix.length; i++){
            System.out.print(i + " | ");
            for( int j = 0 ; j < matrix.length - 1; j++){
                if(i == 0){
                    System.out.print((j+1) + " | ");
                }
                else{
                    System.out.print(matrix[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }

    private static void ShootTarget(String[][] matrix, Scanner sc, int row, int col) {
        int user_row;
        int user_col;
        try {
            do {
                System.out.print("Please, enter row: ");
                user_row = sc.nextInt();
                System.out.print("Please, enter column: ");
                user_col = sc.nextInt();
                if (user_col == col && user_row == row && user_col != 0 && user_row != 0) {
                    System.out.println("You have won!");
                    matrix[user_row][user_col - 1] = "X";
                } else {
                    matrix[user_row][user_col - 1] = "*";
                }
                PrintMatrix(matrix); //Print Changed Matrix.
            } while (user_col != col || user_row != row);
        } catch (Exception e) {
            System.out.println("Please try again!");
        }
    }

    public static void main(String[] args) {
        String[][] matrix = new String[6][6];
        GiveValueToArray(matrix);
        Scanner sc= new Scanner(System.in);
        Random r = new Random();
        int row = r.nextInt(5) + 1;
        int col = r.nextInt(5) + 1;
        System.out.println("All set. Get ready to rumble!");
        PrintMatrix(matrix); //Print Matrix.
        int user_row ;
        int user_col ;
        ShootTarget(matrix, sc, row, col);
    }
}

