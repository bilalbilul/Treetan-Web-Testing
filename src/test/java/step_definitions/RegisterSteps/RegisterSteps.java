package step_definitions.RegisterSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Register.Register;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class RegisterSteps {

    private final WebDriver webDriver;

    public RegisterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User wants to register and click button Daftar")
    public void userClickDaftar() throws InterruptedException {
        Register register = new Register(webDriver);
        register.setBtnRegist();
        Thread.sleep(3000);
    }

    @And("User already on Register page")
    public void userVrfyRegistPage() throws InterruptedException {
        Register register = new Register(webDriver);
        Assert.assertTrue(register.isRegistPageVisible());
        register.isRegistPageVisible();
    }


    @When("User input {string} as Nama Lengkap and {string} as Nomor Telpon and {string} as Email and {string} as Password")
    public void userFormWithValidParam(String name, String nomor, String email, String password) throws InterruptedException {
        Register register = new Register(webDriver);
        register.setInputNama(name);
        register.setInputNumeric(nomor);
        register.setInputEmail(email);
        register.setInputPassword(password);
        Assert.assertTrue(register.isPhoneNumberInTable(nomor));
        Thread.sleep(3000);
    }

    @When("User input {string} as Nama Lengkap and {string} as Nomor Telpon with string parameter and {string} as Email and {string} as Password")
    public void userInputFormWithInvalidParam(String name, String nomorstrng, String email, String password) throws InterruptedException {
        Register register = new Register(webDriver);
        register.setInputNama(name);
        register.setInputNomorString(nomorstrng);
        register.setInputEmail(email);
        register.setInputPassword(password);
        Assert.assertTrue(register.isPhoneNumberInTable(nomorstrng));
        Thread.sleep(3000);
    }

    @When("User click button Google Auth")
    public void clickGoogle() throws InterruptedException {
        Register register = new Register(webDriver);
        register.setBtnGoogleAuth();
        Thread.sleep(3000);
    }

    @And("User check the password was correct")
    public void clickMataPass() throws InterruptedException {
        Register register = new Register(webDriver);
        register.setBtnMataPass();
        Thread.sleep(2000);
    }

    @And("User click button Syarat & Ketentuan")
    public void clickSyarat() throws InterruptedException {
        Register register = new Register(webDriver);
        register.setSyaratBtn();
        Thread.sleep(3000);
    }

    @And("User click button Kebijakan Privasi")
    public void clickKebijakan() throws InterruptedException {
        Register register = new Register(webDriver);
        register.setKebijakanBtn();
        Thread.sleep(3000);
    }

    @And("User already on Syarat & Ketentuan page")
    public void userVrfySyaratPage() throws InterruptedException {
        Register register = new Register(webDriver);
        Assert.assertTrue(register.isSyaratPageVisible());
        register.isSyaratPageVisible();
        Thread.sleep(3000);
    }

    @And("User already on Kebijakan Privasi page")
    public void userVrfyKebijakanPage() throws InterruptedException {
        Register register = new Register(webDriver);
        Assert.assertTrue(register.isKebijakanPageVisible());
        register.isKebijakanPageVisible();
        Thread.sleep(3000);
    }

    @When("User already have account and click button Masuk")
    public void clickMasuk() throws InterruptedException {
        Register register = new Register(webDriver);
        register.setBtnMasuk();
        Thread.sleep(3000);
    }

    @And("User already on Masuk page")
    public void userVrfyMasukPage() throws InterruptedException {
        Register register = new Register(webDriver);
        Assert.assertTrue(register.isLoginPageVisible());
        register.isLoginPageVisible();
        Thread.sleep(3000);
    }

}
