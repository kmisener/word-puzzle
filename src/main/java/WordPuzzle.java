public class WordPuzzle {

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
      else {
        wordPuzzle += word.substring(i, i+1);
      }
    }
    return wordPuzzle;
  } // End createWordPuzzle

  public Boolean guessWordPuzzle(String guess, String word) {

    Boolean isGuessSuccessful = false;
    Boolean isCheckingGuess = true;

    while(isCheckingGuess) {
      for(int i = 0; i < word.length(); i++) {

        if(word.length() != guess.length())  {
          isCheckingGuess = false;
        }
        else if(word.length() == i+1 && isCheckingGuess == true){
          isGuessSuccessful = true;
          isCheckingGuess = false;
        }
        else if(word.charAt(i) == guess.charAt(i)) {
          isCheckingGuess = true;
        }
        else {
          isCheckingGuess = false;
        }
      }// End For
    }// End While
  return isGuessSuccessful;
  }// End guessWordPuzzle
}
