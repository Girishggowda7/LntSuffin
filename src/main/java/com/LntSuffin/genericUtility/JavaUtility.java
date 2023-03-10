package com.LntSuffin.genericUtility;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.WebElement;

public class JavaUtility 
{
	/**
	 * This method is used to pass the timeout
	 * @return
	 */
	public long timeOut()
	{
		PropertyFileData pro = new PropertyFileData();
		String timeout = pro.getDataFromPropertyFile(PropertyFileKeys.TIMEOUT.convertToString());
		long time = Long.parseLong(timeout);
		return time;
	}


	/**
	 * This method is used to generate the random Number
	 * @param limit
	 * @return
	 */
	public int generateRandomNumber(int limit)
	{
		Random ran = new Random();
		int randomInt = ran.nextInt(limit);
		return randomInt;
	}


	/**
	 * This method is used to get the Date And Time of System
	 * @return
	 */
	public String getDateAndTime()
	{

		String date = new Date().toString().replaceAll(" ", "_").toString().replaceAll(":", ".");
		return date;

	}



	/**
	 * This method is used to get the date in the format of d-mm-yyyy
	 * @return
	 */
	public String dateWithFormat()
	{
		String date = new Date().toString();
		String dd = date.split(" ")[2];
		String mm = date.split(" ")[1];
		String yyyy = date.split(" ")[5];

		String dateformat = dd+"-"+mm+"-"+yyyy;
		return dateformat;

	}


	/**
	 * This method is used to get the month(january, february,march......) in MM format(1,2,3.......)
	 * @param month
	 * @return
	 */
	public int getMonthInMMFormat(String month)
	{
		return DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(month).get(ChronoField.MONTH_OF_YEAR);
	}


	/**
	 * this method is used to wait before click
	 * @param element
	 * @throws InterruptedException
	 */
	public void waitAndClick(WebElement element) 
	{
		int count = 0;
		while(count<40) {
			try {
				element.click();
				break;
			}catch(Throwable e){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				count++;
			}
		}
	}
	
	

}


