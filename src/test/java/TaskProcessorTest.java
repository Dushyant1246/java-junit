import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class TaskProcessorTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask() {
        TaskProcessor.longRunningTask();
    }
}
