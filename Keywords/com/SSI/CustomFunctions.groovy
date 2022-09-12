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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Point
import org.openqa.selenium.interactions.Actions
import java.util.concurrent.TimeUnit;
import java.util.*;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;
import java.io.*



public class CustomFunctions {

	/*
	 @Keyword
	 def GlobalEnv() {
	 String SSI360 = 'https://ssi360.ssidecisions.com/Account/LogOn?ReturnUrl=%2F'
	 String global = GlobalVariable.URL
	 if(global == SSI360) {
	 return 'SSI360'
	 }
	 else if(global == SSI360) {
	 return 'SSI360'
	 }
	 }
	 }
	 */

	@Keyword
	def ClickbyText(text) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement ele = driver.findElement(By.xpath('//*[@id="ui-datepicker-div"]/div/div/select[1], "' + text + '")]'))
		ele.click()
	}
}