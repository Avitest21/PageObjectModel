package wrappers;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utilis.Reporting;

public class GenericWrappers extends Reporting implements Wrappers  {


	public static  RemoteWebDriver driver;
	public static Properties prop;
	public void loadObjects() {
		
		try {
			prop=new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadObjects() {
		prop=null;
		
	}
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub

		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {

				//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();			
			}else if (browser.equalsIgnoreCase("ie")) {
				//System.setProperty("webdriver.ie.driver", "./drivers/IEDriverserve.exe");

				driver = new InternetExplorerDriver();
			}

			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			//System.out.println("The Browser "+browser+" is launched with given url "+url+ " sucessfully");
			reportStep("The Browser "+browser+" is launched with given url "+url+ " successfully", "Pass");

		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The Browser "+browser+" is not launched due to session not created error");
			reportStep("The Browser "+browser+" is not launched due to session not created error", "Fail");
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			//	System.err.println("The Browser "+browser+" is not launched as url does not contain http/https" );
			reportStep("The Browser "+browser+" is not launched as url does not contain http/https", "Fail");

		} catch (WebDriverException e) {
			// TODO: handle exception

			//System.err.println("The Browser "+browser+" is not launched due to unknown error");

			reportStep("The Browser "+browser+" is not launched due to unknown error", "Fail");
		}

	} 



	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub

		try {
			driver.findElementById(idValue).sendKeys(data);

			//System.out.println("The element with id "+idValue+" is entered with data "+data);

			reportStep("The element with id "+idValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in DOM");
			reportStep("The element with id "+idValue+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//	System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//	System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception

			//	System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data"+data+"due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data"+data+"due to unknown error", "Fail");

		}

	}


	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with Name "+nameValue+" is enterd with data "+data);
			reportStep("The element with Name "+nameValue+" is enterd with data "+data, "Pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The element with Name "+nameValue+" is not found in the dom");
			reportStep("The element with Name "+nameValue+" is not found in the dom", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//	System.err.println("The element with Name "+nameValue+" is not visible in the Application");

			reportStep("The element with Name "+nameValue+" is not visible in the Application", "fAIL");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+nameValue+" is not interactable in the Application");
			reportStep("The element with Name "+nameValue+" is not interactable in the Application", "Fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+nameValue+" is not stable in the Application");
			reportStep("The element with Name "+nameValue+" is not stable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with Name "+nameValue+" is not entered with data "+data+" due to unknown error", "Fail");


		}
	}



	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with Xpath "+xpathValue+" is enterd with data "+data);
			reportStep("The element with Xpath "+xpathValue+" is enterd with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpathValue+" is not found in the Dom");
			reportStep("The element with Xpath "+xpathValue+" is not found in the Dom", "Fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//	System.err.println("The element with Xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with Xpath "+xpathValue+" is not visible in the application", "Fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathValue+" is not not Interactable in the application");
			reportStep("The element with Xpath "+xpathValue+" is not not Interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception

			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception

			//System.err.println("The element with Xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");

			reportStep("The element with Xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "Fal");
		}

	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub

		try {
			String actualText = driver.getTitle();

			if (actualText.equals(title)) {
				//System.out.println("The Title of the page "+actualText+" is matched with expected title" +title);
				reportStep("The Title of the page "+actualText+" is matched with expected title" +title, "Pass");
			}else {
				//System.err.println("The Title of the page "+actualText+" is not matched with expected title" +title);
				reportStep("The Title of the page "+actualText+" is not matched with expected title" +title, "Fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The title of the page "+title+" is not verified due to unknown error");
			reportStep("The title of the page "+title+" is not verified due to unknown error", "Fail");


		}

	}



	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

		try {
			String actualText = driver.findElementById(id).getText();
			if (actualText.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualText+" is matched with expected text"+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is matched with expected text"+text, "Pass");
			}else {
				//System.err.println("The element with id"+id+"is holding the text "+actualText+" is not matched with expected text"+text);
				reportStep("The element with id"+id+"is holding the text "+actualText+" is not matched with expected text"+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");

		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the Application");
			reportStep("The element with id "+id+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the Application");
			reportStep("The element with id "+id+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the Application");
			reportStep("The element with id "+id+" is not stable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" and text "+text+" is not veirfied due to unknown error");
			reportStep("The element with id "+id+" and text "+text+" is not veirfied due to unknown error", "Fail");

		}

	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)){
				//System.out.println("The element with Xpath "+xpath+" is holding the text "+actualText+" is matched with expected text "+text);	
				reportStep("The element with Xpath "+xpath+" is holding the text "+actualText+" is matched with expected text "+text, "PAss");
			}else {
				//System.err.println("The element with Xpath "+xpath+" is holding the text "+actualText+" is not matched with expected text "+text);	
				reportStep("The element with Xpath "+xpath+" is holding the text "+actualText+" is not matched with expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The element with Xpath "+xpath+" is not found in DOM");	
			reportStep("The element with Xpath "+xpath+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//	System.err.println("The element with Xpath "+xpath+" is not visible in the application");
			reportStep("The element with Xpath "+xpath+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//	System.err.println("The element with Xpath "+xpath+" is not interactable in the application");
			reportStep("The element with Xpath "+xpath+" is not interactable in the application", "Fail");

		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpath+" is not stable in the application");
			reportStep("The element with Xpath "+xpath+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpath+" text  "+text+" is not verified due to unknown error");
			reportStep("The element with Xpath "+xpath+" text  "+text+" is not verified due to unknown error", "Fail");

		}

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				//System.out.println("The element with Xpath "+xpath+" is containing the text "+actualText+" is matched with expected text "+text);	
				reportStep("The element with Xpath "+xpath+" is containing the text "+actualText+" is matched with expected text "+text, "Pass");
			}else {
				//System.err.println("The element with Xpath "+xpath+" is containing the text "+actualText+" is not matched with expected text "+text);
				reportStep("The element with Xpath "+xpath+" is containing the text "+actualText+" is not matched with expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpath+" is not found in DOM");
			reportStep("The element with Xpath "+xpath+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpath+" is not visible in the application");
			reportStep("The element with Xpath "+xpath+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//	System.err.println("The element with Xpath "+xpath+" is not interactable in the application");
			reportStep("The element with Xpath "+xpath+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpath+" is not stable in the application");
			reportStep("The element with Xpath "+xpath+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" text "+text+" is not verified due to unknown error");
			reportStep("The element with xpath "+xpath+" text "+text+" is not verified due to unknown error", "Fail");

		}
	}



	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();

			//System.out.println("The element with Id "+id+" is clicked successfully");
			reportStep("The element with Id "+id+" is clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The element with Id "+id+" is not found in DOM"); 
			reportStep("The element with Id "+id+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+id+" is not visible in the application");
			reportStep("The element with Id "+id+" is not visible in the application", "Fail");

		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+id+" is  is obscured in the application");
			reportStep("The element with Id "+id+" is  is obscured in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+id+" is not interactable in the application");
			reportStep("The element with Id "+id+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The element with Id "+id+" is not Stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Id "+id+" is not clicked due to unknown error");
			reportStep("The element with Id "+id+" is not clicked due to unknown error", "Fail");

		}

	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with ClassName "+classVal+" is clicked successfully");
			reportStep("The element with ClassName "+classVal+" is clicked successfully", "Pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ClassName "+classVal+" is not found in DOM");
			reportStep("The element with ClassName "+classVal+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not visible in the application");
			reportStep("The element with ClassName "+classVal+" is not visible in the application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is obscured in the application");
			reportStep("The element with ClassName "+classVal+" is obscured in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not interactable in the application");
			reportStep("The element with ClassName "+classVal+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not stable in the application");
			reportStep("The element with ClassName "+classVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not clicked due to unknown error");
			reportStep("The element with ClassName "+classVal+" is not clicked due to unknown error", "Fail");

		}

	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with Name "+name+" is clicked successfully");	
			reportStep("The element with Name "+name+" is clicked successfully", "Pass");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+name+" is not found in DOM");
			reportStep("The element with Name "+name+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+name+" is not visible in the application");
			reportStep("The element with Name "+name+" is not visible in the application", "Fail");

		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+name+" is obscured in the application");
			reportStep("The element with Name "+name+" is obscured in the application", "Fail");
		}	catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+name+" is not interactable in the application");
			reportStep("The element with Name "+name+" is not interactable in the application", "Fail");

		}	catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+name+" is not stable in the application");
			reportStep("The element with Name "+name+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Name "+name+" is not clicked due to unknown error");
			reportStep("The element with Name "+name+" is not clicked due to unknown error", "Fail");

		}
	}


	public void clickByLink(String name) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with LinkText "+name+" is clicked successfully");	
			reportStep("The element with LinkText "+name+" is clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText "+name+" is not found in DOM");
			reportStep("The element with LinkText "+name+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not visible in Application");
			reportStep("The element with LinkText "+name+" is not visible in Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with LinkText "+name+" is obscured in Application");
			reportStep("The element with LinkText "+name+" is obscured in Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not interactable in Application");
			reportStep("The element with LinkText "+name+" is not interactable in Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//	System.err.println("The element with LinkText "+name+" is not stable in Application");
			reportStep("The element with LinkText "+name+" is not stable in Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with LinkText "+name+" is not clicked due to unknown error");
			reportStep("The element with LinkText "+name+" is not clicked due to unknown error", "Fail");

		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//	System.out.println("The element with LinkText "+name+" is clicked successfully");	
			reportStep("The element with LinkText "+name+" is clicked successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The element with LinkText "+name+" is not found in DOM");
			reportStep("The element with LinkText "+name+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not visible in Application");
			reportStep("The element with LinkText "+name+" is not visible in Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//	System.err.println("The element with LinkText "+name+" is obscured in Application");
			reportStep("The element with LinkText "+name+" is obscured in Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText"+name+" is not interactable in Application");
			reportStep("The element with LinkText"+name+" is not interactable in Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//	System.err.println("The element with LinkText "+name+" is not stable in Application");
			reportStep("The element with LinkText "+name+" is not stable in Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with LinkText "+name+" is not clicked due to unknown error");
			reportStep("The element with LinkText "+name+" is not clicked due to unknown error", "Fail");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//	System.out.println("The element with Xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with Xpath "+xpathVal+" is clicked successfully", "Pass");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with Xpath "+xpathVal+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathVal+" is not visible in Application");
			reportStep("The element with Xpath "+xpathVal+" is not visible in Application", "Fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathVal+" is Obscured in Application");
			reportStep("The element with Xpath "+xpathVal+" is Obscured in Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//	System.err.println("The element with Xpath "+xpathVal+" is not interactable in Application");
			reportStep("The element with Xpath "+xpathVal+" is not interactable in Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with Xpath "+xpathVal+" is not stable in Application");
			reportStep("The element with Xpath "+xpathVal+" is not stable in Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with Xpath "+xpathVal+" is not clicked due to unknown error", "Fail");

		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element With Xpath" +xpathVal+" is clicked Sucessfully");
			reportStep("The element With Xpath" +xpathVal+" is clicked Sucessfully", "Pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with Xpath "+xpathVal+" is not found in DOM", "Fail",false);
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The element with Xpath "+xpathVal+" is not visible in Application");
			reportStep("The element with Xpath "+xpathVal+" is not visible in Application", "Fail",false);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathVal+" is Obscured in Application");
			reportStep("The element with Xpath "+xpathVal+" is Obscured in Application", "Fail",false);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with Xpath "+xpathVal+" is not interactable in Application");
			reportStep("The element with Xpath "+xpathVal+" is not interactable in Application", "Fail",false);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with Xpath "+xpathVal+" is not stable in Application");
			reportStep("The element with Xpath "+xpathVal+" is not stable in Application", "Fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with Xpath "+xpathVal+" is not clicked due to unknown error", "Fail",false);
		}



	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub

		String getText  = null;

		try {
			getText = driver.findElementById(idVal).getText();
			//System.out.println("The element with id" +idVal+" is holding the text "+getText);
			reportStep("The element with id" +idVal+" is holding the text "+getText, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+idVal+" is not visible in the Application");
			reportStep("The element with id "+idVal+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interactable in the Application");
			reportStep("The element with id "+idVal+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+idVal+" is not stable in the Application");
			reportStep("The element with id "+idVal+" is not stable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//	System.err.println("The element with id "+idVal+" is not return due to unknown error");
			reportStep("The element with id "+idVal+" is not return due to unknown error", "Fail");

		}
		return getText;
	}


	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String getText  = null;
		try {
			getText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with Xpath "+xpathVal+" is return Successfully "+getText);
			reportStep("The element with Xpath "+xpathVal+" is return Successfully "+getText, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with Xpath "+xpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//	System.err.println("The element with Xpath "+xpathVal+" is not visible in the Application");
			reportStep("The element with Xpath "+xpathVal+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//	System.err.println("The element with Xpath "+xpathVal+" is not interactable in the Application");
			reportStep("The element with Xpath "+xpathVal+" is not interactable in the Application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with Xpath "+xpathVal+" is not stable in the Application");
			reportStep("The element with Xpath "+xpathVal+" is not stable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//	System.err.println("The element with Xpath is not return due to unknown error");
			reportStep("The element with Xpath is not return due to unknown error", "Fail");
		}

		return getText;
	}


	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selectVisibiletext = driver.findElementById(id);
			Select sc = new Select(selectVisibiletext);
			sc.selectByVisibleText(value);

			//System.out.println("The element with  Dropdown is selected by select by visible text using the Value" +value);
			reportStep("The element with  Dropdown is selected by select by visible text using the Value" +value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The elelment with id "+id+" is not found in the DOM");
			reportStep("The elelment with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The elelment with id "+id+" is not visible in the Application");
			reportStep("The elelment with id "+id+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The elelment with id "+id+" is not interactable in the Application");
			reportStep("The elelment with id "+id+" is not interactable in the Application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			// System.err.println("The elelment with id "+id+" is not selectable in the Application");
			reportStep("The elelment with id "+id+" is not selectable in the Application", "Fail");

		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not select by visible text due to unknown error");
			reportStep("The element with id "+id+" is not select by visible text due to unknown error", "Fail");


		}

	}


	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

		try {
			WebElement selectIndex = driver.findElementById(id);
			Select sc = new Select(selectIndex);
			sc.selectByIndex(value);
			//System.out.println("The element with Dropdown is selected by select by index using the Value" +value);
			reportStep("The element with Dropdown is selected by select by index using the Value" +value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The elelment with id "+id+" is not found in the DOM");
			reportStep("The elelment with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The elelment with id "+id+" is not visible in the Application");
			reportStep("The elelment with id "+id+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The elelment with id "+id+" is not interactable in the Application");
			reportStep("The elelment with id "+id+" is not interactable in the Application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The elelment with id "+id+" is not selectable in the Application");
			reportStep("The elelment with id "+id+" is not selectable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not select by Index text due to unknown error");
			reportStep("The element with id "+id+" is not select by Index text due to unknown error", "Fail");

		}

	}


	public void switchToParentWindow() {
		// TODO Auto-generated method stub

		try {
			Set<String> allWinAfterClick =	driver.getWindowHandles();
			for(String eachID : allWinAfterClick) {
				driver.switchTo().window(eachID);
				break;
			}
			//System.out.println("Switched to Parent Window Successfully");
			reportStep("Switched to Parent Window Successfully", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Not Switched to Parent window due to nosuchwindow error");
			reportStep("Not Switched to Parent window due to nosuchwindow error", "Fail");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			// System.err.println("Not Switched to Parent window due to session not created error");
			reportStep("Not Switched to Parent window due to session not created error", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//		System.err.println("Not Switched to Parent window due to unknown error");
			reportStep("Not Switched to Parent window due to unknown error", "Fail");

		}

	}





	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinAfterClick =	driver.getWindowHandles();
			for(String eachID : allWinAfterClick){
				driver.switchTo().window(eachID);
			}
			//System.out.println("Switched to last Window Successfully");
			reportStep("Switched to last Window Successfully", "Pass", false);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Not Switched to last window due to nosuchwindow error");
			reportStep("Not Switched to last window due to nosuchwindow error", "Fail", false);
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("Not Switched to last window due to session not created");
			reportStep("Not Switched to last window due to session not created", "Fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Not Switched to Parent window due to unknown error");
			reportStep("Not Switched to Parent window due to unknown error", "Fail", false);

		}
	}


	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			System.out.println("Accept the Opened Alert successfully");
			reportStep("Accept the Opened Alert successfully", "Pass", false);

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			// System.err.println("The expected alert is not Present in the Application");
			reportStep("The expected alert is not Present in the Application", "Fail", false);

		}		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The expected alert is not accept due to unknown error");
			reportStep("The expected alert is not accept due to unknown error", "Fail", false);
		}



	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {

			driver.switchTo().alert().dismiss();
			// System.out.println("Dismiss the Opened Alert successfully");
			reportStep("Dismiss the Opened Alert successfully", "Pass", false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			// System.err.println("The expected alert is not Present in the Application");
			reportStep("The expected alert is not Present in the Application", "Fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The expected alert is not dismiss due to unknown error");
			reportStep("The expected alert is not dismiss due to unknown error", "Fail", false);

		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String getText  = null;
		try {
			String alertText = driver.switchTo().alert().getText();
			//	System.out.println("The text of the alert "+alertText+" is return successfully");
			reportStep("The text of the alert "+alertText+" is return successfully", "Pass", false);
			return null;
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The expected alert is not Present in the Application");
			reportStep("The expected alert is not Present in the Application", "Fail", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The expected alert is not return due to unknown error");
			reportStep("The expected alert is not return due to unknown error", "Fail", false);

		}
		return getText;
	}



	public long takeSnap() {
		// TODO Auto-generated method stub
		long number = 0;

		try {
			number= (long) (Math.floor(Math.random()*100000000)+100000);
			
			File temp =	driver.getScreenshotAs(OutputType.FILE);

			File dest = new File("./reports/screenshots/"+number+".png");	

			FileUtils.copyFile(temp, dest);
			//System.out.println("The snapshot taken successfully and stored in screenshots Folder as snap1.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block

		}catch (Throwable e) {
			// TODO: handle exception
		}
		return number;

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("The Active Browser closed Successfully");
			reportStep("The Active Browser closed Successfully", "Pass",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The Active Browser not closed due to unknown error");
			reportStep("The Active Browser not closed due to unknown error", "Fail", false);
		}
	}


	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("All Browsers Closed Successfully");
			reportStep("All Browsers Closed Successfully", "Pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		//	System.err.println("All Browser not closed due to unknown error");
			reportStep("All Browser not closed due to unknown error", "Fail", false);

		}

	}





	public void selectIndexByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selectVisibiletext = driver.findElementByXPath(xpath);
			Select sc = new Select(selectVisibiletext);
			sc.selectByVisibleText(xpath);

			//	System.out.println("The element with  Dropdown is selected by select by visible text using the Value "+value);
			reportStep("The element with  Dropdown is selected by select by visible text using the Value "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The elelment with Xpath "+xpath+" is not found in the DOM");
			reportStep("The elelment with Xpath "+xpath+" is not found in the DOM", "Pass");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//	System.err.println("The elelment with Xpath "+xpath+" is not visible in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//	System.err.println("The elelment with Xpath "+xpath+" is not interactable in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not interactable in the Application", "Fail");

		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The elelment with Xpath "+xpath+" is not selectable in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not selectable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpath+" is not select by visible text due to unknown error");
			reportStep("The element with Xpath "+xpath+" is not select by visible text due to unknown error", "Fail");


		}

	}



	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selectVisibileTextByXpath = driver.findElementByXPath(xpath);
			Select sc = new Select(selectVisibileTextByXpath);
			sc.selectByVisibleText(value);

			// System.out.println("The element with  Dropdown is selected by select by visible text using the Value "+value);
			reportStep("The element with  Dropdown is selected by select by visible text using the Value "+value, "PAss");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The elelment with Xpath "+xpath+" is not found in the DOM");
			reportStep("The element with Xpath "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The elelment with Xpath "+xpath+" is not visible in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The elelment with Xpath "+xpath+" is not interactable in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not interactable in the Application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The elelment with Xpath "+xpath+" is not selectable in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not selectable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with Xpath "+xpath+" is not select by visible text due to unknown error");
			reportStep("The element with Xpath "+xpath+" is not select by visible text due to unknown error", "Fail");

		}


	}






	public void pageDown() {
		// TODO Auto-generated method stub

		try {
			driver.findElementByXPath("html/body").sendKeys(Keys.PAGE_DOWN);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block

		}

	}










	public void SwitchToFramebyXpath(String xpath) {
		// TODO Auto-generated method stub

		try {
			WebElement frame =driver.findElementByXPath(xpath);
			driver.switchTo().frame(frame);

			//System.out.println("The Element with Xpath Switched to Frame Sucessfully");
			reportStep("The Element with Xpath Switched to Frame Sucessfully", "PAss");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The elelment with Xpath "+xpath+" is not found in the DOM");
			reportStep("The elelment with Xpath "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//	System.err.println("The elelment with Xpath "+xpath+" is not visible in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not visible in the Application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The elelment with Xpath "+xpath+" is not interactable in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not interactable in the Application", "fAIL");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpath+" is not stable in the Application");
			reportStep("The element with Xpath "+xpath+" is not stable in the Application", "Fail");
		}catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath has no such frame in the Application");
			reportStep("The element with Xpath has no such frame in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with Xpath "+xpath+" is not select by visible text due to unknown error");
			reportStep("The element with Xpath "+xpath+" is not select by visible text due to unknown error", "Fail");

		}



	}







	public void enterTextAlert(String Name) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(Name);

			System.out.println("The expected Alert is opened and send the data "+Name);
			reportStep("The expected Alert is opened and send the data "+Name, "Pass", false);

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The expected alert is not Present in the Application");
			reportStep("The expected alert is not Present in the Application", "Fail", false);


		}catch (WebDriverException e) {
			// TODO: handle exception
			//	System.err.println("The expected alert is not accept due to unknown error");
			reportStep("The expected alert is not accept due to unknown error", "Fail", false);
		}

	}



	public void defaultContent() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
			//System.out.println("Switched to Default Content Successfully");
			reportStep("Switched to Default Content Successfully", "Pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Not Switched default conten due to unknown error");
			reportStep("Not Switched default conten due to unknown error", "Fail", false);

		}
	}



	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			//System.out.println("Refreshed the Page Successfully");
			reportStep("Refreshed the Page Successfully", "Pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Not Switched default conten due to unknown error");
			reportStep("Not Switched default conten due to unknown error", "Fail", false);
		}
	}




	public void acceptAlertNosnap() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Accept the Opened Alert successfully");
			reportStep("Accept the Opened Alert successfully", "PAss");

		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The expected alert is not Present in the Application");
			reportStep("The expected alert is not Present in the Application", "Fail");

		}		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The expected alert is not accept due to unknown error");
			reportStep("The expected alert is not accept due to unknown error", "Fail");
		}

	}



	public void waitProperty(long millis) {

		// TODO Auto-generated method stub
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("wait is interupted");
			reportStep("wait is interupted", "PAss");
		}
	}



	public void mouseHover1(String xpath) {
		// TODO Auto-generated method stub

		try {
			Actions builder=new Actions(driver);
			WebElement mouseHover =	driver.findElementByXPath(xpath);
			builder.moveToElement(mouseHover).perform();

			//System.out.println("Moved to Xpath Location Successfully");
			reportStep("Moved to Xpath Location Successfully", "PAss");

		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//	System.err.println("The elelment with Xpath "+xpath+" is not found in the DOM");
			reportStep("The elelment with Xpath "+xpath+" is not found in the DOM", "Pass");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//	System.err.println("The elelment with Xpath "+xpath+" is not visible in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not visible in the Application", "Fail");

		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The elelment with Xpath "+xpath+" is not interactable in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not interactable in the Application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The elelment with Xpath "+xpath+" is not selectable in the Application");
			reportStep("The elelment with Xpath "+xpath+" is not selectable in the Application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpath+" is not select by visible text due to unknown error");
			reportStep("The element with Xpath "+xpath+" is not select by visible text due to unknown error", "Fail");
		}
	}



	public void mouseHover() {
		// TODO Auto-generated method stub

	}



	public void switchToAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block

		}
	}
	
	
	public String replaceString(String xpath,String source,String dest) {
		String replaceXpath=null;
		
		try {
			
			if(xpath.contains(source)) {
				replaceXpath= xpath.replace(source, dest);
				reportStep("Xpath is" +replaceXpath+ " is replaced with " +dest, "Pass");
			}
 
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element xpath " +xpathval+ " is not found in the DOM");
			reportStep("The element xpath " +replaceXpath+ " is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element xpath " +xpathval+ " is not visible in the application");
			reportStep("The element xpath " +replaceXpath+ " is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element xpath " +xpathval+ " is not interactable in the application");
			reportStep("The element xpath " +replaceXpath+ " is not interactable in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The element xpath " +xpathval+ " cannot be selected in the application");
			reportStep("The element xpath " +replaceXpath+ " cannot be selected in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element xpath " +xpathval+ " is not stable in the application");
			reportStep("The element xpath " +replaceXpath+ " is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The element xpath " +xpathval+ " is not found due to unknown error");
			reportStep("The element xpath " +replaceXpath+ " is not found due to unknown error", "Fail");
		} 
		
		driver.findElementByXPath(replaceXpath).click();
	
	
	 return replaceXpath;
	}

	public void selectIndexById(String id, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		
	}

	

}
	
