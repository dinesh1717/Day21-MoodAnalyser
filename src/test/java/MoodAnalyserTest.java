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
}
