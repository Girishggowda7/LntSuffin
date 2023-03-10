package com.LntSuffin.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyerHome_page 
{
	@FindBy(xpath = "//span[contains(.,'Building & Construction')]") private WebElement buildingAndConstructionCategory;
	@FindBy(xpath = "//ul/li/a[.='Adhesives']") private WebElement adhesivesSubCategory;

	
	
	public buyerHome_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}


	public void clickbuildingAndConstructionCategory()
	{
		buildingAndConstructionCategory.click();
	}

	public void clickAdhesivesSubCategory()
	{
		adhesivesSubCategory.click();
	}

	
	
	
}
