# animalfarm

welche Funktionen soll unsere Mitarbeiterverwaltung haben: 
* Aufladen der Coffee model.Card
* Alle MA vom model.Sale + model.Office ausgeben
* Welcher Chef welche MA hat
* Teamlead von Sales ausgeben
* neue Keycard angelegen
* Parkingspot zu MA hinzufügen
* Gehaltsliste Mitarbeiter
* Welche MA welchen Führerschein (liecense) haben
* Umsatz pro Kasse
* Alle Karten die demnächst ablaufen
* Adressänderung von MA
* Einem model.Boss ein Auto zuteilen
* MA anlegen
* Wer erhält welchen Bonus

## Main aufrufen. 
Welcher Benutzer bis du? 
Je nachdem welcher Benutzer du bist, hast du verschiedene Möglichkeiten
* model.Office: Coffee model.Card aufladen, oder Guthaben abfragen
Ändern, einfügen, löschen von MA
Suche nach *Nachnamen* 
* model.Boss (Annahme: kann nur abfragen): Wieviele MA arbeiten insgesamt bzw. in den einzelnen Abteilungen. 
Gehalt/ Umsatz je MA/ Übersicht über Warehousa MA und deren Führerschein

## model.Office 
was möchtest du machen Coffe model.Card / MA-Verwaltung 
Coffee model.Card -> aufladen oder abfragen oder ausgeben, wann welche ablaufen

MA-Verwaltung: MA hinzufügen / MA ändern / MA löschen /MA abfragen
* hinzufügen: eingeben von Vorname, Nachname, Adresse, usw. 
* ändern: MA per Nachname suchen, Daten können geändert weden
* löschen: zum Löschen bestätigen oder exit
* abfragen: Nachname eingeben, wenn gefunden, dann ausgeben

## model.Boss
der model.Boss kann nur abfragen
* Abfrage zu MA / Umätze / Zulagen / Führerscheinliste 

## 6.11.2020 Zusammenfassung & Next Steps
### bossDetails: 
Wir wollen sicherstellen, dass die Mitarbeiterdaten sauber eingegeben werden. 
Aus diesem Grund werden alle Eingaben vom Scanner in einer Variable gespeichert. 
* Bei Location sollen alle zur Auswahl stehenden Locations angezeigt werden und der Boss
wählt mit einer Nummer aus. Lösung: Liste aufrufen, durchiterieren (for-Schleife) und laufende 
Nummern raufzählen. 
* Ausgewählte Location Nummer soll dann beim Mitarbeiter eingetrgen werden.
* Locations Liste: wurde extra in der Main erstellt und bei setup() dann befüllt. 

Next Steps: Boss Cases fertigstellen (Mitarbeiter löschen, Abfrge Umsatz) und CoffeeCard.