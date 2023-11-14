package locator.Register;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class Register {

    public static WebDriver driver;

    public Register(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Register.driver = driver;
    }

    @FindBy(xpath = "//button[@class='inline-flex items-center justify-center gap-[10px] flex-shrink-0 rounded-md transition duration-300 ease-in-out w-full bg-green-1 active:bg-green-2 active:scale-95 h-10 px-4 py-2 body-2-bold text-white']")
    private WebElement btnRegist;

    @FindBy(xpath = "//p[@class='mb-4 text-base']")
    private WebElement vrfyRegistPage;

    @FindBy(xpath = "//label[1]/input[@class='block w-full px-3 py-3 mt-1 bg-white border rounded-md shadow-sm border-slate-300 placeholder-slate-400 focus:outline-none focus:border-[#5BCCD4] focus:ring-[#5BCCD4] sm:text-sm focus:ring-1']")
    private WebElement inputNama;

    @FindBy(xpath = "//label[2]/input[@class='block w-full px-3 py-3 mt-1 bg-white border rounded-md shadow-sm border-slate-300 placeholder-slate-400 focus:outline-none focus:border-[#5BCCD4] focus:ring-[#5BCCD4] sm:text-sm focus:ring-1']")
    private WebElement inputNomor;

    @FindBy(xpath = "//label[3]/input[@class='block w-full px-3 py-3 mt-1 bg-white border rounded-md shadow-sm border-slate-300 placeholder-slate-400 focus:outline-none focus:border-[#5BCCD4] focus:ring-[#5BCCD4] sm:text-sm focus:ring-1']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@class='border-2 border-[#BDBDBD] px-4 py-3 rounded-2xl']")
    private WebElement btnGoogleAuth;

    @FindBy(xpath = "//a[contains(.,'Syarat & Ketentuan')]")
    private WebElement syaratBtn;

    @FindBy(xpath = "//a[contains(.,'Kebijakan Privasi')]")
    private WebElement kebijakanBtn;

    @FindBy(css = "[d='M480-320q75 0 127.5-52.5T660-500q0-75-52.5-127.5T480-680q-75 0-127.5 52.5T300-500q0 75 52.5 127.5T480-320Zm0-72q-45 0-76.5-31.5T372-500q0-45 31.5-76.5T480-608q45 0 76.5 31.5T588-500q0 45-31.5 76.5T480-392Zm0 192q-146 0-266-81.5T40-500q54-137 174-218.5T480-800q146 0 266 81.5T920-500q-54 137-174 218.5T480-200Zm0-300Zm0 220q113 0 207.5-59.5T832-500q-50-101-144.5-160.5T480-720q-113 0-207.5 59.5T128-500q50 101 144.5 160.5T480-280Z']")
    private WebElement btnMataPass;

    @FindBy(css = "//h2[contains(.,'Syarat Dan Ketentuan Umum')]")
    private WebElement vrfySyaratPage;

    @FindBy(css = "//div[@class='md:w-[1140px] text-[#2F2F2F] mx-auto mt-[120px] mb-[300px]']/div[1]/h2[@class='mb-6 heading-6-bold']")
    private WebElement vrfyKebijakanPage;

    @FindBy(xpath = "//a[contains(.,'Masuk!')]")
    private WebElement btnMasuk;

    @FindBy(xpath = "//p[@class='mb-4 text-base']")
    private WebElement vrfyLoginPage;

    public void setBtnRegist() {
        btnRegist.click();
    }

    public boolean isRegistPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vrfyRegistPage));
        return element.isDisplayed() && element.getText().contains("Masukan data diri Anda");
    }

    public void setInputNama(String name) {
        inputNama.sendKeys(name);
    }

    public void setInputNumeric(String nomor) {
        String numericNomor = nomor.replaceAll("[^0-9]", "");
        inputNomor.sendKeys(numericNomor);
    }

    public void setInputNomorString(String nmrstring) {
        inputNomor.sendKeys(nmrstring);
    }

    public boolean isPhoneNumberInTable(String phoneNumber) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> phoneNumberCells = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("//label[2]/input[@class='block w-full px-3 py-3 mt-1 bg-white border rounded-md shadow-sm border-slate-300 placeholder-slate-400 focus:outline-none focus:border-[#5BCCD4] focus:ring-[#5BCCD4] sm:text-sm focus:ring-1']" + phoneNumber + "')]")));
        return phoneNumberCells.size() > 0;
    }

    public void setInputEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void setBtnMataPass() {
        btnMataPass.click();
    }

    public void setBtnGoogleAuth() {
        btnGoogleAuth.click();
    }

    public void setSyaratBtn() {
        syaratBtn.click();
    }

    public void setKebijakanBtn() {
        kebijakanBtn.click();
    }

    public boolean isSyaratPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vrfySyaratPage));
        return element.isDisplayed() && element.getText().contains("Syarat Dan Ketentuan Umum");
    }

    public boolean isKebijakanPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vrfyKebijakanPage));
        return element.isDisplayed() && element.getText().contains("Kebijakan Privasi");
    }

    public void setBtnMasuk() {
        btnMasuk.click();
    }

    public boolean isLoginPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vrfyLoginPage));
        return element.isDisplayed() && element.getText().contains("Masuk dengan Email dan Password");
    }

}
