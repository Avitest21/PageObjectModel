package pom.panindia.pages;

import wrappers.GenericWrappers;

public class PanNewPage  extends GenericWrappers{
	
	public PanNewPage selectTitle(String title) {
		selectVisibileTextByXpath("//select[@name='pan_title']", title);
		return this;
		
	}
	
	public PanNewPage enterFirstname(String pan_firstname) {
		enterByXpath("//input[@name='pan_firstname']", pan_firstname);
		return this;
	}

	
	public PanNewPage enterMiddlename(String pan_middlename ) {
		
		enterByXpath("//input[@id='pan_middlename']", pan_middlename);
		return this;
	}
	
	public PanNewPage enterLastname(String pan_lastname) {
		enterByXpath("//input[@id='pan_lastname']", pan_lastname);
		
		return this;
	}
	
	
	public PanNewPage enterFathername(String pan_fatherfirstname ) {
		enterByXpath("//input[@id='pan_fatherfirstname']", pan_fatherfirstname);
		return this;
	}
	
	
	
	public PanNewPage enterFathermidleName(String pan_fathermiddlename) {
		
		enterByXpath("//input[@id='pan_fathermiddlename']", pan_fathermiddlename);
		return this;
		
	}
	
	public PanNewPage enterFatherlastName(String pan_fatherlastname ) {
		enterByXpath("//input[@id='pan_fatherlastname']", pan_fatherlastname);
		return this;
		
	}
	public PanNewPage enterMobileno(String pan_mobilenumber ) {
		enterByXpath("//input[@id='pan_mobilenumber']", pan_mobilenumber);
		return this;
	}
	
	
	
	public PanNewPage enterEmailid(String pan_email) {
		
		enterByXpath("//input[@id='pan_email']", pan_email);
		return this;
	}
	
	
	
	
	public PanNewPage selectSource(String income) {
		selectVisibileTextByXpath("//select[@id='pan_sourceofincome']", income);
		return this;
	}
	
	public PanNewPage clickCommunication() {
		clickByXpath("//input[@id='residence']");
		return this;
			}
	
	
	public PanNewPage enterDob(String pan_dob) {
		enterByXpath("//input[@id='pan_dob']", pan_dob);
		return this;
	}
	
	public PanNewPage enterAddresshouseNo(String pan_addressline1) {
		enterByXpath("//input[@id='pan_addressline1']", pan_addressline1);
		return this;
	}
	public PanNewPage enterAddressline2(String pan_addressline2) {
		enterByXpath("//input[@id='pan_addressline2']", pan_addressline2);
		return this;
	}
	
	public PanNewPage enterCityname(String pan_cityname) {
		enterByXpath("//input[@id='pan_cityname']", pan_cityname);
		return this;
	}
	
	public PanNewPage selectState(String State) {
		selectVisibileTextByXpath("//select[@id='pan_cityname']", State);
		return this;
	}
	
	public PanNewPage enterPincode(String pan_pincode) {
		enterByXpath("//input[@id='pan_pincode']", pan_pincode);
		return this;
	}
	
	public PanNewPage selectCOuntry(String Country) {
		selectVisibileTextByXpath("//select[@id='pan_country']", Country);
		return this;
	}
	
	public PanNewPage selectIDproof(String idproof) {
		selectVisibileTextByXpath("//select[@id='pan_identityproof']", idproof);
		return this;
	}
	
	public PanNewPage selectAddressproof(String addressproof) {
		selectVisibileTextByXpath("//select[@id='pan_addressproof']", addressproof);
		return this;
	}
	public PanNewPage selectDobprrof(String dobproof) {
		selectVisibileTextByXpath("//select[@id='pan_addressproof']", dobproof);
		return this;
	}
	public PanNewPage aadharProof(String aadhar) {
		selectVisibileTextByXpath("//select[@id='pan_aadhaarproof']", aadhar);
		return this;
	}
	public PanNewPage clickAgree() {
		clickByXpath("//input[@id='pan_source']");
		return this;
	}
	
	public PanNewPage clickNext() {
		clickByXpath("//input[@class='next action-button'][1]");
		return this;
	}
}


