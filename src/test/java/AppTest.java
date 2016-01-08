import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest_h1() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Welcome to the Word Puzzle Game");
  }

  @Test
  public void rootTest_h2() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Enter a Word or Phrase and make it into a puzzle");
  }

  @Test
  public void rootTest_label() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Enter a Word or Phrase");
  }

  @Test
  public void rootTest_buttonText() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Create Word Puzzle");
  }

  @Test
  public void outputTest_h1() {
      goTo("http://localhost:4567/");
      fill("#word").with("This is a test");
      submit(".btn");
      assertThat(pageSource()).contains("See if you can guess what this phrase is");
  }

  @Test
  public void outputTest_vowels() {
    String[] vowels = new String[] {"A","a","E","e","I","i","O","o","U","u"};

    for(String vowel : vowels) {
      goTo("http://localhost:4567/");
      fill("#word").with(vowel);
      submit(".btn");
      assertThat(pageSource()).contains("-");
    }
  }

  @Test
  public void outputTest_phrase() {
      goTo("http://localhost:4567/");
      fill("#word").with("Believe you can and you're halfway there. Theodore Roosevelt");
      submit(".btn");
      assertThat(pageSource()).contains("B-l--v- y-- c-n -nd y--'r- h-lfw-y th-r-. Th--d-r- R--s-v-lt");
    }
}
