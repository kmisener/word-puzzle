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
      WordPuzzleCreator wordPuzzleCreator = new WordPuzzleCreator();

      String word = request.queryParams("word");
      String wordPuzzle =  wordPuzzleCreator.createWordPuzzle(word);

      model.put("template", "templates/output.vtl");
      model.put("word", wordPuzzle);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
