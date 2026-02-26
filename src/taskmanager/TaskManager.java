package taskmanager;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        Task newTask = new Task(title);
        tasks.add(newTask);
    }

    public void showTasks() {
        if(tasks.isEmpty()){
            System.out.println("No tasks available.");
            return;
        }

        for(int i = 0; i < tasks.size(); i++){
            Task t = tasks.get(i);
            System.out.println((i+1) + ". " + t.getTitle() + (t.isDone() ? " [Done]" : ""));
        }
    }
    
    public void markTaskDone(int index) {
        if(index >= 0 && index < tasks.size()){
            tasks.get(index).markDone();
        } else {
            System.out.println("Invalid task number.");
        }
    }
    
}
