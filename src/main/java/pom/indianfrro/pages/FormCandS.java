package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class FormCandS extends GenericWrappers {


	public FormCandS enterUserid(String u_id) {
		enterByXpath(prop.getProperty("FormCandS.enterUserid.xpath"), u_id);
		return this;

	}
	public FormCandS enterpassword(String  u_pwd) {
		enterByXpath(prop.getProperty("FormCandS.enterpassword.xpath"), u_pwd);
		return this;
	}
	public FormCandS enterConformpassword(String u_repwd) {
		enterByXpath(prop.getProperty("FormCandS.enterConformpassword.xpath"), u_repwd);
		return this;
	}

	public FormCandS selectSecurityqn(String question) {
		selectVisibileTextByXpath(prop.getProperty("FormCandS.selectSecurityqn.xpath"), question);
		return this;
	}

	public FormCandS entersecurityAnswer(String u_secans ) {
		enterByXpath(prop.getProperty("FormCandS.entersecurityAnswer.xpath"), u_secans);
		return this;
	}

	public FormCandS enterName(String u_name) {
		enterByXpath(prop.getProperty("FormCandS.enterName.xpath"), u_name);
		return this;
	}

	public FormCandS selectGender(String Gender) {
		selectVisibileTextByXpath(prop.getProperty("FormCandS.selectGender.xpath"), Gender);
		return this;
	}

	public FormCandS enterDob(String u_dob) {
		enterByXpath(prop.getProperty("FormCandS.enterDob.xpath"), u_dob);
		return this;
	}


	public FormCandS enterdesignation(String u_designation) {
		enterByXpath(prop.getProperty("FormCandS.enterdesignation.xpath"), u_designation);
		return this;
	}



	public FormCandS enterEmail(String u_emailid) {
		enterByXpath(prop.getProperty("FormCandS.enterEmail.xpath"), u_emailid);
		return this;


	}

	public FormCandS enterMobileNo(String u_mobile) {
		enterByXpath(prop.getProperty("FormCandS.enterMobileNo.xpath"), u_mobile);
		return this;
	}


	public FormCandS enterPhoneNo(String u_phone) {
		enterByXpath(prop.getProperty("FormCandS.enterPhoneNo.xpath"), u_phone);
		return this;
	}

	public FormCandS selectNationality(String nationality) {
		selectVisibileTextByXpath(prop.getProperty("FormCandS.selectNationality.xpath"), nationality);
		return this;
	}

	public FormCandS enterHotelDetail(String name) {
		enterByXpath(prop.getProperty("FormCandS.enterHotelDetail.xpath"), name);
		return this;
	}

	public FormCandS enterCapacity (String capacity) {
		enterByXpath(prop.getProperty("FormCandS.enterCapacity.xpath"), capacity);
		return this;

	}
	public FormCandS enterAddress(String address) {
		enterByXpath(prop.getProperty("FormCandS.enterAddress.xpath"), address);
		return this;
	}

	public FormCandS selectState1(String state) {
		selectVisibileTextByXpath(prop.getProperty("FormCandS.selectState1.xpath"),  state);
		return this;
	}
	
	public FormCandS pagedown1() {
		pageDown();
		return this;
	}
	
	
	public FormCandS selectCity(String City) {
		
		selectVisibileTextByXpath(prop.getProperty("FormCandS.selectCity.xpath"), City);
		return this;
	}
	
	public FormCandS selectFrro(String frrodata) {
		selectVisibileTextById(prop.getProperty("FormCandS.selectFrro.id"), frrodata);
		return this;
	}
	
	
	public FormCandS selectAccotype(String acco_type) {
		selectVisibileTextByXpath(prop.getProperty("FormCandS.selectAccotype.xpath"),  acco_type);
		return this;
	}
	
	public FormCandS selectAccograde(String star_rat) {
		selectVisibileTextByXpath(prop.getProperty("FormCandS.selectAccograde.xpath"),  star_rat);
		return this;
	
}

	public FormCandS enterEmailid(String email ) {
		enterByXpath(prop.getProperty("FormCandS.enterEmailid.xpath"), email);
		return this;
	}
	
	
	public FormCandS enterMobileNo1(String mcontact) {
		enterByXpath(prop.getProperty("FormCandS.enterMobileNo1.xpath"), mcontact);
		return this;
	}


	public FormCandS enterPhoneNo1(String u_phone) {
		enterByXpath(prop.getProperty("FormCandS.enterPhoneNo1.xpath"), u_phone);
		return this;
	}
	public FormCandS enterOwnerDetail(String name_o) {
		enterByXpath(prop.getProperty("FormCandS.enterOwnerDetail.xpath"), name_o);
		return this;
	}
	
	
	public FormCandS enterAddress1(String address_o) {
		enterByXpath(prop.getProperty("FormCandS.enterAddress1.xpath"), address_o);
		return this;
	}
	
	
	public FormCandS selectState(String state_o) {
		selectVisibileTextById(prop.getProperty("FormCandS.selectState.id"), state_o);
		return this;
	}
	
	public FormCandS selectDidtrict(String citydistr_o ) {
		selectVisibileTextByXpath(prop.getProperty("FormCandS.selectDidtrict.xpath"), citydistr_o);
		return this;
		
	}
	public FormCandS enterEmailid2(String email ) {
		enterByXpath(prop.getProperty("FormCandS.enterEmailid2.xpath"), email);
		return this;
	}
	
	
	public FormCandS enterMobileNo2(String mcontact) {
		enterByXpath(prop.getProperty("FormCandS.enterMobileNo2.xpath"), mcontact);
		return this;
	}


	public FormCandS enterPhoneNo2(String u_phone) {
		enterByXpath(prop.getProperty("FormCandS.enterPhoneNo2.xpath"), u_phone);
		return this;
	}
	
	public FormCandS clickAdd() {
		clickByXpath(prop.getProperty("FormCandS.clickAdd.xpath="));
		return this;
	}
	
	
	public FormCandS clickSubmit() {
		clickByXpath(prop.getProperty("FormCandS.clickSubmit.xpath"));
		return this;
	}
	
	public FormCandS waitProperty1(long millis) {
		waitProperty(millis);
		return this;
	}
}


	
	
	