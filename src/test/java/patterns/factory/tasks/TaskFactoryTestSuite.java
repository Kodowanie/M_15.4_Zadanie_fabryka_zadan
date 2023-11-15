package patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //then
        Task driving = taskFactory.createTask(TaskFactory.DRIVING_TASK);
        //when
        assertEquals("Driving", driving.getTaskName());
        assertEquals(true, driving.executeTask());
    }

    @Test
    void testPaintingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task painting = taskFactory.createTask(TaskFactory.PAINTING_TASK);
        //then
        assertEquals("Painting",painting.getTaskName());
        assertEquals(true,painting.executeTask());

    }

    @Test
    void testShoppingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPING_TASK);
        //then
        assertEquals("Shopping",shopping.getTaskName());
        assertEquals(true,shopping.executeTask());
    }

}
