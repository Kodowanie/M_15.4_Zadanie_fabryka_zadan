package patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task createTask(final String taskClass){
        return switch (taskClass){
            case DRIVING_TASK -> new DrivingTask("Driving","London","BMV");
            case PAINTING_TASK -> new PaintingTask("Painting", "White", "House");
            case SHOPPING_TASK -> new ShoppingTask("Shopping", "PC", 1);
            default -> null;
        };
    }
}