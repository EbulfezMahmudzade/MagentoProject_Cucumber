package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

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

    @FindBy (id="firstname")
    public WebElement FirstName;

    @FindBy (id="lastname")
    public  WebElement LastName;

    @FindBy (id="email_address")
    public WebElement EmailAdress;

    @FindBy (id="password")
    public WebElement password;

    @FindBy (id="password-confirmation")
    public  WebElement ConfirmPassword;

    @FindBy (xpath = "//button[@class='action submit primary']")
    public WebElement CreateAnAccountButton;

    //sign-in email
    @FindBy (id="email")
    public WebElement SignInemail;

    @FindBy (xpath = "//input[@name='login[password]']")
    public WebElement SignInpassword;

    @FindBy (css = "[class='action login primary']")
    public WebElement SignInButton;

    @FindBy (xpath = "//a[@title='Argus All-Weather Tank']")
    public WebElement SelectedProduct;

    @FindBy (xpath = "//div[@class='swatch-option text'][@id='option-label-size-143-item-166']")
    public WebElement ChooseSize;

    @FindBy(css = "[class='swatch-option color']")
    public WebElement ChooseColor;

    @FindBy (xpath = "//input[@type='number']")
    public WebElement Choosequantity;

    @FindBy (id="product-addtocart-button")
    public  WebElement AddToCart;

    @FindBy (css = "[class='action showcart active']")
    public WebElement ClickToCartItem;

    @FindBy (xpath = "//span[text()='View and Edit Cart']")
    public WebElement EditToCart;

    @FindBy (css = "[class='input-text qty']")
    public WebElement ChangeQuantity;

    @FindBy (xpath = "//span[text()='Update Shopping Cart'")
    public WebElement UpdateShoppingCart;

    @FindBy (xpath = "//a[@class='action action-delete']")
    public WebElement DeleteItemInCart;

    @FindBy (xpath = "//span[text()='Proceed to Checkout']")
    public WebElement ProoceedToChechout;

    @FindBy (xpath = "//input[@class='input-text'][@name='street[0]']")
    public WebElement StreetAddress;

    @FindBy (xpath = "//input[@class='input-text'][@name='city']")
    public WebElement CityAddress;

    @FindBy (xpath ="//select[@name='region_id']//option[@data-title='Alabama']")
    public WebElement StateProvince;

    @FindBy (xpath = "//input[@name='postcode']")
    public WebElement PostCode;

    @FindBy (xpath = "//select[@class='select']//option[@data-title='United States']")
    public WebElement Country;

    @FindBy (xpath ="//input[@name='telephone']")
    public WebElement PhoneNumber;

    @FindBy ( xpath = "//td[@class='col col-method']//input[@type='radio']")
    public WebElement ChooseShippingMethod;

    @FindBy (css = "[class='button action continue primary']")
    public WebElement NextButton;

    @FindBy (xpath = "//span[text()='Place Order']")
    public WebElement PlaceOrderButton;

    @FindBy (xpath = "//span[text()='Thank you for your purchase!']")
    public WebElement SuccessMsg;

    //Us708 Elements
    @FindBy(css = "[data-bind*='message.text']")
    public WebElement messageText;

    @FindBy(xpath = "//*[@id='wishlist-view-form']/div[1]")
    public WebElement wishListNotEmpty;

    @FindBy(xpath = "//img[@class='product-image-photo' and @alt='Radiant Tee']")
    public WebElement wishListProduct;

    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim()){

            case "messageText": return this.messageText;
            case "wishListNotEmpty": return this.wishListNotEmpty;
            case "wishListProduct": return this.wishListProduct;

        }
        return null;
    }








}
