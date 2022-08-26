package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassengerDetailsPage extends GenericWrappers{
	
	
	public PassengerDetailsPage selectTitle(String title) {
		
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailsPage.selectTitle.xpath"), title);
		return this;
	}
public PassengerDetailsPage switchtoPassengerdetailPage() {
	switchToLastWindow();
	return this;
}
	public PassengerDetailsPage enterFirstname(String firstName ) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.enterFirstname.xpath"), firstName);
		return this;
	}
	
	public PassengerDetailsPage enterLastname(String lastName) {
	enterByXpath(prop.getProperty("PassengerDetailsPage.enterLastname.xpath"), lastName);
	return this;
	}
	
	public PassengerDetailsPage selectCountry(String Country) {
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailsPage.selectCountry.xpath"), Country);
		return this;
	}
	
	public PassengerDetailsPage selectState(String state) {
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailsPage.selectState.xpath"), state);
		return this;
	}
	
	public PassengerDetailsPage selectGST(String gst) {
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailsPage.selectGST.xpath"), gst);
		return this;
	}



public PassengerDetailsPage verifyHotelname() {
	verifyTextByXpath(prop.getProperty("PassengerDetailsPage.verifyHotelname.xpath"), "Oga Le Grace Parktown");
	return this;
	
}
public PassengerDetailsPage verifyPrice() {
	
	verifyTextByXpath(prop.getProperty("PassengerDetailsPage.verifyPrice.xpath"), "₹ 2016");
	return new PassengerDetailsPage();
	
}

public PassengerDetailsPage enterGstno(String gstNumber) {
	enterByXpath(prop.getProperty("PassengerDetailsPage.enterGstno.xpath"), gstNumber);
	return this;
	
}

public PassengerDetailsPage enterCompanyname(String companyName) {
	
	enterByXpath(prop.getProperty("PassengerDetailsPage.enterCompanyname.xpath"), companyName);
	return this;
}

public PassengerDetailsPage  enterCompanyadress(String companyAddress) {
	enterByXpath(prop.getProperty("PassengerDetailsPage.enterCompanyadress.xpath"), companyAddress);
	return this;
	
}
public PassengerDetailsPage verifyGstmessage() {
	verifyTextByXpath(prop.getProperty("PassengerDetailsPage.verifyGstmessage.xpath"), "Please Enter Valid GSt number");
	return this;
	
	
}

public PassengerDetailsPage clickContinuePassenger()
{
	clickByXpath(prop.getProperty("PassengerDetailsPage.clickContinuePassenger.xpath"));
	return this;
}
public SummaryPage clickContinue() {
	clickByXpath(prop.getProperty("PassengerDetailsPage.clickContinue.xpath"));
	return new SummaryPage();
	
}
public PassengerDetailsPage wait1(long millis) {
	waitProperty(millis);
	return this;

}
}