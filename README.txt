Softwares this project helped to understand:
Docker, Spring, Maven, ProSequel

his is an example program made using Spring's guide online. It features a REST API that can be configured to return different type of messages. It was made to familiarise myself with both Spring and Maven.


I also amended this project to include MYSQL support.
You need to create the database first on the server, and then allow access with credentials (included in application.properties)
There is a particularly frustrating bug in the sql connector so the timezone must be properly set.

I was able to connect it to docker by killing all processes and running bandwidth's docker compose yml file which ran the sql server in a different terminal
I also used Sequel Pro to connect to the database and see it visually

Reminder that the program starts on port 8080 and connects to the database on whatever port is given in the application.properties file. The SQL REST API seems to work fine and updates properly.
I had to configure the database to add a new user which is mentioned in the application.properties file.


