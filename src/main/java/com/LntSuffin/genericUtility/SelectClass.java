package com.LntSuffin.genericUtility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * This class is used to handle the DropDown
 * @author Giris
 *
 */
public class SelectClass 
{

	/**
	 * This method is used to deSelect all selected options
	 * @param WebElement
	 */
	public void deSelectAll(WebElement WebElement)
	{
		new Select(WebElement).deselectAll();
	}


	/**
	 * This method is used to deselect selected option using index
	 * @param WebElement
	 * @param index
	 */
	public void deselectByIndex(WebElement WebElement, int index)
	{
		new Select(WebElement).deselectByIndex(index);


	}


	/**
	 * This method is used to deselect selected option using value
	 * @param WebElement
	 * @param value
	 */
	public void deselectByValue(WebElement WebElement, String value)
	{
		new Select(WebElement).deselectByValue(value);


	}



	/**
	 * This method is used to deselect selected option using Visible Text
	 * @param WebElement
	 * @param value
	 */
	public void deselectByVisibleText(WebElement WebElement, String value)
	{

		new Select(WebElement).deselectByVisibleText(value);

	}


	/**
	 * This method is used to get All selected option 
	 * @param WebElement
	 * @return
	 */
	public List<WebElement> getAllSelectedOptions(WebElement WebElement)
	{
		List<WebElement> options = new Select(WebElement).getAllSelectedOptions();
		return options;

	}


	/**
	 * This method is used to get First Selected option
	 * @param WebElement
	 * @return
	 */
	public WebElement getFirstSelectedOption(WebElement WebElement)
	{

		WebElement option = new Select(WebElement).getFirstSelectedOption();
		return option;

	}




	/**
	 * This method is used to get all  option
	 * @param WebElement
	 * @return
	 */
	public List<WebElement> getOptions(WebElement WebElement)
	{
		List<WebElement> options = new Select(WebElement).getOptions();
		return options;

	}


	/**
	 * This method is used to get First Selected option getWrappedElement
	 * @param WebElement
	 * @return
	 */
	public WebElement getWrappedElement(WebElement WebElement)
	{
		WebElement options = new Select(WebElement).getWrappedElement();
		return options;
	}


	/**
	 * This method is used to check Whether it is a MultiSelect Dropdown
	 * @param WebElement
	 * @return
	 */
	public boolean isMultiple(WebElement WebElement)
	{

		boolean options = new Select(WebElement).isMultiple();
		return options;

	}



	/**
	 * This method is used to select a option using index
	 * @param WebElement
	 * @param index
	 */
	public void selectByIndex(WebElement WebElement, int index)
	{
		new Select(WebElement).selectByIndex(index);


	}



	/**
	 * This method is used to select a option using value
	 * @param WebElement
	 * @param value
	 */
	public void selectByValue(WebElement WebElement, String value)
	{
		new Select(WebElement).selectByValue(value);


	}


	/**
	 * 
	 * This method is used to select a option using visible Text
	 * @param WebElement
	 * @param visibleText
	 */
	public void selectByVisibleText(WebElement WebElement, String visibleText)
	{
		new Select(WebElement).selectByVisibleText(visibleText);


	}


}
