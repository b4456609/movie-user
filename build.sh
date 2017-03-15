#!bin/bash
./gradlew bootRepackage
docker build -t movie-user:latest -t movie-user:${1} .