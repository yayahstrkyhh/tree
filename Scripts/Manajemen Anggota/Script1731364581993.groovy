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

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/span_Manajemen Anggota'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_Tambah Anggota'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Nama Anggota_nama'), 'byya')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/label_Nama Anggota'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/div_Tambah Anggota'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/label_Nama Anggota'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/input_Nama Anggota_nama'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/div_Alamat'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Alamat_alamat'), 'Kesawung tengah')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Kirim'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/center_Data Sudah Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/div_Data Sudah Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/span_Manajemen Anggota'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_Daftar Anggota'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/div_Kapasitas Anggota 36                   _14c754'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/div_Kapasitas Anggota 36                   _14c754'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Generate Report_cari'), 'bya')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/center_bya Yang Anda Cari Tidak Ditemukan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/div_bya Yang Anda Cari Tidak Ditemukan     _ccf555'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Generate Report_cari'), 'byya')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/center_Data Yang Anda Cari  Ditemukan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/td_byya'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/td_Kesawung tengah'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/td_byya'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Kembali Lagi'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Generate Report_cari'), 'byya')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Alamat_alamat_1'), 'Kedawung tengah')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/center_Mengedit Data Sukses'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_Manajemen Anggota'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_Daftar Anggota'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Generate Report_cari'), 'byya')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/td_Kedawung tengah'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/ul_1                                       _2375f1'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/td_Kedawung tengah'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/td_2024-11-20'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Hapus'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_6'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_5'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_3'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_4'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_1'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_3'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_4'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_5'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_5'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_6'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/div_Data Anda Masih Kosong'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/center_Data Anda Masih Kosong'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_5'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/h7_Kapasitas Anggota 36'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Generate Report_cari'), 'as')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/center_Data Yang Anda Cari  Ditemukan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/div_Data Yang Anda Cari  Ditemukan         _b278bb'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Hapus'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Anggota/input_Generate Report_cari'), 'as')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/td_2024-11-21'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_Generate Report'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Anggota/a_Manajemen Anggota'))

