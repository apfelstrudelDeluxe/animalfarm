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
