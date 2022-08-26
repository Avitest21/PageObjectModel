package pom.irctc.pages;

import com.google.j2objc.annotations.Property;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterUSerName(String userName) {
		enterByXpath(prop.getProperty("RegistrationPage.enterUSerName.xpath"), userName);
		return new RegistrationPage();
	}

	
	public RegistrationPage enterUserPassword(String usrPwd) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterUserPassword.xpath"), usrPwd);
		return this;
	}
	
	
	public RegistrationPage enterConformUserPassword(String cnfUsrPwd) {
		enterByXpath(prop.getProperty("RegistrationPage.enterConformUserPassword.xpath"), cnfUsrPwd);
		
		return this;
		
	}
	
	public RegistrationPage clickPreferdLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.clickPreferdLanguage.xpath"));
		return this;
		
	}
	public RegistrationPage selectPreferdLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.selectPreferdLanguage.xpath"));
		
		return this;
	}
	
	public RegistrationPage clickSecurityQuestion() {
		
		clickByXpath(prop.getProperty("RegistrationPage.clickSecurityQuestion.xpath"));
		return this;
	}
	
	
	public RegistrationPage selectSecurityquestion() {
		clickByXpath(prop.getProperty("RegistrationPage.selectSecurityquestion.xpath"));
		return this;
	}
	
	
	public RegistrationPage securityAnswer(String secAns) {
		enterByXpath(prop.getProperty("RegistrationPage.securityAnswer.xpath"), secAns);
		
		return this;
	}
	
	public RegistrationPage clickContinuebutton() {
		
		clickByXpath(prop.getProperty("RegistrationPage.clickContinuebutton.xpath"));
		return this;
		
	}
	
	
	public RegistrationPage enterfirstname(String firstName) {
		enterByXpath(prop.getProperty("RegistrationPage.enterfirstname.xpath"), firstName);
		return this;
	}
	
	public RegistrationPage enterMiddlename(String middleName ) {
	enterByXpath(prop.getProperty("RegistrationPage.enterMiddlename.xpath"), middleName);
	return this;
	}
	
	public RegistrationPage enterLastname(String lastname) {
	enterByXpath(prop.getProperty("RegistrationPage.enterLastname.xpath"), lastname);
		return this;
		
	}
	
	public RegistrationPage clickOccupation() {
		
		clickByXpath(prop.getProperty("RegistrationPage.clickOccupation.xpath"));
		return this;
	}
	
	public RegistrationPage selectOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.selectOccupation.xpath"));
		
		return this;
	}
	
	
	public RegistrationPage enterDob(String DOB) {
		enterByXpath(prop.getProperty("RegistrationPage.DOB.xpath"), DOB);
		return this;
	}
	public RegistrationPage clickDateofBirth() {
		clickByXpath(prop.getProperty("RegistrationPage.clickDateofBirth.xpath"));
		return this;
	}
	
	public RegistrationPage selectMonth(String DOB) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectMonth.xpath"), DOB);		
		return this;
	}
	public RegistrationPage selectYear(String year) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectYear.xpath"), year);
		return this;
	}
	public RegistrationPage clickDate(String date) {
		replaceString(prop.getProperty("RegistrationPage.clickDate.xpath"),"\"+Date+\"",date);
		return this;
	}
	
	
	public RegistrationPage clickOnmaritialButton(String maritia) {
		replaceString(prop.getProperty("RegistrationPage.clickOnmaritialButton.xpath"),"\"+maritialStatus+\"", maritia);
		return this;
	}
	
	public RegistrationPage clickOnCountry(String Countryno) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.clickOnCountry.xpath"), Countryno);
		
		return this;
	}
	
	public RegistrationPage clickOnGender(String Gender) {
		
		
		replaceString(prop.getProperty("RegistrationPage.clickOnGender.xpath"), "\"+Gender+\"", Gender);
		return this;
	}
	
	public RegistrationPage enterEmailid(String email) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterEmailid.xpath"), email);
		return this;
	}
	
	public RegistrationPage enterPhoneNUmber(String mobile) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterPhoneNUmber.xpath"), mobile);
		return this;
	}
	public RegistrationPage selectNationality(String nationality) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectNationality.xpath"), nationality);
		return this;
	}
	
	public RegistrationPage clickContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.clickContinue.xpath"));
		return this;
	}
	
	public RegistrationPage enterBlockNo(String resAddress1) {
	
	enterByXpath(prop.getProperty("RegistrationPage.enterBlockNo.xpath"), resAddress1);
	
	return this;
	
	}
	
	public RegistrationPage enterStreetLane(String resAddress2 ){
		
		enterByXpath(prop.getProperty("RegistrationPage.enterStreetLane.xpath"), resAddress2);
		return this;
		
	}
	
	public RegistrationPage enterArea(String  resAddress3) {
		enterByXpath(prop.getProperty("RegistrationPage.enterArea.xpath"), resAddress3);
		return this;
	}
	
	
	public RegistrationPage enterPincode(String resPinCode) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterPincode.xpath"), resPinCode);
		
		return this;
	}
	
	public RegistrationPage enterState(String resState) {
		enterByXpath(prop.getProperty("RegistrationPage.enterState.xpath"), resState);
		return this;
	}
	
	public RegistrationPage selectCityname(String city) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.selectCityname.xpath"), city);
		return this;
		
	}
	
	public RegistrationPage enterPostOffice(String resPostOff ) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.enterPostOffice.xpath"), resPostOff);
		return this;
		
	}
	
	public RegistrationPage enterResidentno(String resPhone) {
		enterByXpath(prop.getProperty("RegistrationPage.enterResidentno.xpath"), resPhone);
		return this;
		
	}
	
	public RegistrationPage copyOfresidence(String copyOfresidence) {
		replaceString(prop.getProperty("RegistrationPage.copyOfresidence.xpath"),"\"+copyOfresidence+\"", copyOfresidence);
		return this;
	}
	public RegistrationPage enterOfficeflatNo(String offAddress1 ) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterOfficeflatNo.xpath"), offAddress1);
		return this;
		
		
	}
	
	public RegistrationPage enterOfficestreet(String offAddress2) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterOfficestreet.xpath"), offAddress2);
		return this;
	}
	
	public RegistrationPage enterOfficeArea(String offAddress3) {
		enterByXpath(prop.getProperty("RegistrationPage.enterOfficeArea.xpath"), offAddress3);
		return this;
	}
	public RegistrationPage clickCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.clickCountry.xpath"));
		return this;
	}
	public RegistrationPage clickcountry1() {
		clickByXpath(prop.getProperty("RegistrationPage.clickcountry1.xpath"));
		return this;
	}
	
	public RegistrationPage enterOfficepinCOde(String offPinCode) {
		enterByXpath(prop.getProperty("RegistrationPage.enterOfficepinCOde.xpath"), offPinCode);
		return this;
	}
	
	public RegistrationPage enterState1(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.enterState1.xpath"), data);
		return this;
	}
	
	public RegistrationPage entercity1(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.entercity1.xpath"), data);
		
		return this;
	}
	
	
	
	
	
	
	
	public RegistrationPage enterPostofficeName(String offPostOff) {
		enterByXpath(prop.getProperty("RegistrationPage.enterPostofficeName.xpath"), offPostOff);
		return this;
	}
	
	public RegistrationPage enterOffphoneNo(String offPhone) {
		enterByXpath(prop.getProperty("RegistrationPage.enterOffphoneNo.xpath"), offPhone);
		return this;
	}
	public RegistrationPage clickCheckbox() {
		clickByXpath(prop.getProperty("RegistrationPage.clickCheckbox.xpath"));
		return this;
	}
	
	public RegistrationPage clickCheckbox2() {
		clickByXpath(prop.getProperty("RegistrationPage.clickCheckbox2.xpath"));
		return this;
	}
	
	public RegistrationPage clickRegisterbutton() {
		clickByXpath(prop.getProperty("RegistrationPage.clickRegisterbutton.xpath"));
		return this;
	}
	
	public RegistrationPage waitProperty1(long Mills) {
		waitProperty(Mills);
		return this;
	}
	
	public RegistrationPage pageDown1() {
		pageDown();
		return this;
	}
}
