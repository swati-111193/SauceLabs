package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Objects.HomePageObjects;

public class HomePageActions  {
	
	HomePageObjects homeObj;
	Actions act;
	
	public HomePageActions(WebDriver driver) {
		homeObj = PageFactory.initElements(driver, HomePageObjects.class);
		act = new Actions(driver);
	}
	
	public void enterUserName(String s) {
		homeObj.userName.sendKeys(s);
	}
	
	public void enterPassword(String s1) {
		homeObj.password.sendKeys(s1);
	}
	
	public void clickLoginBtn() {
		homeObj.loginBtn.click();
	}
	
	public String getProductName() {
		return homeObj.productName.getText();
	}
	
	public String getProductPrice() {
		return homeObj.productPrice.getText();
	}
	
	public void clickAddToCart() {
		homeObj.addToCartBtn.click();
	}
	
	public void openCart() {
		homeObj.cartBtn.click();
	}
	
	public void checkout() {
		homeObj.checkout.click();
		homeObj.firstName.sendKeys("gfgf");
		homeObj.lastName.sendKeys("fgfdty");
		homeObj.postalCode.sendKeys("6576");
		homeObj.continueBtn.click();
	}
	
	public String getActualProductName() {
		return homeObj.actualProductName.getText();
	}
	
	public String getActualProductPrice() {
		return homeObj.actualProductPrice.getText();
	}
	
	public String verifyConfirmationMessage() {
		homeObj.finishBtn.click();
	return	homeObj.confirmationMsg.getText();
	}

}
