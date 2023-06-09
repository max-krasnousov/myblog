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

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Page_Login Page/button_Login'))

WebUI.click(findTestObject('Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Post Page/div_TEST COMMENT TEXT'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more_1'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Post Page/div_FirstT LastT'), 0)

WebUI.verifyElementText(findTestObject('null'), 'TEST COMMENT TEXT')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Post Page/div_TEST COMMENT TEXT'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more_1'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Post Page/div_FirstT LastT'), 0)

WebUI.verifyElementText(findTestObject('null'), 'TEST COMMENT TEXT')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_FirstT LastT'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Post Page/div_TEST COMMENT TEXT'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more_1'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Post Page/div_FirstT LastT'), 0)

WebUI.verifyElementText(findTestObject('null'), 'TEST COMMENT TEXT')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Post Page/div_TEST COMMENT TEXT'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create New Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create Post/input_Post name_postName'), 'TEST Name')

WebUI.setText(findTestObject('Object Repository/Page_Create Post/textarea_Post Text_postText'), 'TEST text')

WebUI.click(findTestObject('Object Repository/Page_Create Post/button_Create Post'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_TEST Name'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home Page/div_TEST POST NAME'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Show more_1'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Post Page/div_FirstT LastT'), 0)

WebUI.verifyElementText(findTestObject('null'), 'TEST COMMENT TEXT')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Email_loginUserName'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Password_loginPassword'), 'teO7gFeCDasckeCIEoAHxg==')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_FirstT LastT'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:7001/my-blog/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/a_Register'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

