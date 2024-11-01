package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

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










}

