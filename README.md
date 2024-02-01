# Assignment.
# This Repo contains all code of springboot Rest-Api.

## Description:-

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
