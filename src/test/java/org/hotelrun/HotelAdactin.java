 package org.hotelrun;

import org.frameBase.FrameWork;
import org.pojo.AdactinPojo;
import org.pojo.pojo2;
import org.pojo.pojo3;
import org.pojo.pojo4;

public class HotelAdactin extends FrameWork  {

	public static void main(String[] args) {
		
		chromebrowser();
		urlLaunch("https://adactinhotelapp.com/");
		
		AdactinPojo a = new AdactinPojo();
		pojo2 b = new pojo2();
		pojo3 c = new pojo3();
		pojo4 d = new pojo4();
		
		
		sendvalue(a.getUser(), "Prabu220");
		sendvalue(a.getPass(),"12109780Nsp");
		buttonclick(a.getLogin());
		
	   aindexSelect(b.getLoc(),1);
	   aindexSelect(b.getHotel(), 1);
	   aindexSelect(b.getRoom(), 2);
	   aindexSelect(b.getNo(), 2);
	   sendvalue(b.getIndate(), "13.06.2023");
	   sendvalue(b.getOutdate(), "15.06.2023");
	   aindexSelect(b.getAdult(), 1);
	   aindexSelect(b.getChild(), 1);
	   buttonclick(b.getSubmit());
	   
	   buttonclick(c.getButton());
	   buttonclick(c.getContin());
	   
	   sendvalue(d.getFirst(), "vimal");
	   sendvalue(d.getLast(), "raj");
	   sendvalue(d.getAdd(), "trichy");
	   sendscriptjava(d.getCard(), "9874561230012345");
	   aindexSelect(d.getCardtype(), 1);
	   aindexSelect(d.getMonth(), 5);
	   aindexSelect(d.getYear(), 3);
	   sendvalue(d.getCvv(), "555");
	   buttonclick(d.getBook());
	   await();
	   getaattribute(d.getOrder(), "value");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
	
}
