# Speer Attribute Swap Fixer

Ein kleines Paper-Plugin-Projekt mit dem Namen **SpeerAttributeSwapFixer**.

## Enthaltene Funktion

- `/dwg` schaltet zwischen Creative und Survival um.
- Der Befehl ist fuer alle Spieler verfuegbar; es ist keine OP-Berechtigung und keine Permission erforderlich.
- Das Plugin erzeugt selbst keine Debug- oder Statusmeldungen in der Serverkonsole. Normale Meldungen von Paper bleiben davon unberuehrt.

## Wichtig zum Speer-/Attribute-Swap

Der Name des Plugins ist bereits **SpeerAttributeSwapFixer**. Eine konkrete Speer-Attributtausch-Reparatur ist in dieser ersten Version noch nicht implementiert: Dafuer muss klar sein, welchen Fehler bzw. welches Verhalten du meinst (zum Beispiel welche Attribute beim Wechseln vertauscht werden und wie es sich zeigen soll). Ich erfinde hier keine Funktion, die dann eventuell nicht das tut, was du erwartest.

## Voraussetzungen

- Paper 1.21.11
- Java 21
- Gradle (oder die Gradle-Unterstuetzung deiner IDE)

## JAR bauen

Im Projektordner ausfuehren:

```bash
gradle build
```

Die fertige Datei liegt danach hier:

```text
build/libs/SpeerAttributeSwapFixer-1.0.0.jar
```

Diese JAR in den `plugins`-Ordner deines eigenen Paper-Servers kopieren und den Server neu starten.

## In GitHub hochladen

1. Auf GitHub ein neues Repository namens `SpeerAttributeSwapFixer` erstellen.
2. Die Projektdateien hochladen (nicht nur die JAR).
3. Fuer die JAR lokal `gradle build` ausfuehren.
4. Im GitHub-Repository **Releases** -> **Draft a new release** oeffnen.
5. Die Datei `build/libs/SpeerAttributeSwapFixer-1.0.0.jar` als Release-Datei anhaengen und veroeffentlichen.

## Sicherheitshinweis

`/dwg` gibt jedem Spieler auf dem Server die Moeglichkeit, Creative zu aktivieren. Nutze das nur auf einem Server, dessen Betreiber diese Regel ausdruecklich moechte.
