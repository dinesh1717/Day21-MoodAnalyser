import com.bridgelabz.MoodAnalyserMain;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertSame;

public class MoodAnalyserTest {
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertSame("SAD", mood);
    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        assertSame("HAPPY", mood);
    }
}