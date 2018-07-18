
# Overview

1. Allure

https://docs.qameta.io/allure/#_about


2. Setup for Allure

2.1. Linux
For debian-based repositories a PPA is provided:
```
sudo apt-add-repository ppa:qameta/allure
sudo apt-get update 
sudo apt-get install allure
```
2.2. Mac OS X
For Mas OS, automated installation is available via Homebrew
```
brew install allure
```
2.3. Windows
For Windows, Allure is available from the Scoop commandline-installer.

To install Allure, download and install Scoop and then execute in the Powershell:
```
scoop install allure
```


# Dependencies 

```$xslt

        <dependency>
            <groupId>com.jayway.restassured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>2.3.4</version>
            <scope>test</scope>
        </dependency>
        
        <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-testng</artifactId>
            <version>2.6.0</version>
            <scope>test</scope>
        </dependency>

```
## Run

Run Maven

```$xslt
mvn clean test allure:report
```

Start Allure server

```$xslt
allure serve target/allure-results
```

# Reference

https://github.com/rest-assured/rest-assured

