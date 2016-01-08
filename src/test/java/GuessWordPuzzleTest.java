import org.junit.*;
import static org.junit.Assert.*;

public class GuessWordPuzzleTest {
  WordPuzzle wordPuzzle;
  String word;

  @Before
  public void setUp() {
    wordPuzzle = new WordPuzzle();
    word =  "Hello There";
  }

  @Test
  public void guessWordPuzzle_inputHelloThereReturnTrue_True() {
      assertEquals(true, wordPuzzle.guessWordPuzzle("Hello There", word));
  }

  @Test
  public void guessWordPuzzle_inputHelloWorldReturnFalse_False() {
      assertEquals(false, wordPuzzle.guessWordPuzzle("Hello World", word));
  }
}// End GuessWordPuzzle
