# vacation1
Teoretická otázka 1: Koľko služieb by bolo potrebné naprogramovať pre vyššie uvedenú obrazovku? Ako by asi vyzerala štruktúra daných služieb?
1 Načítanie všetkých dovoleniek,
2 Vytvorenie novej dovolenky,
3 Schválenie dovolenky,
4 Zmazanie dovolenky.

Štruktúra služieb
GET /vacations
POST /vacations
PUT /vacations/{id}/approve
DELETE /vacations/{id}

Popis vrstiev
Controller prijíma HTTP requesty
Service obsahuje business logiku
Repository komunikuje s databázou
DTO objekty slúžia na request/response komunikáciu
Exception handler spracováva chyby aplikácie

Teoretická otázka 2: Aké programovacie jazyky a frameworky by ste použili?
Java
Spring Boot
Spring Web
Spring Data JPA
H2
Swagger
Maven

Teoretická otázka 3: Ako by vyzeralo zabezpečenie služieb?
Spring security 
Jwt
Role-based autorization

Ďalšie bezpečnostné opatrenia
HTTPS komunikácia
Validácia vstupných dát
Ošetrenie exceptionov
Ochrana proti SQL injection pomocou JPA/Hibernate
Logging a monitoring requestov

Bonus praktickej časti: Ako budú vyzerať unit testy a integračné testy?
vytvorenie dovolenky
schválenie dovolenky
kontrola zmeny statusu
vyhodenie NotFoundException pri neexistujúcom ID
