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
String StartNow_btn = 'Object Repository/Page_SSI360/My attendance/filter_button'
String OpenSearchDetails = 'Object Repository/Page_SSI360/open_detail_search'






String StartDateCalendar = 'Object Repository/Page_SSI360/My attendance/Start Date_startDate_calendarButton'
String StartDate = 'Object Repository/Page_SSI360/My attendance/input_Start Date'
//String FromDate = 'Object Repository/Page_SSI360/My attendance/input_From Date_fromDateID'
String EndDateCalendar = 'Object Repository/Page_SSI360/My attendance/End Date_endDate_calendarButton'
//String Pick_Startdate = 'Object Repository/Page_SSI360/My attendance/a_1 start date'
String selected_startdate = 'Object Repository/Page_SSI360/My attendance/selected_Start Date_ui-igedit ui-igedit-container ui-widget ui-corner-all ui-state-default ui-state-focus ui-state-hover'
String EndDate = 'Object Repository/Page_SSI360/My attendance/input_End Date'
//String pick_EndDate = 'Object Repository/Page_SSI360/My attendance/a_7 enddate'
String selected_EndDate = 'Object Repository/Page_SSI360/My attendance/selected_End Date_ui-igedit ui-igedit-container ui-widget ui-corner-all ui-state-default ui-state-focus ui-state-hover'

String M_Y_div = 'Object Repository/Page_SSI360/My attendance/M_Y_div_PrevNextJanFebMarAprMayJunJulAugSepOctNovDec201220132014201520162017201820192020202120222023202420252026202720282029203020312032'
String Select_start_Month = 'Object Repository/Page_SSI360/My attendance/Month_select_JanFebMarAprMayJunJulAugSepOctNovDec'
//String Select_start_Year = 'Object Repository/Page_SSI360/My attendance/year_select_201220132014201520162017201820192020202120222023202420252026202720282029203020312032'
//String Select_End_Month = 'Object Repository/Page_SSI360/My attendance/EndDate_Month_select_JanFebMarAprMayJunJulAugSepOctNovDec'
//String Select_End_year = 'Object Repository/Page_SSI360/My attendance/EndDate_year_select_201220132014201520162017201820192020202120222023202420252026202720282029203020312032'
String Start_startDate = 'Object Repository/Page_SSI360/My attendance/Start Date_startDate_calendarButton'


//String ToDate = 'Object Repository/Page_SSI360/My attendance/input_To Date_toDateID'
String Search_btn = 'Object Repository/Page_SSI360/My attendance/a_Search_filter'


String Start_Date = ''
String End_Date = ''
String Component = 'MY ATTENDANCE'
String Env = ''
 

WebUI.comment('Verify Page Heading')

WebUI.verifyElementText(findTestObject(Heading),'MY ATTENDANCE', FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Open Search Box to Enter dates')

WebUI.click(findTestObject(OpenSearchDetails), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.click(findTestObject(StartDateCalendar), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.verifyElementClickable(findTestObject(M_Y_div), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject(Select_start_Month), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.click(findTestObject(Start_startDate), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

//WebUI.click(findTestObject(Select_start_Year), FailureHandling.STOP_ON_FAILURE)

//WebUI.enableSmartWait()



//WebUI.click(findTestObject(Pick_Startdate), FailureHandling.STOP_ON_FAILURE)

//WebUI.enableSmartWait()

//WebUI.click(findTestObject(selected_startdate), FailureHandling.STOP_ON_FAILURE)

//WebUI.enableSmartWait()



//WebUI.click(findTestObject(pick_EndDate), FailureHandling.STOP_ON_FAILURE)

//WebUI.enableSmartWait()

//WebUI.click(findTestObject(selected_EndDate), FailureHandling.STOP_ON_FAILURE)

//WebUI.enableSmartWait()

//WebUI.click(findTestObject(StartDate), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject(selected_startdate), FailureHandling.STOP_ON_FAILURE)


Env = CustomKeywords.'com.SSI.CustomFunctions.GlobalEnv'()
WebUI.comment(Env)
(Start_Date,End_Date) = CustomKeywords.'com.SSI.Env_Based_Data.GetSearchData'(Component,Env)

WebUI.comment(Start_Date+' '+End_Date)


WebUI.sendKeys(findTestObject(StartDate), Start_Date, FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()




WebUI.click(findTestObject(EndDateCalendar), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()



//WebUI.click(findTestObject(EndDate), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject(selected_EndDate), FailureHandling.STOP_ON_FAILURE)

//WebUI.sendKeys(findTestObject(EndDate), End_Date, FailureHandling.STOP_ON_FAILURE)

//WebUI.enableSmartWait()


//WebUI.click(findTestObject(Search_btn), FailureHandling.STOP_ON_FAILURE)


//WebUI.click(findTestObject(StartDate), FailureHandling.STOP_ON_FAILURE)
/*
WebUI.sendKeys(findTestObject(StartDate), Start_Date, FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.click(findTestObject(EndDateCalendar), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

//WebUI.click(findTestObject(EndDate), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(EndDate), End_Date, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject(Search_btn), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.comment('Now verify the Search have saved the entered Values')

//WebUI.click(findTestObject(Reset_search), FailureHandling.STOP_ON_FAILURE)

//WebUI.enableSmartWait()

//WebUI.takeFullPageScreenshot()
*/