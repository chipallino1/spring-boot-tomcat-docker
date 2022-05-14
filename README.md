# spring-boot-tomcat-docker
Example of deployable war on of Spring Boot Rest service 

1. mvn clean install
2. docker image build -t consumer_demo .
3. docker docker container run -p 8080:8080 -d consumer_demo
4. check localhost:8080/consumer_test/docker/getCustomer
