package testes;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class author extends TestBase  {

    @Test
    void fillFormTest() {
        open("https://www.google.ru");


        $(By.name("q")).setValue("������").pressEnter();
        $(byText("������� ������ � ������ �� 10 ���� - Yandex")).click();
        $(byText("������"));

        $(byText("�� �����")).click();


        open("/pogoda/maps?lat=55.755863&lon=37.6177&via=f");

        $(".radio-button__text").$(byText("�����������")).click();














    }


}
