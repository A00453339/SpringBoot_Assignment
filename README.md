# SpringBoot_Assignment
This is the code packet for Speing boot assignment in which I have build a rest api.
This application is deployed on aws elastic bean stalk and below is the home yrl:-
http://springbootrestapi-env.eba-gsemta55.us-east-2.elasticbeanstalk.com/api/hello/

Below are the url for for GET and POST requests:-
http://springbootrestapi-env.eba-gsemta55.us-east-2.elasticbeanstalk.com/api/hotels/

Also, below is the sample post request:-
{
	"name":"Marriot",
	"price":"160.00",
	"available":false
}

This data gets stored in a database tables which has the following structure:-
id - Primary key (Auto generated)
name - String
price - String
available - boolean

H2 Database is used for this application which is the default database for springboot.
