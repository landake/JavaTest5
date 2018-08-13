#!/usr/bin/env bash

mvn clean package

mv target/*.jar docker/java/javatest5.jar

docker-compose build
rm docker/java/*.jar