package taskmanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        
        manager.loadFromFile("tasks.txt");

        while(true){

            System.out.println("\n1 - Add task");
            System.out.println("2 - Show tasks");
            System.out.println("3 - Mark task as done");
            System.out.println("4 - Exit");

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
            else if(choice == 3){
                System.out.print("Enter task number: ");
                int num = scanner.nextInt();
                scanner.nextLine();
                manager.markTaskDone(num - 1);
            }
            else if(choice == 4){
            	manager.saveToFile("tasks.txt");
                break;
            }
        }
    }
}