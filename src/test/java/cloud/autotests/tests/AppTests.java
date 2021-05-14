package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Эльдорадо")
    void generatedTest() {
        step("Открыть сайт https://www.eldorado.ru", () -> {
            // todo just add selenium action
        });

        step("Найти и нажать \"Каталог\"", () -> {
            // todo just add selenium action
        });

        step("Проверить что на открытой странице имеется текст \"Каталог товаров «Эльдорадо»\"", () -> {
            // todo just add selenium action
        });
    }
}