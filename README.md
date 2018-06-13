# AnimeAPI

// creare baza de date
CREATE DATABASE anime;
CREATE TABLE characters ( id INT AUTO_INCREMENT NOT NULL, name VARCHAR(100), description VARCHAR(400), picture VARCHAR(260), PRIMARY KEY (id));

// generat jar
mvn package

// rulare
java -jar target/AnimeAPI-1.0-SNAPSHOT.jar
