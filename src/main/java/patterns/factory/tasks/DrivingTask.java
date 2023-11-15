package patterns.factory.tasks;

public final class DrivingTask implements Task {

    private String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask() {
        if (where != null && using != null){
            System.out.println("Drive using '" + using + "' to location '" + where + "'");
            return true;
        } else {
            System.out.println("Error please try again...");
            return false;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
