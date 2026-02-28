// TaskTracker.java

import java.util.List;

public class TaskTracker {
    // Instance variables
    private List<Task> tasks;

    // Public interface
    public TaskTracker();
    public void addTask(String description);
    public void markTaskCompleted(String description);
    public List<String> getPendingTasks();
    public void deleteTask(String description);
    // Additional useful methods
    public List<String> getCompletedTasks();
    public int getTaskCount();
}
