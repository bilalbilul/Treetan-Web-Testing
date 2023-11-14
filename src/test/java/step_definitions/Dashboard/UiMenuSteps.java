package step_definitions.Dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locator.Dashboard.DashboardMenu;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class UiMenuSteps {

    private final WebDriver webDriver;

    public UiMenuSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User already on Homepage")
    public void userDashboard() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.setVrfyDashboard();
        Thread.sleep(2000);
    }

    @Given("User wants to check Umroh Option")
    public void userCheckUmroh() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.setBtnUmroh();
        Thread.sleep(3000);
    }

    @When("User choose {string}")
    public void checkUmrohPembiayaan(String pembiayaan) throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.selectUmrohPembiayaan(pembiayaan);
        Thread.sleep(3000);
    }

    @And("User already on Umroh Pembiayaan page")
    public void vrfyPembiayaanPage() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        Assert.assertTrue(dashboardMenu.isUmrohPembiayaanPageVisible());
        dashboardMenu.isUmrohPembiayaanPageVisible();
        Thread.sleep(3000);
    }

    @When("User choose option {string}")
    public void checkUmrohTabungan(String tabungan) throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.selectUmrohTabungan(tabungan);
        Thread.sleep(3000);
    }

    @And("User already on Umroh Tabungan page")
    public void vrfyTabunganPage() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        Assert.assertTrue(dashboardMenu.isUmrohTabunganPageVisible());
        dashboardMenu.isUmrohTabunganPageVisible();
        Thread.sleep(3000);
    }

    @When("User choose paket {string}")
    public void checkUmrohReguler(String reguler) throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.selectUmrohTabungan(reguler);
        Thread.sleep(3000);
    }

    @And("User already on Umroh Reguler page")
    public void vrfyRegulerPage() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        Assert.assertTrue(dashboardMenu.isUmrohRegulerPageVisible());
        dashboardMenu.isUmrohRegulerPageVisible();
        Thread.sleep(3000);
    }

    @Given("User wants to check Wisata Syariah Option")
    public void userCheckWisata() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.setBtnWisata();
        Thread.sleep(3000);
    }

    @When("User choose Wisata {string}")
    public void checkWisataInter(String luarnegri) throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.selectWisataInter(luarnegri);
        Thread.sleep(3000);
    }

    @And("User already on Wisata International page")
    public void vrfyWisataInterPage() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        Assert.assertTrue(dashboardMenu.isWisataInterPageVisible());
        dashboardMenu.isWisataInterPageVisible();
        Thread.sleep(3000);
    }

    @When("User choose Wisata Syariah {string}")
    public void checkWisataDom(String dalamnegri) throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.selectWisataDomestik(dalamnegri);
        Thread.sleep(3000);
    }

    @And("User already on Wisata Domestik page")
    public void vrfyWisataDomPage() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        Assert.assertTrue(dashboardMenu.isWisataDomPageVisible());
        dashboardMenu.isWisataDomPageVisible();
        Thread.sleep(3000);
    }

    @When("User wants to check and click Tentang Kami")
    public void userTentangKami() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.setBtnTentang();
        Thread.sleep(3000);
    }

    @And("User already on Tentang Kami page")
    public void vrfyTentangPage() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        Assert.assertTrue(dashboardMenu.isTentangPageVisible());
        dashboardMenu.isTentangPageVisible();
        Thread.sleep(3000);
    }

    @When("User wants to check and click Gabung Travel Partner")
    public void userGabungTravel() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        dashboardMenu.setBtnGabung();
        Thread.sleep(3000);
    }

    @And("User already on Gabung Travel Partner page")
    public void vrfyGabungPage() throws InterruptedException {
        DashboardMenu dashboardMenu = new DashboardMenu(webDriver);
        Assert.assertTrue(dashboardMenu.isGabungPageVisible());
        dashboardMenu.isGabungPageVisible();
        Thread.sleep(3000);
    }

}
