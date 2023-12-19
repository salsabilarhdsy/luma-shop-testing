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

WebUI.click(findTestObject('HomePage/button_Sign Up'))

WebUI.setText(findTestObject('SignUp/input_First Name'), 'Salsabila')

WebUI.setText(findTestObject('SignUp/input_Last Name'), 'Aisy')

WebUI.setText(findTestObject('SignUp/input_Email'), 'salsa@test.com')

WebUI.setEncryptedText(findTestObject('SignUp/input_Password'), 'R2dZ4hvJ2uiOEdyVG7iA0Q==')

WebUI.setEncryptedText(findTestObject('SignUp/input_Confirmation Password'), 'R2dZ4hvJ2uiOEdyVG7iA0Q==')

WebUI.click(findTestObject('SignUp/button_Create Account'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('SignUp/message_error'), 'There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

