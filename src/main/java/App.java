import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {

    staticFileLocation("/public");

    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/index.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      HashMap model = new HashMap();
      WordPuzzle wordPuzzleCreator = new WordPuzzle();

      String word = request.queryParams("word");
      String wordPuzzle =  wordPuzzleCreator.createWordPuzzle(word);

      model.put("template", "templates/output.vtl");
      model.put("word", wordPuzzle);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // get("/guess", (request, response) -> {
    //   HashMap model = new HashMap();
    //
    //   String guess = request.queryParams("guess");
    //
    //   if(wordPuzzleCreator.getNumberOfGuessesRemaining() > 0){
    //     if(wordPuzzleCreator.guessWordPuzzle(guess) == true){
    //       //To success page
    //     }
    //     else if(wordPuzzleCreator.getNumberOfGuessesRemaining() > 0) {
    //       //To guess page as have more guesses left
    //       int numberOfGuessesRemaining = wordPuzzleCreator.numberOfGuessesRemaining();
    //       model.put("guess", .getNumberOfGuessesRemaining());
    //       model.put("template", "templates/guess.vtl");
    //       model.put("guess", guess);
    //     }
    //     else{
    //       //To failure page
    //     }
    //   }
    //   else {
    //     //To sorry out of guess page
    //   }
    //
    //
    //
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }// End main
}// End App
