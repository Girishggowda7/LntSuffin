package com.LntSuffin.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PLP_page
{
	@FindBy(xpath = "(//label[contains(.,'Verified')])[2]") private WebElement verifiedCheckbox;
	@FindBy(xpath = "(//label[contains(.,'Verified')])[1]") private WebElement verifiedAndTrustedCheckbox;

	@FindBy(xpath="//div[@id='content-wrapper']/div/div/label") private WebElement productsInPage;
	@FindBy(xpath = "//h3") private List<WebElement> listOfProducts;
	@FindBy(xpath = "//label[@class='product-check mb-0 w-100']/descendant::img[@alt='verified and Trusted' and @src='assets/images/Verifiedicon_tile.svg']") private List<WebElement> verifiedProduct; 
	
	
	public PLP_page(WebDriver driver) {
		PageFactory.initElements(driver, this);}

	
	
	public void clickverifiedAndTrustedCheckbox()
	{
		verifiedAndTrustedCheckbox.click();
	}
	
	public void clickverifiedCheckbox()
	{
		verifiedCheckbox.click();
	}
	public int getproductsInPage()
	{
		String tex = productsInPage.getText();
		int in = tex.split(" ")[0].indexOf("-");
		int pa = Integer.parseInt(tex.split(" ")[0].substring(in+1));
		return pa;
	}


	public int totalInListOfProducts()
	{
		return listOfProducts.size();
	}

	
	public int getNumOfOnlyVerifiedProduct()
	{
		return verifiedProduct.size();
		
	}

}
