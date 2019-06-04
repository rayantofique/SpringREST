Note: This is a journal I'm keeping for this practice project which catalogues my thoughts, lessons, and bugs that I ran into while trying to get familiarized with Spring, Docker, MySQL, Maven, MySQL. Hence, it is probably going to be kinda unorganized and probably not worth reading if you are not me.

Softwares this project helped to understand:
Docker, Spring, Maven, ProSequel

This is an example program made using Spring's guide online. It features a REST API that can be configured to return different type of messages. It was made to familiarise myself with both Spring and Maven.


I also amended this project to include MYSQL support.
You need to create the database first on the server, and then allow access with credentials (included in application.properties)
There is a particularly frustrating bug in the sql connector so the timezone must be properly set.

I was able to connect it to docker by killing all processes and running bandwidth's docker compose yml file which ran the sql server in a different terminal
I also used Sequel Pro to connect to the database and see it visually

Reminder that the program starts on port 8080 and connects to the database on whatever port is given in the application.properties file. The SQL REST API seems to work fine and updates properly.
I had to configure the database to add a new user which is mentioned in the application.properties file.
I was unable to gain access to the database from my application first precisely because I had not setup the new permissions. Doing that with a command failed but using Sequel Pro to do that worked perfectly fine so that was kinda weird. Anyways, I got around that by logging in with root permissions early on and doing the appropriate perimssions stuff.

06/4/2019
To get used to running a java application in a docker container itself, I added a basic Dockerfile with the appropriate commands. It ran fine but it could not connect to the SQL docker container because apparently they are on different networks. I initially had my dockerfile in the root folder of the project instead of the src folder, so that was initally causing the faults with the ADD command as the relative pathing was all messed up.

My next step is going to be to use a docker compose file to create a docker network with linked connectors.

