# movie-database-test
Dies ist ein Java-Maven-Projekt, das Akzeptanztests (u.a. Selenium) beinhaltet. Bei diesem Projekt liegt der Fokus auf die Ausführung von TESTS (mit 'mvn test') und nicht das Bauen einer weiteren JAR o.ä. Das Ziel ist es, dieses Maven-Projekt in die Jenkins-Build-Pipeline zu integrieren und für das Testen zu nutzen.

## Beschreibung der aktuellen Tests
Derzeit gibt es insgesamt 4 Tests:<br>
1. Login-Test: Es wird versucht sich mit dem normalen Standard-User (Name: user, Password: user) anzumelden. Anschließend wird getestet, ob der Anmeldeversuch erfolgreich war<br>
2. Movies-Anlage-Test: Es wird ein Film angelegt (Police Academy)<br>
3. Actors-Aufruf-Test: Es wird die Actors-Seite aufgerufen<br>
4. Actors-Anlage-Test: Es wird ein Schauspieler angelegt (Steve Guttenberg)<br>

## Ausführung der Tests
`mvn test -Dmovie-database-url={...hier die URL der Movie-Database eintragen...}`

Beispiel: `mvn test -Dmovie-database-url=http://localhost`
