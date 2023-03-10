package com.LntSuffin.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


/**
 * This class is used to perform the mouse actions
 * @author Giris
 *
 */
public class ActionsClass
{	 
	/**
	 * This method is used to move the cursor on the WebElement
	 * @param ElementAddress
	 */
	public void moveToElement(WebDriver driver, WebElement ElementAddress)
	{
		new Actions(driver).moveToElement(ElementAddress).perform();
	}

	/**
	 * This method is used to double Click on the element
	 * @param ElementAddress
	 */
	public void doubleClick(WebDriver driver,WebElement ElementAddress)
	{
		new Actions(driver).doubleClick(ElementAddress).perform();
	}


	/**
	 * This method is used to Right Click on the Element
	 * @param ElementAddress
	 */
	public void rightClick(WebDriver driver,WebElement ElementAddress)
	{
		new Actions(driver).contextClick(ElementAddress).perform();
	}


	/**
	 * This method is used to Drag the element from one position to drop the Element in the other position
	 * @param dragFrom
	 * @param dropTo
	 */
	public void dragAndDrop(WebDriver driver,WebElement dragFrom,WebElement dropTo)
	{
		new Actions(driver).dragAndDrop(dragFrom, dropTo).perform();
	}


}
