import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll(){
        System.out.println("\n### beforeAll()\n");
    }


    @AfterAll
    static void afterAll(){
        System.out.println("\n### afterAll()\n");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("###  beforeEach()");
        result = getResult();

    }

    @AfterEach
    void afterEach(){
        System.out.println("###       afterEach()\n");
        result = 0;

    }

    @Test
    void firstTest() {
        System.out.println("###    firstTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        System.out.println("###    firstTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("###    firstTest()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }
}
