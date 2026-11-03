import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://github.com/search");
        $("[aria-label='Search GitHub']").setValue("qa.guru").pressEnter();
        $("[data-testid='results-list']").shouldHave(text("QA.GURU"));
    }

    @Test
    void successfulSearchDuckDuck() {
        open("https://duckduckgo.com/");
        $("[aria-label='Search with DuckDuckGo']").setValue("qa.guru").pressEnter();
        $("[data-area='mainline']").shouldHave(text("QA.GURU"));
    }
}
