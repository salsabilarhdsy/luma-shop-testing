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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Home Page/a_Radiant Tee'))

WebUI.clickOffset(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/a_Reviews 3'), 0, 0)

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/label_1 stars'))

WebUI.setText(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/input_Nickname_nickname'), 'Sabil')

WebUI.setText(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/input_Summary_title'), 'Great')

WebUI.setText(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/textarea_Review_detail'), 'Worth the price')

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/span_Submit Review'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/div_You submitted your review for moderation_1'), 
    0)

WebUI.takeScreenshotAsCheckpoint('success-reviewed')

WebUI.closeBrowser()

