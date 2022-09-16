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


WebUI.comment('Verify page heading')
WebUI.callTestCase(findTestCase('Test Cases/Attendence/Lookups/Verify Page Heading'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()


WebUI.comment('Verify search box')
WebUI.callTestCase(findTestCase('Test Cases/Attendence/Lookups/Verify Search box is Clickable'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()


WebUI.comment('Verify calendar')
WebUI.callTestCase(findTestCase('Test Cases/Attendence/Lookups/Verify Calendar is Present in Filter'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()


WebUI.comment('Verify start date calendar')
WebUI.callTestCase(findTestCase('Test Cases/Attendence/Lookups/Open Calendar'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()


WebUI.comment('Verify month from dropdown')
WebUI.callTestCase(findTestCase('Test Cases/Attendence/Lookups/Verify select start month from dropdown'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()


// verify entered month is selected correctly
WebUI.comment('Verify Month is save and then verify its saved correctly')
WebUI.callTestCase(findTestCase('Test Cases/Attendence/Lookups/Select Month'),
	[('Option'):'Oct'],FailureHandling.STOP_ON_FAILURE)


