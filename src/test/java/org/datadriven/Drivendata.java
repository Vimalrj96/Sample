package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.frameBase.FrameWork;
import org.junit.Test;
import org.pojo.AdactinPojo;

public class Drivendata extends FrameWork {

	public static void main(String[] args) throws IOException {

			chromebrowser();
		urlLaunch("https://adactinhotelapp.com/");
		
		AdactinPojo a = new AdactinPojo();
		
	//toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 0, 1, "Prabu220");
	//toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 0, 2, "12109780Nsp");
	//toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 1, 0, "vimal");
//	toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 2, 0, "prabu");
//	toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 3, 0, "trichy");
//	toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 4, 0, "1234567890123654");
//	toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 5, 0, "789");
//	toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 6, 0, "Prabu220");
//	toaddadata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx","sh" , 7, 0, "12109780Nsp");
//
	sendvalue(a.getUser(), readdata("C:\\Users\\USER\\eclipse-workspace\\Adactin\\Excel\\abc.xlsx", "sh", 6, 0));	
	
	
	
	
	
	
	
	}
}