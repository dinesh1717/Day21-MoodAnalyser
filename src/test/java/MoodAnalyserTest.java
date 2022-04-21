import com.bridgelabz.MoodAnalyserMain;
import com.bridgelabz.MoodAnalysisException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertSame;


public class MoodAnalyserTest {


    @Test
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertSame(MoodAnalysisException.Exception_Type.NULL, e.type);
        }
    }
    @Test
    public void given_EmptyMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertSame(MoodAnalysisException.Exception_Type.EMPTY, e.type);
        }
    }
}
