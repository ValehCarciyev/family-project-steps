package NewPack;

import java.util.Scanner;

public class Homework3 {
    private static void giveValueToArray(String[][] schedule) {
        schedule[0][0] = "Sunday";
        schedule[2][0] = "Tuesday";
        schedule[1][0] = "Monday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";
        schedule[0][1] = "Do homework";
        schedule[1][1] = "Go to course; Watch the film.";
        schedule[2][1] = "Meeting with friends";
        schedule[3][1] = "Go to course";
        schedule[4][1] = "Go to sport";
        schedule[5][1] = "Go to course";
        schedule[6][1] = "";
    }

    private static void ShowTasks(String[][] schedule, String day) {
        for (int i = 0; i < 7; i++) {
            if (!day.equalsIgnoreCase("exit")) {
                if (schedule[i][0].equalsIgnoreCase(day.trim())) {
                    if(schedule[i][1].isEmpty()) {
                        System.out.println("Your have no any tasks for " + day);
                    }
                    else{
                        System.out.println("Your tasks for " + day + ": " + schedule[i][1]);
                    }
                    break;
                }
                else if (i == 6) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            }
        }
    }

    private static void changeTasksOfAnyDay(Scanner sc, String[][] schedule, String[] chg_arr, String day) {
        if (chg_arr[0].equalsIgnoreCase("change") || chg_arr[0].equalsIgnoreCase("reschedule")) {
            System.out.println("Please, input new tasks for " + chg_arr[1]);
            String new_task = sc.nextLine();
            for (int i = 0; i < 7; i++) {
                if (schedule[i][0].equalsIgnoreCase(chg_arr[1])) {
                    schedule[i][1] = new_task;
                    break;
                }
            }
        }
        else{
            ShowTasks(schedule, day);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create 2D array
        String[][] schedule = new String[7][2];
        //Give value to array
        giveValueToArray(schedule);
        String[] chg_arr;
        //Input
        String day = "";
        while (!day.equalsIgnoreCase("exit")) {
            System.out.print("Please input the day of the week: ");
            day = sc.nextLine();

            chg_arr = day.split(" ");

            //Change tasks of any day
            changeTasksOfAnyDay(sc, schedule, chg_arr, day);
        }
    }
}