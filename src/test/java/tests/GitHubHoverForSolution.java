package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubHoverForSolution {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
        Configuration.pageLoadStrategy = "eager";
       // Configuration.holdBrowserOpen = true;
    }

    @Test
    void checkHoverForSolutionsTest () {
        open(" ");
        $(byTagAndText("button", "Solutions")).hover();
        $("ul li a[href='https://github.com/enterprise']").click();
        $("#hero-section-brand-heading").shouldHave(text ("The AI-powered\n" +
                "developer platform."));

    }

}

