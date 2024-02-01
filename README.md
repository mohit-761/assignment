# Assignment.
# This Repo contains all code of springboot Rest-Api.

## Description:-

## Required jars are:-
   spring web, spring boot devtools, spring data jpa, MySql driver, mysql-connector.

This is a springboot project impelement with rest-api, where we can perform complete "CRUD" operation using "PostMan".
I have used "MySql" server database for this project. In this project we'have 4 packages.

## 1) "com.student" 
   It contains main file i.e. Application.java annotated with @SpringBootApplication.
## 2) "com.student.entity" 
   It contains entity class i.e. Student.java annotated with @Entity and (@Id, @Column)
## 3) "com.student.controller"
   It contains controller class i.e. StudentController.java annotated with @Controller and Many request mapping annotations, I have'nt
   created any "Service" class in this project so, all the logic of "CRUD" operation you can get in this class only.
## 4) "com.student.repo"
   It contains an Interface i.e. StudentRepo that extends CrudRepository to use all it's methods for "CRUD" operations.

## application.properties code
server.port: 9777 

spring.datasource.url=jdbc:mysql://localhost:3306/assignment  
spring.datasource.username=root  
spring.datasource.password=root  
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect  
spring.jpa.hibernate.ddl-auto=update  

## url for performing operations  
### for save operation   
       http://localhost:9777/save    
       In "PostMan" set request type as "POST" and in the request body, choose the "raw" option and select "JSON" as content type.  
### for getting all the data  
      http://localhost:9777/select  
      In "PostMan" set request type as "GET"  
### for getting one record  
    http://localhost:9777/selectOne/Id     /*In place of Id provide integer value.*/  
    In "PostMan" set request type as "GET"  
### for updating record 
    http://localhost:9777/update/Id       /*In place of Id provide integer value.*/   
    In "PostMan" set request type as "POST"   
    
### for deleting record  
   http://localhost:9777/delete/Id   /*In place of Id provide integer value */    
   In "PostMan" set request type as "GET"  

  
