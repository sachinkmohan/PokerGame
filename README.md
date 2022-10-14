# PokerGame Implementation

### Classes Overview
  - `Card.java` - [link](https://github.com/sachinkmohan/PokerGame/blob/main/src/game/Card.java) -> All the card properties such as suit, values and the ranking functionalities for the hands are implemented here.
  - `PokerMain.java` - [link](https://github.com/sachinkmohan/PokerGame/blob/main/src/game/PokerMain.java) -> Main Class testing the winner of 2 hands.
  - `CardTest.java` - [link](https://github.com/sachinkmohan/PokerGame/blob/main/src/game/test/CardTest.java) -> All the tests using the JUnit tool is tested in this file. Unfortunately the folder is inside `src` as I couldn't change the package structure after development. 

### Implemented Functionalities
This Poker game tests 2 functionalities
  - A pair of card between 2 hands defined by `isAPair()` in `Card.java`
  - Two pair of cards between 2 hands defined by `isTwoPair()` in `Card.java`
  - A function to test 2 pair of hands is defined by `testisAPair()` in `PokerMain.java`
  
 
 ### Execution
 - The main program can be accessed and run from `/src/game/PokerGame.java`
    - A simple test to compare a pair of card is implemented here.
    - The result "Hand X is won", based on the card values is printed to the console.
 
