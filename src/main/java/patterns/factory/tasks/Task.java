package patterns.factory.tasks;

public interface Task {

    boolean executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
