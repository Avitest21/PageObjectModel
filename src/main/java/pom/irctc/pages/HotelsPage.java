package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers {
	
	
	
	
	public HotelsPage clickOnLogin() {
		
		clickByXpath(prop.getProperty("HotelsPage.clickOnLogin.xpath"));
		return this;
		
	}
	
	public HotelsPage clickOnguest() {
		clickByXpath(prop.getProperty("HotelsPage.clickOnguest.xpath"));
		return this;
	}

	
	public HotelsPage enterEmail(String email) {
		enterByXpath(prop.getProperty("HotelsPage.enterEmail.xpath"), email);
		return this;
		
	}
	
	public HotelsPage enterMobileno(String mobileNo) {
		enterByXpath(prop.getProperty("HotelsPage.enterMobileno.xpath"), mobileNo);
		return this;
	}
	
	public HotelsPage clickonLogin3() {
		clickByXpath(prop.getProperty("HotelsPage.clickonLogin3.xpath"));
		return this;
	}
	public HotelsPage enterCityhotelName(String filterText) {
		enterByXpath(prop.getProperty("HotelsPage.enterCityhotelName.xpath"), filterText);
		
		return this;
		
	}
	public HotelsPage clickHotelname(String Hotelname) {
		replaceString(prop.getProperty("HotelsPage.clickHotelname.xpath"),"\"+Hotelname+\"", Hotelname);
		return this;
	}
	public HotelsPage clickDate() {
		clickByXpath(prop.getProperty("HotelsPage.clickDate.xpath"));
		return this;
		
	}
	
	public HotelsPage clickDatemonthyear() {
		clickByXpath(prop.getProperty("HotelsPage.clickDatemonthyear.xpath"));
		return this;
	}
	
	public HotelsPage enterYear(String enterYear) {
		replaceString(prop.getProperty("HotelsPage.enterYear.xpath"),"\"+year+\"", enterYear);
		return this;
		
		
	}
	public HotelsPage enterMonth(String enterMonth ) {
		replaceString(prop.getProperty("HotelsPage.enterMonth.xpath"),"\"+Month+\"", enterMonth);
		return this;
	}
	
	public HotelsPage enterDate(String enterDate) {
		replaceString(prop.getProperty("HotelsPage.enterDate.xpath"),"\"+date+\"", enterDate);
		return this;
	}
	
	public HotelsPage clickCheckoutDate() {
		clickByXpath(prop.getProperty("HotelsPage.clickCheckoutDate.xpath"));
			return this;
		
		
	}
	public HotelsPage clickCheckoutdmy() {
		clickByXpath(prop.getProperty("HotelsPage.clickCheckoutdmy.xpath"));
		return this;
	}
	
	
	
	public HotelsPage enterCheckoutYear(String checkOutYear) {
		replaceString(prop.getProperty("HotelsPage.enterCheckoutYear.xpath"),"\"+year+\"", checkOutYear);
		return this;
		
		
	}
	public HotelsPage enterCheckoutMonth(String checkOutenterMonth ) {
		replaceString(prop.getProperty("HotelsPage.enterCheckoutMonth.xpath"),"\"+Month+\"", checkOutenterMonth);
		return this;
	}
	
	public HotelsPage enterCheckoutDate(String checkOutenterDate) {
		replaceString(prop.getProperty("HotelsPage.enterCheckoutDate.xpath"), "\"+date+\"", checkOutenterDate);
		return this;
	}
	
	public HotelsPage userDatawrapper() {
		
		clickByXpath(prop.getProperty("HotelsPage.userDatawrapper.xpath"));
		
		return this;
	}
	
	public HotelsPage selectGuest(String data) {
		selectVisibileTextByXpath(prop.getProperty("HotelsPage.selectGuest.xpath"), data);
		return this;
	}
	
	
	
	
	public HotelsSearchPage clickFindhotel() {
		
		clickByXpath(prop.getProperty("HotelsPage.clickFindhotel.xpath"));
		return new HotelsSearchPage();
	}
	
	public HotelsPage switchtoHotelPage() {
		switchToLastWindow();
		return this;
	}
	
	public HotelsPage wait1(long millis) {
		waitProperty(millis);
		return this;
	}
}
