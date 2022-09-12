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

// Pre-Cond itions
WebUI.callTestCase(findTestCase('Test Cases/Login/Login_ssi360/Login SSI360'), [:], FailureHandling.STOP_ON_FAILURE)


// Navigate to My attendance
WebUI.comment('Navigate to My Attendance')
WebUI.callTestCase(findTestCase('Test Cases/Navigations/NT My Attendence listview'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()

String Heading = 'Object Repository/Page_SSI360/My attendance/h1_My Attendance'
String OpenSearchDetails = 'Object Repository/Page_SSI360/open_detail_search'
String StartDateCalendar = 'Object Repository/Page_SSI360/My attendance/Start Date_startDate_calendarButton'
String Select_start_Month = 'Object Repository/Page_SSI360/My attendance/Month_select_JanFebMarAprMayJunJulAugSepOctNovDec'
String Search_btn = 'Object Repository/Page_SSI360/My attendance/a_Search_filter'

String Component = 'MY ATTENDANCE'

WebUI.verifyElementText(findTestObject(Heading),'MY ATTENDANCE', FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Open Search Box to Enter dates')

WebUI.click(findTestObject(OpenSearchDetails), FailureHandling.STOP_ON_FAILURE)


WebUI.verifyElementClickable(findTestObject(StartDateCalendar), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject(StartDateCalendar), FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject(Select_start_Month), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()


CustomKeywords.'com.SSI.CustomFunctions.ClickbyText'()


WebUI.comment('Verify Month is save and then verify its saved correctly')
WebUI.callTestCase(findTestCase('Test Cases/Attendance/Lookups/Select Month'),
	[('Option'):'Aug'],FailureHandling.STOP_ON_FAILURE)

