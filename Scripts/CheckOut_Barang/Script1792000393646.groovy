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

Mobile.startApplication(GlobalVariable.apk, true)

CustomKeywords.'login.Login.LoginStep'(GlobalVariable.username, GlobalVariable.password)

Mobile.tap(findTestObject('Object Repository/Check_Out/AddToCart_Button'), GlobalVariable.timeout)

Mobile.tap(findTestObject('Object Repository/Check_Out/Keranjang_Ikon'), GlobalVariable.timeout)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Check_Out/CheckOut_Button'), GlobalVariable.timeout)

Mobile.tap(findTestObject('Object Repository/Check_Out/CheckOut_Button'), GlobalVariable.timeout)

Mobile.verifyElementVisible(findTestObject('Object Repository/Check_Out/Information/FirstName_Field'), GlobalVariable.timeout)

Mobile.setText(findTestObject('Object Repository/Check_Out/Information/FirstName_Field'), GlobalVariable.first_name, GlobalVariable.timeout)

Mobile.verifyElementVisible(findTestObject('Object Repository/Check_Out/Information/LastName_Field'), GlobalVariable.timeout)

Mobile.setText(findTestObject('Object Repository/Check_Out/Information/LastName_Field'), GlobalVariable.last_name, GlobalVariable.timeout)

Mobile.verifyElementVisible(findTestObject('Object Repository/Check_Out/Information/PostalCode_Field'), GlobalVariable.timeout)

Mobile.setText(findTestObject('Object Repository/Check_Out/Information/PostalCode_Field'), GlobalVariable.postal_code, GlobalVariable.timeout)

Mobile.verifyElementVisible(findTestObject('Object Repository/Check_Out/Information/Continue_Button'), GlobalVariable.timeout)

Mobile.tap(findTestObject('Object Repository/Check_Out/Information/Continue_Button'), GlobalVariable.timeout)

CustomKeywords.'checkout.Scrool.scrollUntilVisible'(findTestObject('Object Repository/Check_Out/Finish_Button'), 5)

Mobile.tap(findTestObject('Object Repository/Check_Out/Finish_Button'), GlobalVariable.timeout)

Mobile.verifyElementVisible(findTestObject('Object Repository/Check_Out/ThankYou_Text'), GlobalVariable.timeout)