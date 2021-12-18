import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    @Test
    public void canBeHeard() {
        String actual = new Sample().buildSomeString().toString();
        assertEquals(actual, "Can you hear me?");
    }
}
