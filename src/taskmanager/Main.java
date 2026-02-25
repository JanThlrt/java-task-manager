package taskmanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while(true){

            System.out.println("\n1 - Add task");
            System.out.println("2 - Show tasks");
            System.out.println("3 - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                System.out.print("Enter task title: ");
                String title = scanner.nextLine();
                manager.addTask(title);
            }
            else if(choice == 2){
                manager.showTasks();
            }
            else if (choice == 3) {
            	break;
            }
        }
    }
}