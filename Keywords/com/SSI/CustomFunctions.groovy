	package com.SSI

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint


import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.util.ObservableList.ElementAddedEvent

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import org.openqa.selenium.WebElement as WebElement
import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Point
import org.openqa.selenium.interactions.Actions
import java.util.concurrent.TimeUnit;
//import java.util.*;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;
//import java.io.*

public class CustomFunctions {

}
//	@Keyword
//	def ClickbyText()
////	{
////		WebDriver driver =  DriverFactory.getWebDriver()
////		Select se = new Select(driver.findElement(By.xpath('//*[@id="ui-datepicker-div"]/div/div/select[1]"')));
////
////		// Select the option by index
////		se.selectByIndex(3);
////	}

//
//		@Keyword
//		def ClickbyText() {
//			def driver = DriverFactory.getWebDriver()
//((JavascriptExecutor)driver).executeScript("arguments[0].value=arguments[1]", text, '07-09-2022')
//		}
//}
//
//
/////*
//// * def ClickbyText() {
// WebDriver driver = DriverFactory.getWebDriver()
// WebElement ele = driver.findElement(By.id('//*[@id="ui-datepicker-div"]/div/div/select[1], "' + text + '")]'))
// ele.click();
// }
// */
