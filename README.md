# Floow_Test_V1
Mobile testing project using Appium-Selenium-Java technology in real Android device.#FloowApp#TestNG#Framework#RedmiNote4


#Setup:- Installed Android Studio, SDK Manager, UIAutomator2 , Appium Server in Windows 10 Laptop. Used selenium-java in Eclipse IDE for scripting the test cases

#Connected real mobile device (Redmi Note4) using USB cable. Made Developer mode change in device and disabled permission security to access and launch the app using the script.

#Upon first connection the appium software will get installed in device.

#Mobile device is connected to Laptop where script runs via Appium server.

#POM design methodolgy being used for framework design. Maintaining webelement and assosiated methods in screen based pageObject classes. Base Classes are having the initial and basic setup. Test case classes extend Baseclass. PageObject classes are intialised by test case classes by intantiziation.
