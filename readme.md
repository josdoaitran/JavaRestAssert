
# Overview





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

