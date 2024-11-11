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

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Setor Kas'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Menejemen Keuangan/select_Nama Anggota                        _3704f5'), 
    'hanan', true)

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Uang Kas_jumlah'), '20000')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Kirim'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/center_Data Sudah Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Daftar Kas'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_3'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_4'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/td_hanan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/td_20,000'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/ul_1                                       _4116a3'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/td_20,000'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Jumlah_jumlah'), '10000')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/center_Mengedit Data Sukses'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Daftar Kas'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Generate Report_cari'), 'Hanan')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Generate Report_cari'), '')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Hapus'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Generate Report_cari'), 'Hanan')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/center_Hanan Yang Anda Cari Tidak Ditemukan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/span_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Nunda Kas'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_8'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Generate Report'))

WebUI.click(findTestObject('Object Repository/Page_/td_Jakarta'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/span_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Daftar Kas'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Generate Report_1'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Catat Pengeluaran'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Pengeluaran_nama'), 'buku')

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Harga_jumlah'), '1000')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Kirim'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Pengeluaran_nama'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Harga_jumlah'), '')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/span_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Daftar Pengeluaran'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Daftar Pengeluaran'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_3'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_4'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_3'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/div_No                   Pengeluaran       _90e128'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/td_buku'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/form_Pengeluaran                       Harg_d8f32b'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Pengeluaran_nama_1'), 'pensil')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/div_Edit Data Pengeluaran                  _8caf2b'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Pengeluaran_nama_1'), 'pensil')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Daftar Pengeluaran_sidebarToggle'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Daftar Pengeluaran_sidebarToggle'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/span_Manajemen Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Daftar Pengeluaran'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Generate Report_cari'), 'pensil')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/div_Data Yang Anda Cari  Ditemukan'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Hapus'))

WebUI.setText(findTestObject('Object Repository/Page_Menejemen Keuangan/input_Generate Report_cari'), 'pensil')

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Menejemen Keuangan/a_Generate Report_1_2'))

WebUI.click(findTestObject('Object Repository/Page_/center_buku'))

