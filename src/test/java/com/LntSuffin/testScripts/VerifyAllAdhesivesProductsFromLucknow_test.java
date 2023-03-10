package com.LntSuffin.testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.LntSuffin.genericUtility.TestNgCommonClass;
import com.LntSuffin.objectRepository.PLP_page;
import com.LntSuffin.objectRepository.buyerHome_page;

public class VerifyAllAdhesivesProductsFromLucknow_test extends TestNgCommonClass 
{
	@Test
	public void VerifyAllProductsFromDelhi()
	{
		buyerHome_page buyerhome = new buyerHome_page(driver);
		PLP_page plp = new PLP_page(driver);

		buyerhome.clickbuildingAndConstructionCategory();
		buyerhome.clickAdhesivesSubCategory();
		plp.clickLucknowCheckbox();
		webDrive.scrollPage(2);
		int num = plp.getproductsInPage();
		
		int num1 = plp.getNumofProductsCities();

		Assert.assertEquals(num, num1);}



}
