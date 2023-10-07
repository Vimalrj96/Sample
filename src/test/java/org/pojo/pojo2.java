package org.pojo;

import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo2 extends FrameWork {

	public pojo2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement loc;
	
	@FindBy(name="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement room;
	
	@FindBy(name="room_nos")
	private WebElement no;
	
	@FindBy(name="datepick_in")
	private WebElement indate;
	
	@FindBy(name="datepick_out")
	private WebElement outdate;
	
	@FindBy(name="adult_room")
	private WebElement adult;
	
	@FindBy(name="child_room")
	private WebElement child;
	
	@FindBy(name="Submit")
	private WebElement submit;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNo() {
		return no;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
}
