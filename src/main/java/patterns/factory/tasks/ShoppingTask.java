package patterns.factory.tasks;

public final class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        if (whatToBuy != null && quantity != 0){
            System.out.println("Buy '" + whatToBuy + "' in quantity of '" + quantity + "'");
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
