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

WebUI.openBrowser('https://www.sejasa.com/')
WebUI.maximizeWindow()

//Click Logo
WebUI.click(findTestObject('Object Repository/Home/logo'))

//Click Layanan
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/dailycleaning'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/massage'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/serviceac'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/kontraktorbangunan'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/jasapertukangan'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/pemasanganac'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/servicemesincuci'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/servicekulkas'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/pemasanganatap'))
WebUI.back()
WebUI.click(findTestObject('Object Repository/Home/layanan'))
WebUI.click(findTestObject('Object Repository/Home/reflexology'))
WebUI.back()

//Click Cari vendor
WebUI.click(findTestObject('Object Repository/Home/carivendor'))
WebUI.back()

//Click Login
WebUI.click(findTestObject('Object Repository/Home/login'))
WebUI.back()

//Click Daftar
WebUI.click(findTestObject('Object Repository/Home/daftar'))
WebUI.back()

//Layanan Dropdown
WebUI.click(findTestObject('Object Repository/Home/layanandropdown'))
WebUI.click(findTestObject('Object Repository/Home/dailycleaningdropdown'))

//Lokasi Dropdown
WebUI.click(findTestObject('Object Repository/Home/lokasidropdown'))
WebUI.click(findTestObject('Object Repository/Home/jakartadropdown'))

WebUI.click(findTestObject('Object Repository/Home/temukanjasabtn'))
WebUI.back()

WebUI.closeBrowser()