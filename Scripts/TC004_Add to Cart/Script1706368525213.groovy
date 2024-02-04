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

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Home Page/span_Men'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Men/div_XL'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Men/div_XL_option-label-color-93-item-52'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Men/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Argus All-Weather Tank/div_XS'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Argus All-Weather Tank/div_Color_option-label-color-93-item-52'))

WebUI.setText(findTestObject('Object Repository/Visual Checkpoint/Page_Argus All-Weather Tank/input_Qty_qty'), '2')

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Argus All-Weather Tank/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Argus All-Weather Tank/a_My Cart22items'))

WebUI.takeScreenshotAsCheckpoint('add-2-amount')

WebUI.closeBrowser()

