# Journey-Through-Mordor

## Game Trailer 
Click the following link to watch Journey Through Mordor's trailer:

https://www.youtube.com/watch?v=td1vKdk4mZs

## Description
This is a 2D arcade game set in the world of the Lord of the Rings. It follows Frodo upon his task to destroy the
One Ring. This is a perilous journey wherein Frodo travels through Mordor on treacherous terrain. During his
journey, Frodo will encounter several foes with the purpose of returning the One Ring to their master, the Dark
Lord Sauron. Frodo’s goal is to reach Mount Doom to destroy the One Ring and rid Middle Earth of evil. 

The user will start with a score of 0. This score will increase as Frodo finds rewards and bonuses, and it will
decrease as Frodo encounters enemies. If this score drops below 0, the user will have lost, and the game will be
over. To win, Frodo must collect all the scattered rewards and then reach Mount Doom. Therefore, if Frodo
reaches Mount Doom without having collected all the rewards, the user will have lost. Frodo will be controlled by
the user on their keyboard allowing him to move one cell at a time. He can move up, down, left, and right. 

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

## Contributors
- Jeffrey Wong
- Jessy Chahal
- Preet Dhadda
- Jimmy Hui
