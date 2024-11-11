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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Jumlah Pengeluaran                     _7d4354'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Jumlah Pengeluaran                     _7d4354_1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Jumlah Anggota                      27 Orang'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/p_Copyright  Faiz Nurullah'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Manajemen Anggota'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Tambah Anggota'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Nama Anggota_nama'), 'hanan')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Alamat_alamat'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Kirim'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Jumlah Anggota                      28 Orang'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Catat Pengeluaran'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Rp.20,785,688'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Daftar Pengeluaran_sidebarToggle'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Daftar Pengeluaran_text-center d-none d_242091'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Daftar Pengeluaran_text-center d-none d_242091'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Catat Pengeluaran'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Pengeluaran_nama'), 'buku')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Harga_jumlah'), '5000')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Kirim'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Rp.20,790,688'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Rp.20,790,688'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Rp.20,790,688'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Catat Pengeluaran'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Daftar Pengeluaran'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Generate Report'))

WebUI.click(findTestObject('Object Repository/Page_/center_5000'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Daftar Pengeluaran_sidebarToggle'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_21 Belanja'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Daftar Pengeluaran_sidebarToggle'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Daftar Pengeluaran_text-center d-none d_242091'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Daftar Pengeluaran_sidebarToggle'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Catat Pengeluaran'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Pengeluaran_nama'), 'pulpen')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Harga_jumlah'), '1000')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Kirim'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_22 Belanja'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Rp.20,791,688'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Rp.20,791,688'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Jumlah Uang Kas                      Rp_40415f'))

