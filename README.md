# Journey-Through-Mordor

## Game Trailer 
Click the following link to watch Journey Through Mordor's trailer:

https://www.youtube.com/watch?v=td1vKdk4mZs

## Building the Game
Navigate to the root directory and type in the terminal:
```bash
mvn package
```

## Running the Game
Type in the terminal:
```bash
java -cp target/Phase-2-1.0.jar com.group21.app.Main
```

## Testing the Game
Navigate to the root directory and type in the terminal:
```bash
mvn clean
mvn compile
mvn test
```

## Line Coverage
To check the line coverage, type in the terminal:
```bash
mvn package
```
Navigate to target->site->jacoco and open the index.html file

## Java Docs
To generate Javadocs, type in the terminal:
```bash
mvn clean
mvn javadoc:javadoc
```
Navigate to target->site->apidocs and open the index.html file
