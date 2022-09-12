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


String StartDateCalendar = 'Object Repository/Page_SSI360/My attendance/Start Date_startDate_calendarButton'
String Select_start_Month = 'Object Repository/Page_SSI360/My attendance/Month_select_JanFebMarAprMayJunJulAugSepOctNovDec'
String Jan = 'Object Repository/Page_SSI360/My attendance/Jan'
String Feb = 'Object Repository/Page_SSI360/My attendance/Feb'
String Mar = 'Object Repository/Page_SSI360/My attendance/Mar'
String Apr = 'Object Repository/Page_SSI360/My attendance/Apr'
String May = 'Object Repository/Page_SSI360/My attendance/May'
String Jun = 'Object Repository/Page_SSI360/My attendance/Jun'
String jul = 'Object Repository/Page_SSI360/My attendance/Jul'
String Aug = 'Object Repository/Page_SSI360/My attendance/Aug'
String Sep = 'Object Repository/Page_SSI360/My attendance/Sep'
String Oct = 'Object Repository/Page_SSI360/My attendance/Oct'
String Nov = 'Object Repository/Page_SSI360/My attendance/Nov'
String Dec = 'Object Repository/Page_SSI360/My attendance/Dec'
String Search_btn = 'Object Repository/Page_SSI360/My attendance/a_Search_filter'



WebUI.click(findTestObject(StartDateCalendar), FailureHandling.STOP_ON_FAILURE)



if(Option == 'Jan') {
	//WebUI.click(findTestObject(Jan), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Jan'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Feb') {
	//WebUI.click(findTestObject(Feb), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Feb'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Mar') {
	//WebUI.click(findTestObject(Mar), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Mar'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Apr') {
	//WebUI.click(findTestObject(Apr), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Apr'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'May') {
	//WebUI.click(findTestObject(May), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'May'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Jun') {
	//WebUI.click(findTestObject(Jun), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'jun'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Jul') {
	//WebUI.click(findTestObject(Jul), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Jul'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Aug') {
	//WebUI.click(findTestObject(Aug), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Aug'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Sep') {
	//WebUI.click(findTestObject(Sep), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Sep'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Oct') {
	//WebUI.click(findTestObject(Oct), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Oct'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Nov') {
	//WebUI.click(findTestObject(Nov), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Nov'],FailureHandling.STOP_ON_FAILURE)
}

else if(Option == 'Dec') {
	//WebUI.click(findTestObject(Dec), FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Core/Helpers/Click by Text'),
		[('Text'):'Dec'],FailureHandling.STOP_ON_FAILURE)
}
