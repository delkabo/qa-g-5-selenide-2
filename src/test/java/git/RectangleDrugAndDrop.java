package git;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RectangleDrugAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }

    @Test
    void drugAndDrop() {
        open("/drag_and_drop");
        $(".example").shouldHave(text("Drag and Drop"));
        $("#column-a").dragAndDropTo("#column-b");
        $(".column").shouldHave(text("B"));
        $(".column").sibling(0).shouldHave(text("A"));
    }
}
