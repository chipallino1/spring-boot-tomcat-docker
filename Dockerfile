From tomcat:9.0.62-jre11-openjdk
RUN rm -rf /usr/local/tomcat/webapps/*
RUN mv /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps/
COPY ./target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/consumer_test.war
CMD ["catalina.sh","run"]