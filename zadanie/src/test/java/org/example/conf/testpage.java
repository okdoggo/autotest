package org.example.conf;

public class testpage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[@id="app"]/div/div/div[2]/div/div[1] )
            private WebElement firstcard;

            public void firstcard() {
            firstcard.click(); }

    @FindBy(xpath = "//*[contains(@id, 'item-0')]")
            private WebElement section;

            public void section() {
            section.click(); }

    @FindBy(xpath = "//*[contains(@id, 'userName')]")
            private WebElement fieldFullName;


            public void fieldFullName(String field) {
            fieldFullName.sendKeys(field); }

    @FindBy(xpath = "//*[contains(@id, 'userEmail')]")
            private WebElement fieldUserEmail;

            public void fieldUserEmail(String field) {
                fieldUserEmail.sendKeys(field); }

    @FindBy(xpath = "//*[contains(@id, 'currentAdress')]")
            private WebElement fieldCurrentAdress;

            public void fieldCurrentAdress(String field) {
                fieldCurrentAdress.sendKeys(field); }

    @FindBy(xpath = "//*[contains(@id, 'currentAdress')]")
    private WebElement fieldPermanentAdress;

    public void fieldCurrentAdress(String field) {
        fieldPermanentAdress.sendKeys(field); }

    @FindBy(xpath = "//*[contains(@id, 'submit')]")
            private WebElement btnSubmit;

            public void btnSubmit() {
            btnSubmit.click(); }
}
