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

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/div_Qty_control'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/span_Add to Compare'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Radiant Tee/a_Gabrielle Micro Sleeve Top'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Gabrielle Micro Sleeve Top/span_Add to Compare'))

WebUI.click(findTestObject('Object Repository/Visual Checkpoint/Page_Gabrielle Micro Sleeve Top/a_Compare Products 2 items'))

WebUI.scrollToElement(findTestObject('Object Repository/Visual Checkpoint/Page_Products Comparison List - Magento Commerce/a_Product_product-item-photo'), 
    0)

WebUI.takeScreenshotAsCheckpoint('compare-products')

WebUI.closeBrowser()

