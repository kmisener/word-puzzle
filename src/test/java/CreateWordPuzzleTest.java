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

  @Test
  public void createWordPuzzle_inputiReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("i"));
  }

  @Test
  public void createWordPuzzle_inputIReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("I"));
  }

  @Test
  public void createWordPuzzle_inputOReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("O"));
  }

  @Test
  public void createWordPuzzle_inputoReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("o"));
  }

  @Test
  public void createWordPuzzle_inputUReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("U"));
  }

  @Test
  public void createWordPuzzle_inputuReturnDash_Dash(){
    assertEquals("-", wordPuzzle.createWordPuzzle("u"));
  }

  @Test
  public void createWordPuzzle_inputBelieve_you_can_and_youre_halfway_there_Theodore_RooseveltReturnDash_Dash(){
    assertEquals("B-l--v- y-- c-n -nd y--'r- h-lfw-y th-r-. Th--d-r- R--s-v-lt", wordPuzzle.createWordPuzzle("Believe you can and you're halfway there. Theodore Roosevelt"));
  }


}
