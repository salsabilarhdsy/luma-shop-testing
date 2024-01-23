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

WebUI.openBrowser(url)

WebUI.click(findTestObject('Page_HomePage/button_sign-up'))

WebUI.setText(findTestObject('Page_SignUp/input_first-name'), '')

WebUI.setText(findTestObject('Page_SignUp/input_last-name'), '')

WebUI.setText(findTestObject('Page_SignUp/input_Email'), '')

WebUI.setText(findTestObject('Page_SignUp/input_Password'), '')

WebUI.setText(findTestObject('Page_SignUp/input_confirmation-password'), '')

WebUI.click(findTestObject('Page_SignUp/button_create-account'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Page_SignUp/message_firstname-error'), 'This is a required field.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_SignUp/message_lastname-error'), 'This is a required field.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_SignUp/message_emailaddress-error'), 'This is a required field.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_SignUp/message_password-error'), 'This is a required field.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_SignUp/message_passwordconfirmation-error'), 'This is a required field.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

