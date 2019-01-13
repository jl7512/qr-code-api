**SPRING INITIALIZR to bootstrap the application**

Set the following:
```
Maven Project with Java and Spring Boot 2.1.1
```
Visit the url:
```
https://start.spring.io/
```
Enter a group and artifact id then search for and add dependencies


**Running the QR Code API**

Open a terminal and run the following command: 
```
mvn spring-boot:run
```

Enter the POST endpoint in your postman:
```
http://localhost:8080/qrcode/generate/image
```
In the body of your POST request, define a url:
```
{
	"url": "https://www.google.com"
}
```
