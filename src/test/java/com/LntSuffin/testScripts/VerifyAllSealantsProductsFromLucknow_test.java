package com.LntSuffin.testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.LntSuffin.genericUtility.TestNgCommonClass;
import com.LntSuffin.objectRepository.PLP_page;
import com.LntSuffin.objectRepository.buyerHome_page;

public class VerifyAllSealantsProductsFromLucknow_test extends TestNgCommonClass
{ 
	@Test
	public void	VerifyAllSealantsProductsFromLucknow()
	{
		buyerHome_page buyerhome = new buyerHome_page(driver);
		PLP_page plp = new PLP_page(driver);

		buyerhome.clickbuildingAndConstructionCategory();
		buyerhome.clickSealantsSubCategory();
		plp.clickLucknowCheckbox();
		webDrive.scrollPage(2);
		int num = plp.getproductsInPage();

		int num1 = plp.getNumofProductsCities();

		Assert.assertEquals(num, num1);}
}
