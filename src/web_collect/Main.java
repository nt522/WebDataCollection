package web_collect;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.opencsv.CSVWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		File file = new File("C://Users//email//Desktop//MSU//Fall2023//BIS 3523-01 Advanced Languages I//test.csv");
		FileWriter outputfile = new FileWriter(file);
		CSVWriter writer = new CSVWriter(outputfile);
		
		
		Virtual_driver col = new Virtual_driver();
		
		try {
		col.firefox("https://www.google.com/");
		}catch(Exception e) {
			System.out.println("Error");
		}
		
//		String title;
//		for (int i=3; i<12; i++) {
//			title = col.driver.findElement(By.xpath("")).get
//		}
	}
	

}
