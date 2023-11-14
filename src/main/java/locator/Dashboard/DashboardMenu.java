package locator.Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DashboardMenu {

    public static WebDriver driver;

    public DashboardMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        DashboardMenu.driver = driver;
    }

    @FindBy(xpath = "//img[@src='https://is3.cloudhost.id/new-bucket-73ded000/logo-treetan-with-icon.png']")
    private WebElement vrfyDashboard;

    @FindBy(xpath = "//span[.='Umroh']")
    private WebElement btnUmroh;

    @FindBy(xpath = "//ul[@class='flex gap-8']/li[@class='font-semibold dropdown text-grey-2']/div[@class='dropdown-content']//a[@href='/umroh-dana-talangan']//span[@class='block']")
    private WebElement dropdownUmrohPembiayaan;

    @FindBy(xpath = "//ul[@class='flex gap-8']/li[@class='font-semibold dropdown text-grey-2']/div[@class='dropdown-content']//a[@href='/umroh-dana-tabungan']//span[@class='block text-sm font-normal']")
    private WebElement dropdownUmrohTabungan;

    @FindBy(xpath = "//ul[@class='flex gap-8']/li[@class='font-semibold dropdown text-grey-2']/div[@class='dropdown-content']//a[@href='/umroh']//span[@class='block']")
    private WebElement dropdownUmrohReguler;

    @FindBy(xpath = "//span[.='Wisata Syariah']")
    private WebElement btnWisata;

    @FindBy(xpath = "//ul[@class='flex gap-8']/li[@class='font-semibold dropdown text-grey-2']/div[@class='dropdown-content']//span[.='Wisata luar negeri']")
    private WebElement dropdownWisataInternational;

    @FindBy(xpath = "//ul[@class='flex gap-8']/li[@class='font-semibold dropdown text-grey-2']/div[@class='dropdown-content']//span[.='Wisata Syariah Domestik']")
    private WebElement dropdownWisataDomestik;

    @FindBy(xpath = "//span[.='Tentang Kami']")
    private WebElement btnTentang;

    @FindBy(xpath = "//span[.='Gabung Travel Partner']")
    private WebElement btnGabung;

    @FindBy(xpath = "//p[contains(.,'Treetan menyediakan layanan pembiayaan Umroh Pembiayaan yang bekerjasama dengan')]")
    private WebElement vrfyUmrohPembiayaan;

    @FindBy(xpath = "//h6[contains(.,'Apa itu Umroh Dana Tabungan?')]")
    private WebElement vryfUmrohTabungan;

    @FindBy(xpath = "//h2[contains(.,'Jadwal berangkat paling Awal')]")
    private WebElement vryfUmrohReguler;

    @FindBy(xpath = "//div[@class='flex flex-wrap gap-x-3 gap-y-8 md:gap-x-4 mt-6 md:my-10 hidden md:flex']//img[@src='https://treetan.s3.ap-southeast-3.amazonaws.com/uploads-production/0000/137/2023/09/19/kalifa.']")
    private WebElement vryfWisataInternasional;

    @FindBy(xpath = "//h3[contains(.,'Tour Labuan Bajo')]")
    private WebElement vryfWisataDomestik;

    @FindBy(xpath = "//h2[contains(.,'Tentang Treetan')]")
    private WebElement vrfyTentang;

    @FindBy(xpath = "//h2[@class='mb-4 md:mb-6 heading-6-bold text-grey-1']")
    private WebElement vrfyGabung;


    public boolean setVrfyDashboard() {
        vrfyDashboard.isDisplayed();
        return true;
    }

    public void setBtnUmroh() {
        btnUmroh.click();
    }

    public void selectUmrohPembiayaan(String pembiayaan) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dropdownUmrohPembiayaan)).click();

        Select dropdown = new Select(dropdownUmrohPembiayaan);
        dropdown.selectByVisibleText(pembiayaan);
    }

    public void selectUmrohTabungan(String tabungan) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dropdownUmrohTabungan)).click();

        Select dropdown = new Select(dropdownUmrohTabungan);
        dropdown.selectByVisibleText(tabungan);
    }

    public void selectUmrohReguler(String reguler) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dropdownUmrohReguler)).click();

        Select dropdown = new Select(dropdownUmrohReguler);
        dropdown.selectByVisibleText(reguler);
    }

        public void setBtnWisata() {
        btnWisata.click();
    }

    public void selectWisataInter(String international) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dropdownWisataInternational)).click();

        Select dropdown = new Select(dropdownWisataInternational);
        dropdown.selectByVisibleText(international);
    }

    public void selectWisataDomestik(String domestik) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dropdownWisataDomestik)).click();

        Select dropdown = new Select(dropdownWisataDomestik);
        dropdown.selectByVisibleText(domestik);
    }

    public void setBtnTentang() {
        btnTentang.click();
    }

    public void setBtnGabung() {
        btnGabung.click();
    }

    public boolean isUmrohPembiayaanPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vrfyUmrohPembiayaan));
        return element.isDisplayed() && element.getText().contains("Apa itu Umroh Pembiayaan?");
    }

    public boolean isUmrohTabunganPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vryfUmrohTabungan));
        return element.isDisplayed() && element.getText().contains("Apa itu Umroh Dana Tabungan?");
    }

    public boolean isUmrohRegulerPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vryfUmrohReguler));
        return element.isDisplayed() && element.getText().contains("Jadwal berangkat paling Awal");
    }

    public boolean isWisataInterPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vryfWisataInternasional));
        return element.isDisplayed() && element.getText().contains("Goesto korean 9 hari");
    }

    public boolean isWisataDomPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vryfWisataDomestik));
        return element.isDisplayed() && element.getText().contains("Tour Labuan Bajo");
    }

    public boolean isTentangPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vrfyTentang));
        return element.isDisplayed() && element.getText().contains("Tentang Treetan");
    }

    public boolean isGabungPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(vrfyGabung));
        return element.isDisplayed() && element.getText().contains("Yuk gabung jadi partner Treetan!");
    }

}
