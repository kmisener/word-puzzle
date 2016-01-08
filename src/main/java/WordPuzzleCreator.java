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
      else if(word.charAt(i) == 'o' || word.charAt(i) == 'O'){
        wordPuzzle += "-";
      }
      else if(word.charAt(i) == 'u' || word.charAt(i) == 'U'){
        wordPuzzle += "-";
      }
      //TODO: check to make sure last character in string gets processed
      else {
        wordPuzzle += word.substring(i, i+1);
      }
    }

    return wordPuzzle;
  }
}
