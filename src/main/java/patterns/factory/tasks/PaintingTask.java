package patterns.factory.tasks;

public final  class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask() {
        if (color != null && whatToPaint != null){
            System.out.println("Paint '" + whatToPaint + "' using the color '" + color + "'");
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
        if (executeTask() == true){
            return true;
        } else {
            return false;
        }
    }
}
