# redis_java
This is a quick look at redis java
## Overview
In this example, a java application is run using a jar file to write 100 values into redis.  Next, the values are read in the opposite order.  This is a perfect case for a redis list.
## Getting Started
1. Prepare Docker environment-see the Prerequisites section above...
2. Pull this github into a directory
```bash
git clone https://github.com/jphaugla/redis_java.git
```
3. Refer to the notes for redis Docker images used but don't get too bogged down as docker compose handles everything except for a few admin steps on tomcat.
 * [https://hub.docker.com/r/bitnami/redis/](https://hub.docker.com/r/bitnami/redis/)
4. Open terminal and change to the github home where you will see the docker-compose.yml file, then:
```bash
docker-compose up -d
```
## The java code
1. Complile the code
```bash
mvn package
```
2.  run the jar file.
```bash
java -jar target/demo-0.1-SNAPSHOT-jar-with-dependencies.jar
```
