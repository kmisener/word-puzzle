public class WordPuzzleCreator {

  public String createWordPuzzle(String word) {

    String wordPuzzle = "";

    for(int i = 0; i < word.length(); i++) {
      if(word.charAt(i) == 'a' || word.charAt(i) == 'A') {
        wordPuzzle += "-";
      }
      else if(word.charAt(i) == 'e' || word.charAt(i) == 'E'){
        wordPuzzle += "-";
      }
      else if(word.charAt(i) == 'i' || word.charAt(i) == 'I'){
        wordPuzzle += "-";
      }
      else {
        wordPuzzle += word.substring(i, i+1);
      }
    }

    return wordPuzzle;
  }
}
