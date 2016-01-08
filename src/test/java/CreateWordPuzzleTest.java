import org.junit.*;
import static org.junit.Assert.*;


public class CreateWordPuzzleTest {

  WordPuzzleCreator wordPuzzle;

  @Before
  public void setUp() {
    wordPuzzle = new WordPuzzleCreator();
  }


  @Test
  public void createWordPuzzle_inputaReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("a"));
  }

  @Test
  public void createWordPuzzle_inputAReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("A"));
  }

  @Test
  public void createWordPuzzle_inputeReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("e"));
  }

  @Test
  public void createWordPuzzle_inputEReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("E"));
  }
}
