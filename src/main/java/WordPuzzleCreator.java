public class WordPuzzleCreator {

  public String createWordPuzzle(String word) {
    String wordPuzzle = "";
    for(int i = 0; i < word.length(); i++) {
      if(word.charAt(i) == 'a' || word.charAt(i) == 'A') {
        wordPuzzle += "-";
      }
    }

    return wordPuzzle;
  }
}
