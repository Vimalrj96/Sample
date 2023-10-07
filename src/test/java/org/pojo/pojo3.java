package org.pojo;

import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo3 extends FrameWork {

	public pojo3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="radiobutton_0")
	private WebElement button;
	
	@FindBy(name="continue")
	private WebElement contin;

	public WebElement getButton() {
		return button;
	}

	public WebElement getContin() {
		return contin;
	}
	
	
	
}
