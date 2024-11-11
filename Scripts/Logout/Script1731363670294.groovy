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

WebUI.navigateToUrl('https://qatest.rimbahouse.com/login.php')

WebUI.setText(findTestObject('Page_Admin Login/input_Selamat Datang Admin_username'), 'admin9')

WebUI.setEncryptedText(findTestObject('Page_Admin Login/input_Selamat Datang Admin_password'), 'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Page_Admin Login/input_Selamat Datang Admin_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Admin Logout/span_admin4'))

WebUI.click(findTestObject('Object Repository/Page_Admin Logout/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Admin Logout/h5_Yakin Mau Keluar'))

WebUI.click(findTestObject('Object Repository/Page_Admin Logout/div_Pilih Option Logout Untuk Keluar Dan Pi_716853'))

WebUI.click(findTestObject('Object Repository/Page_Admin Logout/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Admin Logout/span_admin4'))

WebUI.click(findTestObject('Object Repository/Page_Admin Logout/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Admin Logout/a_Logout_1'))

