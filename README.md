

##  APIs Application for Goal Management

####``Technologies used``

1. Java JDK 1.8
2. Maven 3
3. Hibernate
4. MySQL
5. Spring Boot
6. JDBC

####``How to run application application ``
To run the application excecute  HiteshApplication.java 
and the open http://localhost:1710/swagger-ui.html 
click on show/hide.

####``Dependencies used``

1.  log4j-core
2.  log4j-api
3.  spring-boot-starter-data-jdbc
4.  spring-boot-starter-data-jpa
5.  spring-boot-starter-web
6.  spring-boot-starter-test
7.  mysql-connector-java
8.  springfox-swagger2
10. springfox-swagger-ui



####``Functianlities``
These services can perform following functionality,

   1. Employee CRUD operations.
   
     > GET Method 
       Api -  /goals
       Discription - It returns all goals
      
     > POST Method
       Api - /goals
       Discription - use to add a new goal
       Demo json - [
                       {
                         "createDate": "string",
                         "details": "string",
                         "eta": "string",
                         "title": "string",
                         "updateDate": "string"
                       }
                   ] 
                   
      > GET Method
        Api - /goals/{goalId}
        Discription - returns the list of all goals of partilar goalId
        
      > DELETE Method
        Api - /goals/{goalId}
        Description - deletes the goal with the particular goalId
        
      > PUT Method
        Api - /goals/{goalId}
        Description - update the goal of particular id.
        Demo json - [
                          {
                            "createDate": "string",
                            "details": "string",
                            "eta": "string",
                            "title": "string",
                            "updateDate": "string"
                          }
                          
                     ] 
      
   




