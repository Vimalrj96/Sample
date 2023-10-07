package org.pojo;


import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojo extends FrameWork {

	public AdactinPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement user;	

	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;

    @FindBy(xpath="//a[text()='Forgot Password?']")
    private WebElement forgot;

    @FindBy(xpath="//a[text()='New User Register Here']")
    private WebElement newuser;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgot() {
		return forgot;
	}

	public WebElement getNewuser() {
		return newuser;
	}

}
