# Les 10 Novi - Spring Boot


## For my English speaking viewers:
This repository reflects my work for lesson 9 of our Spring Boot course. I'll be doing it in Dutch and although I don't think it will be too interesting for most of the world, feel free to translate whatever you want.


## Workshop les 10
1. Start een Spring Boot project met Spring Web dependency
2. Maak class **Person** (met velden: *name, dob & gender*) in package 'model'
3. Maak class **PersonController** in package 'controller'
   - met ArrayList<Person> veld
   - met GET/POST/PUT methods
4. Test met Postman





## De opdracht van les 10
- Breid het project van de workshop verder uit met het volgende:
  - Voeg een GET method ('persons') toe die op basis van een inded (int) de zoveelste persoon uit de lijst retourneert (via ArrayList.get()). Als die aanwezig is, retourneer je deze als JSON data. Zoek zelf uit  wekle HTTP status je moet retourneren (resource gevonden/niet gevonden).
  - Voeg een DELETE method ('/persons') toe die een persoon uit de lijst verwijderd op basis van een naam (String). Als die aanwezig is, verwijder je deze en retourneert HTTP status  204 (No Content), anders status 404 (Not Found).
  - Extra
    - Maak een GET method ('persons/search') die een lijst van personen retourneert op basis van een substring parameter.
  - Test het in Postman
