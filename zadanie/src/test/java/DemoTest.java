package org.example;
        import org.junit.BeforeClass;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import java.util.concurrent.TimeUnit;
public class testpage {
    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу
        driver.get(ConfProperties.getProperty("testpage")); }
    @Test
    public void testpage() {
        //получение доступа к методам класса testpage для взаимодействия с элементами страницы
        //нажимаем на первую карточку Elements
        firstcard.clickfirstcard();
        //нажимаем на секцию Text Box
        section.clicksection();
        //заполняем поля
        testpage.inputfieldFullName(ConfProperties.getProperty("fieldFullName"));
        testpage.inputfieldUserEmail(ConfProperties.getProperty("fieldUserEmail"));
        testpage.inputfieldCurrentAdress(ConfProperties.getProperty("fieldCurrentAdress"));
        testpage.inputfieldfieldPermanentAdress(ConfProperties.getProperty("fieldPermanentAdress"));
        //нажимаем на Submit
        btnSubmit.clickbtnSubmit();



    @AfterClass
    public static void tearDown() {
        driver.quit(); } }
}
