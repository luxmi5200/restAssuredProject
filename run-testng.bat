@echo off
REM Navigate to the project directory
cd /d "C:\Users\luxmi.1\eclipse-workspace\restAssureProject"

REM Run the Maven command to execute TestNG tests
mvn test -Dsurefire.suiteXmlFiles=testng.xml

REM Pause to keep the command prompt open
pause
