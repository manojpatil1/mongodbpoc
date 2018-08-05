Spring Data using MongoDB PoC

POST:
http://localhost:8082/employee/add
JSON: 
{
	"firstName": "Manoj",
	"lastName": "Patil",
	"emailId":"manoj@temp.com",
	"city":"PUNE"
}

GET:
http://localhost:8082/employee/byfirstname?firstName=Manoj

http://localhost:8082/employee/bylastname?lastName=Patil