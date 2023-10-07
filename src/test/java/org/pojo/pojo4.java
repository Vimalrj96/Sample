
 package org.pojo;

import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo4 extends FrameWork {

	public pojo4() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name")
	private WebElement first;
	
	@FindBy(name="last_name")
	private WebElement last;
	
	
	@FindBy(name="address")
	private WebElement add;
	
	@FindBy(name="cc_num")
	private WebElement card;
	
	@FindBy(name="cc_type")
	private WebElement cardtype;
	
	@FindBy(name="cc_exp_month")
	private WebElement month;
	
	@FindBy(name="cc_exp_year")
	private WebElement year;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="book_now")
	private WebElement book;

	@FindBy(xpath="//input[@name='order_no']")
	private WebElement order;
	
	public WebElement getOrder() {
		return order;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
