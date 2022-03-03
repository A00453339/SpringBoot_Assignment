# SpringBoot_Assignment
This code implements rest api using spring boot framework. This rest api uses H2 as it's backend database. 
Following table structure is used for the same: -
id (auto increment)
name (string)
price (string)
available (boolean)

1) Below is the home page for the app which prints "Hello Canada"
http://localhost:8080/api/hello

2) Below is the GET request url to fetch all the hotels from backend database
http://localhost:8080/api/hotels/

3)Below is the sample POST request and url is same as GET request:-
{
	"name":"Marriot",
	"price":"160.00",
	"available":false
}
This will create entry for this hotel in the backend table, which can then be viewed using GET request
