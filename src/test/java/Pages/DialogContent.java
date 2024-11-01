package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    //****************************************************************//
    //US704 Elements
    @FindBy (xpath = "(//a[@class='level-top ui-corner-all'])[1]/span")
    public WebElement whatsNew;

    @FindBy (xpath = "((//a[@class='level-top ui-corner-all'])[2]/span)[2]")
    public WebElement women;

    @FindBy (xpath = "(//*[@role='menu'])[1]/li[3]")
    public WebElement men;

    @FindBy (xpath = "(//*[@role='menu'])[1]/li[4]")
    public WebElement gear;

    @FindBy (xpath = "(//*[@role='menu'])[1]/li[5]")
    public WebElement training;

    @FindBy (xpath = "(//*[@role='menu'])[1]/li[6]")
    public WebElement sale;

    @FindBy (xpath = "(//span[text()='Tops'])[1]")
    public WebElement womenTops;

    @FindBy (xpath = "(//span[text()='Bottoms'])[1]")
    public WebElement womenBottom;

    @FindBy (xpath = "(//span[text()='Tops'])[2]")
    public WebElement menTops;

    @FindBy (xpath = "(//span[text()='Bottoms'])[2]")
    public WebElement menBottom;

    @FindBy (xpath = "//span[text()='Bags']")
    public WebElement gearBags;

    @FindBy (xpath = "//span[text()='Fitness Equipment']")
    public WebElement gearFitness;

    @FindBy (xpath = "//span[text()='Watches']")
    public WebElement gearWatches;

    @FindBy (xpath = "//span[text()='Video Download']")
    public WebElement trainingVideo;

    @FindBy (xpath = "//*[@class='navigation']/ul/li[2]/ul/li[1]/ul//li")
    public List< WebElement> womenKategoryTops;

    @FindBy (xpath = "//*[@class='navigation']/ul/li[3]/ul/li[1]/ul//li")
    public List< WebElement> menKategoryTops;

    @FindBy (xpath = "//*[@class='navigation']/ul/li[2]/ul/li[2]/ul/li")
    public List< WebElement> womenKategoryBottom;
    @FindBy (xpath = "//*[@class='navigation']/ul/li[3]/ul/li[2]/ul/li")
    public List< WebElement> menKategoryBottom;

    public void tabControl(WebElement control){
        Assert.assertTrue(control.isDisplayed());
    }
    //****************************************************************//

}

