import com.bridgelabz.MoodAnalyserMain;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertSame;

public class MoodAnalyserTest {
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        /**
         * create a object for MoodAnalyserMain class
         */
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        assertSame("SAD", mood);
    }
}
