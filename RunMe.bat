set projectlocation="D:\Java Project Files\projectEdureka"
cd %projectlocation%

set classpath= %projectlocation%\bin; %projectlocation\lib\*

java org.testng.TestNG %projectlocation%\testng.xml

pause