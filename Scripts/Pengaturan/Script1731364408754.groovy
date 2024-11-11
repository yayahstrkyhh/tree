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

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/img_admin4_img-profile rounded-circle'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/a_Riwayat'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/a_admin4'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/a_Pengaturan'))

WebUI.setText(findTestObject('Object Repository/Page_Pengaturan/input_Ganti Nama_name'), 'admin')

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/input_Ganti Nama_name'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Pengaturan/input_Ganti Nama_name'))

WebUI.setText(findTestObject('Object Repository/Page_Pengaturan/input_Ganti Nama_name'), 'AAa')

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/button_Update'))

WebUI.setText(findTestObject('Object Repository/Page_Pengaturan/input_Ganti Nama_name'), 'adminaaa')

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/button_Update'))

WebUI.setText(findTestObject('Object Repository/Page_Pengaturan/input_Ganti Nama_name'), 'addmin')

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/div_Ganti Nama                             _14ed00'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan/span_adminaaa'))

