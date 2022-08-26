package pom.irctc.pages;

import pom.simplealert.pages.SimpleAlertpage;
import wrappers.GenericWrappers;

public class FtrServeletPage extends GenericWrappers{
	
	
	
	public FtrServeletPage enterUserid(String userId) {
		enterByXpath(prop.getProperty("FtrServeletPage.enterUserid.xpath"), userId);
		return this;
	}

	
	public FtrServeletPage enterPassword(String password) {
		enterByXpath(prop.getProperty("FtrServeletPage.enterPassword.xpath"), password);
		return this;
	}
	
	public FtrServeletPage enterConfirmPassword(String cnfPassword) {
		enterByXpath(prop.getProperty("FtrServeletPage.enterConfirmPassword.xpath"), cnfPassword);
		return this;
	}
	
	public FtrServeletPage selectSecurityQuestion(String value ) {
		selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectSecurityquestion.xpath"), value);
		return this;
	
	}
	
	public FtrServeletPage securityAnswer(String secAnswer) {
		enterByXpath(prop.getProperty("FtrServeletPage.securityAnswer.xpath"), secAnswer );
		return this;
	}
	public FtrServeletPage clickDOB() {
		clickByXpath(prop.getProperty("FtrServeletPage.clickDOB.xpath"));
		return this;
		
	}
	public FtrServeletPage selectMonth(String Month) {
	selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectMonth.xpath"), Month);
		return this;
	}
	public FtrServeletPage selectYear(String year) {
		selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectYear.xpath"), year);
		return this;
	}
	
	

	public FtrServeletPage clickDate(String clickDate) {
		replaceString(prop.getProperty("FtrServeletPage.clickDate.xpath"), "\"+Date+\"", clickDate);
		return this;
	}
	
	public FtrServeletPage enterDOB(String enterDOB) {
		enterByXpath(prop.getProperty("FtrServeletPage.enterDOB.xpath"), enterDOB);
		return this;
	}
	
	public FtrServeletPage clickGender(String enterGender) {
	replaceString(prop.getProperty("FtrServeletPage.clickGender.xpath"), "\"+Gender+\"", enterGender);
		return this;
	}
	
public FtrServeletPage clickMaritial(String clickMartial) {
	replaceString(prop.getProperty("FtrServeletPage.clickMartial.xpath"),"\"+clickMartial+\"",clickMartial);
	return this;
	}
	
	public FtrServeletPage enterEmail(String email) {
		enterByXpath(prop.getProperty("FtrServeletPage.enterEmail.xpath"), email);
		return this;
	}
	public FtrServeletPage selectOccuppation(String Occupation) {
		selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectOccuppation.xpath"), Occupation);
		return this;
	}
	
	public FtrServeletPage enterPanmname(String fname) {
		enterByXpath(prop.getProperty("FtrServeletPage.enterPanmname.xpath"), fname);
		return this;
	}
	public FtrServeletPage selectNationality(String nationality) {
		selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectNationality.xpath"), nationality);
		return this;
		
	}
public FtrServeletPage enterAddress(String flatNo ) {
	enterByXpath(prop.getProperty("FtrServeletPage.enterAddress.xpath"), flatNo);
	return this;
}
public FtrServeletPage enterStreet(String street) {
	enterByXpath(prop.getProperty("FtrServeletPage.enterStreet.xpath"), street);
	return this;
}
public FtrServeletPage enterArea(String area) {
	enterByXpath(prop.getProperty("FtrServeletPage.enterArea.xpath"), area);
	return this;
	
}
public FtrServeletPage selectCountry(String country) {
	selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectCountry.xpath"), country);
	return this;
}
public FtrServeletPage enterMObile(String mobile) {
	enterByXpath(prop.getProperty("FtrServeletPage.enterMObile.xpath"), mobile);
	return this;
	
}
public FtrServeletPage enterPincode(String pincode) {
	enterByXpath(prop.getProperty("FtrServeletPage.enterPincode.xpath"), pincode);
	return this;
}
public FtrServeletPage clickCity1() {
	clickByXpath(prop.getProperty("FtrServeletPage.clickCity1.xpath"));
	return this;
}

public FtrServeletPage enterCity(String cityname) {
	selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.enterCity.xpath"),cityname);
	return this;
}
public FtrServeletPage enterstate(String state) {
	selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.enterstate.xpath"), state);
	return this;
}

public FtrServeletPage clickState1() {
	clickByXpath(prop.getProperty("FtrServeletPage.clickState1.xpath"));
	return this;
}
public FtrServeletPage selectPostoffice(String postoffice) {
	selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectPostoffice.xpath"), postoffice);
	return this;
}
public FtrServeletPage clickCommunicationAddress() {
	clickByXpath(prop.getProperty("FtrServeletPage.clickCommunicationAddress.xpath"));
	return this;
	
	
}
public FtrServeletPage enterOfficeaddress(String offAdd) {
	
	enterByXpath(prop.getProperty("FtrServeletPage.enterOfficeaddress.xpath"), offAdd);
	return this;
}
public FtrServeletPage clickCreateprofile() {
	clickByXpath(prop.getProperty("FtrServeletPage.clickCreateprofile.xpath"));
	return this;
}
public FtrServeletPage selectOfficeCountry(String offCountry) {
	selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectOfficeCountry.xpath"), offCountry);
	return this;
}

public FtrServeletPage enteroffphone(String offNumber) {
	enterByXpath(prop.getProperty("FtrServeletPage.enteroffphone.xpath"), offNumber);
	return this;
}
public FtrServeletPage enteroffPincode(String pincode) {
	enterByXpath(prop.getProperty("FtrServeletPage.enteroffPincode.xpath"), pincode);
	return this;
}
public FtrServeletPage selectPostoffice1(String postoffice1) {
	selectVisibileTextByXpath(prop.getProperty("FtrServeletPage.selectPostoffice.xpath"), postoffice1);
	return this;
}
public FtrServeletPage waitProperty1(long Mills) {
	waitProperty(Mills);
	return this;
}
public FtrServeletPage pagedown() {
	pageDown();
	return this;
}
}