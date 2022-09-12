import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//String ex = "world"
//CustomKeywords.'com.example.ExampleFunctions.printName'(ex)
//Open Browser
WebUI.openBrowser(GlobalVariable.URL)

//Add User Name & Password
WebUI.setText(findTestObject('Object Repository/Page_SSI360/input_Username_username'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_SSI360/input_Password_password'), GlobalVariable.Password)

//Click on Login Button
WebUI.click(findTestObject('Object Repository/Page_SSI360/input__Button1'))

//Verify Logo
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SSI360/a_sidemenu-burgermenu'), 
    5)

//verify side menu bar expand/collapse
String click  = 'Object Repository/Page_SSI360/a_sidemenu-burgermenu'

WebUI.enhancedClick(findTestObject(click), FailureHandling.STOP_ON_FAILURE)


//Close Browser
//WebUI.closeBrowser()
//findTestObject('Object Repository/Page_SSI360/input_Password_password')
