package taskmanager;

import java.io.*;
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
    
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Task t : tasks) {
                String line = (t.isDone() ? "1" : "0") + "|" + t.getTitle();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Could not save tasks: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            return; // nichts zu laden, dann ist ok
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|", 2);
                if (parts.length != 2) continue;

                boolean done = parts[0].equals("1");
                String title = parts[1];

                Task t = new Task(title);
                t.setDone(done);
                tasks.add(t);
            }
        } catch (IOException e) {
            System.out.println("Could not load tasks: " + e.getMessage());
        }
    }
    
}
