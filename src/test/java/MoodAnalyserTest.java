import com.bridgelabz.MoodAnalyserMain;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertSame;

public class MoodAnalyserTest {
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        assertSame("SAD", mood);
    }
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        assertSame("HAPPY", mood);
    }
}
